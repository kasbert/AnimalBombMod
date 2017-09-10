package fi.dungeon.animalbomb.init;

import fi.dungeon.animalbomb.AnimalBomb;
import net.minecraftforge.common.config.Config;
import net.minecraftforge.common.config.ConfigManager;
import net.minecraftforge.fml.client.event.ConfigChangedEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@Config(modid = AnimalBomb.MODID)
public class ModConfig {

	@Config.Comment("Size of flock.")
	@Config.RangeInt(min = 1, max = 20)
	public static int numberOfAnimals = 10;

	@Config.Comment("Burning time in seconds.")
	@Config.RangeInt(min = 0, max = 20)
	public static int burningDuration = 2;

	@Mod.EventBusSubscriber
	static class ConfigurationHolder {

		@SubscribeEvent
		public static void onConfigChanged(ConfigChangedEvent.OnConfigChangedEvent event) {
			if (event.getModID().equals(AnimalBomb.MODID)) {
				ConfigManager.sync(AnimalBomb.MODID, Config.Type.INSTANCE);
			}
		}
	}
}
