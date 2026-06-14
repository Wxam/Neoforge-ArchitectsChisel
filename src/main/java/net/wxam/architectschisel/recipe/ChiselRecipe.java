package net.wxam.architectschisel.recipe;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

import java.util.ArrayList;
import java.util.List;

public class ChiselRecipe {

    private final List<ItemStack> variants = new ArrayList<>();

    public List<ItemStack> getVariants() {
        return variants;
    }

    public ChiselRecipe addVariant(Item... items) {
        for (Item item : items) {
            variants.add(new ItemStack(item));
        }
        return this;
    }

    public boolean contains(ItemStack base) {
        for (ItemStack variant : variants) {
            if (variant.getItem() == base.getItem()) {
                return true;
            }
        }
        return false;
    }

    public static ChiselRecipe fromItems(List<Item> items) {
        ChiselRecipe recipe = new ChiselRecipe();
        recipe.addVariant(items.toArray(new Item[0]));
        return recipe;
    }
}