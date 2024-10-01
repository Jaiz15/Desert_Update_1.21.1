package jaiz.desertupdate.sound;

import jaiz.desertupdate.DunesDrought;
import net.minecraft.block.jukebox.JukeboxSong;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.sound.SoundEvent;
import net.minecraft.util.Identifier;

public class ModSounds {

    public static RegistryKey<JukeboxSong> of(String id) {
        return RegistryKey.of(RegistryKeys.JUKEBOX_SONG, Identifier.of(DunesDrought.MOD_ID, id));
    }

    public static final SoundEvent ANCIENT_HORN_01 = registerSoundEvent("ancient_horn_01");
    public static final SoundEvent ANCIENT_HORN_02 = registerSoundEvent("ancient_horn_02");
    public static final SoundEvent ANCIENT_HORN_03 = registerSoundEvent("ancient_horn_03");

    public static void registerSounds() {
        DunesDrought.LOGGER.info(("Registering sounds for " + DunesDrought.MOD_ID));
        ModSounds.registerReference("origami_hairball");
    }

    private static void registerReference(String name) {
        Identifier ID = Identifier.of(DunesDrought.MOD_ID, name);
        Registry.registerReference(Registries.SOUND_EVENT, ID, SoundEvent.of(ID));
    }

    private static SoundEvent registerSoundEvent(String name) {
        Identifier id = Identifier.of(DunesDrought.MOD_ID, name);
        return Registry.register(Registries.SOUND_EVENT, id, SoundEvent.of(id));

    }
}
