package net.wxam.architectschisel.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.block.ModBlocks;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagProvider extends BlockTagsProvider {
    public ModBlockTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, ArchitectsChisel.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        tag(BlockTags.MINEABLE_WITH_AXE)
                .add(ModBlocks.ACACIA_PLANKS_1.get())
                .add(ModBlocks.ACACIA_PLANKS_2.get())
                .add(ModBlocks.ACACIA_PLANKS_3.get())
                .add(ModBlocks.ACACIA_PLANKS_4.get())
                .add(ModBlocks.ACACIA_PLANKS_5.get())
                .add(ModBlocks.ACACIA_PLANKS_6.get())
                .add(ModBlocks.ACACIA_PLANKS_7.get());

    }
}
