package net.wxam.architectschisel.datagen;

import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.neoforged.neoforge.common.conditions.IConditionBuilder;
import net.wxam.architectschisel.ModTags;
import net.wxam.architectschisel.block.ModBlocks;

import java.util.concurrent.CompletableFuture;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {

    public ModRecipeProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider) {
        super(output, lookupProvider);
    }

    @Override
    protected void buildRecipes(RecipeOutput output) {
        // Acacia Planks 1
        stairBuilder(ModBlocks.ACACIA_STAIRS_1.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_1.get()))
                .unlockedBy("has_acacia_planks_1", has(ModBlocks.ACACIA_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_1.get())
                .unlockedBy("has_acacia_planks_1", has(ModBlocks.ACACIA_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.ACACIA_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Acacia Planks 2
        stairBuilder(ModBlocks.ACACIA_STAIRS_2.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_2.get()))
                .unlockedBy("has_acacia_planks_2", has(ModBlocks.ACACIA_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_2.get())
                .unlockedBy("has_acacia_planks_2", has(ModBlocks.ACACIA_PLANKS_2.get()))
                .save(output);

        // Acacia Planks 3
        stairBuilder(ModBlocks.ACACIA_STAIRS_3.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_3.get()))
                .unlockedBy("has_acacia_planks_3", has(ModBlocks.ACACIA_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_3.get())
                .unlockedBy("has_acacia_planks_3", has(ModBlocks.ACACIA_PLANKS_3.get()))
                .save(output);

        // Acacia Planks 4
        stairBuilder(ModBlocks.ACACIA_STAIRS_4.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_4.get()))
                .unlockedBy("has_acacia_planks_4", has(ModBlocks.ACACIA_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_4.get())
                .unlockedBy("has_acacia_planks_4", has(ModBlocks.ACACIA_PLANKS_4.get()))
                .save(output);

        // Acacia Planks 5
        stairBuilder(ModBlocks.ACACIA_STAIRS_5.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_5.get()))
                .unlockedBy("has_acacia_planks_5", has(ModBlocks.ACACIA_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_5.get())
                .unlockedBy("has_acacia_planks_5", has(ModBlocks.ACACIA_PLANKS_5.get()))
                .save(output);

        // Acacia Planks 6
        stairBuilder(ModBlocks.ACACIA_STAIRS_6.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_6.get()))
                .unlockedBy("has_acacia_planks_6", has(ModBlocks.ACACIA_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_6.get())
                .unlockedBy("has_acacia_planks_6", has(ModBlocks.ACACIA_PLANKS_6.get()))
                .save(output);

        // Acacia Planks 7
        stairBuilder(ModBlocks.ACACIA_STAIRS_7.get(), Ingredient.of(ModBlocks.ACACIA_PLANKS_7.get()))
                .unlockedBy("has_acacia_planks_7", has(ModBlocks.ACACIA_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ACACIA_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ACACIA_PLANKS_7.get())
                .unlockedBy("has_acacia_planks_7", has(ModBlocks.ACACIA_PLANKS_7.get()))
                .save(output);
        
        // Bamboo Planks 1
        stairBuilder(ModBlocks.BAMBOO_STAIRS_1.get(), Ingredient.of(ModBlocks.BAMBOO_PLANKS_1.get()))
                .unlockedBy("has_bamboo_planks_1", has(ModBlocks.BAMBOO_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BAMBOO_PLANKS_1.get())
                .unlockedBy("has_bamboo_planks_1", has(ModBlocks.BAMBOO_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.BAMBOO_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Bamboo Planks 2
        stairBuilder(ModBlocks.BAMBOO_STAIRS_2.get(), Ingredient.of(ModBlocks.BAMBOO_PLANKS_2.get()))
                .unlockedBy("has_bamboo_planks_2", has(ModBlocks.BAMBOO_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BAMBOO_PLANKS_2.get())
                .unlockedBy("has_bamboo_planks_2", has(ModBlocks.BAMBOO_PLANKS_2.get()))
                .save(output);

        // Bamboo Planks 3
        stairBuilder(ModBlocks.BAMBOO_STAIRS_3.get(), Ingredient.of(ModBlocks.BAMBOO_PLANKS_3.get()))
                .unlockedBy("has_bamboo_planks_3", has(ModBlocks.BAMBOO_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BAMBOO_PLANKS_3.get())
                .unlockedBy("has_bamboo_planks_3", has(ModBlocks.BAMBOO_PLANKS_3.get()))
                .save(output);

        // Bamboo Planks 4
        stairBuilder(ModBlocks.BAMBOO_STAIRS_4.get(), Ingredient.of(ModBlocks.BAMBOO_PLANKS_4.get()))
                .unlockedBy("has_bamboo_planks_4", has(ModBlocks.BAMBOO_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BAMBOO_PLANKS_4.get())
                .unlockedBy("has_bamboo_planks_4", has(ModBlocks.BAMBOO_PLANKS_4.get()))
                .save(output);

        // Bamboo Planks 5
        stairBuilder(ModBlocks.BAMBOO_STAIRS_5.get(), Ingredient.of(ModBlocks.BAMBOO_PLANKS_5.get()))
                .unlockedBy("has_bamboo_planks_5", has(ModBlocks.BAMBOO_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BAMBOO_PLANKS_5.get())
                .unlockedBy("has_bamboo_planks_5", has(ModBlocks.BAMBOO_PLANKS_5.get()))
                .save(output);

        // Bamboo Planks 6
        stairBuilder(ModBlocks.BAMBOO_STAIRS_6.get(), Ingredient.of(ModBlocks.BAMBOO_PLANKS_6.get()))
                .unlockedBy("has_bamboo_planks_6", has(ModBlocks.BAMBOO_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BAMBOO_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BAMBOO_PLANKS_6.get())
                .unlockedBy("has_bamboo_planks_6", has(ModBlocks.BAMBOO_PLANKS_6.get()))
                .save(output);

        // Birch Planks 1
        stairBuilder(ModBlocks.BIRCH_STAIRS_1.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_1.get()))
                .unlockedBy("has_birch_planks_1", has(ModBlocks.BIRCH_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_1.get())
                .unlockedBy("has_birch_planks_1", has(ModBlocks.BIRCH_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.BIRCH_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Birch Planks 2
        stairBuilder(ModBlocks.BIRCH_STAIRS_2.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_2.get()))
                .unlockedBy("has_birch_planks_2", has(ModBlocks.BIRCH_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_2.get())
                .unlockedBy("has_birch_planks_2", has(ModBlocks.BIRCH_PLANKS_2.get()))
                .save(output);

        // Birch Planks 3
        stairBuilder(ModBlocks.BIRCH_STAIRS_3.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_3.get()))
                .unlockedBy("has_birch_planks_3", has(ModBlocks.BIRCH_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_3.get())
                .unlockedBy("has_birch_planks_3", has(ModBlocks.BIRCH_PLANKS_3.get()))
                .save(output);

        // Birch Planks 4
        stairBuilder(ModBlocks.BIRCH_STAIRS_4.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_4.get()))
                .unlockedBy("has_birch_planks_4", has(ModBlocks.BIRCH_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_4.get())
                .unlockedBy("has_birch_planks_4", has(ModBlocks.BIRCH_PLANKS_4.get()))
                .save(output);

        // Birch Planks 5
        stairBuilder(ModBlocks.BIRCH_STAIRS_5.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_5.get()))
                .unlockedBy("has_birch_planks_5", has(ModBlocks.BIRCH_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_5.get())
                .unlockedBy("has_birch_planks_5", has(ModBlocks.BIRCH_PLANKS_5.get()))
                .save(output);

        // Birch Planks 6
        stairBuilder(ModBlocks.BIRCH_STAIRS_6.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_6.get()))
                .unlockedBy("has_birch_planks_6", has(ModBlocks.BIRCH_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_6.get())
                .unlockedBy("has_birch_planks_6", has(ModBlocks.BIRCH_PLANKS_6.get()))
                .save(output);

        // Birch Planks 7
        stairBuilder(ModBlocks.BIRCH_STAIRS_7.get(), Ingredient.of(ModBlocks.BIRCH_PLANKS_7.get()))
                .unlockedBy("has_birch_planks_7", has(ModBlocks.BIRCH_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BIRCH_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BIRCH_PLANKS_7.get())
                .unlockedBy("has_birch_planks_7", has(ModBlocks.BIRCH_PLANKS_7.get()))
                .save(output);
        
        // Cherry Planks 1
        stairBuilder(ModBlocks.CHERRY_STAIRS_1.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_1.get()))
                .unlockedBy("has_cherry_planks_1", has(ModBlocks.CHERRY_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_1.get())
                .unlockedBy("has_cherry_planks_1", has(ModBlocks.CHERRY_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.CHERRY_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Cherry Planks 2
        stairBuilder(ModBlocks.CHERRY_STAIRS_2.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_2.get()))
                .unlockedBy("has_cherry_planks_2", has(ModBlocks.CHERRY_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_2.get())
                .unlockedBy("has_cherry_planks_2", has(ModBlocks.CHERRY_PLANKS_2.get()))
                .save(output);

        // Cherry Planks 3
        stairBuilder(ModBlocks.CHERRY_STAIRS_3.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_3.get()))
                .unlockedBy("has_cherry_planks_3", has(ModBlocks.CHERRY_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_3.get())
                .unlockedBy("has_cherry_planks_3", has(ModBlocks.CHERRY_PLANKS_3.get()))
                .save(output);

        // Cherry Planks 4
        stairBuilder(ModBlocks.CHERRY_STAIRS_4.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_4.get()))
                .unlockedBy("has_cherry_planks_4", has(ModBlocks.CHERRY_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_4.get())
                .unlockedBy("has_cherry_planks_4", has(ModBlocks.CHERRY_PLANKS_4.get()))
                .save(output);

        // Cherry Planks 5
        stairBuilder(ModBlocks.CHERRY_STAIRS_5.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_5.get()))
                .unlockedBy("has_cherry_planks_5", has(ModBlocks.CHERRY_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_5.get())
                .unlockedBy("has_cherry_planks_5", has(ModBlocks.CHERRY_PLANKS_5.get()))
                .save(output);

        // Cherry Planks 6
        stairBuilder(ModBlocks.CHERRY_STAIRS_6.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_6.get()))
                .unlockedBy("has_cherry_planks_6", has(ModBlocks.CHERRY_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_6.get())
                .unlockedBy("has_cherry_planks_6", has(ModBlocks.CHERRY_PLANKS_6.get()))
                .save(output);

        // Cherry Planks 7
        stairBuilder(ModBlocks.CHERRY_STAIRS_7.get(), Ingredient.of(ModBlocks.CHERRY_PLANKS_7.get()))
                .unlockedBy("has_cherry_planks_7", has(ModBlocks.CHERRY_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CHERRY_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CHERRY_PLANKS_7.get())
                .unlockedBy("has_cherry_planks_7", has(ModBlocks.CHERRY_PLANKS_7.get()))
                .save(output);

        // Crimson Planks 1
        stairBuilder(ModBlocks.CRIMSON_STAIRS_1.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_1.get()))
                .unlockedBy("has_crimson_planks_1", has(ModBlocks.CRIMSON_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_1.get())
                .unlockedBy("has_crimson_planks_1", has(ModBlocks.CRIMSON_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.CRIMSON_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Crimson Planks 2
        stairBuilder(ModBlocks.CRIMSON_STAIRS_2.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_2.get()))
                .unlockedBy("has_crimson_planks_2", has(ModBlocks.CRIMSON_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_2.get())
                .unlockedBy("has_crimson_planks_2", has(ModBlocks.CRIMSON_PLANKS_2.get()))
                .save(output);

        // Crimson Planks 3
        stairBuilder(ModBlocks.CRIMSON_STAIRS_3.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_3.get()))
                .unlockedBy("has_crimson_planks_3", has(ModBlocks.CRIMSON_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_3.get())
                .unlockedBy("has_crimson_planks_3", has(ModBlocks.CRIMSON_PLANKS_3.get()))
                .save(output);

        // Crimson Planks 4
        stairBuilder(ModBlocks.CRIMSON_STAIRS_4.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_4.get()))
                .unlockedBy("has_crimson_planks_4", has(ModBlocks.CRIMSON_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_4.get())
                .unlockedBy("has_crimson_planks_4", has(ModBlocks.CRIMSON_PLANKS_4.get()))
                .save(output);

        // Crimson Planks 5
        stairBuilder(ModBlocks.CRIMSON_STAIRS_5.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_5.get()))
                .unlockedBy("has_crimson_planks_5", has(ModBlocks.CRIMSON_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_5.get())
                .unlockedBy("has_crimson_planks_5", has(ModBlocks.CRIMSON_PLANKS_5.get()))
                .save(output);

        // Crimson Planks 6
        stairBuilder(ModBlocks.CRIMSON_STAIRS_6.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_6.get()))
                .unlockedBy("has_crimson_planks_6", has(ModBlocks.CRIMSON_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_6.get())
                .unlockedBy("has_crimson_planks_6", has(ModBlocks.CRIMSON_PLANKS_6.get()))
                .save(output);

        // Crimson Planks 7
        stairBuilder(ModBlocks.CRIMSON_STAIRS_7.get(), Ingredient.of(ModBlocks.CRIMSON_PLANKS_7.get()))
                .unlockedBy("has_crimson_planks_7", has(ModBlocks.CRIMSON_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CRIMSON_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CRIMSON_PLANKS_7.get())
                .unlockedBy("has_crimson_planks_7", has(ModBlocks.CRIMSON_PLANKS_7.get()))
                .save(output);

        // Dark_Oak Planks 1
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_1.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_1.get()))
                .unlockedBy("has_dark_oak_planks_1", has(ModBlocks.DARK_OAK_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_1.get())
                .unlockedBy("has_dark_oak_planks_1", has(ModBlocks.DARK_OAK_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.DARK_OAK_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Dark_Oak Planks 2
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_2.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_2.get()))
                .unlockedBy("has_dark_oak_planks_2", has(ModBlocks.DARK_OAK_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_2.get())
                .unlockedBy("has_dark_oak_planks_2", has(ModBlocks.DARK_OAK_PLANKS_2.get()))
                .save(output);

        // Dark_Oak Planks 3
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_3.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_3.get()))
                .unlockedBy("has_dark_oak_planks_3", has(ModBlocks.DARK_OAK_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_3.get())
                .unlockedBy("has_dark_oak_planks_3", has(ModBlocks.DARK_OAK_PLANKS_3.get()))
                .save(output);

        // Dark_Oak Planks 4
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_4.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_4.get()))
                .unlockedBy("has_dark_oak_planks_4", has(ModBlocks.DARK_OAK_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_4.get())
                .unlockedBy("has_dark_oak_planks_4", has(ModBlocks.DARK_OAK_PLANKS_4.get()))
                .save(output);

        // Dark_Oak Planks 5
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_5.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_5.get()))
                .unlockedBy("has_dark_oak_planks_5", has(ModBlocks.DARK_OAK_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_5.get())
                .unlockedBy("has_dark_oak_planks_5", has(ModBlocks.DARK_OAK_PLANKS_5.get()))
                .save(output);

        // Dark_Oak Planks 6
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_6.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_6.get()))
                .unlockedBy("has_dark_oak_planks_6", has(ModBlocks.DARK_OAK_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_6.get())
                .unlockedBy("has_dark_oak_planks_6", has(ModBlocks.DARK_OAK_PLANKS_6.get()))
                .save(output);

        // Dark_Oak Planks 7
        stairBuilder(ModBlocks.DARK_OAK_STAIRS_7.get(), Ingredient.of(ModBlocks.DARK_OAK_PLANKS_7.get()))
                .unlockedBy("has_dark_oak_planks_7", has(ModBlocks.DARK_OAK_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DARK_OAK_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DARK_OAK_PLANKS_7.get())
                .unlockedBy("has_dark_oak_planks_7", has(ModBlocks.DARK_OAK_PLANKS_7.get()))
                .save(output);

        // Jungle Planks 1
        stairBuilder(ModBlocks.JUNGLE_STAIRS_1.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_1.get()))
                .unlockedBy("has_jungle_planks_1", has(ModBlocks.JUNGLE_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_1.get())
                .unlockedBy("has_jungle_planks_1", has(ModBlocks.JUNGLE_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.JUNGLE_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Jungle Planks 2
        stairBuilder(ModBlocks.JUNGLE_STAIRS_2.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_2.get()))
                .unlockedBy("has_jungle_planks_2", has(ModBlocks.JUNGLE_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_2.get())
                .unlockedBy("has_jungle_planks_2", has(ModBlocks.JUNGLE_PLANKS_2.get()))
                .save(output);

        // Jungle Planks 3
        stairBuilder(ModBlocks.JUNGLE_STAIRS_3.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_3.get()))
                .unlockedBy("has_jungle_planks_3", has(ModBlocks.JUNGLE_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_3.get())
                .unlockedBy("has_jungle_planks_3", has(ModBlocks.JUNGLE_PLANKS_3.get()))
                .save(output);

        // Jungle Planks 4
        stairBuilder(ModBlocks.JUNGLE_STAIRS_4.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_4.get()))
                .unlockedBy("has_jungle_planks_4", has(ModBlocks.JUNGLE_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_4.get())
                .unlockedBy("has_jungle_planks_4", has(ModBlocks.JUNGLE_PLANKS_4.get()))
                .save(output);

        // Jungle Planks 5
        stairBuilder(ModBlocks.JUNGLE_STAIRS_5.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_5.get()))
                .unlockedBy("has_jungle_planks_5", has(ModBlocks.JUNGLE_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_5.get())
                .unlockedBy("has_jungle_planks_5", has(ModBlocks.JUNGLE_PLANKS_5.get()))
                .save(output);

        // Jungle Planks 6
        stairBuilder(ModBlocks.JUNGLE_STAIRS_6.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_6.get()))
                .unlockedBy("has_jungle_planks_6", has(ModBlocks.JUNGLE_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_6.get())
                .unlockedBy("has_jungle_planks_6", has(ModBlocks.JUNGLE_PLANKS_6.get()))
                .save(output);

        // Jungle Planks 7
        stairBuilder(ModBlocks.JUNGLE_STAIRS_7.get(), Ingredient.of(ModBlocks.JUNGLE_PLANKS_7.get()))
                .unlockedBy("has_jungle_planks_7", has(ModBlocks.JUNGLE_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.JUNGLE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.JUNGLE_PLANKS_7.get())
                .unlockedBy("has_jungle_planks_7", has(ModBlocks.JUNGLE_PLANKS_7.get()))
                .save(output);

        // Mangrove Planks 1
        stairBuilder(ModBlocks.MANGROVE_STAIRS_1.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_1.get()))
                .unlockedBy("has_mangrove_planks_1", has(ModBlocks.MANGROVE_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_1.get())
                .unlockedBy("has_mangrove_planks_1", has(ModBlocks.MANGROVE_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.MANGROVE_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Mangrove Planks 2
        stairBuilder(ModBlocks.MANGROVE_STAIRS_2.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_2.get()))
                .unlockedBy("has_mangrove_planks_2", has(ModBlocks.MANGROVE_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_2.get())
                .unlockedBy("has_mangrove_planks_2", has(ModBlocks.MANGROVE_PLANKS_2.get()))
                .save(output);

        // Mangrove Planks 3
        stairBuilder(ModBlocks.MANGROVE_STAIRS_3.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_3.get()))
                .unlockedBy("has_mangrove_planks_3", has(ModBlocks.MANGROVE_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_3.get())
                .unlockedBy("has_mangrove_planks_3", has(ModBlocks.MANGROVE_PLANKS_3.get()))
                .save(output);

        // Mangrove Planks 4
        stairBuilder(ModBlocks.MANGROVE_STAIRS_4.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_4.get()))
                .unlockedBy("has_mangrove_planks_4", has(ModBlocks.MANGROVE_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_4.get())
                .unlockedBy("has_mangrove_planks_4", has(ModBlocks.MANGROVE_PLANKS_4.get()))
                .save(output);

        // Mangrove Planks 5
        stairBuilder(ModBlocks.MANGROVE_STAIRS_5.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_5.get()))
                .unlockedBy("has_mangrove_planks_5", has(ModBlocks.MANGROVE_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_5.get())
                .unlockedBy("has_mangrove_planks_5", has(ModBlocks.MANGROVE_PLANKS_5.get()))
                .save(output);

        // Mangrove Planks 6
        stairBuilder(ModBlocks.MANGROVE_STAIRS_6.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_6.get()))
                .unlockedBy("has_mangrove_planks_6", has(ModBlocks.MANGROVE_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_6.get())
                .unlockedBy("has_mangrove_planks_6", has(ModBlocks.MANGROVE_PLANKS_6.get()))
                .save(output);

        // Mangrove Planks 7
        stairBuilder(ModBlocks.MANGROVE_STAIRS_7.get(), Ingredient.of(ModBlocks.MANGROVE_PLANKS_7.get()))
                .unlockedBy("has_mangrove_planks_7", has(ModBlocks.MANGROVE_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.MANGROVE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.MANGROVE_PLANKS_7.get())
                .unlockedBy("has_mangrove_planks_7", has(ModBlocks.MANGROVE_PLANKS_7.get()))
                .save(output);

        // Oak Planks 1
        stairBuilder(ModBlocks.OAK_STAIRS_1.get(), Ingredient.of(ModBlocks.OAK_PLANKS_1.get()))
                .unlockedBy("has_oak_planks_1", has(ModBlocks.OAK_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_1.get())
                .unlockedBy("has_oak_planks_1", has(ModBlocks.OAK_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.OAK_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Oak Planks 2
        stairBuilder(ModBlocks.OAK_STAIRS_2.get(), Ingredient.of(ModBlocks.OAK_PLANKS_2.get()))
                .unlockedBy("has_oak_planks_2", has(ModBlocks.OAK_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_2.get())
                .unlockedBy("has_oak_planks_2", has(ModBlocks.OAK_PLANKS_2.get()))
                .save(output);

        // Oak Planks 3
        stairBuilder(ModBlocks.OAK_STAIRS_3.get(), Ingredient.of(ModBlocks.OAK_PLANKS_3.get()))
                .unlockedBy("has_oak_planks_3", has(ModBlocks.OAK_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_3.get())
                .unlockedBy("has_oak_planks_3", has(ModBlocks.OAK_PLANKS_3.get()))
                .save(output);

        // Oak Planks 4
        stairBuilder(ModBlocks.OAK_STAIRS_4.get(), Ingredient.of(ModBlocks.OAK_PLANKS_4.get()))
                .unlockedBy("has_oak_planks_4", has(ModBlocks.OAK_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_4.get())
                .unlockedBy("has_oak_planks_4", has(ModBlocks.OAK_PLANKS_4.get()))
                .save(output);

        // Oak Planks 5
        stairBuilder(ModBlocks.OAK_STAIRS_5.get(), Ingredient.of(ModBlocks.OAK_PLANKS_5.get()))
                .unlockedBy("has_oak_planks_5", has(ModBlocks.OAK_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_5.get())
                .unlockedBy("has_oak_planks_5", has(ModBlocks.OAK_PLANKS_5.get()))
                .save(output);

        // Oak Planks 6
        stairBuilder(ModBlocks.OAK_STAIRS_6.get(), Ingredient.of(ModBlocks.OAK_PLANKS_6.get()))
                .unlockedBy("has_oak_planks_6", has(ModBlocks.OAK_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_6.get())
                .unlockedBy("has_oak_planks_6", has(ModBlocks.OAK_PLANKS_6.get()))
                .save(output);

        // Oak Planks 7
        stairBuilder(ModBlocks.OAK_STAIRS_7.get(), Ingredient.of(ModBlocks.OAK_PLANKS_7.get()))
                .unlockedBy("has_oak_planks_7", has(ModBlocks.OAK_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.OAK_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.OAK_PLANKS_7.get())
                .unlockedBy("has_oak_planks_7", has(ModBlocks.OAK_PLANKS_7.get()))
                .save(output);

        // Spruce Planks 1
        stairBuilder(ModBlocks.SPRUCE_STAIRS_1.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_1.get()))
                .unlockedBy("has_spruce_planks_1", has(ModBlocks.SPRUCE_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_1.get())
                .unlockedBy("has_spruce_planks_1", has(ModBlocks.SPRUCE_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.SPRUCE_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Spruce Planks 2
        stairBuilder(ModBlocks.SPRUCE_STAIRS_2.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_2.get()))
                .unlockedBy("has_spruce_planks_2", has(ModBlocks.SPRUCE_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_2.get())
                .unlockedBy("has_spruce_planks_2", has(ModBlocks.SPRUCE_PLANKS_2.get()))
                .save(output);

        // Spruce Planks 3
        stairBuilder(ModBlocks.SPRUCE_STAIRS_3.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_3.get()))
                .unlockedBy("has_spruce_planks_3", has(ModBlocks.SPRUCE_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_3.get())
                .unlockedBy("has_spruce_planks_3", has(ModBlocks.SPRUCE_PLANKS_3.get()))
                .save(output);

        // Spruce Planks 4
        stairBuilder(ModBlocks.SPRUCE_STAIRS_4.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_4.get()))
                .unlockedBy("has_spruce_planks_4", has(ModBlocks.SPRUCE_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_4.get())
                .unlockedBy("has_spruce_planks_4", has(ModBlocks.SPRUCE_PLANKS_4.get()))
                .save(output);

        // Spruce Planks 5
        stairBuilder(ModBlocks.SPRUCE_STAIRS_5.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_5.get()))
                .unlockedBy("has_spruce_planks_5", has(ModBlocks.SPRUCE_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_5.get())
                .unlockedBy("has_spruce_planks_5", has(ModBlocks.SPRUCE_PLANKS_5.get()))
                .save(output);

        // Spruce Planks 6
        stairBuilder(ModBlocks.SPRUCE_STAIRS_6.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_6.get()))
                .unlockedBy("has_spruce_planks_6", has(ModBlocks.SPRUCE_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_6.get())
                .unlockedBy("has_spruce_planks_6", has(ModBlocks.SPRUCE_PLANKS_6.get()))
                .save(output);

        // Spruce Planks 7
        stairBuilder(ModBlocks.SPRUCE_STAIRS_7.get(), Ingredient.of(ModBlocks.SPRUCE_PLANKS_7.get()))
                .unlockedBy("has_spruce_planks_7", has(ModBlocks.SPRUCE_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SPRUCE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SPRUCE_PLANKS_7.get())
                .unlockedBy("has_spruce_planks_7", has(ModBlocks.SPRUCE_PLANKS_7.get()))
                .save(output);

        // Warped Planks 1
        stairBuilder(ModBlocks.WARPED_STAIRS_1.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_1.get()))
                .unlockedBy("has_warped_planks_1", has(ModBlocks.WARPED_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_1.get())
                .unlockedBy("has_warped_planks_1", has(ModBlocks.WARPED_PLANKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_FRAME_1.get(), 8)
                .pattern("202")
                .pattern("010")
                .pattern("202")
                .define('0', ModTags.Items.WARPED_PLANKS)
                .define('1', ItemTags.WOOL)
                .define('2', Items.STICK)
                .unlockedBy("has_stick", has(Items.STICK))
                .save(output);

        // Warped Planks 2
        stairBuilder(ModBlocks.WARPED_STAIRS_2.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_2.get()))
                .unlockedBy("has_warped_planks_2", has(ModBlocks.WARPED_PLANKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_2.get())
                .unlockedBy("has_warped_planks_2", has(ModBlocks.WARPED_PLANKS_2.get()))
                .save(output);

        // Warped Planks 3
        stairBuilder(ModBlocks.WARPED_STAIRS_3.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_3.get()))
                .unlockedBy("has_warped_planks_3", has(ModBlocks.WARPED_PLANKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_3.get())
                .unlockedBy("has_warped_planks_3", has(ModBlocks.WARPED_PLANKS_3.get()))
                .save(output);

        // Warped Planks 4
        stairBuilder(ModBlocks.WARPED_STAIRS_4.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_4.get()))
                .unlockedBy("has_warped_planks_4", has(ModBlocks.WARPED_PLANKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_4.get())
                .unlockedBy("has_warped_planks_4", has(ModBlocks.WARPED_PLANKS_4.get()))
                .save(output);

        // Warped Planks 5
        stairBuilder(ModBlocks.WARPED_STAIRS_5.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_5.get()))
                .unlockedBy("has_warped_planks_5", has(ModBlocks.WARPED_PLANKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_5.get())
                .unlockedBy("has_warped_planks_5", has(ModBlocks.WARPED_PLANKS_5.get()))
                .save(output);

        // Warped Planks 6
        stairBuilder(ModBlocks.WARPED_STAIRS_6.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_6.get()))
                .unlockedBy("has_warped_planks_6", has(ModBlocks.WARPED_PLANKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_6.get())
                .unlockedBy("has_warped_planks_6", has(ModBlocks.WARPED_PLANKS_6.get()))
                .save(output);

        // Warped Planks 7
        stairBuilder(ModBlocks.WARPED_STAIRS_7.get(), Ingredient.of(ModBlocks.WARPED_PLANKS_7.get()))
                .unlockedBy("has_warped_planks_7", has(ModBlocks.WARPED_PLANKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.WARPED_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.WARPED_PLANKS_7.get())
                .unlockedBy("has_warped_planks_7", has(ModBlocks.WARPED_PLANKS_7.get()))
                .save(output);
        
        // Cobblestone 1
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_1.get(), Ingredient.of(ModBlocks.COBBLESTONE_1.get()))
                .unlockedBy("has_cobblestone_1", has(ModBlocks.COBBLESTONE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_1.get())
                .unlockedBy("has_cobblestone_1", has(ModBlocks.COBBLESTONE_1.get()))
                .save(output);
        
        // Cobblestone 2
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_2.get(), Ingredient.of(ModBlocks.COBBLESTONE_2.get()))
                .unlockedBy("has_cobblestone_2", has(ModBlocks.COBBLESTONE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_2.get())
                .unlockedBy("has_cobblestone_2", has(ModBlocks.COBBLESTONE_2.get()))
                .save(output);
        
        // Cobblestone 3
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_3.get(), Ingredient.of(ModBlocks.COBBLESTONE_3.get()))
                .unlockedBy("has_cobblestone_3", has(ModBlocks.COBBLESTONE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_3.get())
                .unlockedBy("has_cobblestone_3", has(ModBlocks.COBBLESTONE_3.get()))
                .save(output);
        
        // Cobblestone 4
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_4.get(), Ingredient.of(ModBlocks.COBBLESTONE_4.get()))
                .unlockedBy("has_cobblestone_4", has(ModBlocks.COBBLESTONE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_4.get())
                .unlockedBy("has_cobblestone_4", has(ModBlocks.COBBLESTONE_4.get()))
                .save(output);
        
        // Cobblestone 5
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_5.get(), Ingredient.of(ModBlocks.COBBLESTONE_5.get()))
                .unlockedBy("has_cobblestone_5", has(ModBlocks.COBBLESTONE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_5.get())
                .unlockedBy("has_cobblestone_5", has(ModBlocks.COBBLESTONE_5.get()))
                .save(output);
        
        // Cobblestone 6
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_6.get(), Ingredient.of(ModBlocks.COBBLESTONE_6.get()))
                .unlockedBy("has_cobblestone_6", has(ModBlocks.COBBLESTONE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_6.get())
                .unlockedBy("has_cobblestone_6", has(ModBlocks.COBBLESTONE_6.get()))
                .save(output);
        
        // Cobblestone 7
        stairBuilder(ModBlocks.COBBLESTONE_STAIRS_7.get(), Ingredient.of(ModBlocks.COBBLESTONE_7.get()))
                .unlockedBy("has_cobblestone_7", has(ModBlocks.COBBLESTONE_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.COBBLESTONE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.COBBLESTONE_7.get())
                .unlockedBy("has_cobblestone_7", has(ModBlocks.COBBLESTONE_7.get()))
                .save(output);
        
        // Granite 1
        stairBuilder(ModBlocks.GRANITE_STAIRS_1.get(), Ingredient.of(ModBlocks.GRANITE_1.get()))
                .unlockedBy("has_granite_1", has(ModBlocks.GRANITE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_1.get())
                .unlockedBy("has_granite_1", has(ModBlocks.GRANITE_1.get()))
                .save(output);
        
        // Granite 2
        stairBuilder(ModBlocks.GRANITE_STAIRS_2.get(), Ingredient.of(ModBlocks.GRANITE_2.get()))
                .unlockedBy("has_granite_2", has(ModBlocks.GRANITE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_2.get())
                .unlockedBy("has_granite_2", has(ModBlocks.GRANITE_2.get()))
                .save(output);
        
        // Granite 3
        stairBuilder(ModBlocks.GRANITE_STAIRS_3.get(), Ingredient.of(ModBlocks.GRANITE_3.get()))
                .unlockedBy("has_granite_3", has(ModBlocks.GRANITE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_3.get())
                .unlockedBy("has_granite_3", has(ModBlocks.GRANITE_3.get()))
                .save(output);
        
        // Granite 4
        stairBuilder(ModBlocks.GRANITE_STAIRS_4.get(), Ingredient.of(ModBlocks.GRANITE_4.get()))
                .unlockedBy("has_granite_4", has(ModBlocks.GRANITE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_4.get())
                .unlockedBy("has_granite_4", has(ModBlocks.GRANITE_4.get()))
                .save(output);
        
        // Granite 5
        stairBuilder(ModBlocks.GRANITE_STAIRS_5.get(), Ingredient.of(ModBlocks.GRANITE_5.get()))
                .unlockedBy("has_granite_5", has(ModBlocks.GRANITE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_5.get())
                .unlockedBy("has_granite_5", has(ModBlocks.GRANITE_5.get()))
                .save(output);
        
        // Granite 6
        stairBuilder(ModBlocks.GRANITE_STAIRS_6.get(), Ingredient.of(ModBlocks.GRANITE_6.get()))
                .unlockedBy("has_granite_6", has(ModBlocks.GRANITE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_6.get())
                .unlockedBy("has_granite_6", has(ModBlocks.GRANITE_6.get()))
                .save(output);
        
        // Granite 7
        stairBuilder(ModBlocks.GRANITE_STAIRS_7.get(), Ingredient.of(ModBlocks.GRANITE_7.get()))
                .unlockedBy("has_granite_7", has(ModBlocks.GRANITE_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.GRANITE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.GRANITE_7.get())
                .unlockedBy("has_granite_7", has(ModBlocks.GRANITE_7.get()))
                .save(output);
        
        // Andesite 1
        stairBuilder(ModBlocks.ANDESITE_STAIRS_1.get(), Ingredient.of(ModBlocks.ANDESITE_1.get()))
                .unlockedBy("has_andesite_1", has(ModBlocks.ANDESITE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_1.get())
                .unlockedBy("has_andesite_1", has(ModBlocks.ANDESITE_1.get()))
                .save(output);
        
        // Andesite 2
        stairBuilder(ModBlocks.ANDESITE_STAIRS_2.get(), Ingredient.of(ModBlocks.ANDESITE_2.get()))
                .unlockedBy("has_andesite_2", has(ModBlocks.ANDESITE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_2.get())
                .unlockedBy("has_andesite_2", has(ModBlocks.ANDESITE_2.get()))
                .save(output);
        
        // Andesite 3
        stairBuilder(ModBlocks.ANDESITE_STAIRS_3.get(), Ingredient.of(ModBlocks.ANDESITE_3.get()))
                .unlockedBy("has_andesite_3", has(ModBlocks.ANDESITE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_3.get())
                .unlockedBy("has_andesite_3", has(ModBlocks.ANDESITE_3.get()))
                .save(output);
        
        // Andesite 4
        stairBuilder(ModBlocks.ANDESITE_STAIRS_4.get(), Ingredient.of(ModBlocks.ANDESITE_4.get()))
                .unlockedBy("has_andesite_4", has(ModBlocks.ANDESITE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_4.get())
                .unlockedBy("has_andesite_4", has(ModBlocks.ANDESITE_4.get()))
                .save(output);
        
        // Andesite 5
        stairBuilder(ModBlocks.ANDESITE_STAIRS_5.get(), Ingredient.of(ModBlocks.ANDESITE_5.get()))
                .unlockedBy("has_andesite_5", has(ModBlocks.ANDESITE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_5.get())
                .unlockedBy("has_andesite_5", has(ModBlocks.ANDESITE_5.get()))
                .save(output);
        
        // Andesite 6
        stairBuilder(ModBlocks.ANDESITE_STAIRS_6.get(), Ingredient.of(ModBlocks.ANDESITE_6.get()))
                .unlockedBy("has_andesite_6", has(ModBlocks.ANDESITE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_6.get())
                .unlockedBy("has_andesite_6", has(ModBlocks.ANDESITE_6.get()))
                .save(output);
        
        // Andesite 7
        stairBuilder(ModBlocks.ANDESITE_STAIRS_7.get(), Ingredient.of(ModBlocks.ANDESITE_7.get()))
                .unlockedBy("has_andesite_7", has(ModBlocks.ANDESITE_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.ANDESITE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.ANDESITE_7.get())
                .unlockedBy("has_andesite_7", has(ModBlocks.ANDESITE_7.get()))
                .save(output);
        
        // Diorite 1
        stairBuilder(ModBlocks.DIORITE_STAIRS_1.get(), Ingredient.of(ModBlocks.DIORITE_1.get()))
                .unlockedBy("has_diorite_1", has(ModBlocks.DIORITE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_1.get())
                .unlockedBy("has_diorite_1", has(ModBlocks.DIORITE_1.get()))
                .save(output);
        
        // Diorite 2
        stairBuilder(ModBlocks.DIORITE_STAIRS_2.get(), Ingredient.of(ModBlocks.DIORITE_2.get()))
                .unlockedBy("has_diorite_2", has(ModBlocks.DIORITE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_2.get())
                .unlockedBy("has_diorite_2", has(ModBlocks.DIORITE_2.get()))
                .save(output);
        
        // Diorite 3
        stairBuilder(ModBlocks.DIORITE_STAIRS_3.get(), Ingredient.of(ModBlocks.DIORITE_3.get()))
                .unlockedBy("has_diorite_3", has(ModBlocks.DIORITE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_3.get())
                .unlockedBy("has_diorite_3", has(ModBlocks.DIORITE_3.get()))
                .save(output);
        
        // Diorite 4
        stairBuilder(ModBlocks.DIORITE_STAIRS_4.get(), Ingredient.of(ModBlocks.DIORITE_4.get()))
                .unlockedBy("has_diorite_4", has(ModBlocks.DIORITE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_4.get())
                .unlockedBy("has_diorite_4", has(ModBlocks.DIORITE_4.get()))
                .save(output);
        
        // Diorite 5
        stairBuilder(ModBlocks.DIORITE_STAIRS_5.get(), Ingredient.of(ModBlocks.DIORITE_5.get()))
                .unlockedBy("has_diorite_5", has(ModBlocks.DIORITE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_5.get())
                .unlockedBy("has_diorite_5", has(ModBlocks.DIORITE_5.get()))
                .save(output);
        
        // Diorite 6
        stairBuilder(ModBlocks.DIORITE_STAIRS_6.get(), Ingredient.of(ModBlocks.DIORITE_6.get()))
                .unlockedBy("has_diorite_6", has(ModBlocks.DIORITE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_6.get())
                .unlockedBy("has_diorite_6", has(ModBlocks.DIORITE_6.get()))
                .save(output);
        
        // Diorite 7
        stairBuilder(ModBlocks.DIORITE_STAIRS_7.get(), Ingredient.of(ModBlocks.DIORITE_7.get()))
                .unlockedBy("has_diorite_7", has(ModBlocks.DIORITE_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DIORITE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DIORITE_7.get())
                .unlockedBy("has_diorite_7", has(ModBlocks.DIORITE_7.get()))
                .save(output);
        
         // Stone Bricks 1
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_1.get(), Ingredient.of(ModBlocks.STONE_BRICKS_1.get()))
                .unlockedBy("has_stone_bricks_1", has(ModBlocks.STONE_BRICKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_1.get())
                .unlockedBy("has_stone_bricks_1", has(ModBlocks.STONE_BRICKS_1.get()))
                .save(output);
        
         // Stone Bricks 2
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_2.get(), Ingredient.of(ModBlocks.STONE_BRICKS_2.get()))
                .unlockedBy("has_stone_bricks_2", has(ModBlocks.STONE_BRICKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_2.get())
                .unlockedBy("has_stone_bricks_2", has(ModBlocks.STONE_BRICKS_2.get()))
                .save(output);
        
         // Stone Bricks 3
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_3.get(), Ingredient.of(ModBlocks.STONE_BRICKS_3.get()))
                .unlockedBy("has_stone_bricks_3", has(ModBlocks.STONE_BRICKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_3.get())
                .unlockedBy("has_stone_bricks_3", has(ModBlocks.STONE_BRICKS_3.get()))
                .save(output);
        
         // Stone Bricks 4
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_4.get(), Ingredient.of(ModBlocks.STONE_BRICKS_4.get()))
                .unlockedBy("has_stone_bricks_4", has(ModBlocks.STONE_BRICKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_4.get())
                .unlockedBy("has_stone_bricks_4", has(ModBlocks.STONE_BRICKS_4.get()))
                .save(output);
        
         // Stone Bricks 5
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_5.get(), Ingredient.of(ModBlocks.STONE_BRICKS_5.get()))
                .unlockedBy("has_stone_bricks_5", has(ModBlocks.STONE_BRICKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_5.get())
                .unlockedBy("has_stone_bricks_5", has(ModBlocks.STONE_BRICKS_5.get()))
                .save(output);
        
         // Stone Bricks 6
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_6.get(), Ingredient.of(ModBlocks.STONE_BRICKS_6.get()))
                .unlockedBy("has_stone_bricks_6", has(ModBlocks.STONE_BRICKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_6.get())
                .unlockedBy("has_stone_bricks_6", has(ModBlocks.STONE_BRICKS_6.get()))
                .save(output);
        
         // Stone Bricks 7
        stairBuilder(ModBlocks.STONE_BRICK_STAIRS_7.get(), Ingredient.of(ModBlocks.STONE_BRICKS_7.get()))
                .unlockedBy("has_stone_bricks_7", has(ModBlocks.STONE_BRICKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.STONE_BRICK_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.STONE_BRICKS_7.get())
                .unlockedBy("has_stone_bricks_7", has(ModBlocks.STONE_BRICKS_7.get()))
                .save(output);
        
         // Deepslate 1
        stairBuilder(ModBlocks.DEEPSLATE_STAIRS_1.get(), Ingredient.of(ModBlocks.DEEPSLATE_1.get()))
                .unlockedBy("has_deepslate_1", has(ModBlocks.DEEPSLATE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DEEPSLATE_1.get())
                .unlockedBy("has_deepslate_1", has(ModBlocks.DEEPSLATE_1.get()))
                .save(output);

         // Deepslate 2
        stairBuilder(ModBlocks.DEEPSLATE_STAIRS_2.get(), Ingredient.of(ModBlocks.DEEPSLATE_2.get()))
                .unlockedBy("has_deepslate_2", has(ModBlocks.DEEPSLATE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DEEPSLATE_2.get())
                .unlockedBy("has_deepslate_2", has(ModBlocks.DEEPSLATE_2.get()))
                .save(output);

         // Deepslate 3
        stairBuilder(ModBlocks.DEEPSLATE_STAIRS_3.get(), Ingredient.of(ModBlocks.DEEPSLATE_3.get()))
                .unlockedBy("has_deepslate_3", has(ModBlocks.DEEPSLATE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DEEPSLATE_3.get())
                .unlockedBy("has_deepslate_3", has(ModBlocks.DEEPSLATE_3.get()))
                .save(output);

         // Deepslate 4
        stairBuilder(ModBlocks.DEEPSLATE_STAIRS_4.get(), Ingredient.of(ModBlocks.DEEPSLATE_4.get()))
                .unlockedBy("has_deepslate_4", has(ModBlocks.DEEPSLATE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DEEPSLATE_4.get())
                .unlockedBy("has_deepslate_4", has(ModBlocks.DEEPSLATE_4.get()))
                .save(output);

         // Deepslate 5
        stairBuilder(ModBlocks.DEEPSLATE_STAIRS_5.get(), Ingredient.of(ModBlocks.DEEPSLATE_5.get()))
                .unlockedBy("has_deepslate_5", has(ModBlocks.DEEPSLATE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DEEPSLATE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DEEPSLATE_5.get())
                .unlockedBy("has_deepslate_5", has(ModBlocks.DEEPSLATE_5.get()))
                .save(output);

          // Bricks 1
        stairBuilder(ModBlocks.BRICK_STAIRS_1.get(), Ingredient.of(ModBlocks.BRICKS_1.get()))
                .unlockedBy("has_bricks_1", has(ModBlocks.BRICKS_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_1.get())
                .unlockedBy("has_bricks_1", has(ModBlocks.BRICKS_1.get()))
                .save(output);

           // Bricks 2
        stairBuilder(ModBlocks.BRICK_STAIRS_2.get(), Ingredient.of(ModBlocks.BRICKS_2.get()))
                .unlockedBy("has_bricks_2", has(ModBlocks.BRICKS_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_2.get())
                .unlockedBy("has_bricks_2", has(ModBlocks.BRICKS_2.get()))
                .save(output);

           // Bricks 3
        stairBuilder(ModBlocks.BRICK_STAIRS_3.get(), Ingredient.of(ModBlocks.BRICKS_3.get()))
                .unlockedBy("has_bricks_3", has(ModBlocks.BRICKS_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_3.get())
                .unlockedBy("has_bricks_3", has(ModBlocks.BRICKS_3.get()))
                .save(output);

           // Bricks 4
        stairBuilder(ModBlocks.BRICK_STAIRS_4.get(), Ingredient.of(ModBlocks.BRICKS_4.get()))
                .unlockedBy("has_bricks_4", has(ModBlocks.BRICKS_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_4.get())
                .unlockedBy("has_bricks_4", has(ModBlocks.BRICKS_4.get()))
                .save(output);

           // Bricks 5
        stairBuilder(ModBlocks.BRICK_STAIRS_5.get(), Ingredient.of(ModBlocks.BRICKS_5.get()))
                .unlockedBy("has_bricks_5", has(ModBlocks.BRICKS_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_5.get())
                .unlockedBy("has_bricks_5", has(ModBlocks.BRICKS_5.get()))
                .save(output);

           // Bricks 6
        stairBuilder(ModBlocks.BRICK_STAIRS_6.get(), Ingredient.of(ModBlocks.BRICKS_6.get()))
                .unlockedBy("has_bricks_6", has(ModBlocks.BRICKS_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_6.get())
                .unlockedBy("has_bricks_6", has(ModBlocks.BRICKS_6.get()))
                .save(output);

           // Bricks 7
        stairBuilder(ModBlocks.BRICK_STAIRS_7.get(), Ingredient.of(ModBlocks.BRICKS_7.get()))
                .unlockedBy("has_bricks_7", has(ModBlocks.BRICKS_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.BRICK_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.BRICKS_7.get())
                .unlockedBy("has_bricks_7", has(ModBlocks.BRICKS_7.get()))
                .save(output);

           // Sandstone 1
        stairBuilder(ModBlocks.SANDSTONE_STAIRS_1.get(), Ingredient.of(ModBlocks.SANDSTONE_1.get()))
                .unlockedBy("has_sandstone_1", has(ModBlocks.SANDSTONE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SANDSTONE_1.get())
                .unlockedBy("has_sandstone_1", has(ModBlocks.SANDSTONE_1.get()))
                .save(output);

           // Sandstone 2
        stairBuilder(ModBlocks.SANDSTONE_STAIRS_2.get(), Ingredient.of(ModBlocks.SANDSTONE_2.get()))
                .unlockedBy("has_sandstone_2", has(ModBlocks.SANDSTONE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SANDSTONE_2.get())
                .unlockedBy("has_sandstone_2", has(ModBlocks.SANDSTONE_2.get()))
                .save(output);

           // Sandstone 3
        stairBuilder(ModBlocks.SANDSTONE_STAIRS_3.get(), Ingredient.of(ModBlocks.SANDSTONE_3.get()))
                .unlockedBy("has_sandstone_3", has(ModBlocks.SANDSTONE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SANDSTONE_3.get())
                .unlockedBy("has_sandstone_3", has(ModBlocks.SANDSTONE_3.get()))
                .save(output);

           // Sandstone 4
        stairBuilder(ModBlocks.SANDSTONE_STAIRS_4.get(), Ingredient.of(ModBlocks.SANDSTONE_4.get()))
                .unlockedBy("has_sandstone_4", has(ModBlocks.SANDSTONE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SANDSTONE_4.get())
                .unlockedBy("has_sandstone_4", has(ModBlocks.SANDSTONE_4.get()))
                .save(output);

           // Sandstone 5
        stairBuilder(ModBlocks.SANDSTONE_STAIRS_5.get(), Ingredient.of(ModBlocks.SANDSTONE_5.get()))
                .unlockedBy("has_sandstone_5", has(ModBlocks.SANDSTONE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.SANDSTONE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.SANDSTONE_5.get())
                .unlockedBy("has_sandstone_5", has(ModBlocks.SANDSTONE_5.get()))
                .save(output);

            // Prismarine 1
        stairBuilder(ModBlocks.PRISMARINE_STAIRS_1.get(), Ingredient.of(ModBlocks.PRISMARINE_1.get()))
                .unlockedBy("has_prismarine_1", has(ModBlocks.PRISMARINE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.PRISMARINE_1.get())
                .unlockedBy("has_prismarine_1", has(ModBlocks.PRISMARINE_1.get()))
                .save(output);

            // Prismarine 2
        stairBuilder(ModBlocks.PRISMARINE_STAIRS_2.get(), Ingredient.of(ModBlocks.PRISMARINE_2.get()))
                .unlockedBy("has_prismarine_2", has(ModBlocks.PRISMARINE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.PRISMARINE_2.get())
                .unlockedBy("has_prismarine_2", has(ModBlocks.PRISMARINE_2.get()))
                .save(output);

            // Prismarine 3
        stairBuilder(ModBlocks.PRISMARINE_STAIRS_3.get(), Ingredient.of(ModBlocks.PRISMARINE_3.get()))
                .unlockedBy("has_prismarine_3", has(ModBlocks.PRISMARINE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.PRISMARINE_3.get())
                .unlockedBy("has_prismarine_3", has(ModBlocks.PRISMARINE_3.get()))
                .save(output);

            // Prismarine 4
        stairBuilder(ModBlocks.PRISMARINE_STAIRS_4.get(), Ingredient.of(ModBlocks.PRISMARINE_4.get()))
                .unlockedBy("has_prismarine_4", has(ModBlocks.PRISMARINE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.PRISMARINE_4.get())
                .unlockedBy("has_prismarine_4", has(ModBlocks.PRISMARINE_4.get()))
                .save(output);

            // Prismarine 5
        stairBuilder(ModBlocks.PRISMARINE_STAIRS_5.get(), Ingredient.of(ModBlocks.PRISMARINE_5.get()))
                .unlockedBy("has_prismarine_5", has(ModBlocks.PRISMARINE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.PRISMARINE_5.get())
                .unlockedBy("has_prismarine_5", has(ModBlocks.PRISMARINE_5.get()))
                .save(output);

            // Prismarine 6
        stairBuilder(ModBlocks.PRISMARINE_STAIRS_6.get(), Ingredient.of(ModBlocks.PRISMARINE_6.get()))
                .unlockedBy("has_prismarine_6", has(ModBlocks.PRISMARINE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.PRISMARINE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.PRISMARINE_6.get())
                .unlockedBy("has_prismarine_6", has(ModBlocks.PRISMARINE_6.get()))
                .save(output);

            // Calcite 1
        stairBuilder(ModBlocks.CALCITE_STAIRS_1.get(), Ingredient.of(Blocks.CALCITE))
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', Blocks.CALCITE)
                .unlockedBy("has_calcite", has(Blocks.CALCITE))
                .save(output);

            // Calcite 2
        stairBuilder(ModBlocks.CALCITE_STAIRS_2.get(), Ingredient.of(ModBlocks.CALCITE_2.get()))
                .unlockedBy("has_calcite_2", has(ModBlocks.CALCITE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_2.get())
                .unlockedBy("has_calcite_2", has(ModBlocks.CALCITE_2.get()))
                .save(output);

            // Calcite 3
        stairBuilder(ModBlocks.CALCITE_STAIRS_3.get(), Ingredient.of(ModBlocks.CALCITE_3.get()))
                .unlockedBy("has_calcite_3", has(ModBlocks.CALCITE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_3.get())
                .unlockedBy("has_calcite_3", has(ModBlocks.CALCITE_3.get()))
                .save(output);

            // Calcite 4
        stairBuilder(ModBlocks.CALCITE_STAIRS_4.get(), Ingredient.of(ModBlocks.CALCITE_4.get()))
                .unlockedBy("has_calcite_4", has(ModBlocks.CALCITE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_4.get())
                .unlockedBy("has_calcite_4", has(ModBlocks.CALCITE_4.get()))
                .save(output);

            // Calcite 5
        stairBuilder(ModBlocks.CALCITE_STAIRS_5.get(), Ingredient.of(ModBlocks.CALCITE_5.get()))
                .unlockedBy("has_calcite_5", has(ModBlocks.CALCITE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_5.get())
                .unlockedBy("has_calcite_5", has(ModBlocks.CALCITE_5.get()))
                .save(output);

            // Calcite 6
        stairBuilder(ModBlocks.CALCITE_STAIRS_6.get(), Ingredient.of(ModBlocks.CALCITE_6.get()))
                .unlockedBy("has_calcite_6", has(ModBlocks.CALCITE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_6.get())
                .unlockedBy("has_calcite_6", has(ModBlocks.CALCITE_6.get()))
                .save(output);

            // Calcite 7
        stairBuilder(ModBlocks.CALCITE_STAIRS_7.get(), Ingredient.of(ModBlocks.CALCITE_7.get()))
                .unlockedBy("has_calcite_7", has(ModBlocks.CALCITE_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_7.get())
                .unlockedBy("has_calcite_7", has(ModBlocks.CALCITE_7.get()))
                .save(output);

        // Calcite 8
        stairBuilder(ModBlocks.CALCITE_STAIRS_8.get(), Ingredient.of(ModBlocks.CALCITE_8.get()))
                .unlockedBy("has_calcite_8", has(ModBlocks.CALCITE_8.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.CALCITE_SLAB_8.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.CALCITE_8.get())
                .unlockedBy("has_calcite_8", has(ModBlocks.CALCITE_8.get()))
                .save(output);

            // Dripstone 1
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_1.get(), Ingredient.of(ModBlocks.DRIPSTONE_1.get()))
                .unlockedBy("has_dripstone_1", has(ModBlocks.DRIPSTONE_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_1.get())
                .unlockedBy("has_dripstone_1", has(ModBlocks.DRIPSTONE_1.get()))
                .save(output);

            // Dripstone 2
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_2.get(), Ingredient.of(ModBlocks.DRIPSTONE_2.get()))
                .unlockedBy("has_dripstone_2", has(ModBlocks.DRIPSTONE_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_2.get())
                .unlockedBy("has_dripstone_2", has(ModBlocks.DRIPSTONE_2.get()))
                .save(output);

            // Dripstone 3
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_3.get(), Ingredient.of(ModBlocks.DRIPSTONE_3.get()))
                .unlockedBy("has_dripstone_3", has(ModBlocks.DRIPSTONE_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_3.get())
                .unlockedBy("has_dripstone_3", has(ModBlocks.DRIPSTONE_3.get()))
                .save(output);

            // Dripstone 4
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_4.get(), Ingredient.of(ModBlocks.DRIPSTONE_4.get()))
                .unlockedBy("has_dripstone_4", has(ModBlocks.DRIPSTONE_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_4.get())
                .unlockedBy("has_dripstone_4", has(ModBlocks.DRIPSTONE_4.get()))
                .save(output);

            // Dripstone 5
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_5.get(), Ingredient.of(ModBlocks.DRIPSTONE_5.get()))
                .unlockedBy("has_dripstone_5", has(ModBlocks.DRIPSTONE_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_5.get())
                .unlockedBy("has_dripstone_5", has(ModBlocks.DRIPSTONE_5.get()))
                .save(output);

            // Dripstone 6
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_6.get(), Ingredient.of(ModBlocks.DRIPSTONE_6.get()))
                .unlockedBy("has_dripstone_6", has(ModBlocks.DRIPSTONE_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_6.get())
                .unlockedBy("has_dripstone_6", has(ModBlocks.DRIPSTONE_6.get()))
                .save(output);

            // Dripstone 7
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_7.get(), Ingredient.of(ModBlocks.DRIPSTONE_7.get()))
                .unlockedBy("has_dripstone_7", has(ModBlocks.DRIPSTONE_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.DRIPSTONE_7.get())
                .unlockedBy("has_dripstone_7", has(ModBlocks.DRIPSTONE_7.get()))
                .save(output);

        // Dripstone 8
        stairBuilder(ModBlocks.DRIPSTONE_STAIRS_8.get(), Ingredient.of(Blocks.DRIPSTONE_BLOCK))
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.DRIPSTONE_SLAB_8.get(), 6)
                .pattern("XXX")
                .define('X', Blocks.DRIPSTONE_BLOCK)
                .unlockedBy("has_dripstone_block", has(Blocks.DRIPSTONE_BLOCK))
                .save(output);

        // Tuff 1
        stairBuilder(ModBlocks.TUFF_STAIRS_1.get(), Ingredient.of(ModBlocks.TUFF_1.get()))
                .unlockedBy("has_tuff_1", has(ModBlocks.TUFF_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_1.get())
                .unlockedBy("has_tuff_1", has(ModBlocks.TUFF_1.get()))
                .save(output);

        // Tuff 2
        stairBuilder(ModBlocks.TUFF_STAIRS_2.get(), Ingredient.of(ModBlocks.TUFF_2.get()))
                .unlockedBy("has_tuff_2", has(ModBlocks.TUFF_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_2.get())
                .unlockedBy("has_tuff_2", has(ModBlocks.TUFF_2.get()))
                .save(output);

        // Tuff 3
        stairBuilder(ModBlocks.TUFF_STAIRS_3.get(), Ingredient.of(ModBlocks.TUFF_3.get()))
                .unlockedBy("has_tuff_3", has(ModBlocks.TUFF_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_3.get())
                .unlockedBy("has_tuff_3", has(ModBlocks.TUFF_3.get()))
                .save(output);

        // Tuff 4
        stairBuilder(ModBlocks.TUFF_STAIRS_4.get(), Ingredient.of(ModBlocks.TUFF_4.get()))
                .unlockedBy("has_tuff_4", has(ModBlocks.TUFF_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_4.get())
                .unlockedBy("has_tuff_4", has(ModBlocks.TUFF_4.get()))
                .save(output);

        // Tuff 5
        stairBuilder(ModBlocks.TUFF_STAIRS_5.get(), Ingredient.of(ModBlocks.TUFF_5.get()))
                .unlockedBy("has_tuff_5", has(ModBlocks.TUFF_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_5.get())
                .unlockedBy("has_tuff_5", has(ModBlocks.TUFF_5.get()))
                .save(output);

        // Tuff 6
        stairBuilder(ModBlocks.TUFF_STAIRS_6.get(), Ingredient.of(ModBlocks.TUFF_6.get()))
                .unlockedBy("has_tuff_6", has(ModBlocks.TUFF_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_6.get())
                .unlockedBy("has_tuff_6", has(ModBlocks.TUFF_6.get()))
                .save(output);

        // Tuff 7
        stairBuilder(ModBlocks.TUFF_STAIRS_7.get(), Ingredient.of(ModBlocks.TUFF_7.get()))
                .unlockedBy("has_tuff_7", has(ModBlocks.TUFF_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.TUFF_7.get())
                .unlockedBy("has_tuff_7", has(ModBlocks.TUFF_7.get()))
                .save(output);

        // Tuff 8
        stairBuilder(ModBlocks.TUFF_STAIRS_8.get(), Ingredient.of(Blocks.TUFF))
                .unlockedBy("has_tuff", has(Blocks.TUFF))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.TUFF_SLAB_8.get(), 6)
                .pattern("XXX")
                .define('X', Blocks.TUFF)
                .unlockedBy("has_tuff", has(Blocks.TUFF))
                .save(output);

        // Amethyst 1
        stairBuilder(ModBlocks.AMETHYST_STAIRS_1.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_1.get()))
                .unlockedBy("has_amethyst_1", has(ModBlocks.AMETHYST_BLOCK_1.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_1.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_1.get())
                .unlockedBy("has_amethyst_1", has(ModBlocks.AMETHYST_BLOCK_1.get()))
                .save(output);

        // Amethyst 2
        stairBuilder(ModBlocks.AMETHYST_STAIRS_2.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_2.get()))
                .unlockedBy("has_amethyst_2", has(ModBlocks.AMETHYST_BLOCK_2.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_2.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_2.get())
                .unlockedBy("has_amethyst_2", has(ModBlocks.AMETHYST_BLOCK_2.get()))
                .save(output);

        // Amethyst 3
        stairBuilder(ModBlocks.AMETHYST_STAIRS_3.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_3.get()))
                .unlockedBy("has_amethyst_3", has(ModBlocks.AMETHYST_BLOCK_3.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_3.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_3.get())
                .unlockedBy("has_amethyst_3", has(ModBlocks.AMETHYST_BLOCK_3.get()))
                .save(output);

        // Amethyst 4
        stairBuilder(ModBlocks.AMETHYST_STAIRS_4.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_4.get()))
                .unlockedBy("has_amethyst_4", has(ModBlocks.AMETHYST_BLOCK_4.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_4.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_4.get())
                .unlockedBy("has_amethyst_4", has(ModBlocks.AMETHYST_BLOCK_4.get()))
                .save(output);

        // Amethyst 5
        stairBuilder(ModBlocks.AMETHYST_STAIRS_5.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_5.get()))
                .unlockedBy("has_amethyst_5", has(ModBlocks.AMETHYST_BLOCK_5.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_5.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_5.get())
                .unlockedBy("has_amethyst_5", has(ModBlocks.AMETHYST_BLOCK_5.get()))
                .save(output);

        // Amethyst 6
        stairBuilder(ModBlocks.AMETHYST_STAIRS_6.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_6.get()))
                .unlockedBy("has_amethyst_6", has(ModBlocks.AMETHYST_BLOCK_6.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_6.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_6.get())
                .unlockedBy("has_amethyst_6", has(ModBlocks.AMETHYST_BLOCK_6.get()))
                .save(output);

        // Amethyst 7
        stairBuilder(ModBlocks.AMETHYST_STAIRS_7.get(), Ingredient.of(ModBlocks.AMETHYST_BLOCK_7.get()))
                .unlockedBy("has_amethyst_7", has(ModBlocks.AMETHYST_BLOCK_7.get()))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, ModBlocks.AMETHYST_SLAB_7.get(), 6)
                .pattern("XXX")
                .define('X', ModBlocks.AMETHYST_BLOCK_7.get())
                .unlockedBy("has_amethyst_7", has(ModBlocks.AMETHYST_BLOCK_7.get()))
                .save(output);

        // Amethyst 8
        stairBuilder(ModBlocks.AMETHYST_STAIRS_8.get(), Ingredient.of(Blocks.AMETHYST_BLOCK))
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .save(output);

        ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, Blocks.AMETHYST_BLOCK, 6)
                .pattern("XXX")
                .define('X', Blocks.AMETHYST_BLOCK)
                .unlockedBy("has_amethyst_block", has(Blocks.AMETHYST_BLOCK))
                .save(output);
    }
}