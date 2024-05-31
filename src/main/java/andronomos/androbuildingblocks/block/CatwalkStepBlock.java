package andronomos.androbuildingblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.SpawnPlacements;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SimpleWaterloggedBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.material.Fluid;
import net.minecraft.world.level.material.FluidState;
import net.minecraft.world.level.material.Fluids;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CatwalkStepBlock extends Block implements SimpleWaterloggedBlock {
	private static final VoxelShape BOX_NORTH = Shapes.join(
			Block.box(0d, 14d, 8d, 16d, 16d, 16d),
			Block.box(0d, 6d, 0d, 16d, 8d, 8d),
			BooleanOp.OR
	);
	private static final VoxelShape BOX_SOUTH = Shapes.join(
			Block.box(0d, 14d, 0d, 16d, 16d, 8d),
			Block.box(0d, 6d, 8d, 16d, 8d, 16d),
			BooleanOp.OR
	);
	private static final VoxelShape BOX_WEST = Shapes.join(
			Block.box(8d, 14d, 0d, 16d, 16d, 16d),
			Block.box(0d, 6d, 0d, 8d, 8d, 16d),
			BooleanOp.OR
	);
	private static final VoxelShape BOX_EAST = Shapes.join(
			Block.box(0d, 14d, 0d, 8d, 16d, 16),
			Block.box(8d, 6d, 0d, 16d, 8d, 16d),
			BooleanOp.OR
	);

	public CatwalkStepBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState()
				.setValue(BlockStateProperties.HORIZONTAL_FACING, Direction.NORTH)
				.setValue(BlockStateProperties.WATERLOGGED, false)
		);
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		Direction facing = ctx.getHorizontalDirection();
		FluidState fluid = ctx.getLevel().getFluidState(ctx.getClickedPos());

		return defaultBlockState()
				.setValue(BlockStateProperties.HORIZONTAL_FACING, facing.getOpposite())
				.setValue(BlockStateProperties.WATERLOGGED, fluid.getType() == Fluids.WATER);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(BlockStateProperties.HORIZONTAL_FACING);
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
	public @NotNull VoxelShape getShape (BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos, @NotNull CollisionContext ctx) {
		return switch(state.getValue(BlockStateProperties.HORIZONTAL_FACING)) {
			case SOUTH -> BOX_SOUTH;
			case EAST  -> BOX_EAST;
			case WEST  -> BOX_WEST;
			default    -> BOX_NORTH;
		};
	}

	@Override
	public boolean isValidSpawn(BlockState state, BlockGetter level, BlockPos pos, SpawnPlacements.Type type, EntityType<?> entityType) {
		return false;
	}
}
