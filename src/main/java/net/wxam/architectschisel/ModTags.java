package net.wxam.architectschisel;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {

    public static class Blocks {
        public static final TagKey<Block> ACACIA_PLANKS = create("acacia_planks");
        public static final TagKey<Block> BAMBOO_PLANKS = create("bamboo_planks");
        public static final TagKey<Block> BIRCH_PLANKS = create("birch_planks");
        public static final TagKey<Block> CHERRY_PLANKS = create("cherry_planks");
        public static final TagKey<Block> CRIMSON_PLANKS = create("crimson_planks");
        public static final TagKey<Block> DARK_OAK_PLANKS = create("dark_oak_planks");
        public static final TagKey<Block> JUNGLE_PLANKS = create("jungle_planks");
        public static final TagKey<Block> MANGROVE_PLANKS = create("mangrove_planks");
        public static final TagKey<Block> OAK_PLANKS = create("oak_planks");
        public static final TagKey<Block> SPRUCE_PLANKS = create("spruce_planks");
        public static final TagKey<Block> WARPED_PLANKS = create("warped_planks");

        private static TagKey<Block> create(String name) {
            return TagKey.create(Registries.BLOCK,
                    ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, name));
        }
    }

    public static class Items {
        public static final TagKey<Item> ACACIA_PLANKS = create("acacia_planks");
        public static final TagKey<Item> BAMBOO_PLANKS = create("bamboo_planks");
        public static final TagKey<Item> BIRCH_PLANKS = create("birch_planks");
        public static final TagKey<Item> CHERRY_PLANKS = create("cherry_planks");
        public static final TagKey<Item> CRIMSON_PLANKS = create("crimson_planks");
        public static final TagKey<Item> DARK_OAK_PLANKS = create("dark_oak_planks");
        public static final TagKey<Item> JUNGLE_PLANKS = create("jungle_planks");
        public static final TagKey<Item> MANGROVE_PLANKS = create("mangrove_planks");
        public static final TagKey<Item> OAK_PLANKS = create("oak_planks");
        public static final TagKey<Item> SPRUCE_PLANKS = create("spruce_planks");
        public static final TagKey<Item> WARPED_PLANKS = create("warped_planks");

        private static TagKey<Item> create(String name) {
            return TagKey.create(Registries.ITEM,
                    ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, name));
        }
    }
}