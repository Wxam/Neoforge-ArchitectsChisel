package net.wxam.architectschisel.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.neoforged.neoforge.common.data.BlockTagsProvider;
import net.neoforged.neoforge.common.data.ExistingFileHelper;
import net.wxam.architectschisel.ModTags;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagProvider extends ItemTagsProvider {

    public ModItemTagProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider,
                              BlockTagsProvider blockTagsProvider,
                              @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, blockTagsProvider.contentsGetter());
    }

    @Override
    protected void addTags(HolderLookup.Provider provider) {
        copy(ModTags.Blocks.ACACIA_PLANKS, ModTags.Items.ACACIA_PLANKS);
        copy(ModTags.Blocks.BAMBOO_PLANKS, ModTags.Items.BAMBOO_PLANKS);
        copy(ModTags.Blocks.BIRCH_PLANKS, ModTags.Items.BIRCH_PLANKS);
        copy(ModTags.Blocks.CHERRY_PLANKS, ModTags.Items.CHERRY_PLANKS);
        copy(ModTags.Blocks.CRIMSON_PLANKS, ModTags.Items.CRIMSON_PLANKS);
        copy(ModTags.Blocks.DARK_OAK_PLANKS, ModTags.Items.DARK_OAK_PLANKS);
        copy(ModTags.Blocks.JUNGLE_PLANKS, ModTags.Items.JUNGLE_PLANKS);
        copy(ModTags.Blocks.MANGROVE_PLANKS, ModTags.Items.MANGROVE_PLANKS);
        copy(ModTags.Blocks.OAK_PLANKS, ModTags.Items.OAK_PLANKS);
        copy(ModTags.Blocks.SPRUCE_PLANKS, ModTags.Items.SPRUCE_PLANKS);
        copy(ModTags.Blocks.WARPED_PLANKS, ModTags.Items.WARPED_PLANKS);
    }
}