package net.wxam.architectschisel.menu;

import net.minecraft.core.registries.Registries;
import net.minecraft.world.inventory.MenuType;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.common.extensions.IMenuTypeExtension;
import net.neoforged.neoforge.registries.DeferredHolder;
import net.neoforged.neoforge.registries.DeferredRegister;

public class ModMenuTypes {
    public static final DeferredRegister<MenuType<?>> MENUS =
            DeferredRegister.create(Registries.MENU, "architectschisel");

    public static final DeferredHolder<MenuType<?>, MenuType<ChiselMenu>> CHISEL_MENU =
            MENUS.register("chisel_menu", () ->
                    IMenuTypeExtension.create((windowId, inv, data) ->
                            new ChiselMenu(windowId, inv)));

    public static void register(IEventBus eventBus) {
        MENUS.register(eventBus);
    }
}
