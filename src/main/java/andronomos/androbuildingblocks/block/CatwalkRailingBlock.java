package andronomos.androbuildingblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
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
	public VoxelShape getShape(BlockState state, BlockGetter reader, BlockPos pos, CollisionContext ctx) {
		return getInteractionShape(state, reader, pos);
	}

	@Override
	public VoxelShape getInteractionShape (BlockState state, BlockGetter world, BlockPos pos) {
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
		BlockState state = defaultBlockState()
				.setValue(NORTH_FENCE, (facing == Direction.NORTH))
				.setValue(SOUTH_FENCE, (facing == Direction.SOUTH))
				.setValue(EAST_FENCE,  (facing == Direction.EAST))
				.setValue(WEST_FENCE,  (facing == Direction.WEST))
				.setValue(BlockStateProperties.WATERLOGGED, fluid.getType() == Fluids.WATER);
		return state;
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(NORTH_FENCE);
		builder.add(SOUTH_FENCE);
		builder.add(EAST_FENCE);
		builder.add(WEST_FENCE);
		builder.add(BlockStateProperties.WATERLOGGED);
	}

	@Override
	public boolean canPlaceLiquid(BlockGetter world, BlockPos pos, BlockState state, Fluid fluid) {
		return !state.getValue(BlockStateProperties.WATERLOGGED) && fluid == Fluids.WATER;
	}

	@Override
	public FluidState getFluidState(BlockState state) {
		return state.getValue(BlockStateProperties.WATERLOGGED) ? Fluids.WATER.getSource(false) : Fluids.EMPTY.defaultFluidState();
	}
}
