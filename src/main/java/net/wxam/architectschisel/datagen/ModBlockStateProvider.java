package net.wxam.architectschisel.datagen;

import net.minecraft.core.Direction;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.ChainBlock;
import net.minecraft.world.level.block.RotatedPillarBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.neoforged.neoforge.client.model.generators.BlockStateProvider;
import net.neoforged.neoforge.client.model.generators.ModelFile;
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
        blockWithItem(ModBlocks.ACACIA_FRAME_1);
        blockWithItem(ModBlocks.ACACIA_FRAME_2);
        blockWithItem(ModBlocks.ACACIA_FRAME_3);
        blockWithItem(ModBlocks.ACACIA_FRAME_4);
        blockWithItem(ModBlocks.ACACIA_FRAME_5);
        blockWithItem(ModBlocks.ACACIA_FRAME_6);
        blockWithItem(ModBlocks.ACACIA_FRAME_7);
        blockWithItem(ModBlocks.ACACIA_FRAME_8);
        blockWithItem(ModBlocks.ACACIA_PLANKS_1);
        blockWithItem(ModBlocks.ACACIA_PLANKS_2);
        blockWithItem(ModBlocks.ACACIA_PLANKS_3);
        blockWithItem(ModBlocks.ACACIA_PLANKS_4);
        blockWithItem(ModBlocks.ACACIA_PLANKS_5);
        blockWithItem(ModBlocks.ACACIA_PLANKS_6);
        blockWithItem(ModBlocks.ACACIA_PLANKS_7);
        stairsBlock(ModBlocks.ACACIA_STAIRS_1, "acacia_planks_1");
        stairsBlock(ModBlocks.ACACIA_STAIRS_2, "acacia_planks_2");
        stairsBlock(ModBlocks.ACACIA_STAIRS_3, "acacia_planks_3");
        stairsBlock(ModBlocks.ACACIA_STAIRS_4, "acacia_planks_4");
        stairsBlock(ModBlocks.ACACIA_STAIRS_5, "acacia_planks_5");
        stairsBlock(ModBlocks.ACACIA_STAIRS_6, "acacia_planks_6");
        stairsBlock(ModBlocks.ACACIA_STAIRS_7, "acacia_planks_7");
        slabBlock(ModBlocks.ACACIA_SLAB_1, "acacia_planks_1");
        slabBlock(ModBlocks.ACACIA_SLAB_2, "acacia_planks_2");
        slabBlock(ModBlocks.ACACIA_SLAB_3, "acacia_planks_3");
        slabBlock(ModBlocks.ACACIA_SLAB_4, "acacia_planks_4");
        slabBlock(ModBlocks.ACACIA_SLAB_5, "acacia_planks_5");
        slabBlock(ModBlocks.ACACIA_SLAB_6, "acacia_planks_6");
        slabBlock(ModBlocks.ACACIA_SLAB_7, "acacia_planks_7");
        
        blockWithItem(ModBlocks.BAMBOO_FRAME_1);
        blockWithItem(ModBlocks.BAMBOO_FRAME_2);
        blockWithItem(ModBlocks.BAMBOO_FRAME_3);
        blockWithItem(ModBlocks.BAMBOO_FRAME_4);
        blockWithItem(ModBlocks.BAMBOO_FRAME_5);
        blockWithItem(ModBlocks.BAMBOO_FRAME_6);
        blockWithItem(ModBlocks.BAMBOO_FRAME_7);
        blockWithItem(ModBlocks.BAMBOO_FRAME_8);
        blockWithItem(ModBlocks.BAMBOO_PLANKS_1);
        blockWithItem(ModBlocks.BAMBOO_PLANKS_2);
        blockWithItem(ModBlocks.BAMBOO_PLANKS_3);
        blockWithItem(ModBlocks.BAMBOO_PLANKS_4);
        blockWithItem(ModBlocks.BAMBOO_PLANKS_5);
        blockWithItem(ModBlocks.BAMBOO_PLANKS_6);
        stairsBlock(ModBlocks.BAMBOO_STAIRS_1, "bamboo_planks_1");
        stairsBlock(ModBlocks.BAMBOO_STAIRS_2, "bamboo_planks_2");
        stairsBlock(ModBlocks.BAMBOO_STAIRS_3, "bamboo_planks_3");
        stairsBlock(ModBlocks.BAMBOO_STAIRS_4, "bamboo_planks_4");
        stairsBlock(ModBlocks.BAMBOO_STAIRS_5, "bamboo_planks_5");
        stairsBlock(ModBlocks.BAMBOO_STAIRS_6, "bamboo_planks_6");
        slabBlock(ModBlocks.BAMBOO_SLAB_1, "bamboo_planks_1");
        slabBlock(ModBlocks.BAMBOO_SLAB_2, "bamboo_planks_2");
        slabBlock(ModBlocks.BAMBOO_SLAB_3, "bamboo_planks_3");
        slabBlock(ModBlocks.BAMBOO_SLAB_4, "bamboo_planks_4");
        slabBlock(ModBlocks.BAMBOO_SLAB_5, "bamboo_planks_5");
        slabBlock(ModBlocks.BAMBOO_SLAB_6, "bamboo_planks_6");
        
        blockWithItem(ModBlocks.BIRCH_FRAME_1);
        blockWithItem(ModBlocks.BIRCH_FRAME_2);
        blockWithItem(ModBlocks.BIRCH_FRAME_3);
        blockWithItem(ModBlocks.BIRCH_FRAME_4);
        blockWithItem(ModBlocks.BIRCH_FRAME_5);
        blockWithItem(ModBlocks.BIRCH_FRAME_6);
        blockWithItem(ModBlocks.BIRCH_FRAME_7);
        blockWithItem(ModBlocks.BIRCH_FRAME_8);
        blockWithItem(ModBlocks.BIRCH_PLANKS_1);
        blockWithItem(ModBlocks.BIRCH_PLANKS_2);
        blockWithItem(ModBlocks.BIRCH_PLANKS_3);
        blockWithItem(ModBlocks.BIRCH_PLANKS_4);
        blockWithItem(ModBlocks.BIRCH_PLANKS_5);
        blockWithItem(ModBlocks.BIRCH_PLANKS_6);
        blockWithItem(ModBlocks.BIRCH_PLANKS_7);
        stairsBlock(ModBlocks.BIRCH_STAIRS_1, "birch_planks_1");
        stairsBlock(ModBlocks.BIRCH_STAIRS_2, "birch_planks_2");
        stairsBlock(ModBlocks.BIRCH_STAIRS_3, "birch_planks_3");
        stairsBlock(ModBlocks.BIRCH_STAIRS_4, "birch_planks_4");
        stairsBlock(ModBlocks.BIRCH_STAIRS_5, "birch_planks_5");
        stairsBlock(ModBlocks.BIRCH_STAIRS_6, "birch_planks_6");
        stairsBlock(ModBlocks.BIRCH_STAIRS_7, "birch_planks_7");
        slabBlock(ModBlocks.BIRCH_SLAB_1, "birch_planks_1");
        slabBlock(ModBlocks.BIRCH_SLAB_2, "birch_planks_2");
        slabBlock(ModBlocks.BIRCH_SLAB_3, "birch_planks_3");
        slabBlock(ModBlocks.BIRCH_SLAB_4, "birch_planks_4");
        slabBlock(ModBlocks.BIRCH_SLAB_5, "birch_planks_5");
        slabBlock(ModBlocks.BIRCH_SLAB_6, "birch_planks_6");
        slabBlock(ModBlocks.BIRCH_SLAB_7, "birch_planks_7");
        
        blockWithItem(ModBlocks.CHERRY_FRAME_1);
        blockWithItem(ModBlocks.CHERRY_FRAME_2);
        blockWithItem(ModBlocks.CHERRY_FRAME_3);
        blockWithItem(ModBlocks.CHERRY_FRAME_4);
        blockWithItem(ModBlocks.CHERRY_FRAME_5);
        blockWithItem(ModBlocks.CHERRY_FRAME_6);
        blockWithItem(ModBlocks.CHERRY_FRAME_7);
        blockWithItem(ModBlocks.CHERRY_FRAME_8);
        blockWithItem(ModBlocks.CHERRY_PLANKS_1);
        blockWithItem(ModBlocks.CHERRY_PLANKS_2);
        blockWithItem(ModBlocks.CHERRY_PLANKS_3);
        blockWithItem(ModBlocks.CHERRY_PLANKS_4);
        blockWithItem(ModBlocks.CHERRY_PLANKS_5);
        blockWithItem(ModBlocks.CHERRY_PLANKS_6);
        blockWithItem(ModBlocks.CHERRY_PLANKS_7);
        stairsBlock(ModBlocks.CHERRY_STAIRS_1, "cherry_planks_1");
        stairsBlock(ModBlocks.CHERRY_STAIRS_2, "cherry_planks_2");
        stairsBlock(ModBlocks.CHERRY_STAIRS_3, "cherry_planks_3");
        stairsBlock(ModBlocks.CHERRY_STAIRS_4, "cherry_planks_4");
        stairsBlock(ModBlocks.CHERRY_STAIRS_5, "cherry_planks_5");
        stairsBlock(ModBlocks.CHERRY_STAIRS_6, "cherry_planks_6");
        stairsBlock(ModBlocks.CHERRY_STAIRS_7, "cherry_planks_7");
        slabBlock(ModBlocks.CHERRY_SLAB_1, "cherry_planks_1");
        slabBlock(ModBlocks.CHERRY_SLAB_2, "cherry_planks_2");
        slabBlock(ModBlocks.CHERRY_SLAB_3, "cherry_planks_3");
        slabBlock(ModBlocks.CHERRY_SLAB_4, "cherry_planks_4");
        slabBlock(ModBlocks.CHERRY_SLAB_5, "cherry_planks_5");
        slabBlock(ModBlocks.CHERRY_SLAB_6, "cherry_planks_6");
        slabBlock(ModBlocks.CHERRY_SLAB_7, "cherry_planks_7");
        
        blockWithItem(ModBlocks.CRIMSON_FRAME_1);
        blockWithItem(ModBlocks.CRIMSON_FRAME_2);
        blockWithItem(ModBlocks.CRIMSON_FRAME_3);
        blockWithItem(ModBlocks.CRIMSON_FRAME_4);
        blockWithItem(ModBlocks.CRIMSON_FRAME_5);
        blockWithItem(ModBlocks.CRIMSON_FRAME_6);
        blockWithItem(ModBlocks.CRIMSON_FRAME_7);
        blockWithItem(ModBlocks.CRIMSON_FRAME_8);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_1);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_2);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_3);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_4);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_5);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_6);
        blockWithItem(ModBlocks.CRIMSON_PLANKS_7);
        stairsBlock(ModBlocks.CRIMSON_STAIRS_1, "crimson_planks_1");
        stairsBlock(ModBlocks.CRIMSON_STAIRS_2, "crimson_planks_2");
        stairsBlock(ModBlocks.CRIMSON_STAIRS_3, "crimson_planks_3");
        stairsBlock(ModBlocks.CRIMSON_STAIRS_4, "crimson_planks_4");
        stairsBlock(ModBlocks.CRIMSON_STAIRS_5, "crimson_planks_5");
        stairsBlock(ModBlocks.CRIMSON_STAIRS_6, "crimson_planks_6");
        stairsBlock(ModBlocks.CRIMSON_STAIRS_7, "crimson_planks_7");
        slabBlock(ModBlocks.CRIMSON_SLAB_1, "crimson_planks_1");
        slabBlock(ModBlocks.CRIMSON_SLAB_2, "crimson_planks_2");
        slabBlock(ModBlocks.CRIMSON_SLAB_3, "crimson_planks_3");
        slabBlock(ModBlocks.CRIMSON_SLAB_4, "crimson_planks_4");
        slabBlock(ModBlocks.CRIMSON_SLAB_5, "crimson_planks_5");
        slabBlock(ModBlocks.CRIMSON_SLAB_6, "crimson_planks_6");
        slabBlock(ModBlocks.CRIMSON_SLAB_7, "crimson_planks_7");
        
        blockWithItem(ModBlocks.DARK_OAK_FRAME_1);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_2);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_3);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_4);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_5);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_6);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_7);
        blockWithItem(ModBlocks.DARK_OAK_FRAME_8);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_1);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_2);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_3);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_4);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_5);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_6);
        blockWithItem(ModBlocks.DARK_OAK_PLANKS_7);
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_1, "dark_oak_planks_1");
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_2, "dark_oak_planks_2");
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_3, "dark_oak_planks_3");
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_4, "dark_oak_planks_4");
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_5, "dark_oak_planks_5");
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_6, "dark_oak_planks_6");
        stairsBlock(ModBlocks.DARK_OAK_STAIRS_7, "dark_oak_planks_7");
        slabBlock(ModBlocks.DARK_OAK_SLAB_1, "dark_oak_planks_1");
        slabBlock(ModBlocks.DARK_OAK_SLAB_2, "dark_oak_planks_2");
        slabBlock(ModBlocks.DARK_OAK_SLAB_3, "dark_oak_planks_3");
        slabBlock(ModBlocks.DARK_OAK_SLAB_4, "dark_oak_planks_4");
        slabBlock(ModBlocks.DARK_OAK_SLAB_5, "dark_oak_planks_5");
        slabBlock(ModBlocks.DARK_OAK_SLAB_6, "dark_oak_planks_6");
        slabBlock(ModBlocks.DARK_OAK_SLAB_7, "dark_oak_planks_7");
        
        blockWithItem(ModBlocks.JUNGLE_FRAME_1);
        blockWithItem(ModBlocks.JUNGLE_FRAME_2);
        blockWithItem(ModBlocks.JUNGLE_FRAME_3);
        blockWithItem(ModBlocks.JUNGLE_FRAME_4);
        blockWithItem(ModBlocks.JUNGLE_FRAME_5);
        blockWithItem(ModBlocks.JUNGLE_FRAME_6);
        blockWithItem(ModBlocks.JUNGLE_FRAME_7);
        blockWithItem(ModBlocks.JUNGLE_FRAME_8);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_1);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_2);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_3);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_4);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_5);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_6);
        blockWithItem(ModBlocks.JUNGLE_PLANKS_7);
        stairsBlock(ModBlocks.JUNGLE_STAIRS_1, "jungle_planks_1");
        stairsBlock(ModBlocks.JUNGLE_STAIRS_2, "jungle_planks_2");
        stairsBlock(ModBlocks.JUNGLE_STAIRS_3, "jungle_planks_3");
        stairsBlock(ModBlocks.JUNGLE_STAIRS_4, "jungle_planks_4");
        stairsBlock(ModBlocks.JUNGLE_STAIRS_5, "jungle_planks_5");
        stairsBlock(ModBlocks.JUNGLE_STAIRS_6, "jungle_planks_6");
        stairsBlock(ModBlocks.JUNGLE_STAIRS_7, "jungle_planks_7");
        slabBlock(ModBlocks.JUNGLE_SLAB_1, "jungle_planks_1");
        slabBlock(ModBlocks.JUNGLE_SLAB_2, "jungle_planks_2");
        slabBlock(ModBlocks.JUNGLE_SLAB_3, "jungle_planks_3");
        slabBlock(ModBlocks.JUNGLE_SLAB_4, "jungle_planks_4");
        slabBlock(ModBlocks.JUNGLE_SLAB_5, "jungle_planks_5");
        slabBlock(ModBlocks.JUNGLE_SLAB_6, "jungle_planks_6");
        slabBlock(ModBlocks.JUNGLE_SLAB_7, "jungle_planks_7");
        
        blockWithItem(ModBlocks.MANGROVE_FRAME_1);
        blockWithItem(ModBlocks.MANGROVE_FRAME_2);
        blockWithItem(ModBlocks.MANGROVE_FRAME_3);
        blockWithItem(ModBlocks.MANGROVE_FRAME_4);
        blockWithItem(ModBlocks.MANGROVE_FRAME_5);
        blockWithItem(ModBlocks.MANGROVE_FRAME_6);
        blockWithItem(ModBlocks.MANGROVE_FRAME_7);
        blockWithItem(ModBlocks.MANGROVE_FRAME_8);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_1);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_2);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_3);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_4);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_5);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_6);
        blockWithItem(ModBlocks.MANGROVE_PLANKS_7);
        stairsBlock(ModBlocks.MANGROVE_STAIRS_1, "mangrove_planks_1");
        stairsBlock(ModBlocks.MANGROVE_STAIRS_2, "mangrove_planks_2");
        stairsBlock(ModBlocks.MANGROVE_STAIRS_3, "mangrove_planks_3");
        stairsBlock(ModBlocks.MANGROVE_STAIRS_4, "mangrove_planks_4");
        stairsBlock(ModBlocks.MANGROVE_STAIRS_5, "mangrove_planks_5");
        stairsBlock(ModBlocks.MANGROVE_STAIRS_6, "mangrove_planks_6");
        stairsBlock(ModBlocks.MANGROVE_STAIRS_7, "mangrove_planks_7");
        slabBlock(ModBlocks.MANGROVE_SLAB_1, "mangrove_planks_1");
        slabBlock(ModBlocks.MANGROVE_SLAB_2, "mangrove_planks_2");
        slabBlock(ModBlocks.MANGROVE_SLAB_3, "mangrove_planks_3");
        slabBlock(ModBlocks.MANGROVE_SLAB_4, "mangrove_planks_4");
        slabBlock(ModBlocks.MANGROVE_SLAB_5, "mangrove_planks_5");
        slabBlock(ModBlocks.MANGROVE_SLAB_6, "mangrove_planks_6");
        slabBlock(ModBlocks.MANGROVE_SLAB_7, "mangrove_planks_7");
        
        blockWithItem(ModBlocks.OAK_FRAME_1);
        blockWithItem(ModBlocks.OAK_FRAME_2);
        blockWithItem(ModBlocks.OAK_FRAME_3);
        blockWithItem(ModBlocks.OAK_FRAME_4);
        blockWithItem(ModBlocks.OAK_FRAME_5);
        blockWithItem(ModBlocks.OAK_FRAME_6);
        blockWithItem(ModBlocks.OAK_FRAME_7);
        blockWithItem(ModBlocks.OAK_FRAME_8);
        blockWithItem(ModBlocks.OAK_PLANKS_1);
        blockWithItem(ModBlocks.OAK_PLANKS_2);
        blockWithItem(ModBlocks.OAK_PLANKS_3);
        blockWithItem(ModBlocks.OAK_PLANKS_4);
        blockWithItem(ModBlocks.OAK_PLANKS_5);
        blockWithItem(ModBlocks.OAK_PLANKS_6);
        blockWithItem(ModBlocks.OAK_PLANKS_7);
        stairsBlock(ModBlocks.OAK_STAIRS_1, "oak_planks_1");
        stairsBlock(ModBlocks.OAK_STAIRS_2, "oak_planks_2");
        stairsBlock(ModBlocks.OAK_STAIRS_3, "oak_planks_3");
        stairsBlock(ModBlocks.OAK_STAIRS_4, "oak_planks_4");
        stairsBlock(ModBlocks.OAK_STAIRS_5, "oak_planks_5");
        stairsBlock(ModBlocks.OAK_STAIRS_6, "oak_planks_6");
        stairsBlock(ModBlocks.OAK_STAIRS_7, "oak_planks_7");
        slabBlock(ModBlocks.OAK_SLAB_1, "oak_planks_1");
        slabBlock(ModBlocks.OAK_SLAB_2, "oak_planks_2");
        slabBlock(ModBlocks.OAK_SLAB_3, "oak_planks_3");
        slabBlock(ModBlocks.OAK_SLAB_4, "oak_planks_4");
        slabBlock(ModBlocks.OAK_SLAB_5, "oak_planks_5");
        slabBlock(ModBlocks.OAK_SLAB_6, "oak_planks_6");
        slabBlock(ModBlocks.OAK_SLAB_7, "oak_planks_7");
        
        blockWithItem(ModBlocks.SPRUCE_FRAME_1);
        blockWithItem(ModBlocks.SPRUCE_FRAME_2);
        blockWithItem(ModBlocks.SPRUCE_FRAME_3);
        blockWithItem(ModBlocks.SPRUCE_FRAME_4);
        blockWithItem(ModBlocks.SPRUCE_FRAME_5);
        blockWithItem(ModBlocks.SPRUCE_FRAME_6);
        blockWithItem(ModBlocks.SPRUCE_FRAME_7);
        blockWithItem(ModBlocks.SPRUCE_FRAME_8);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_1);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_2);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_3);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_4);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_5);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_6);
        blockWithItem(ModBlocks.SPRUCE_PLANKS_7);
        stairsBlock(ModBlocks.SPRUCE_STAIRS_1, "spruce_planks_1");
        stairsBlock(ModBlocks.SPRUCE_STAIRS_2, "spruce_planks_2");
        stairsBlock(ModBlocks.SPRUCE_STAIRS_3, "spruce_planks_3");
        stairsBlock(ModBlocks.SPRUCE_STAIRS_4, "spruce_planks_4");
        stairsBlock(ModBlocks.SPRUCE_STAIRS_5, "spruce_planks_5");
        stairsBlock(ModBlocks.SPRUCE_STAIRS_6, "spruce_planks_6");
        stairsBlock(ModBlocks.SPRUCE_STAIRS_7, "spruce_planks_7");
        slabBlock(ModBlocks.SPRUCE_SLAB_1, "spruce_planks_1");
        slabBlock(ModBlocks.SPRUCE_SLAB_2, "spruce_planks_2");
        slabBlock(ModBlocks.SPRUCE_SLAB_3, "spruce_planks_3");
        slabBlock(ModBlocks.SPRUCE_SLAB_4, "spruce_planks_4");
        slabBlock(ModBlocks.SPRUCE_SLAB_5, "spruce_planks_5");
        slabBlock(ModBlocks.SPRUCE_SLAB_6, "spruce_planks_6");
        slabBlock(ModBlocks.SPRUCE_SLAB_7, "spruce_planks_7");
        
        blockWithItem(ModBlocks.WARPED_FRAME_1);
        blockWithItem(ModBlocks.WARPED_FRAME_2);
        blockWithItem(ModBlocks.WARPED_FRAME_3);
        blockWithItem(ModBlocks.WARPED_FRAME_4);
        blockWithItem(ModBlocks.WARPED_FRAME_5);
        blockWithItem(ModBlocks.WARPED_FRAME_6);
        blockWithItem(ModBlocks.WARPED_FRAME_7);
        blockWithItem(ModBlocks.WARPED_FRAME_8);
        blockWithItem(ModBlocks.WARPED_PLANKS_1);
        blockWithItem(ModBlocks.WARPED_PLANKS_2);
        blockWithItem(ModBlocks.WARPED_PLANKS_3);
        blockWithItem(ModBlocks.WARPED_PLANKS_4);
        blockWithItem(ModBlocks.WARPED_PLANKS_5);
        blockWithItem(ModBlocks.WARPED_PLANKS_6);
        blockWithItem(ModBlocks.WARPED_PLANKS_7);
        stairsBlock(ModBlocks.WARPED_STAIRS_1, "warped_planks_1");
        stairsBlock(ModBlocks.WARPED_STAIRS_2, "warped_planks_2");
        stairsBlock(ModBlocks.WARPED_STAIRS_3, "warped_planks_3");
        stairsBlock(ModBlocks.WARPED_STAIRS_4, "warped_planks_4");
        stairsBlock(ModBlocks.WARPED_STAIRS_5, "warped_planks_5");
        stairsBlock(ModBlocks.WARPED_STAIRS_6, "warped_planks_6");
        stairsBlock(ModBlocks.WARPED_STAIRS_7, "warped_planks_7");
        slabBlock(ModBlocks.WARPED_SLAB_1, "warped_planks_1");
        slabBlock(ModBlocks.WARPED_SLAB_2, "warped_planks_2");
        slabBlock(ModBlocks.WARPED_SLAB_3, "warped_planks_3");
        slabBlock(ModBlocks.WARPED_SLAB_4, "warped_planks_4");
        slabBlock(ModBlocks.WARPED_SLAB_5, "warped_planks_5");
        slabBlock(ModBlocks.WARPED_SLAB_6, "warped_planks_6");
        slabBlock(ModBlocks.WARPED_SLAB_7, "warped_planks_7");

        columnBlockWithItem(ModBlocks.COBBLESTONE_1, "cobblestone_1", "cobblestone_1_top");
        blockWithItem(ModBlocks.COBBLESTONE_2);
        blockWithItem(ModBlocks.COBBLESTONE_3);
        blockWithItem(ModBlocks.COBBLESTONE_4);
        blockWithItem(ModBlocks.COBBLESTONE_5);
        blockWithItem(ModBlocks.COBBLESTONE_6);
        blockWithItem(ModBlocks.COBBLESTONE_7);
        stairsBlockTop(ModBlocks.COBBLESTONE_STAIRS_1, "cobblestone_1", "cobblestone_1_top");
        stairsBlock(ModBlocks.COBBLESTONE_STAIRS_2, "cobblestone_2");
        stairsBlock(ModBlocks.COBBLESTONE_STAIRS_3, "cobblestone_3");
        stairsBlock(ModBlocks.COBBLESTONE_STAIRS_4, "cobblestone_4");
        stairsBlock(ModBlocks.COBBLESTONE_STAIRS_5, "cobblestone_5");
        stairsBlock(ModBlocks.COBBLESTONE_STAIRS_6, "cobblestone_6");
        stairsBlock(ModBlocks.COBBLESTONE_STAIRS_7, "cobblestone_7");
        slabBlockTop(ModBlocks.COBBLESTONE_SLAB_1, "cobblestone_1", "cobblestone_1_top");
        slabBlock(ModBlocks.COBBLESTONE_SLAB_2, "cobblestone_2");
        slabBlock(ModBlocks.COBBLESTONE_SLAB_3, "cobblestone_3");
        slabBlock(ModBlocks.COBBLESTONE_SLAB_4, "cobblestone_4");
        slabBlock(ModBlocks.COBBLESTONE_SLAB_5, "cobblestone_5");
        slabBlock(ModBlocks.COBBLESTONE_SLAB_6, "cobblestone_6");
        slabBlock(ModBlocks.COBBLESTONE_SLAB_7, "cobblestone_7");
        
        columnBlockWithItem(ModBlocks.GRANITE_1, "granite_1", "granite_1_top");
        blockWithItem(ModBlocks.GRANITE_2);
        blockWithItem(ModBlocks.GRANITE_3);
        blockWithItem(ModBlocks.GRANITE_4);
        blockWithItem(ModBlocks.GRANITE_5);
        blockWithItem(ModBlocks.GRANITE_6);
        blockWithItem(ModBlocks.GRANITE_7);
        stairsBlockTop(ModBlocks.GRANITE_STAIRS_1, "granite_1", "granite_1_top");
        stairsBlock(ModBlocks.GRANITE_STAIRS_2, "granite_2");
        stairsBlock(ModBlocks.GRANITE_STAIRS_3, "granite_3");
        stairsBlock(ModBlocks.GRANITE_STAIRS_4, "granite_4");
        stairsBlock(ModBlocks.GRANITE_STAIRS_5, "granite_5");
        stairsBlock(ModBlocks.GRANITE_STAIRS_6, "granite_6");
        stairsBlock(ModBlocks.GRANITE_STAIRS_7, "granite_7");
        slabBlockTop(ModBlocks.GRANITE_SLAB_1, "granite_1", "granite_1_top");
        slabBlock(ModBlocks.GRANITE_SLAB_2, "granite_2");
        slabBlock(ModBlocks.GRANITE_SLAB_3, "granite_3");
        slabBlock(ModBlocks.GRANITE_SLAB_4, "granite_4");
        slabBlock(ModBlocks.GRANITE_SLAB_5, "granite_5");
        slabBlock(ModBlocks.GRANITE_SLAB_6, "granite_6");
        slabBlock(ModBlocks.GRANITE_SLAB_7, "granite_7");
        
        columnBlockWithItem(ModBlocks.ANDESITE_1, "andesite_1", "andesite_1_top");
        blockWithItem(ModBlocks.ANDESITE_2);
        blockWithItem(ModBlocks.ANDESITE_3);
        blockWithItem(ModBlocks.ANDESITE_4);
        blockWithItem(ModBlocks.ANDESITE_5);
        blockWithItem(ModBlocks.ANDESITE_6);
        blockWithItem(ModBlocks.ANDESITE_7);
        stairsBlockTop(ModBlocks.ANDESITE_STAIRS_1, "andesite_1", "andesite_1_top");
        stairsBlock(ModBlocks.ANDESITE_STAIRS_2, "andesite_2");
        stairsBlock(ModBlocks.ANDESITE_STAIRS_3, "andesite_3");
        stairsBlock(ModBlocks.ANDESITE_STAIRS_4, "andesite_4");
        stairsBlock(ModBlocks.ANDESITE_STAIRS_5, "andesite_5");
        stairsBlock(ModBlocks.ANDESITE_STAIRS_6, "andesite_6");
        stairsBlock(ModBlocks.ANDESITE_STAIRS_7, "andesite_7");
        slabBlockTop(ModBlocks.ANDESITE_SLAB_1, "andesite_1", "andesite_1_top");
        slabBlock(ModBlocks.ANDESITE_SLAB_2, "andesite_2");
        slabBlock(ModBlocks.ANDESITE_SLAB_3, "andesite_3");
        slabBlock(ModBlocks.ANDESITE_SLAB_4, "andesite_4");
        slabBlock(ModBlocks.ANDESITE_SLAB_5, "andesite_5");
        slabBlock(ModBlocks.ANDESITE_SLAB_6, "andesite_6");
        slabBlock(ModBlocks.ANDESITE_SLAB_7, "andesite_7");
        
        columnBlockWithItem(ModBlocks.DIORITE_1, "diorite_1", "diorite_1_top");
        blockWithItem(ModBlocks.DIORITE_2);
        blockWithItem(ModBlocks.DIORITE_3);
        blockWithItem(ModBlocks.DIORITE_4);
        blockWithItem(ModBlocks.DIORITE_5);
        blockWithItem(ModBlocks.DIORITE_6);
        blockWithItem(ModBlocks.DIORITE_7);
        stairsBlockTop(ModBlocks.DIORITE_STAIRS_1, "diorite_1", "diorite_1_top");
        stairsBlock(ModBlocks.DIORITE_STAIRS_2, "diorite_2");
        stairsBlock(ModBlocks.DIORITE_STAIRS_3, "diorite_3");
        stairsBlock(ModBlocks.DIORITE_STAIRS_4, "diorite_4");
        stairsBlock(ModBlocks.DIORITE_STAIRS_5, "diorite_5");
        stairsBlock(ModBlocks.DIORITE_STAIRS_6, "diorite_6");
        stairsBlock(ModBlocks.DIORITE_STAIRS_7, "diorite_7");
        slabBlockTop(ModBlocks.DIORITE_SLAB_1, "diorite_1", "diorite_1_top");
        slabBlock(ModBlocks.DIORITE_SLAB_2, "diorite_2");
        slabBlock(ModBlocks.DIORITE_SLAB_3, "diorite_3");
        slabBlock(ModBlocks.DIORITE_SLAB_4, "diorite_4");
        slabBlock(ModBlocks.DIORITE_SLAB_5, "diorite_5");
        slabBlock(ModBlocks.DIORITE_SLAB_6, "diorite_6");
        slabBlock(ModBlocks.DIORITE_SLAB_7, "diorite_7");

        blockWithItem(ModBlocks.STONE_BRICKS_1);
        blockWithItem(ModBlocks.STONE_BRICKS_2);
        blockWithItem(ModBlocks.STONE_BRICKS_3);
        topBlockWithItem(ModBlocks.STONE_BRICKS_4, "stone_bricks_4", "stone_bricks_4_top");
        columnBlockWithItem(ModBlocks.STONE_BRICKS_5, "stone_bricks_5", "stone_bricks_5_top");
        blockWithItem(ModBlocks.STONE_BRICKS_6);
        blockWithItem(ModBlocks.STONE_BRICKS_7);
        stairsBlock(ModBlocks.STONE_BRICK_STAIRS_1, "stone_bricks_1");
        stairsBlock(ModBlocks.STONE_BRICK_STAIRS_2, "stone_bricks_2");
        stairsBlock(ModBlocks.STONE_BRICK_STAIRS_3, "stone_bricks_3");
        stairsBlockTop(ModBlocks.STONE_BRICK_STAIRS_4, "stone_bricks_4", "stone_bricks_4_top");
        stairsBlockTop(ModBlocks.STONE_BRICK_STAIRS_5, "stone_bricks_5", "stone_bricks_5_top");
        stairsBlock(ModBlocks.STONE_BRICK_STAIRS_6, "stone_bricks_6");
        stairsBlock(ModBlocks.STONE_BRICK_STAIRS_7, "stone_bricks_7");
        slabBlock(ModBlocks.STONE_BRICK_SLAB_1, "stone_bricks_1");
        slabBlock(ModBlocks.STONE_BRICK_SLAB_2, "stone_bricks_2");
        slabBlock(ModBlocks.STONE_BRICK_SLAB_3, "stone_bricks_3");
        slabBlockTop(ModBlocks.STONE_BRICK_SLAB_4, "stone_bricks_4", "stone_bricks_4_top");
        slabBlockTop(ModBlocks.STONE_BRICK_SLAB_5, "stone_bricks_5", "stone_bricks_5_top");
        slabBlock(ModBlocks.STONE_BRICK_SLAB_6, "stone_bricks_6");
        slabBlock(ModBlocks.STONE_BRICK_SLAB_7, "stone_bricks_7");
        
        blockWithItem(ModBlocks.DEEPSLATE_1);
        blockWithItem(ModBlocks.DEEPSLATE_2);
        blockWithItem(ModBlocks.DEEPSLATE_3);
        blockWithItem(ModBlocks.DEEPSLATE_4);
        blockWithItem(ModBlocks.DEEPSLATE_5);
        stairsBlock(ModBlocks.DEEPSLATE_STAIRS_1, "deepslate_1");
        stairsBlock(ModBlocks.DEEPSLATE_STAIRS_2, "deepslate_2");
        stairsBlock(ModBlocks.DEEPSLATE_STAIRS_3, "deepslate_3");
        stairsBlock(ModBlocks.DEEPSLATE_STAIRS_4, "deepslate_4");
        stairsBlock(ModBlocks.DEEPSLATE_STAIRS_5, "deepslate_5");
        slabBlock(ModBlocks.DEEPSLATE_SLAB_1, "deepslate_1");
        slabBlock(ModBlocks.DEEPSLATE_SLAB_2, "deepslate_2");
        slabBlock(ModBlocks.DEEPSLATE_SLAB_3, "deepslate_3");
        slabBlock(ModBlocks.DEEPSLATE_SLAB_4, "deepslate_4");
        slabBlock(ModBlocks.DEEPSLATE_SLAB_5, "deepslate_5");
        
        blockWithItem(ModBlocks.BRICKS_1);
        blockWithItem(ModBlocks.BRICKS_2);
        blockWithItem(ModBlocks.BRICKS_3);
        blockWithItem(ModBlocks.BRICKS_4);
        blockWithItem(ModBlocks.BRICKS_5);
        blockWithItem(ModBlocks.BRICKS_6);
        blockWithItem(ModBlocks.BRICKS_7);
        stairsBlock(ModBlocks.BRICK_STAIRS_1, "bricks_1");
        stairsBlock(ModBlocks.BRICK_STAIRS_2, "bricks_2");
        stairsBlock(ModBlocks.BRICK_STAIRS_3, "bricks_3");
        stairsBlock(ModBlocks.BRICK_STAIRS_4, "bricks_4");
        stairsBlock(ModBlocks.BRICK_STAIRS_5, "bricks_5");
        stairsBlock(ModBlocks.BRICK_STAIRS_6, "bricks_6");
        stairsBlock(ModBlocks.BRICK_STAIRS_7, "bricks_7");
        slabBlock(ModBlocks.BRICK_SLAB_1, "bricks_1");
        slabBlock(ModBlocks.BRICK_SLAB_2, "bricks_2");
        slabBlock(ModBlocks.BRICK_SLAB_3, "bricks_3");
        slabBlock(ModBlocks.BRICK_SLAB_4, "bricks_4");
        slabBlock(ModBlocks.BRICK_SLAB_5, "bricks_5");
        slabBlock(ModBlocks.BRICK_SLAB_6, "bricks_6");
        slabBlock(ModBlocks.BRICK_SLAB_7, "bricks_7");

        blockWithItem(ModBlocks.SANDSTONE_1);
        blockWithItem(ModBlocks.SANDSTONE_2);
        blockWithItem(ModBlocks.SANDSTONE_3);
        blockWithItem(ModBlocks.SANDSTONE_4);
        blockWithItem(ModBlocks.SANDSTONE_5);
        stairsBlock(ModBlocks.SANDSTONE_STAIRS_1, "sandstone_1");
        stairsBlock(ModBlocks.SANDSTONE_STAIRS_2, "sandstone_2");
        stairsBlock(ModBlocks.SANDSTONE_STAIRS_3, "sandstone_3");
        stairsBlock(ModBlocks.SANDSTONE_STAIRS_4, "sandstone_4");
        stairsBlock(ModBlocks.SANDSTONE_STAIRS_5, "sandstone_5");
        stairsBlock(ModBlocks.SANDSTONE_STAIRS_6, "sandstone_stairs_6");
        slabBlock(ModBlocks.SANDSTONE_SLAB_1, "sandstone_1");
        slabBlock(ModBlocks.SANDSTONE_SLAB_2, "sandstone_2");
        slabBlock(ModBlocks.SANDSTONE_SLAB_3, "sandstone_3");
        slabBlock(ModBlocks.SANDSTONE_SLAB_4, "sandstone_4");
        slabBlock(ModBlocks.SANDSTONE_SLAB_5, "sandstone_5");

        blockWithItem(ModBlocks.PRISMARINE_1);
        blockWithItem(ModBlocks.PRISMARINE_2);
        blockWithItem(ModBlocks.PRISMARINE_3);
        blockWithItem(ModBlocks.PRISMARINE_4);
        blockWithItem(ModBlocks.PRISMARINE_5);
        columnBlockWithItem(ModBlocks.PRISMARINE_6, "prismarine_6", "prismarine_6_top");
        stairsBlock(ModBlocks.PRISMARINE_STAIRS_1, "prismarine_1");
        stairsBlock(ModBlocks.PRISMARINE_STAIRS_2, "prismarine_2");
        stairsBlock(ModBlocks.PRISMARINE_STAIRS_3, "prismarine_3");
        stairsBlock(ModBlocks.PRISMARINE_STAIRS_4, "prismarine_4");
        stairsBlock(ModBlocks.PRISMARINE_STAIRS_5, "prismarine_5");
        stairsBlockTop(ModBlocks.PRISMARINE_STAIRS_6, "prismarine_6", "prismarine_6_top");
        slabBlock(ModBlocks.PRISMARINE_SLAB_1, "prismarine_1");
        slabBlock(ModBlocks.PRISMARINE_SLAB_2, "prismarine_2");
        slabBlock(ModBlocks.PRISMARINE_SLAB_3, "prismarine_3");
        slabBlock(ModBlocks.PRISMARINE_SLAB_4, "prismarine_4");
        slabBlock(ModBlocks.PRISMARINE_SLAB_5, "prismarine_5");
        slabBlockTop(ModBlocks.PRISMARINE_SLAB_6, "prismarine_6", "prismarine_6_top");

        blockWithItem(ModBlocks.BLACKSTONE_1);
        blockWithItem(ModBlocks.BLACKSTONE_2);
        blockWithItem(ModBlocks.BLACKSTONE_3);
        blockWithItem(ModBlocks.BLACKSTONE_4);
        blockWithItem(ModBlocks.BLACKSTONE_5);
        columnBlockWithItem(ModBlocks.BLACKSTONE_6, "blackstone_6", "blackstone_6_top");

        blockWithItem(ModBlocks.GILDED_BLACKSTONE_1);
        blockWithItem(ModBlocks.GILDED_BLACKSTONE_2);
        blockWithItem(ModBlocks.GILDED_BLACKSTONE_3);
        columnBlockWithItem(ModBlocks.GILDED_BLACKSTONE_4, "gilded_blackstone_4", "gilded_blackstone_4_top");

        blockWithItem(ModBlocks.NETHER_BRICKS_1);
        blockWithItem(ModBlocks.NETHER_BRICKS_2);
        blockWithItem(ModBlocks.NETHER_BRICKS_3);
        blockWithItem(ModBlocks.NETHER_BRICKS_4);
        blockWithItem(ModBlocks.NETHER_BRICKS_5);
        columnBlockWithItem(ModBlocks.NETHER_BRICKS_6, "nether_bricks_6", "nether_bricks_6_top");

        blockWithItem(ModBlocks.GILDED_NETHER_BRICKS_1);
        blockWithItem(ModBlocks.GILDED_NETHER_BRICKS_2);
        blockWithItem(ModBlocks.GILDED_NETHER_BRICKS_3);
        columnBlockWithItem(ModBlocks.GILDED_NETHER_BRICKS_4, "gilded_nether_bricks_4", "gilded_nether_bricks_4_top");

        blockWithItemVanilla(ModBlocks.CALCITE_1, "calcite");
        blockWithItem(ModBlocks.CALCITE_2);
        blockWithItem(ModBlocks.CALCITE_3);
        blockWithItem(ModBlocks.CALCITE_4);
        blockWithItem(ModBlocks.CALCITE_5);
        blockWithItem(ModBlocks.CALCITE_6);
        blockWithItem(ModBlocks.CALCITE_7);
        blockWithItem(ModBlocks.CALCITE_8);
        stairsBlockVanilla(ModBlocks.CALCITE_STAIRS_1, "calcite");
        stairsBlock(ModBlocks.CALCITE_STAIRS_2, "calcite_2");
        stairsBlock(ModBlocks.CALCITE_STAIRS_3, "calcite_3");
        stairsBlock(ModBlocks.CALCITE_STAIRS_4, "calcite_4");
        stairsBlock(ModBlocks.CALCITE_STAIRS_5, "calcite_5");
        stairsBlock(ModBlocks.CALCITE_STAIRS_6, "calcite_6");
        stairsBlock(ModBlocks.CALCITE_STAIRS_7, "calcite_7");
        stairsBlock(ModBlocks.CALCITE_STAIRS_8, "calcite_8");
        slabBlockVanilla(ModBlocks.CALCITE_SLAB_1, "calcite");
        slabBlock(ModBlocks.CALCITE_SLAB_2, "calcite_2");
        slabBlock(ModBlocks.CALCITE_SLAB_3, "calcite_3");
        slabBlock(ModBlocks.CALCITE_SLAB_4, "calcite_4");
        slabBlock(ModBlocks.CALCITE_SLAB_5, "calcite_5");
        slabBlock(ModBlocks.CALCITE_SLAB_6, "calcite_6");
        slabBlock(ModBlocks.CALCITE_SLAB_7, "calcite_7");
        slabBlock(ModBlocks.CALCITE_SLAB_8, "calcite_8");

        columnBlockWithItem(ModBlocks.DRIPSTONE_1, "dripstone_1", "dripstone_1_top");
        blockWithItem(ModBlocks.DRIPSTONE_2);
        blockWithItem(ModBlocks.DRIPSTONE_3);
        blockWithItem(ModBlocks.DRIPSTONE_4);
        blockWithItem(ModBlocks.DRIPSTONE_5);
        blockWithItem(ModBlocks.DRIPSTONE_6);
        blockWithItem(ModBlocks.DRIPSTONE_7);
        stairsBlockTop(ModBlocks.DRIPSTONE_STAIRS_1, "dripstone_1", "dripstone_1_top");
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS_2, "dripstone_2");
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS_3, "dripstone_3");
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS_4, "dripstone_4");
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS_5, "dripstone_5");
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS_6, "dripstone_6");
        stairsBlock(ModBlocks.DRIPSTONE_STAIRS_7, "dripstone_7");
        stairsBlockVanilla(ModBlocks.DRIPSTONE_STAIRS_8, "dripstone_block");
        slabBlockTop(ModBlocks.DRIPSTONE_SLAB_1, "dripstone_1", "dripstone_1_top");
        slabBlock(ModBlocks.DRIPSTONE_SLAB_2, "dripstone_2");
        slabBlock(ModBlocks.DRIPSTONE_SLAB_3, "dripstone_3");
        slabBlock(ModBlocks.DRIPSTONE_SLAB_4, "dripstone_4");
        slabBlock(ModBlocks.DRIPSTONE_SLAB_5, "dripstone_5");
        slabBlock(ModBlocks.DRIPSTONE_SLAB_6, "dripstone_6");
        slabBlock(ModBlocks.DRIPSTONE_SLAB_7, "dripstone_7");
        slabBlockVanilla(ModBlocks.DRIPSTONE_SLAB_8, "dripstone_block");

        columnBlockWithItem(ModBlocks.TUFF_1, "tuff_1", "tuff_1_top");
        blockWithItem(ModBlocks.TUFF_2);
        blockWithItem(ModBlocks.TUFF_3);
        blockWithItem(ModBlocks.TUFF_4);
        columnBlockWithItem(ModBlocks.TUFF_5, "tuff_5", "tuff_5_top");
        blockWithItem(ModBlocks.TUFF_6);
        blockWithItem(ModBlocks.TUFF_7);
        blockWithItemVanilla(ModBlocks.TUFF_8, "tuff");
        stairsBlockTop(ModBlocks.TUFF_STAIRS_1, "tuff_1", "tuff_1_top");
        stairsBlock(ModBlocks.TUFF_STAIRS_2, "tuff_2");
        stairsBlock(ModBlocks.TUFF_STAIRS_3, "tuff_3");
        stairsBlock(ModBlocks.TUFF_STAIRS_4, "tuff_4");
        stairsBlockTop(ModBlocks.TUFF_STAIRS_5, "tuff_5", "tuff_5_top");
        stairsBlock(ModBlocks.TUFF_STAIRS_6, "tuff_6");
        stairsBlock(ModBlocks.TUFF_STAIRS_7, "tuff_7");
        stairsBlockVanilla(ModBlocks.TUFF_STAIRS_8, "tuff");
        slabBlockTop(ModBlocks.TUFF_SLAB_1, "tuff_1", "tuff_1_top");
        slabBlock(ModBlocks.TUFF_SLAB_2, "tuff_2");
        slabBlock(ModBlocks.TUFF_SLAB_3, "tuff_3");
        slabBlock(ModBlocks.TUFF_SLAB_4, "tuff_4");
        slabBlockTop(ModBlocks.TUFF_SLAB_5, "tuff_5", "tuff_5_top");
        slabBlock(ModBlocks.TUFF_SLAB_6, "tuff_6");
        slabBlock(ModBlocks.TUFF_SLAB_7, "tuff_7");
        slabBlockVanilla(ModBlocks.TUFF_SLAB_8, "tuff");

        blockWithItem(ModBlocks.AMETHYST_BLOCK_1);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_2);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_3);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_4);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_5);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_6);
        blockWithItem(ModBlocks.AMETHYST_BLOCK_7);
        stairsBlock(ModBlocks.AMETHYST_STAIRS_1, "amethyst_block_1");
        stairsBlock(ModBlocks.AMETHYST_STAIRS_2, "amethyst_block_2");
        stairsBlock(ModBlocks.AMETHYST_STAIRS_3, "amethyst_block_3");
        stairsBlock(ModBlocks.AMETHYST_STAIRS_4, "amethyst_block_4");
        stairsBlock(ModBlocks.AMETHYST_STAIRS_5, "amethyst_block_5");
        stairsBlock(ModBlocks.AMETHYST_STAIRS_6, "amethyst_block_6");
        stairsBlock(ModBlocks.AMETHYST_STAIRS_7, "amethyst_block_7");
        stairsBlockVanilla(ModBlocks.AMETHYST_STAIRS_8, "amethyst_block");
        slabBlock(ModBlocks.AMETHYST_SLAB_1, "amethyst_block_1");
        slabBlock(ModBlocks.AMETHYST_SLAB_2, "amethyst_block_2");
        slabBlock(ModBlocks.AMETHYST_SLAB_3, "amethyst_block_3");
        slabBlock(ModBlocks.AMETHYST_SLAB_4, "amethyst_block_4");
        slabBlock(ModBlocks.AMETHYST_SLAB_5, "amethyst_block_5");
        slabBlock(ModBlocks.AMETHYST_SLAB_6, "amethyst_block_6");
        slabBlock(ModBlocks.AMETHYST_SLAB_7, "amethyst_block_7");
        slabBlockVanilla(ModBlocks.AMETHYST_SLAB_8, "amethyst_block");
    }

    private void blockWithItem(DeferredBlock<?> deferredBlock) {
        simpleBlockWithItem(deferredBlock.get(), cubeAll(deferredBlock.get()));
    }

    private void blockWithItemVanilla(DeferredBlock<?> deferredBlock, String textureName) {
        simpleBlockWithItem(deferredBlock.get(), models().cubeAll(
                deferredBlock.getId().getPath(), mcLoc("block/" + textureName)));
    }

    private void stairsBlock(DeferredBlock<StairBlock> deferredBlock, String textureName) {
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + textureName);
        stairsBlock(deferredBlock.get(), texture);
        simpleBlockItem(deferredBlock.get(), models().stairs(deferredBlock.get().getDescriptionId(), texture, texture, texture));
    }

    private void stairsBlockTop(DeferredBlock<StairBlock> deferredBlock, String sideTexture, String topTexture) {
        ResourceLocation side = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + sideTexture);
        ResourceLocation top = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + topTexture);
        stairsBlock(deferredBlock.get(), side, top, top);
        simpleBlockItem(deferredBlock.get(), models().stairs(deferredBlock.get().getDescriptionId(), side, top, top));
    }

    private void slabBlock(DeferredBlock<SlabBlock> deferredBlock, String textureName) {
        ResourceLocation texture = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + textureName);
        ResourceLocation fullBlock = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + textureName);
        slabBlock(deferredBlock.get(), fullBlock, texture);
        simpleBlockItem(deferredBlock.get(), models().slab(deferredBlock.get().getDescriptionId(), texture, texture, texture));
    }

    private void slabBlockTop(DeferredBlock<SlabBlock> deferredBlock, String sideTexture, String topTexture) {
        ResourceLocation side = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + sideTexture);
        ResourceLocation top = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + topTexture);
        String blockName = deferredBlock.getId().getPath();
        ModelFile fullBlock = models().cubeTop(blockName + "_full", side, top);
        slabBlock(deferredBlock.get(), fullBlock.getLocation(), side, top, top);
        simpleBlockItem(deferredBlock.get(), models().slab(blockName, side, top, top));
    }

    private void columnBlockWithItem(DeferredBlock<RotatedPillarBlock> deferredBlock, String sideTexture, String endTexture) {
        ResourceLocation side = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + sideTexture);
        ResourceLocation end = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + endTexture);
        axisBlock(deferredBlock.get(), side, end);
        simpleBlockItem(deferredBlock.get(), models().cubeColumn(deferredBlock.getId().getPath(), side, end));
    }

    private void topBlockWithItem(DeferredBlock<?> deferredBlock, String sideTexture, String topTexture) {
        ResourceLocation side = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + sideTexture);
        ResourceLocation top = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/" + topTexture);
        simpleBlockWithItem(deferredBlock.get(), models().cubeTop(deferredBlock.get().getDescriptionId(), side, top));
    }

    private void stairsBlockVanilla(DeferredBlock<StairBlock> deferredBlock, String textureName) {
        ResourceLocation texture = mcLoc("block/" + textureName);
        stairsBlock(deferredBlock.get(), texture);
        simpleBlockItem(deferredBlock.get(), models().stairs(deferredBlock.get().getDescriptionId(), texture, texture, texture));
    }

    private void slabBlockVanilla(DeferredBlock<SlabBlock> deferredBlock, String textureName) {
        ResourceLocation texture = mcLoc("block/" + textureName);
        slabBlock(deferredBlock.get(), texture, texture);
        simpleBlockItem(deferredBlock.get(), models().slab(deferredBlock.get().getDescriptionId(), texture, texture, texture));
    }

    private void chainBlock(DeferredBlock<ChainBlock> deferredBlock, String textureName) {
        ResourceLocation blocktexture = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "block/decorative/chains/" + textureName);
        ResourceLocation itemTexture = ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "item/" + textureName);

        ModelFile chainModel = models().withExistingParent(deferredBlock.getId().getPath(), mcLoc("block/chain"))
                .texture("all", blocktexture)
                .texture("particle", blocktexture);

        getVariantBuilder(deferredBlock.get())
                .partialState().with(ChainBlock.AXIS, Direction.Axis.Y)
                .modelForState().modelFile(chainModel).addModel()
                .partialState().with(ChainBlock.AXIS, Direction.Axis.X)
                .modelForState().modelFile(chainModel).rotationX(90).rotationY(90).addModel()
                .partialState().with(ChainBlock.AXIS, Direction.Axis.Z)
                .modelForState().modelFile(chainModel).rotationX(90).addModel();

        itemModels().withExistingParent(deferredBlock.getId().getPath(), mcLoc("item/generated"))
                .texture("layer0", itemTexture);
    }
}
