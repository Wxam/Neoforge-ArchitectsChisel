package net.wxam.architectschisel.recipe;

import com.google.gson.*;
import com.mojang.logging.LogUtils;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.server.packs.resources.ResourceManager;
import net.minecraft.server.packs.resources.SimpleJsonResourceReloadListener;
import net.minecraft.util.GsonHelper;
import net.minecraft.util.profiling.ProfilerFiller;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import org.slf4j.Logger;

import java.util.*;

public class ChiselRecipeFactory extends SimpleJsonResourceReloadListener {
    private static final Logger LOGGER = LogUtils.getLogger();
    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().disableHtmlEscaping().create();

    private static ChiselRecipeFactory INSTANCE;
    private final List<ChiselRecipe> recipes = new ArrayList<>();

    public ChiselRecipeFactory() {
        super(GSON, "chisel");
        INSTANCE = this;
    }

    @Override
    protected void apply(Map<ResourceLocation, JsonElement> objects, ResourceManager manager, ProfilerFiller profiler) {
        recipes.clear();
        for (Map.Entry<ResourceLocation, JsonElement> entry : objects.entrySet()) {
            ResourceLocation id = entry.getKey();
            try {
                ChiselRecipe recipe = fromJson(GsonHelper.convertToJsonObject(entry.getValue(), "top element"));
                if (recipe != null) {
                    recipes.add(recipe);
                }
            } catch (JsonParseException e) {
                LOGGER.error("Error loading chisel recipe {}", id, e);
            }
        }
        LOGGER.info("Loaded {} chisel recipes", recipes.size());
    }

    private ChiselRecipe fromJson(JsonObject json) {
        JsonArray variantsArray = GsonHelper.getAsJsonArray(json, "variants");
        List<Item> items = new ArrayList<>();

        for (JsonElement element : variantsArray) {
            ResourceLocation id = ResourceLocation.tryParse(element.getAsString());
            if (id == null || !BuiltInRegistries.ITEM.containsKey(id)) {
                LOGGER.warn("Unknown item in chisel recipe: {}", element.getAsString());
                return null;
            }
            items.add(BuiltInRegistries.ITEM.get(id));
        }

        return ChiselRecipe.fromItems(items);
    }

    public List<ItemStack> getVariants(ItemStack input) {
        for (ChiselRecipe recipe : recipes) {
            if (recipe.contains(input)) {
                return recipe.getVariants();
            }
        }
        return new ArrayList<>();
    }

    public List<ChiselRecipe> getChiselRecipes() {
        return recipes;
    }

    public static ChiselRecipeFactory get() {
        return INSTANCE;
    }
}