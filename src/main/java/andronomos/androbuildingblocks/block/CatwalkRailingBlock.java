package andronomos.androbuildingblocks.block;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CatwalkRailingBlock extends Block implements SimpleWaterloggedBlock {
	private static final VoxelShape VOXEL_NORTH = Block.box(
			0d, 0d, 0d,
			16d, 14d, 2d
	);
	private static final VoxelShape VOXEL_SOUTH = Block.box(
			0d, 0d, 14d,
			16d, 14d, 16d
	);
	private static final VoxelShape VOXEL_EAST = Block.box(
			14d, 0d, 0d,
			16d, 14d, 16d
	);
	private static final VoxelShape VOXEL_WEST = Block.box(
			0d, 0d, 0d,
			2d, 14d, 16d
	);

	public static final BooleanProperty NORTH_FENCE = BlockStateProperties.NORTH;
	public static final BooleanProperty SOUTH_FENCE = BlockStateProperties.SOUTH;
	public static final BooleanProperty EAST_FENCE  = BlockStateProperties.EAST;
	public static final BooleanProperty WEST_FENCE  = BlockStateProperties.WEST;

	public CatwalkRailingBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState()
				.setValue(NORTH_FENCE, false)
				.setValue(SOUTH_FENCE, false)
				.setValue(EAST_FENCE,  false)
				.setValue(WEST_FENCE,  false)
				.setValue(BlockStateProperties.WATERLOGGED, false)
		);
	}

	@Override
	public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter reader, @NotNull BlockPos pos, @NotNull CollisionContext ctx) {
		VoxelShape shape = Shapes.empty();
		if (state.getValue(NORTH_FENCE)) shape = Shapes.join(shape, VOXEL_NORTH, BooleanOp.OR);
		if (state.getValue(SOUTH_FENCE)) shape = Shapes.join(shape, VOXEL_SOUTH, BooleanOp.OR);
		if (state.getValue(EAST_FENCE))  shape = Shapes.join(shape, VOXEL_EAST,  BooleanOp.OR);
		if (state.getValue(WEST_FENCE))  shape = Shapes.join(shape, VOXEL_WEST,  BooleanOp.OR);
		return shape;
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		Direction facing = ctx.getHorizontalDirection();
		FluidState fluid = ctx.getLevel().getFluidState(ctx.getClickedPos());

		BlockGetter blockgetter = ctx.getLevel();
		BlockPos blockpos = ctx.getClickedPos();

		BlockState blockstate = blockgetter.getBlockState(blockpos.north());
		BlockState blockstate1 = blockgetter.getBlockState(blockpos.south());
		BlockState blockstate2 = blockgetter.getBlockState(blockpos.west());
		BlockState blockstate3 = blockgetter.getBlockState(blockpos.east());

		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlock#getStateForPlacement | facing: %s", facing));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlock#getStateForPlacement | blockpos: %s", blockpos));

		//if() {
		//
		//}



		return defaultBlockState()
				.setValue(NORTH_FENCE, (facing == Direction.NORTH))
				.setValue(SOUTH_FENCE, (facing == Direction.SOUTH))
				.setValue(EAST_FENCE,  (facing == Direction.EAST))
				.setValue(WEST_FENCE,  (facing == Direction.WEST))
				.setValue(BlockStateProperties.WATERLOGGED, fluid.getType() == Fluids.WATER);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(NORTH_FENCE);
		builder.add(SOUTH_FENCE);
		builder.add(EAST_FENCE);
		builder.add(WEST_FENCE);
		builder.add(BlockStateProperties.WATERLOGGED);
	}

	@Override
	public boolean canPlaceLiquid(@NotNull BlockGetter world, @NotNull BlockPos pos, BlockState state, @NotNull Fluid fluid) {
		return !state.getValue(BlockStateProperties.WATERLOGGED) && fluid == Fluids.WATER;
	}

	@Override
	public @NotNull FluidState getFluidState(BlockState state) {
		return state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}

	@Override
	public void neighborChanged(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos, @NotNull Block neighborBlock, @NotNull BlockPos neighborPos, boolean movedByPiston) {
		if (isEmpty(state)) level.setBlock(pos, Blocks.AIR.defaultBlockState(), 0);
		super.neighborChanged(state, level, pos, neighborBlock, neighborPos, movedByPiston);
	}

	public static boolean isEmpty(BlockState state) {
		boolean safe = false;
		for (Direction dir : BlockStateProperties.HORIZONTAL_FACING.getPossibleValues()) {
			safe |= state.getValue(fromDirection(dir));
		}
		return !safe;
	}

	public static BooleanProperty fromDirection(Direction face) {
		return switch (face) {
			case SOUTH -> SOUTH_FENCE;
			case EAST  -> EAST_FENCE;
			case WEST  -> WEST_FENCE;
			default -> NORTH_FENCE;
		};
	}
}
