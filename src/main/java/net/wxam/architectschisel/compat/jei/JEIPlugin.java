package net.wxam.architectschisel.compat.jei;

import mezz.jei.api.IModPlugin;
import mezz.jei.api.JeiPlugin;
import mezz.jei.api.registration.IRecipeCatalystRegistration;
import mezz.jei.api.registration.IRecipeCategoryRegistration;
import mezz.jei.api.registration.IRecipeRegistration;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.item.ModItems;
import net.wxam.architectschisel.recipe.ChiselRecipeFactory;

@JeiPlugin
public class JEIPlugin implements IModPlugin {

    @Override
    public ResourceLocation getPluginUid() {
        return ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "jei_plugin");
    }

    @Override
    public void registerCategories(IRecipeCategoryRegistration registration) {
        registration.addRecipeCategories(new ChiselRecipeCategory(
                registration.getJeiHelpers().getGuiHelper()));
    }

    @Override
    public void registerRecipes(IRecipeRegistration registration) {
        if (ChiselRecipeFactory.get() != null) {
            registration.addRecipes(
                    ChiselRecipeCategory.RECIPE_TYPE,
                    ChiselRecipeFactory.get().getChiselRecipes()
            );
        }
    }

    @Override
    public void registerRecipeCatalysts(IRecipeCatalystRegistration registration) {
        registration.addRecipeCatalyst(
                new ItemStack(ModItems.IRON_CHISEL.get()),
                ChiselRecipeCategory.RECIPE_TYPE
        );
    }
}