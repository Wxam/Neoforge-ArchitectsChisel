package net.wxam.architectschisel.screen;

import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.gui.GuiGraphics;
import net.minecraft.client.gui.screens.inventory.AbstractContainerScreen;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.player.Inventory;
import net.wxam.architectschisel.ArchitectsChisel;
import net.wxam.architectschisel.menu.ChiselMenu;

public class ChiselScreen extends AbstractContainerScreen<ChiselMenu> {

    private static final ResourceLocation TEXTURE = ResourceLocation.fromNamespaceAndPath(
            ArchitectsChisel.MOD_ID, "textures/gui/chisel_gui.png");
    private static final ResourceLocation BUTTON_ON = ResourceLocation.fromNamespaceAndPath(
            ArchitectsChisel.MOD_ID, "textures/gui/chisel_all_toggle.png");

    private boolean toggled = false;

    public ChiselScreen(ChiselMenu menu, Inventory inventory, Component title) {
        super(menu, inventory, title);
        this.titleLabelX = 54;
        this.titleLabelY = 7;
        this.inventoryLabelX = 19;
        this.inventoryLabelY = this.imageHeight - 64;
        this.imageWidth = 200;
        this.imageHeight = 200;
    }

    @Override
    public void render(GuiGraphics graphics, int mouseX, int mouseY, float partialTicks) {
        this.renderBackground(graphics, mouseX, mouseY, partialTicks);
        super.render(graphics, mouseX, mouseY, partialTicks);
        this.renderTooltip(graphics, mouseX, mouseY);
    }

    @Override
    protected void renderBg(GuiGraphics graphics, float partialTicks, int mouseX, int mouseY) {
        int buttonX = this.leftPos + 28;
        int buttonY = this.topPos + 72;

        RenderSystem.setShaderColor(1, 1, 1, 1);
        graphics.blit(TEXTURE, this.leftPos, this.topPos, 0, 0,
                this.imageWidth, this.imageHeight, this.imageWidth, this.imageHeight);

        if (toggled) {
            graphics.blit(BUTTON_ON, buttonX, buttonY, 0, 0, 16, 16, 16, 16);
        }
    }

    @Override
    public boolean mouseClicked(double mouseX, double mouseY, int button) {
        int buttonX = this.leftPos + 28;
        int buttonY = this.topPos + 72;

        if (mouseX > buttonX && mouseX < buttonX + 16 && mouseY > buttonY && mouseY < buttonY + 16) {
            toggled = !toggled;
            this.minecraft.gameMode.handleInventoryButtonClick(this.menu.containerId, toggled ? 1 : 0);
        }

        return super.mouseClicked(mouseX, mouseY, button);
    }

    @Override
    public boolean keyPressed(int key, int b, int c) {
        if (key == 256) {
            this.minecraft.player.closeContainer();
            return true;
        }
        return super.keyPressed(key, b, c);
    }

    @Override
    public void init() {
        super.init();
        if (toggled) {
            this.minecraft.gameMode.handleInventoryButtonClick(this.menu.containerId, 1);
        }
    }
}