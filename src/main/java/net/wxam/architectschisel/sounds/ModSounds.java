package net.wxam.architectschisel.sounds;

import net.minecraft.core.registries.Registries;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.sounds.SoundEvent;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;
import net.wxam.architectschisel.ArchitectsChisel;

import java.util.function.Supplier;

public class ModSounds {
    public static final DeferredRegister<SoundEvent> SOUNDS =
            DeferredRegister.create(Registries.SOUND_EVENT, ArchitectsChisel.MOD_ID);

    public static final Supplier<SoundEvent> CHISELING_SOUND = SOUNDS.register("chiseling",
            () -> SoundEvent.createVariableRangeEvent(
                    ResourceLocation.fromNamespaceAndPath(ArchitectsChisel.MOD_ID, "chiseling")));

    public static void register(IEventBus eventBus) {
        SOUNDS.register(eventBus);
    }
}