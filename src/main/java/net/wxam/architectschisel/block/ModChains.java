package net.wxam.architectschisel.block;

import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.TooltipFlag;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.item.ModItems;

import java.util.List;
import java.util.function.Supplier;

public class ModChains {
    public static final DeferredRegister.Blocks BLOCKS =
            DeferredRegister.createBlocks(ArchitectsChisel.MOD_ID);

    public static final DeferredBlock<ChainBlock> CHAIN_1 = registerBlock("chain_1", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<ChainBlock> CHAIN_2 = registerBlock("chain_2", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL)));
    public static final DeferredBlock<ChainBlock> CHAIN_3 = registerBlock("chain_3", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<ChainBlock> CHAIN_4 = registerBlock("chain_4", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));
    public static final DeferredBlock<ChainBlock> CHAIN_5 = registerBlock("chain_5", () -> new ChainBlock(BlockBehaviour.Properties.ofFullCopy(Blocks.CHAIN)));

    private static <T extends Block> DeferredBlock<T> registerBlock(String name, Supplier<T> block) {
        DeferredBlock<T> toReturn = BLOCKS.register(name, block);
        ModItems.ITEMS.register(name, () -> new BlockItem(toReturn.get(), new Item.Properties()) {
            @Override
            public void appendHoverText(ItemStack stack, TooltipContext context, List<Component> tooltipComponents, TooltipFlag flag) {
                tooltipComponents.add(Component.translatable("tooltip.block." + name).withStyle(ChatFormatting.GRAY));
                super.appendHoverText(stack, context, tooltipComponents, flag);
            }
        });
        return toReturn;
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}