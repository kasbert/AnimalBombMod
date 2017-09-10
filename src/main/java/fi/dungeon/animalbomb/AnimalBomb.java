package fi.dungeon.animalbomb;

import fi.dungeon.animalbomb.init.CommonProxy;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = AnimalBomb.MODID, name = AnimalBomb.MODNAME, version = AnimalBomb.VERSION, acceptedMinecraftVersions = "[1.12]")
public class AnimalBomb {

	public static final String MODID = "animalbomb";
	public static final String MODNAME = "AnimalBomb Mod";
	public static final String VERSION = "0.0.1";

	@SidedProxy(clientSide = "fi.dungeon.animalbomb.init.ClientProxy", serverSide = "fi.dungeon.animalbomb.init.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance(MODID)
	public static AnimalBomb instance;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent e) {
		proxy.preInit(e);
		e.getModLog().info(MODNAME + " is loading!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}