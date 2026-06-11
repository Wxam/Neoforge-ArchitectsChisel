package net.wxam.architectschisel.content.item;

import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wxam.architectschisel.ArchitectsChisel;

public class ModItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(ArchitectsChisel.MOD_ID);

    public static final DeferredItem<Item> IRON_CHISEL = ITEMS.register("iron_chisel",
            () -> new Item(new Item.Properties().stacksTo(1)));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
