package fi.dungeon.animalbomb.block;

import fi.dungeon.animalbomb.AnimalBomb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class PigBomb extends AnimalBombBlock {
	public PigBomb() {
		super();
		setUnlocalizedName("pigBomb");
		setRegistryName(AnimalBomb.MODID, "pigBomb");
	}

	protected Entity createAnimal(World worldIn, BlockPos pos) {
		return new EntityPig(worldIn);
	}

}
