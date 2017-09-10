package fi.dungeon.animalbomb.init;

import java.util.HashSet;
import java.util.Set;

import fi.dungeon.animalbomb.block.ChickenBomb;
import fi.dungeon.animalbomb.block.CowBomb;
import fi.dungeon.animalbomb.block.PigBomb;
import fi.dungeon.animalbomb.block.SheepBomb;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class Blocks {

	public static ChickenBomb chickenBombBlock = new ChickenBomb();
	public static CowBomb cowBombBlock = new CowBomb();
	public static PigBomb pigBombBlock = new PigBomb();
	public static SheepBomb sheepBombBlock = new SheepBomb();

	public static Set<Block> blocks = new HashSet<Block>() {
		private static final long serialVersionUID = 1L;
		{
			add(chickenBombBlock);
			add(cowBombBlock);
			add(pigBombBlock);
			add(sheepBombBlock);
		}
	};

	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		for (Block block : blocks) {
			event.getRegistry().register(block);
		}
	}

	@SubscribeEvent
	public static void registerItemBlocks(Register<Item> event) {
		for (Block block : blocks) {
			ItemBlock iblock = new ItemBlock(block);
			iblock.setRegistryName(block.getRegistryName());
			event.getRegistry().register(iblock);
		}
	}
}
