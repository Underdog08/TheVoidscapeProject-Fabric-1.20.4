package com.underdog.voidscape.sound;

import com.underdog.voidscape.Voidscape;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static final SoundEvent TWILIGHT_DISC = registerSoundEvent("twilight_disc");



    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = new Identifier(Voidscape.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));
    }

    public static void registerSounds() {}
}
