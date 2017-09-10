package fi.dungeon.animalbomb.block;

import fi.dungeon.animalbomb.AnimalBomb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class SheepBomb extends AnimalBombBlock {
	public SheepBomb() {
		super();
		setUnlocalizedName("sheepBomb");
		setRegistryName(AnimalBomb.MODID, "sheepBomb");
	}

	protected Entity createAnimal(World worldIn, BlockPos pos) {
		return new EntitySheep(worldIn);
	}

}
