package net.wxam.architectschisel.item;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wxam.architectschisel.ArchitectsChisel;

import java.util.List;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArchitectsChisel.MOD_ID);

    public static final DeferredItem<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new Item(new Item.Properties().stacksTo(1)));

    private static DeferredItem<Item> registerItem(String name, Item.Properties properties) {
        return ITEMS.register(name, () -> new Item(properties) {
            @Override
            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag flag) {
                tooltipComponents.add(Component.translatable("tooltip.item." + name).withStyle(ChatFormatting.GRAY));
                super.appendHoverText(stack, context, tooltipComponents, flag);
            }
        });
    }

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
