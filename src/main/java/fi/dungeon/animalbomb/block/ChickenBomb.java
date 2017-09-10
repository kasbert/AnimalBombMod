package fi.dungeon.animalbomb.block;

import fi.dungeon.animalbomb.AnimalBomb;
import net.minecraft.entity.Entity;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

public class ChickenBomb extends AnimalBombBlock {
	public ChickenBomb() {
		super();
		setUnlocalizedName("chickenBomb");
		setRegistryName(AnimalBomb.MODID, "chickenBomb");
	}

	protected Entity createAnimal(World worldIn, BlockPos pos) {
		return new EntityChicken(worldIn);
	}

}
