package net.wxam.architectschisel.datagen;

import net.minecraft.data.PackOutput;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.neoforged.neoforge.registries.DeferredBlock;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.block.ModBlocks;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, ArchitectsChisel.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.ACACIA_PLANKS_1);
        blockWithItem(ModBlocks.ACACIA_PLANKS_2);
        blockWithItem(ModBlocks.ACACIA_PLANKS_3);
        blockWithItem(ModBlocks.ACACIA_PLANKS_4);
        blockWithItem(ModBlocks.ACACIA_PLANKS_5);
        blockWithItem(ModBlocks.ACACIA_PLANKS_6);
        blockWithItem(ModBlocks.ACACIA_PLANKS_7);
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }
}
