package net.upstagebunion.otakucraft.sound;

import net.minecraft.item.Item;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.upstagebunion.otakucraft.Otakucraft;

public class ModSounds {
    public static final SoundEvent WOMANMOANEVENT = registerSoundEvent("woman_moan");
    public static final SoundEvent CAPIBARA_HURT = registerSoundEvent("capibara_hurt");
    public static final SoundEvent CAPIBARA_AMBIENT = registerSoundEvent("capibara_ambient");
    private static SoundEvent registerSoundEvent(String name){
        Identifier id =  new Identifier(Otakucraft.MOD_ID, name);
        return Registry.register(Registry.SOUND_EVENT, id, new SoundEvent(id));
    }

    public static void registerModSounds(){
        Otakucraft.LOGGER.info("Registrando Sonido Mod para " + Otakucraft.MOD_ID);
    }
}
