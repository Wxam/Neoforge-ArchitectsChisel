package net.wxam.architectschisel.datagen;

import net.minecraft.core.Holder;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.Block;
import net.wxam.architectschisel.block.ModBlocks;

import java.util.Set;

public class ModBlockLootTableProvider extends BlockLootSubProvider {
    protected ModBlockLootTableProvider(HolderLookup.Provider registries) {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags(), registries);
    }

    @Override
    protected void generate() {
        dropSelf(ModBlocks.ACACIA_PLANKS_1.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_2.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_3.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_4.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_5.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_6.get());
        dropSelf(ModBlocks.ACACIA_PLANKS_7.get());

    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(Holder::value)::iterator;
    }
}
