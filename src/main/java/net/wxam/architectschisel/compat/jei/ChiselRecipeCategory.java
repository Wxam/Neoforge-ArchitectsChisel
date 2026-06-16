package net.wxam.architectschisel.compat.jei;

import mezz.jei.api.gui.builder.IRecipeLayoutBuilder;
import mezz.jei.api.gui.drawable.IDrawable;
import mezz.jei.api.helpers.IGuiHelper;
import mezz.jei.api.recipe.IFocusGroup;
import mezz.jei.api.recipe.RecipeIngredientRole;
import mezz.jei.api.recipe.RecipeType;
import mezz.jei.api.recipe.category.IRecipeCategory;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.ItemStack;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.item.ModItems;
import net.wxam.architectschisel.recipe.ChiselRecipe;

import java.util.List;

public class ChiselRecipeCategory implements IRecipeCategory<ChiselRecipe> {

    public static final RecipeType<ChiselRecipe> RECIPE_TYPE = RecipeType.create(
            ArchitectsChisel.MOD_ID, "chiseling", ChiselRecipe.class);

    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(
            ArchitectsChisel.MOD_ID, "textures/gui/chisel_gui_jei.png");

    private static final int GUI_WIDTH = 176;
    private static final int GUI_HEIGHT = 80;

    private final IDrawable background;
    private final IDrawable icon;

    public ChiselRecipeCategory(IGuiHelper guiHelper) {
        this.background = guiHelper.createDrawable(TEXTURE, 0, 0, 166, 96);
        this.icon = guiHelper.createDrawableItemStack(new ItemStack(ModItems.IRON_CHISEL.get()));
    }

    @Override
    public RecipeType<ChiselRecipe> getRecipeType() {
        return RECIPE_TYPE;
    }

    @Override
    public Component getTitle() {
        return Component.translatable("jei.architectschisel.chiseling");
    }

    @Override
    public IDrawable getBackground() {
        return background;
    }

    @Override
    public IDrawable getIcon() {
        return icon;
    }

    @Override
    public void setRecipe(IRecipeLayoutBuilder builder, ChiselRecipe recipe, IFocusGroup focuses) {
        List<ItemStack> variants = recipe.getVariants();

        builder.addSlot(RecipeIngredientRole.INPUT, 13, 8)
                .addItemStacks(variants);

        int cols = 7;
        for (int i = 0; i < variants.size() && i < cols * 4; i++) {
            int col = i % cols;
            int row = i / cols;
            int x = 40 + col * 18;
            int y = 8 + row * 18;

            builder.addSlot(RecipeIngredientRole.OUTPUT, x, y)
                    .addItemStack(variants.get(i));
        }
    }
}