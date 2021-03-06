package net.tslat.aoa3.structure.celeve;

import net.minecraft.block.state.IBlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;
import net.tslat.aoa3.common.registration.BlockRegister;
import net.tslat.aoa3.structure.AoAStructure;

import java.util.Random;

public class PurpleCelevusTree extends AoAStructure { //StructureSize: 5x17x5
	private static final IBlockState whiteCelevus = BlockRegister.WHITE_CELEVUS_LEAVES.getDefaultState();
	private static final IBlockState purpleCelevus = BlockRegister.PURPLE_CELEVUS_LEAVES.getDefaultState();
	private static final IBlockState celevusStem = BlockRegister.CELEVE_STEM.getDefaultState();

	public PurpleCelevusTree() {
		super("PurpleCelevusTree");
	}

	@Override
	protected void build(World world, Random rand, BlockPos basePos) {
		addBlock(world, basePos, 2, 0, 2, celevusStem);
		addBlock(world, basePos, 2, 1, 2, celevusStem);
		addBlock(world, basePos, 2, 2, 2, celevusStem);
		addBlock(world, basePos, 1, 3, 1, purpleCelevus);
		addBlock(world, basePos, 1, 3, 2, purpleCelevus);
		addBlock(world, basePos, 1, 3, 3, purpleCelevus);
		addBlock(world, basePos, 2, 3, 1, purpleCelevus);
		addBlock(world, basePos, 2, 3, 2, celevusStem);
		addBlock(world, basePos, 2, 3, 3, purpleCelevus);
		addBlock(world, basePos, 3, 3, 1, purpleCelevus);
		addBlock(world, basePos, 3, 3, 2, purpleCelevus);
		addBlock(world, basePos, 3, 3, 3, purpleCelevus);
		addBlock(world, basePos, 2, 4, 2, celevusStem);
		addBlock(world, basePos, 2, 5, 2, celevusStem);
		addBlock(world, basePos, 1, 6, 1, purpleCelevus);
		addBlock(world, basePos, 1, 6, 2, purpleCelevus);
		addBlock(world, basePos, 1, 6, 3, purpleCelevus);
		addBlock(world, basePos, 2, 6, 1, purpleCelevus);
		addBlock(world, basePos, 2, 6, 2, celevusStem);
		addBlock(world, basePos, 2, 6, 3, purpleCelevus);
		addBlock(world, basePos, 3, 6, 1, purpleCelevus);
		addBlock(world, basePos, 3, 6, 2, purpleCelevus);
		addBlock(world, basePos, 3, 6, 3, purpleCelevus);
		addBlock(world, basePos, 2, 7, 2, celevusStem);
		addBlock(world, basePos, 2, 8, 2, celevusStem);
		addBlock(world, basePos, 1, 9, 1, purpleCelevus);
		addBlock(world, basePos, 1, 9, 2, purpleCelevus);
		addBlock(world, basePos, 1, 9, 3, purpleCelevus);
		addBlock(world, basePos, 2, 9, 1, purpleCelevus);
		addBlock(world, basePos, 2, 9, 2, celevusStem);
		addBlock(world, basePos, 2, 9, 3, purpleCelevus);
		addBlock(world, basePos, 3, 9, 1, purpleCelevus);
		addBlock(world, basePos, 3, 9, 2, purpleCelevus);
		addBlock(world, basePos, 3, 9, 3, purpleCelevus);
		addBlock(world, basePos, 2, 10, 2, celevusStem);
		addBlock(world, basePos, 1, 11, 1, whiteCelevus);
		addBlock(world, basePos, 1, 11, 2, whiteCelevus);
		addBlock(world, basePos, 1, 11, 3, whiteCelevus);
		addBlock(world, basePos, 2, 11, 1, whiteCelevus);
		addBlock(world, basePos, 2, 11, 2, whiteCelevus);
		addBlock(world, basePos, 2, 11, 3, whiteCelevus);
		addBlock(world, basePos, 3, 11, 1, whiteCelevus);
		addBlock(world, basePos, 3, 11, 2, whiteCelevus);
		addBlock(world, basePos, 3, 11, 3, whiteCelevus);
		addBlock(world, basePos, 0, 12, 0, purpleCelevus);
		addBlock(world, basePos, 0, 12, 1, purpleCelevus);
		addBlock(world, basePos, 0, 12, 2, purpleCelevus);
		addBlock(world, basePos, 0, 12, 3, purpleCelevus);
		addBlock(world, basePos, 0, 12, 4, purpleCelevus);
		addBlock(world, basePos, 1, 12, 0, purpleCelevus);
		addBlock(world, basePos, 1, 12, 1, purpleCelevus);
		addBlock(world, basePos, 1, 12, 2, purpleCelevus);
		addBlock(world, basePos, 1, 12, 3, purpleCelevus);
		addBlock(world, basePos, 1, 12, 4, purpleCelevus);
		addBlock(world, basePos, 2, 12, 0, purpleCelevus);
		addBlock(world, basePos, 2, 12, 1, purpleCelevus);
		addBlock(world, basePos, 2, 12, 2, purpleCelevus);
		addBlock(world, basePos, 2, 12, 3, purpleCelevus);
		addBlock(world, basePos, 2, 12, 4, purpleCelevus);
		addBlock(world, basePos, 3, 12, 0, purpleCelevus);
		addBlock(world, basePos, 3, 12, 1, purpleCelevus);
		addBlock(world, basePos, 3, 12, 2, purpleCelevus);
		addBlock(world, basePos, 3, 12, 3, purpleCelevus);
		addBlock(world, basePos, 3, 12, 4, purpleCelevus);
		addBlock(world, basePos, 4, 12, 0, purpleCelevus);
		addBlock(world, basePos, 4, 12, 1, purpleCelevus);
		addBlock(world, basePos, 4, 12, 2, purpleCelevus);
		addBlock(world, basePos, 4, 12, 3, purpleCelevus);
		addBlock(world, basePos, 4, 12, 4, purpleCelevus);
		addBlock(world, basePos, 0, 13, 0, whiteCelevus);
		addBlock(world, basePos, 0, 13, 1, whiteCelevus);
		addBlock(world, basePos, 0, 13, 2, whiteCelevus);
		addBlock(world, basePos, 0, 13, 3, whiteCelevus);
		addBlock(world, basePos, 0, 13, 4, whiteCelevus);
		addBlock(world, basePos, 1, 13, 0, whiteCelevus);
		addBlock(world, basePos, 1, 13, 1, whiteCelevus);
		addBlock(world, basePos, 1, 13, 2, whiteCelevus);
		addBlock(world, basePos, 1, 13, 3, whiteCelevus);
		addBlock(world, basePos, 1, 13, 4, whiteCelevus);
		addBlock(world, basePos, 2, 13, 0, whiteCelevus);
		addBlock(world, basePos, 2, 13, 1, whiteCelevus);
		addBlock(world, basePos, 2, 13, 2, whiteCelevus);
		addBlock(world, basePos, 2, 13, 3, whiteCelevus);
		addBlock(world, basePos, 2, 13, 4, whiteCelevus);
		addBlock(world, basePos, 3, 13, 0, whiteCelevus);
		addBlock(world, basePos, 3, 13, 1, whiteCelevus);
		addBlock(world, basePos, 3, 13, 2, whiteCelevus);
		addBlock(world, basePos, 3, 13, 3, whiteCelevus);
		addBlock(world, basePos, 3, 13, 4, whiteCelevus);
		addBlock(world, basePos, 4, 13, 0, whiteCelevus);
		addBlock(world, basePos, 4, 13, 1, whiteCelevus);
		addBlock(world, basePos, 4, 13, 2, whiteCelevus);
		addBlock(world, basePos, 4, 13, 3, whiteCelevus);
		addBlock(world, basePos, 4, 13, 4, whiteCelevus);
		addBlock(world, basePos, 0, 14, 0, purpleCelevus);
		addBlock(world, basePos, 0, 14, 1, purpleCelevus);
		addBlock(world, basePos, 0, 14, 2, purpleCelevus);
		addBlock(world, basePos, 0, 14, 3, purpleCelevus);
		addBlock(world, basePos, 0, 14, 4, purpleCelevus);
		addBlock(world, basePos, 1, 14, 0, purpleCelevus);
		addBlock(world, basePos, 1, 14, 1, purpleCelevus);
		addBlock(world, basePos, 1, 14, 2, purpleCelevus);
		addBlock(world, basePos, 1, 14, 3, purpleCelevus);
		addBlock(world, basePos, 1, 14, 4, purpleCelevus);
		addBlock(world, basePos, 2, 14, 0, purpleCelevus);
		addBlock(world, basePos, 2, 14, 1, purpleCelevus);
		addBlock(world, basePos, 2, 14, 2, purpleCelevus);
		addBlock(world, basePos, 2, 14, 3, purpleCelevus);
		addBlock(world, basePos, 2, 14, 4, purpleCelevus);
		addBlock(world, basePos, 3, 14, 0, purpleCelevus);
		addBlock(world, basePos, 3, 14, 1, purpleCelevus);
		addBlock(world, basePos, 3, 14, 2, purpleCelevus);
		addBlock(world, basePos, 3, 14, 3, purpleCelevus);
		addBlock(world, basePos, 3, 14, 4, purpleCelevus);
		addBlock(world, basePos, 4, 14, 0, purpleCelevus);
		addBlock(world, basePos, 4, 14, 1, purpleCelevus);
		addBlock(world, basePos, 4, 14, 2, purpleCelevus);
		addBlock(world, basePos, 4, 14, 3, purpleCelevus);
		addBlock(world, basePos, 4, 14, 4, purpleCelevus);
		addBlock(world, basePos, 0, 15, 0, whiteCelevus);
		addBlock(world, basePos, 0, 15, 1, whiteCelevus);
		addBlock(world, basePos, 0, 15, 2, whiteCelevus);
		addBlock(world, basePos, 0, 15, 3, whiteCelevus);
		addBlock(world, basePos, 0, 15, 4, whiteCelevus);
		addBlock(world, basePos, 1, 15, 0, whiteCelevus);
		addBlock(world, basePos, 1, 15, 1, whiteCelevus);
		addBlock(world, basePos, 1, 15, 2, whiteCelevus);
		addBlock(world, basePos, 1, 15, 3, whiteCelevus);
		addBlock(world, basePos, 1, 15, 4, whiteCelevus);
		addBlock(world, basePos, 2, 15, 0, whiteCelevus);
		addBlock(world, basePos, 2, 15, 1, whiteCelevus);
		addBlock(world, basePos, 2, 15, 2, whiteCelevus);
		addBlock(world, basePos, 2, 15, 3, whiteCelevus);
		addBlock(world, basePos, 2, 15, 4, whiteCelevus);
		addBlock(world, basePos, 3, 15, 0, whiteCelevus);
		addBlock(world, basePos, 3, 15, 1, whiteCelevus);
		addBlock(world, basePos, 3, 15, 2, whiteCelevus);
		addBlock(world, basePos, 3, 15, 3, whiteCelevus);
		addBlock(world, basePos, 3, 15, 4, whiteCelevus);
		addBlock(world, basePos, 4, 15, 0, whiteCelevus);
		addBlock(world, basePos, 4, 15, 1, whiteCelevus);
		addBlock(world, basePos, 4, 15, 2, whiteCelevus);
		addBlock(world, basePos, 4, 15, 3, whiteCelevus);
		addBlock(world, basePos, 4, 15, 4, whiteCelevus);
		addBlock(world, basePos, 1, 16, 1, purpleCelevus);
		addBlock(world, basePos, 1, 16, 2, purpleCelevus);
		addBlock(world, basePos, 1, 16, 3, purpleCelevus);
		addBlock(world, basePos, 2, 16, 1, purpleCelevus);
		addBlock(world, basePos, 2, 16, 2, purpleCelevus);
		addBlock(world, basePos, 2, 16, 3, purpleCelevus);
		addBlock(world, basePos, 3, 16, 1, purpleCelevus);
		addBlock(world, basePos, 3, 16, 2, purpleCelevus);
		addBlock(world, basePos, 3, 16, 3, purpleCelevus);
	}
}
