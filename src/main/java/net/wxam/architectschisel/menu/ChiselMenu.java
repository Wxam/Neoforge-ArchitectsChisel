package net.wxam.architectschisel.menu;

import net.minecraft.server.level.ServerPlayer;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.Container;
import net.minecraft.world.SimpleContainer;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.Slot;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.wxam.architectschisel.recipe.ChiselRecipeFactory;
import net.wxam.architectschisel.sounds.ModSounds;

import java.util.ArrayList;
import java.util.List;

public class ChiselMenu extends AbstractContainerMenu {

    private final Container chisel;
    private final Slot inputSlot;
    private final Slot resultSlot;
    private final List<Slot> variantSlots = new ArrayList<>();
    private final Inventory playerInventory;
    private boolean toggle = false;

    public ChiselMenu(int id, Inventory inv) {
        this(id, inv, new SimpleContainer(30));
    }

    public ChiselMenu(int id, Inventory playerInv, Container container) {
        super(ModMenuTypes.CHISEL_MENU.get(), id);
        this.chisel = container;
        this.playerInventory = playerInv;
        container.startOpen(playerInv.player);

        int index = 0;

        this.inputSlot = this.addSlot(new Slot(container, index, 28, 18) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return true;
            }

            @Override
            public void setChanged() {
                super.setChanged();
                updateVariants(ChiselMenu.this.inputSlot.getItem());
            }
        });
        index++;

        this.resultSlot = this.addSlot(new Slot(container, index, 28, 45) {
            @Override
            public boolean mayPlace(ItemStack stack) {
                return false;
            }
        });
        index++;

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 7; col++) {
                final int slotIndex = index;
                Slot slot = new Slot(container, slotIndex, 55 + col * 18, 18 + row * 18) {
                    @Override
                    public boolean mayPlace(ItemStack stack) {
                        return false;
                    }

                    @Override
                    public boolean mayPickup(Player player) {
                        if (!ChiselMenu.this.resultSlot.hasItem()) {
                            ChiselMenu.this.craftVariant(this.getItem(), player);
                        }
                        return false;
                    }
                };
                variantSlots.add(slot);
                this.addSlot(slot);
                index++;
            }
        }

        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 9; col++) {
                this.addSlot(new Slot(playerInv, col + row * 9 + 9, 20 + col * 18, 114 + row * 18));
            }
        }

        for (int col = 0; col < 9; col++) {
            this.addSlot(new Slot(playerInv, col, 20 + col * 18, 172));
        }
    }

    private void updateVariants(ItemStack input) {
        for (int i = 2; i < 30; i++) {
            slots.get(i).set(ItemStack.EMPTY);
        }

        if (input.isEmpty()) {
            broadcastChanges();
            return;
        }

        List<ItemStack> variants = getVariantsForItem(input);

        int slotIndex = 2;
        for (ItemStack variant : variants) {
            if (slotIndex >= 30) break;
            slots.get(slotIndex).set(variant);
            slotIndex++;
        }

        broadcastChanges();
    }

    private List<ItemStack> getVariantsForItem(ItemStack input) {
        if (ChiselRecipeFactory.get() == null) return new ArrayList<>();
        return ChiselRecipeFactory.get().getVariants(input);
    }

    public void craftVariant(ItemStack variantItem, Player player) {
        if (variantItem.isEmpty()) return;

        int count = inputSlot.getItem().getCount();
        ItemStack newStack = new ItemStack(variantItem.getItem(), count);

        if (toggle) {
            for (ItemStack stack : playerInventory.items) {
                if (!stack.isEmpty() && stack.getItem() == inputSlot.getItem().getItem()) {
                    int slot = playerInventory.findSlotMatchingUnusedItem(stack);
                    playerInventory.setItem(slot, new ItemStack(variantItem.getItem(), stack.getCount()));
                }
            }
        }

        Level level = player.level();
        if (!level.isClientSide()) {
            level.playSound(null, player.blockPosition(),
                    ModSounds.CHISELING_SOUND.get(),
                    SoundSource.PLAYERS,
                    1.0f, 1.0f);
        }

        resultSlot.set(newStack);
        inputSlot.set(ItemStack.EMPTY);
        updateVariants(ItemStack.EMPTY);
        broadcastChanges();
    }

    @Override
    public boolean clickMenuButton(Player player, int id) {
        toggle = (id == 1);
        return super.clickMenuButton(player, id);
    }

    @Override
    public void removed(Player player) {
        super.removed(player);
        if (resultSlot.hasItem() && player instanceof ServerPlayer) {
            player.getInventory().placeItemBackInInventory(chisel.removeItemNoUpdate(resultSlot.index));
        }
        if (inputSlot.hasItem() && player instanceof ServerPlayer) {
            player.getInventory().placeItemBackInInventory(chisel.removeItemNoUpdate(inputSlot.index));
        }
    }

    @Override
    public ItemStack quickMoveStack(Player player, int index) {
        ItemStack itemstack = ItemStack.EMPTY;
        Slot slot = this.slots.get(index);
        if (slot != null && slot.hasItem()) {
            ItemStack itemstack1 = slot.getItem();
            itemstack = itemstack1.copy();
            if (index < 2) {
                if (!this.moveItemStackTo(itemstack1, 9, 45, true)) {
                    return ItemStack.EMPTY;
                }
            } else if (!this.moveItemStackTo(itemstack1, 0, 1, false)) {
                return ItemStack.EMPTY;
            }

            if (itemstack1.isEmpty()) {
                slot.set(ItemStack.EMPTY);
            } else {
                slot.setChanged();
            }

            if (itemstack1.getCount() == itemstack.getCount()) {
                return ItemStack.EMPTY;
            }

            slot.onTake(player, itemstack1);
        }
        return itemstack;
    }

    @Override
    public boolean stillValid(Player player) {
        return true;
    }
}