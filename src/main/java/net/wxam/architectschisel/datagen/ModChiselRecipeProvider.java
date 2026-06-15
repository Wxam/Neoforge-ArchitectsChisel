package net.wxam.architectschisel.datagen;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import net.minecraft.data.CachedOutput;
import net.minecraft.data.DataProvider;
import net.minecraft.data.PackOutput;
import net.wxam.architectschisel.ArchitectsChisel;

import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CompletableFuture;

public class ModChiselRecipeProvider implements DataProvider {

    private final PackOutput output;

    public ModChiselRecipeProvider (PackOutput output) {
        this.output = output;
    }

    @Override
    public CompletableFuture<?> run(CachedOutput cache) {
        List<CompletableFuture<?>> futures = new ArrayList<>();

        futures.add(saveRecipe(cache, "acacia_planks", List.of(
                "minecraft:acacia_planks",
                "architectschisel:acacia_planks_1",
                "architectschisel:acacia_planks_2",
                "architectschisel:acacia_planks_3",
                "architectschisel:acacia_planks_4",
                "architectschisel:acacia_planks_5",
                "architectschisel:acacia_planks_6",
                "architectschisel:acacia_planks_7"
        )));

        futures.add(saveRecipe(cache, "acacia_stairs", List.of(
                "minecraft:acacia_stairs",
                "architectschisel:acacia_stairs_1",
                "architectschisel:acacia_stairs_2",
                "architectschisel:acacia_stairs_3",
                "architectschisel:acacia_stairs_4",
                "architectschisel:acacia_stairs_5",
                "architectschisel:acacia_stairs_6",
                "architectschisel:acacia_stairs_7"
        )));

        futures.add(saveRecipe(cache, "acacia_slabs", List.of(
                "minecraft:acacia_slab",
                "architectschisel:acacia_slab_1",
                "architectschisel:acacia_slab_2",
                "architectschisel:acacia_slab_3",
                "architectschisel:acacia_slab_4",
                "architectschisel:acacia_slab_5",
                "architectschisel:acacia_slab_6",
                "architectschisel:acacia_slab_7"
        )));

        futures.add(saveRecipe(cache, "acacia_frame", List.of(
                "architectschisel:acacia_frame_1",
                "architectschisel:acacia_frame_2",
                "architectschisel:acacia_frame_3",
                "architectschisel:acacia_frame_4",
                "architectschisel:acacia_frame_5",
                "architectschisel:acacia_frame_6",
                "architectschisel:acacia_frame_7",
                "architectschisel:acacia_frame_8"
        )));

        futures.add(saveRecipe(cache, "bamboo_planks", List.of(
                "minecraft:bamboo_planks",
                "architectschisel:bamboo_planks_1",
                "architectschisel:bamboo_planks_2",
                "architectschisel:bamboo_planks_3",
                "architectschisel:bamboo_planks_4",
                "architectschisel:bamboo_planks_5",
                "architectschisel:bamboo_planks_6"
        )));

        futures.add(saveRecipe(cache, "bamboo_stairs", List.of(
                "minecraft:bamboo_stairs",
                "architectschisel:bamboo_stairs_1",
                "architectschisel:bamboo_stairs_2",
                "architectschisel:bamboo_stairs_3",
                "architectschisel:bamboo_stairs_4",
                "architectschisel:bamboo_stairs_5",
                "architectschisel:bamboo_stairs_6"
        )));

        futures.add(saveRecipe(cache, "bamboo_slabs", List.of(
                "minecraft:bamboo_slab",
                "architectschisel:bamboo_slab_1",
                "architectschisel:bamboo_slab_2",
                "architectschisel:bamboo_slab_3",
                "architectschisel:bamboo_slab_4",
                "architectschisel:bamboo_slab_5",
                "architectschisel:bamboo_slab_6"
        )));

        futures.add(saveRecipe(cache, "bamboo_frame", List.of(
                "architectschisel:bamboo_frame_1",
                "architectschisel:bamboo_frame_2",
                "architectschisel:bamboo_frame_3",
                "architectschisel:bamboo_frame_4",
                "architectschisel:bamboo_frame_5",
                "architectschisel:bamboo_frame_6",
                "architectschisel:bamboo_frame_7",
                "architectschisel:bamboo_frame_8"
        )));
        
        futures.add(saveRecipe(cache, "birch_planks", List.of(
                "minecraft:birch_planks",
                "architectschisel:birch_planks_1",
                "architectschisel:birch_planks_2",
                "architectschisel:birch_planks_3",
                "architectschisel:birch_planks_4",
                "architectschisel:birch_planks_5",
                "architectschisel:birch_planks_6",
                "architectschisel:birch_planks_7"
        )));
        
        futures.add(saveRecipe(cache, "birch_stairs", List.of(
                "minecraft:birch_stairs",
                "architectschisel:birch_stairs_1",
                "architectschisel:birch_stairs_2",
                "architectschisel:birch_stairs_3",
                "architectschisel:birch_stairs_4",
                "architectschisel:birch_stairs_5",
                "architectschisel:birch_stairs_6",
                "architectschisel:birch_stairs_7"
        )));

        futures.add(saveRecipe(cache, "birch_slabs", List.of(
                "minecraft:birch_slab",
                "architectschisel:birch_slab_1",
                "architectschisel:birch_slab_2",
                "architectschisel:birch_slab_3",
                "architectschisel:birch_slab_4",
                "architectschisel:birch_slab_5",
                "architectschisel:birch_slab_6",
                "architectschisel:birch_slab_7"
        )));

        futures.add(saveRecipe(cache, "birch_frame", List.of(
                "architectschisel:birch_frame_1",
                "architectschisel:birch_frame_2",
                "architectschisel:birch_frame_3",
                "architectschisel:birch_frame_4",
                "architectschisel:birch_frame_5",
                "architectschisel:birch_frame_6",
                "architectschisel:birch_frame_7",
                "architectschisel:birch_frame_8"
        )));
        futures.add(saveRecipe(cache, "cherry_planks", List.of(
                "minecraft:cherry_planks",
                "architectschisel:cherry_planks_1",
                "architectschisel:cherry_planks_2",
                "architectschisel:cherry_planks_3",
                "architectschisel:cherry_planks_4",
                "architectschisel:cherry_planks_5",
                "architectschisel:cherry_planks_6",
                "architectschisel:cherry_planks_7"
        )));
        
        futures.add(saveRecipe(cache, "cherry_stairs", List.of(
                "minecraft:cherry_stairs",
                "architectschisel:cherry_stairs_1",
                "architectschisel:cherry_stairs_2",
                "architectschisel:cherry_stairs_3",
                "architectschisel:cherry_stairs_4",
                "architectschisel:cherry_stairs_5",
                "architectschisel:cherry_stairs_6",
                "architectschisel:cherry_stairs_7"
        )));

        futures.add(saveRecipe(cache, "cherry_slabs", List.of(
                "minecraft:cherry_slab",
                "architectschisel:cherry_slab_1",
                "architectschisel:cherry_slab_2",
                "architectschisel:cherry_slab_3",
                "architectschisel:cherry_slab_4",
                "architectschisel:cherry_slab_5",
                "architectschisel:cherry_slab_6",
                "architectschisel:cherry_slab_7"
        )));

        futures.add(saveRecipe(cache, "cherry_frame", List.of(
                "architectschisel:cherry_frame_1",
                "architectschisel:cherry_frame_2",
                "architectschisel:cherry_frame_3",
                "architectschisel:cherry_frame_4",
                "architectschisel:cherry_frame_5",
                "architectschisel:cherry_frame_6",
                "architectschisel:cherry_frame_7",
                "architectschisel:cherry_frame_8"
        )));

         futures.add(saveRecipe(cache, "crimson_planks", List.of(
                "minecraft:crimson_planks",
                "architectschisel:crimson_planks_1",
                "architectschisel:crimson_planks_2",
                "architectschisel:crimson_planks_3",
                "architectschisel:crimson_planks_4",
                "architectschisel:crimson_planks_5",
                "architectschisel:crimson_planks_6",
                "architectschisel:crimson_planks_7"
        )));

        futures.add(saveRecipe(cache, "crimson_stairs", List.of(
                "minecraft:crimson_stairs",
                "architectschisel:crimson_stairs_1",
                "architectschisel:crimson_stairs_2",
                "architectschisel:crimson_stairs_3",
                "architectschisel:crimson_stairs_4",
                "architectschisel:crimson_stairs_5",
                "architectschisel:crimson_stairs_6",
                "architectschisel:crimson_stairs_7"
        )));

        futures.add(saveRecipe(cache, "crimson_slabs", List.of(
                "minecraft:crimson_slab",
                "architectschisel:crimson_slab_1",
                "architectschisel:crimson_slab_2",
                "architectschisel:crimson_slab_3",
                "architectschisel:crimson_slab_4",
                "architectschisel:crimson_slab_5",
                "architectschisel:crimson_slab_6",
                "architectschisel:crimson_slab_7"
        )));

        futures.add(saveRecipe(cache, "crimson_frame", List.of(
                "architectschisel:crimson_frame_1",
                "architectschisel:crimson_frame_2",
                "architectschisel:crimson_frame_3",
                "architectschisel:crimson_frame_4",
                "architectschisel:crimson_frame_5",
                "architectschisel:crimson_frame_6",
                "architectschisel:crimson_frame_7",
                "architectschisel:crimson_frame_8"
        )));

         futures.add(saveRecipe(cache, "dark_oak_planks", List.of(
                "minecraft:dark_oak_planks",
                "architectschisel:dark_oak_planks_1",
                "architectschisel:dark_oak_planks_2",
                "architectschisel:dark_oak_planks_3",
                "architectschisel:dark_oak_planks_4",
                "architectschisel:dark_oak_planks_5",
                "architectschisel:dark_oak_planks_6",
                "architectschisel:dark_oak_planks_7"
        )));

        futures.add(saveRecipe(cache, "dark_oak_stairs", List.of(
                "minecraft:dark_oak_stairs",
                "architectschisel:dark_oak_stairs_1",
                "architectschisel:dark_oak_stairs_2",
                "architectschisel:dark_oak_stairs_3",
                "architectschisel:dark_oak_stairs_4",
                "architectschisel:dark_oak_stairs_5",
                "architectschisel:dark_oak_stairs_6",
                "architectschisel:dark_oak_stairs_7"
        )));

        futures.add(saveRecipe(cache, "dark_oak_slabs", List.of(
                "minecraft:dark_oak_slab",
                "architectschisel:dark_oak_slab_1",
                "architectschisel:dark_oak_slab_2",
                "architectschisel:dark_oak_slab_3",
                "architectschisel:dark_oak_slab_4",
                "architectschisel:dark_oak_slab_5",
                "architectschisel:dark_oak_slab_6",
                "architectschisel:dark_oak_slab_7"
        )));

        futures.add(saveRecipe(cache, "dark_oak_frame", List.of(
                "architectschisel:dark_oak_frame_1",
                "architectschisel:dark_oak_frame_2",
                "architectschisel:dark_oak_frame_3",
                "architectschisel:dark_oak_frame_4",
                "architectschisel:dark_oak_frame_5",
                "architectschisel:dark_oak_frame_6",
                "architectschisel:dark_oak_frame_7",
                "architectschisel:dark_oak_frame_8"
        )));

         futures.add(saveRecipe(cache, "jungle_planks", List.of(
                "minecraft:jungle_planks",
                "architectschisel:jungle_planks_1",
                "architectschisel:jungle_planks_2",
                "architectschisel:jungle_planks_3",
                "architectschisel:jungle_planks_4",
                "architectschisel:jungle_planks_5",
                "architectschisel:jungle_planks_6",
                "architectschisel:jungle_planks_7"
        )));

        futures.add(saveRecipe(cache, "jungle_stairs", List.of(
                "minecraft:jungle_stairs",
                "architectschisel:jungle_stairs_1",
                "architectschisel:jungle_stairs_2",
                "architectschisel:jungle_stairs_3",
                "architectschisel:jungle_stairs_4",
                "architectschisel:jungle_stairs_5",
                "architectschisel:jungle_stairs_6",
                "architectschisel:jungle_stairs_7"
        )));

        futures.add(saveRecipe(cache, "jungle_slabs", List.of(
                "minecraft:jungle_slab",
                "architectschisel:jungle_slab_1",
                "architectschisel:jungle_slab_2",
                "architectschisel:jungle_slab_3",
                "architectschisel:jungle_slab_4",
                "architectschisel:jungle_slab_5",
                "architectschisel:jungle_slab_6",
                "architectschisel:jungle_slab_7"
        )));

        futures.add(saveRecipe(cache, "jungle_frame", List.of(
                "architectschisel:jungle_frame_1",
                "architectschisel:jungle_frame_2",
                "architectschisel:jungle_frame_3",
                "architectschisel:jungle_frame_4",
                "architectschisel:jungle_frame_5",
                "architectschisel:jungle_frame_6",
                "architectschisel:jungle_frame_7",
                "architectschisel:jungle_frame_8"
        )));

         futures.add(saveRecipe(cache, "mangrove_planks", List.of(
                "minecraft:mangrove_planks",
                "architectschisel:mangrove_planks_1",
                "architectschisel:mangrove_planks_2",
                "architectschisel:mangrove_planks_3",
                "architectschisel:mangrove_planks_4",
                "architectschisel:mangrove_planks_5",
                "architectschisel:mangrove_planks_6",
                "architectschisel:mangrove_planks_7"
        )));

        futures.add(saveRecipe(cache, "mangrove_stairs", List.of(
                "minecraft:mangrove_stairs",
                "architectschisel:mangrove_stairs_1",
                "architectschisel:mangrove_stairs_2",
                "architectschisel:mangrove_stairs_3",
                "architectschisel:mangrove_stairs_4",
                "architectschisel:mangrove_stairs_5",
                "architectschisel:mangrove_stairs_6",
                "architectschisel:mangrove_stairs_7"
        )));

        futures.add(saveRecipe(cache, "mangrove_slabs", List.of(
                "minecraft:mangrove_slab",
                "architectschisel:mangrove_slab_1",
                "architectschisel:mangrove_slab_2",
                "architectschisel:mangrove_slab_3",
                "architectschisel:mangrove_slab_4",
                "architectschisel:mangrove_slab_5",
                "architectschisel:mangrove_slab_6",
                "architectschisel:mangrove_slab_7"
        )));

        futures.add(saveRecipe(cache, "mangrove_frame", List.of(
                "architectschisel:mangrove_frame_1",
                "architectschisel:mangrove_frame_2",
                "architectschisel:mangrove_frame_3",
                "architectschisel:mangrove_frame_4",
                "architectschisel:mangrove_frame_5",
                "architectschisel:mangrove_frame_6",
                "architectschisel:mangrove_frame_7",
                "architectschisel:mangrove_frame_8"
        )));

         futures.add(saveRecipe(cache, "oak_planks", List.of(
                "minecraft:oak_planks",
                "architectschisel:oak_planks_1",
                "architectschisel:oak_planks_2",
                "architectschisel:oak_planks_3",
                "architectschisel:oak_planks_4",
                "architectschisel:oak_planks_5",
                "architectschisel:oak_planks_6",
                "architectschisel:oak_planks_7"
        )));

        futures.add(saveRecipe(cache, "oak_stairs", List.of(
                "minecraft:oak_stairs",
                "architectschisel:oak_stairs_1",
                "architectschisel:oak_stairs_2",
                "architectschisel:oak_stairs_3",
                "architectschisel:oak_stairs_4",
                "architectschisel:oak_stairs_5",
                "architectschisel:oak_stairs_6",
                "architectschisel:oak_stairs_7"
        )));

        futures.add(saveRecipe(cache, "oak_slabs", List.of(
                "minecraft:oak_slab",
                "architectschisel:oak_slab_1",
                "architectschisel:oak_slab_2",
                "architectschisel:oak_slab_3",
                "architectschisel:oak_slab_4",
                "architectschisel:oak_slab_5",
                "architectschisel:oak_slab_6",
                "architectschisel:oak_slab_7"
        )));

        futures.add(saveRecipe(cache, "oak_frame", List.of(
                "architectschisel:oak_frame_1",
                "architectschisel:oak_frame_2",
                "architectschisel:oak_frame_3",
                "architectschisel:oak_frame_4",
                "architectschisel:oak_frame_5",
                "architectschisel:oak_frame_6",
                "architectschisel:oak_frame_7",
                "architectschisel:oak_frame_8"
        )));

         futures.add(saveRecipe(cache, "spruce_planks", List.of(
                "minecraft:spruce_planks",
                "architectschisel:spruce_planks_1",
                "architectschisel:spruce_planks_2",
                "architectschisel:spruce_planks_3",
                "architectschisel:spruce_planks_4",
                "architectschisel:spruce_planks_5",
                "architectschisel:spruce_planks_6",
                "architectschisel:spruce_planks_7"
        )));

        futures.add(saveRecipe(cache, "spruce_stairs", List.of(
                "minecraft:spruce_stairs",
                "architectschisel:spruce_stairs_1",
                "architectschisel:spruce_stairs_2",
                "architectschisel:spruce_stairs_3",
                "architectschisel:spruce_stairs_4",
                "architectschisel:spruce_stairs_5",
                "architectschisel:spruce_stairs_6",
                "architectschisel:spruce_stairs_7"
        )));

        futures.add(saveRecipe(cache, "spruce_slabs", List.of(
                "minecraft:spruce_slab",
                "architectschisel:spruce_slab_1",
                "architectschisel:spruce_slab_2",
                "architectschisel:spruce_slab_3",
                "architectschisel:spruce_slab_4",
                "architectschisel:spruce_slab_5",
                "architectschisel:spruce_slab_6",
                "architectschisel:spruce_slab_7"
        )));

        futures.add(saveRecipe(cache, "spruce_frame", List.of(
                "architectschisel:spruce_frame_1",
                "architectschisel:spruce_frame_2",
                "architectschisel:spruce_frame_3",
                "architectschisel:spruce_frame_4",
                "architectschisel:spruce_frame_5",
                "architectschisel:spruce_frame_6",
                "architectschisel:spruce_frame_7",
                "architectschisel:spruce_frame_8"
        )));

         futures.add(saveRecipe(cache, "warped_planks", List.of(
                "minecraft:warped_planks",
                "architectschisel:warped_planks_1",
                "architectschisel:warped_planks_2",
                "architectschisel:warped_planks_3",
                "architectschisel:warped_planks_4",
                "architectschisel:warped_planks_5",
                "architectschisel:warped_planks_6",
                "architectschisel:warped_planks_7"
        )));

        futures.add(saveRecipe(cache, "warped_stairs", List.of(
                "minecraft:warped_stairs",
                "architectschisel:warped_stairs_1",
                "architectschisel:warped_stairs_2",
                "architectschisel:warped_stairs_3",
                "architectschisel:warped_stairs_4",
                "architectschisel:warped_stairs_5",
                "architectschisel:warped_stairs_6",
                "architectschisel:warped_stairs_7"
        )));

        futures.add(saveRecipe(cache, "warped_slabs", List.of(
                "minecraft:warped_slab",
                "architectschisel:warped_slab_1",
                "architectschisel:warped_slab_2",
                "architectschisel:warped_slab_3",
                "architectschisel:warped_slab_4",
                "architectschisel:warped_slab_5",
                "architectschisel:warped_slab_6",
                "architectschisel:warped_slab_7"
        )));

        futures.add(saveRecipe(cache, "warped_frame", List.of(
                "architectschisel:warped_frame_1",
                "architectschisel:warped_frame_2",
                "architectschisel:warped_frame_3",
                "architectschisel:warped_frame_4",
                "architectschisel:warped_frame_5",
                "architectschisel:warped_frame_6",
                "architectschisel:warped_frame_7",
                "architectschisel:warped_frame_8"
        )));
        
        futures.add(saveRecipe(cache, "cobblestone" , List.of(
                "minecraft:cobblestone",
                "architectschisel:cobblestone_1",
                "architectschisel:cobblestone_2",
                "architectschisel:cobblestone_3",
                "architectschisel:cobblestone_4",
                "architectschisel:cobblestone_5",
                "architectschisel:cobblestone_6",
                "architectschisel:cobblestone_7"
        )));
        
        futures.add(saveRecipe(cache, "cobblestone_stairs" , List.of(
                "minecraft:cobblestone_stairs",
                "architectschisel:cobblestone_stairs_1",
                "architectschisel:cobblestone_stairs_2",
                "architectschisel:cobblestone_stairs_3",
                "architectschisel:cobblestone_stairs_4",
                "architectschisel:cobblestone_stairs_5",
                "architectschisel:cobblestone_stairs_6",
                "architectschisel:cobblestone_stairs_7"
        )));

        futures.add(saveRecipe(cache, "cobblestone_slab" , List.of(
                "minecraft:cobblestone_slab",
                "architectschisel:cobblestone_slab_1",
                "architectschisel:cobblestone_slab_2",
                "architectschisel:cobblestone_slab_3",
                "architectschisel:cobblestone_slab_4",
                "architectschisel:cobblestone_slab_5",
                "architectschisel:cobblestone_slab_6",
                "architectschisel:cobblestone_slab_7"
        )));

        futures.add(saveRecipe(cache, "granite" , List.of(
                "minecraft:granite",
                "architectschisel:granite_1",
                "architectschisel:granite_2",
                "architectschisel:granite_3",
                "architectschisel:granite_4",
                "architectschisel:granite_5",
                "architectschisel:granite_6",
                "architectschisel:granite_7"
        )));
        
        futures.add(saveRecipe(cache, "granite_stairs" , List.of(
                "minecraft:granite_stairs",
                "architectschisel:granite_stairs_1",
                "architectschisel:granite_stairs_2",
                "architectschisel:granite_stairs_3",
                "architectschisel:granite_stairs_4",
                "architectschisel:granite_stairs_5",
                "architectschisel:granite_stairs_6",
                "architectschisel:granite_stairs_7"
        )));

        futures.add(saveRecipe(cache, "granite_slab" , List.of(
                "minecraft:granite_slab",
                "architectschisel:granite_slab_1",
                "architectschisel:granite_slab_2",
                "architectschisel:granite_slab_3",
                "architectschisel:granite_slab_4",
                "architectschisel:granite_slab_5",
                "architectschisel:granite_slab_6",
                "architectschisel:granite_slab_7"
        )));

         futures.add(saveRecipe(cache, "andesite" , List.of(
                "minecraft:andesite",
                "architectschisel:andesite_1",
                "architectschisel:andesite_2",
                "architectschisel:andesite_3",
                "architectschisel:andesite_4",
                "architectschisel:andesite_5",
                "architectschisel:andesite_6",
                "architectschisel:andesite_7"
        )));
        
        futures.add(saveRecipe(cache, "andesite_stairs" , List.of(
                "minecraft:andesite_stairs",
                "architectschisel:andesite_stairs_1",
                "architectschisel:andesite_stairs_2",
                "architectschisel:andesite_stairs_3",
                "architectschisel:andesite_stairs_4",
                "architectschisel:andesite_stairs_5",
                "architectschisel:andesite_stairs_6",
                "architectschisel:andesite_stairs_7"
        )));

        futures.add(saveRecipe(cache, "andesite_slab" , List.of(
                "minecraft:andesite_slab",
                "architectschisel:andesite_slab_1",
                "architectschisel:andesite_slab_2",
                "architectschisel:andesite_slab_3",
                "architectschisel:andesite_slab_4",
                "architectschisel:andesite_slab_5",
                "architectschisel:andesite_slab_6",
                "architectschisel:andesite_slab_7"
        )));

         futures.add(saveRecipe(cache, "diorite" , List.of(
                "minecraft:diorite",
                "architectschisel:diorite_1",
                "architectschisel:diorite_2",
                "architectschisel:diorite_3",
                "architectschisel:diorite_4",
                "architectschisel:diorite_5",
                "architectschisel:diorite_6",
                "architectschisel:diorite_7"
        )));
        
        futures.add(saveRecipe(cache, "diorite_stairs" , List.of(
                "minecraft:diorite_stairs",
                "architectschisel:diorite_stairs_1",
                "architectschisel:diorite_stairs_2",
                "architectschisel:diorite_stairs_3",
                "architectschisel:diorite_stairs_4",
                "architectschisel:diorite_stairs_5",
                "architectschisel:diorite_stairs_6",
                "architectschisel:diorite_stairs_7"
        )));

        futures.add(saveRecipe(cache, "diorite_slab" , List.of(
                "minecraft:diorite_slab",
                "architectschisel:diorite_slab_1",
                "architectschisel:diorite_slab_2",
                "architectschisel:diorite_slab_3",
                "architectschisel:diorite_slab_4",
                "architectschisel:diorite_slab_5",
                "architectschisel:diorite_slab_6",
                "architectschisel:diorite_slab_7"
        )));
        
        futures.add(saveRecipe(cache, "stone_bricks", List.of(
                "minecraft:stone_bricks",
                "architectschisel:stone_bricks_1",
                "architectschisel:stone_bricks_2",
                "architectschisel:stone_bricks_3",
                "architectschisel:stone_bricks_4",
                "architectschisel:stone_bricks_5",
                "architectschisel:stone_bricks_6",
                "architectschisel:stone_bricks_7"
        )));
        
        futures.add(saveRecipe(cache, "stone_brick_stairs", List.of(
                "minecraft:stone_brick_stairs",
                "architectschisel:stone_brick_stairs_1",
                "architectschisel:stone_brick_stairs_2",
                "architectschisel:stone_brick_stairs_3",
                "architectschisel:stone_brick_stairs_4",
                "architectschisel:stone_brick_stairs_5",
                "architectschisel:stone_brick_stairs_6",
                "architectschisel:stone_brick_stairs_7"
        )));

         futures.add(saveRecipe(cache, "stone_brick_slab", List.of(
                "minecraft:stone_brick_slab",
                "architectschisel:stone_brick_slab_1",
                "architectschisel:stone_brick_slab_2",
                "architectschisel:stone_brick_slab_3",
                "architectschisel:stone_brick_slab_4",
                "architectschisel:stone_brick_slab_5",
                "architectschisel:stone_brick_slab_6",
                "architectschisel:stone_brick_slab_7"
        )));
         
         futures.add(saveRecipe(cache, "deepslate", List.of(
                 "minecraft:deepslate",
                 "architectschisel:deepslate_1",
                 "architectschisel:deepslate_2",
                 "architectschisel:deepslate_3",
                 "architectschisel:deepslate_4",
                 "architectschisel:deepslate_5"
         )));

         futures.add(saveRecipe(cache, "deepslate_stairs", List.of(
                 "minecraft:deepslate_stairs",
                 "architectschisel:deepslate_stairs_1",
                 "architectschisel:deepslate_stairs_2",
                 "architectschisel:deepslate_stairs_3",
                 "architectschisel:deepslate_stairs_4",
                 "architectschisel:deepslate_stairs_5"
         )));

         futures.add(saveRecipe(cache, "deepslate_slab", List.of(
                 "minecraft:deepslate_slab",
                 "architectschisel:deepslate_slab_1",
                 "architectschisel:deepslate_slab_2",
                 "architectschisel:deepslate_slab_3",
                 "architectschisel:deepslate_slab_4",
                 "architectschisel:deepslate_slab_5"
         )));
         
         futures.add(saveRecipe(cache, "bricks", List.of(
                 "minecraft:sandstone",
                 "architectschisel:sandstone_1",
                 "architectschisel:sandstone_2",
                 "architectschisel:sandstone_3",
                 "architectschisel:sandstone_4",
                 "architectschisel:sandstone_5"
         )));

         futures.add(saveRecipe(cache, "bricks", List.of(
                 "minecraft:sandstone_stairs",
                 "architectschisel:sandstone_stairs_1",
                 "architectschisel:sandstone_stairs_2",
                 "architectschisel:sandstone_stairs_3",
                 "architectschisel:sandstone_stairs_4",
                 "architectschisel:sandstone_stairs_5",
                 "architectschisel:sandstone_stairs_6"
         )));

         futures.add(saveRecipe(cache, "bricks", List.of(
                 "minecraft:sandstone_slabs",
                 "architectschisel:sandstone_slabs_1",
                 "architectschisel:sandstone_slabs_2",
                 "architectschisel:sandstone_slabs_3",
                 "architectschisel:sandstone_slabs_4",
                 "architectschisel:sandstone_slabs_5",
                 "architectschisel:sandstone_slab_6"
         )));
         
         futures.add(saveRecipe(cache, "prismarine", List.of(
                 "minecraft:prismarine",
                 "architectschisel:prismarine_1",
                 "architectschisel:prismarine_2",
                 "architectschisel:prismarine_3",
                 "architectschisel:prismarine_4",
                 "architectschisel:prismarine_5",
                 "architectschisel:prismarine_6"
         )));

         futures.add(saveRecipe(cache, "prismarine_stairs", List.of(
                 "minecraft:prismarine_stairs",
                 "architectschisel:prismarine_stairs_1",
                 "architectschisel:prismarine_stairs_2",
                 "architectschisel:prismarine_stairs_3",
                 "architectschisel:prismarine_stairs_4",
                 "architectschisel:prismarine_stairs_5",
                 "architectschisel:prismarine_stairs_6"
         )));

         futures.add(saveRecipe(cache, "prismarine_slab", List.of(
                 "minecraft:prismarine_slab",
                 "architectschisel:prismarine_slab_1",
                 "architectschisel:prismarine_slab_2",
                 "architectschisel:prismarine_slab_3",
                 "architectschisel:prismarine_slab_4",
                 "architectschisel:prismarine_slab_5",
                 "architectschisel:prismarine_slab_6"
         )));
         
         futures.add(saveRecipe(cache, "blackstone", List.of(
                 "minecraft:blackstone",
                 "architectschisel:blackstone_1",
                 "architectschisel:blackstone_2",
                 "architectschisel:blackstone_3",
                 "architectschisel:blackstone_4",
                 "architectschisel:blackstone_5",
                 "architectschisel:blackstone_6"
         )));
         
         futures.add(saveRecipe(cache, "gilded_blackstone", List.of(
                 "minecraft:gilded_blackstone",
                 "architectschisel:gilded_blackstone_1",
                 "architectschisel:gilded_blackstone_2",
                 "architectschisel:gilded_blackstone_3",
                 "architectschisel:gilded_blackstone_4"
         )));

         futures.add(saveRecipe(cache, "nether_bricks", List.of(
                 "minecraft:nether_bricks",
                 "architectschisel:nether_bricks_1",
                 "architectschisel:nether_bricks_2",
                 "architectschisel:nether_bricks_3",
                 "architectschisel:nether_bricks_4",
                 "architectschisel:nether_bricks_5",
                 "architectschisel:nether_bricks_6"
         )));
         
         futures.add(saveRecipe(cache, "gilded_nether_bricks", List.of(
                 "minecraft:gilded_nether_bricks",
                 "architectschisel:gilded_nether_bricks_1",
                 "architectschisel:gilded_nether_bricks_2",
                 "architectschisel:gilded_nether_bricks_3",
                 "architectschisel:gilded_nether_bricks_4"
         )));
         
         futures.add(saveRecipe(cache, "calcite", List.of(
                 "minecraft:calcite",
                 "architectschisel:calite_1",
                 "architectschisel:calite_2",
                 "architectschisel:calite_3",
                 "architectschisel:calite_4",
                 "architectschisel:calite_5",
                 "architectschisel:calite_6",
                 "architectschisel:calite_7",
                 "architectschisel:calite_8"
         )));

          futures.add(saveRecipe(cache, "calcite_stairs", List.of(
                 "minecraft:calcite_stairs",
                 "architectschisel:calcite_stairs_1",
                 "architectschisel:calcite_stairs_2",
                 "architectschisel:calcite_stairs_3",
                 "architectschisel:calcite_stairs_4",
                 "architectschisel:calcite_stairs_5",
                 "architectschisel:calcite_stairs_6",
                 "architectschisel:calcite_stairs_7",
                 "architectschisel:calcite_stairs_8"
         )));

          futures.add(saveRecipe(cache, "calcite_slab", List.of(
                 "minecraft:calcite_slab",
                 "architectschisel:calcite_slab_1",
                 "architectschisel:calcite_slab_2",
                 "architectschisel:calcite_slab_3",
                 "architectschisel:calcite_slab_4",
                 "architectschisel:calcite_slab_5",
                 "architectschisel:calcite_slab_6",
                 "architectschisel:calcite_slab_7",
                 "architectschisel:calcite_slab_8"
         )));
          
          futures.add(saveRecipe(cache, "dripstone", List.of(
                  "minecraft:dripstone_block",
                  "architectschisel:dripstone_1",
                  "architectschisel:dripstone_2",
                  "architectschisel:dripstone_3",
                  "architectschisel:dripstone_4",
                  "architectschisel:dripstone_5",
                  "architectschisel:dripstone_6",
                  "architectschisel:dripstone_7"
          )));

          futures.add(saveRecipe(cache, "dripstone_stairs", List.of(
                  "minecraft:dripstone_stairs_block",
                  "architectschisel:dripstone_stairs_1",
                  "architectschisel:dripstone_stairs_2",
                  "architectschisel:dripstone_stairs_3",
                  "architectschisel:dripstone_stairs_4",
                  "architectschisel:dripstone_stairs_5",
                  "architectschisel:dripstone_stairs_6",
                  "architectschisel:dripstone_stairs_7",
                  "architectschisel:dripstone_stairs_8"
          )));

           futures.add(saveRecipe(cache, "dripstone_slab", List.of(
                  "minecraft:dripstone_slab_block",
                  "architectschisel:dripstone_slab_1",
                  "architectschisel:dripstone_slab_2",
                  "architectschisel:dripstone_slab_3",
                  "architectschisel:dripstone_slab_4",
                  "architectschisel:dripstone_slab_5",
                  "architectschisel:dripstone_slab_6",
                  "architectschisel:dripstone_slab_7",
                  "architectschisel:dripstone_slab_8"
          )));
           
           futures.add(saveRecipe(cache, "tuff", List.of(
                   "minecraft:tuff",
                   "architectschisel:tuff_1",
                   "architectschisel:tuff_2",
                   "architectschisel:tuff_3",
                   "architectschisel:tuff_4",
                   "architectschisel:tuff_5",
                   "architectschisel:tuff_6",
                   "architectschisel:tuff_7",
                   "architectschisel:tuff_8"
           )));

            futures.add(saveRecipe(cache, "tuff_stairs", List.of(
                   "minecraft:tuff_stairs",
                   "architectschisel:tuff_stairs_1",
                   "architectschisel:tuff_stairs_2",
                   "architectschisel:tuff_stairs_3",
                   "architectschisel:tuff_stairs_4",
                   "architectschisel:tuff_stairs_5",
                   "architectschisel:tuff_stairs_6",
                   "architectschisel:tuff_stairs_7",
                   "architectschisel:tuff_stairs_8"
           )));

            futures.add(saveRecipe(cache, "tuff_slab", List.of(
                   "minecraft:tuff_slab",
                   "architectschisel:tuff_slab_1",
                   "architectschisel:tuff_slab_2",
                   "architectschisel:tuff_slab_3",
                   "architectschisel:tuff_slab_4",
                   "architectschisel:tuff_slab_5",
                   "architectschisel:tuff_slab_6",
                   "architectschisel:tuff_slab_7",
                   "architectschisel:tuff_slab_8"
           )));
            
            futures.add(saveRecipe(cache, "amethyst", List.of(
                    "minecraft:amethyst_block",
                    "architectschisel:amethyst_block_1",
                    "architectschisel:amethyst_block_2",
                    "architectschisel:amethyst_block_3",
                    "architectschisel:amethyst_block_4",
                    "architectschisel:amethyst_block_5",
                    "architectschisel:amethyst_block_6",
                    "architectschisel:amethyst_block_7"
            )));

            futures.add(saveRecipe(cache, "amethyst_stairs", List.of(
                    "minecraft:amethyst_stairs_block",
                    "architectschisel:amethyst_stairs_1",
                    "architectschisel:amethyst_stairs_2",
                    "architectschisel:amethyst_stairs_3",
                    "architectschisel:amethyst_stairs_4",
                    "architectschisel:amethyst_stairs_5",
                    "architectschisel:amethyst_stairs_6",
                    "architectschisel:amethyst_stairs_7",
                    "architectschisel:amethyst_stairs_8"
            )));

            futures.add(saveRecipe(cache, "amethyst_slab", List.of(
                    "minecraft:amethyst_slab_block",
                    "architectschisel:amethyst_slab_1",
                    "architectschisel:amethyst_slab_2",
                    "architectschisel:amethyst_slab_3",
                    "architectschisel:amethyst_slab_4",
                    "architectschisel:amethyst_slab_5",
                    "architectschisel:amethyst_slab_6",
                    "architectschisel:amethyst_slab_7",
                    "architectschisel:amethyst_slab_8"
            )));

        return CompletableFuture.allOf(futures.toArray(new CompletableFuture[0]));

    }

    private CompletableFuture<?> saveRecipe(CachedOutput cache, String name, List<String> variants) {
        JsonObject json = new JsonObject();
        JsonArray array = new JsonArray();
        variants.forEach(array::add);
        json.add("variants", array);

        Path path = output.getOutputFolder()
                .resolve("data")
                .resolve(ArchitectsChisel.MOD_ID)
                .resolve("chisel")
                .resolve(name + ".json");

        return DataProvider.saveStable(cache, json, path);
    }

    @Override
    public String getName() {
        return "Chisel Recipes";
    }
}
