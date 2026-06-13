package net.wxam.architectschisel.item;

import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.block.ModBlocks;

import java.util.function.Supplier;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TAB =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, ArchitectsChisel.MOD_ID);

    public static final Supplier<CreativeModeTab> MATERIALS_TAB = CREATIVE_MODE_TAB.register("materials_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.IRON_CHISEL.get()))
                    .title(Component.translatable("creativetab.architectschisel.materials"))
                    .displayItems((parameters, output) -> {
                        ModItems.ITEMS.getEntries().stream()
                                .filter(item -> !(item.get() instanceof BlockItem))
                                .forEach(item -> output.accept(item.get()));
                    }).build());

    public static final Supplier<CreativeModeTab> BLOCKS_TAB = CREATIVE_MODE_TAB.register("blocks_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.ACACIA_PLANKS_1))
                    .title(Component.translatable("creativetab.architectschisel.blocks"))
                    .displayItems((parameters, output) -> {
                        ModBlocks.BLOCKS.getEntries().forEach(block -> output.accept(block.get()));
                    }).build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TAB.register(eventBus);
    }
}
