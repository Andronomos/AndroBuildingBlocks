package andronomos.androbuildingblocks.block;

import net.minecraft.core.BlockPos;
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
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class CatwalkBlock extends Block implements SimpleWaterloggedBlock {
	private static final VoxelShape VOXEL_TOP = Block.box(
			0d, 14d, 0d,
			16d, 16d, 16d
	);
	BooleanProperty WATERLOGGED = BlockStateProperties.WATERLOGGED;

	public CatwalkBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState()
				.setValue(WATERLOGGED, false));
	}

	@Override
	public @NotNull VoxelShape getShape(@NotNull BlockState state, @NotNull BlockGetter reader, @NotNull BlockPos pos, @NotNull CollisionContext ctx) {
		return getInteractionShape(state, reader, pos);
	}

	@Override
	public @NotNull VoxelShape getInteractionShape (@NotNull BlockState state, @NotNull BlockGetter world, @NotNull BlockPos pos) {
		return VOXEL_TOP;
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		FluidState fluid = ctx.getLevel().getFluidState(ctx.getClickedPos());

		return defaultBlockState()
				.setValue(BlockStateProperties.WATERLOGGED, fluid.getType() == Fluids.WATER);
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
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
}
