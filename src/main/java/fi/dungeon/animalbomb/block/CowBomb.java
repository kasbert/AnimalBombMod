package fi.dungeon.animalbomb.block;

import fi.dungeon.animalbomb.AnimalBomb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class CowBomb extends AnimalBombBlock {
	public CowBomb() {
		super();
		setUnlocalizedName("cowBomb");
		setRegistryName(AnimalBomb.MODID, "cowBomb");
	}

	protected Entity createAnimal(World worldIn, BlockPos pos) {
		return new EntityCow(worldIn);
	}

}
