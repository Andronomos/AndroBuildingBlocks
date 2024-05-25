package andronomos.androbuildingblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.BlockPlaceContext;
import net.minecraft.world.level.BlockGetter;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.phys.BlockHitResult;
import net.minecraft.world.phys.shapes.BooleanOp;
import net.minecraft.world.phys.shapes.CollisionContext;
import net.minecraft.world.phys.shapes.Shapes;
import net.minecraft.world.phys.shapes.VoxelShape;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MultiPartBlock extends Block {
	private static final VoxelShape NORTH_SHAPE = Block.box(0, 0, 0, 16, 2, 2);
	private static final VoxelShape WEST_SHAPE = Block.box(0, 0, 0, 2, 2, 16);
	private static final VoxelShape SOUTH_SHAPE = Block.box(0, 0, 14, 16, 2, 16);
	private static final VoxelShape EAST_SHAPE = Block.box(14, 0, 0, 16, 2, 16);

	public static final BooleanProperty NORTH_FENCE = BlockStateProperties.NORTH;
	public static final BooleanProperty SOUTH_FENCE = BlockStateProperties.SOUTH;
	public static final BooleanProperty EAST_FENCE  = BlockStateProperties.EAST;
	public static final BooleanProperty WEST_FENCE  = BlockStateProperties.WEST;

	public MultiPartBlock(Properties properties) {
		super(properties);
		this.registerDefaultState(this.defaultBlockState()
				.setValue(NORTH_FENCE, false)
				.setValue(SOUTH_FENCE, false)
				.setValue(EAST_FENCE,  false)
				.setValue(WEST_FENCE,  false)
		);
	}

	@Override
	public @NotNull VoxelShape getShape(BlockState state, @NotNull BlockGetter reader, @NotNull BlockPos pos, @NotNull CollisionContext ctx) {
		VoxelShape shape = Shapes.empty();
		if (state.getValue(NORTH_FENCE)) shape = Shapes.join(shape, NORTH_SHAPE, BooleanOp.OR);
		if (state.getValue(WEST_FENCE))  shape = Shapes.join(shape, WEST_SHAPE,  BooleanOp.OR);
		if (state.getValue(EAST_FENCE))  shape = Shapes.join(shape, EAST_SHAPE,  BooleanOp.OR);
		if (state.getValue(SOUTH_FENCE))  shape = Shapes.join(shape, SOUTH_SHAPE,  BooleanOp.OR);
		return shape;
	}

	@Nullable
	@Override
	public BlockState getStateForPlacement(BlockPlaceContext ctx) {
		Direction facing = ctx.getHorizontalDirection();
		return defaultBlockState()
				.setValue(NORTH_FENCE, (facing == Direction.NORTH))
				.setValue(SOUTH_FENCE, (facing == Direction.SOUTH))
				.setValue(EAST_FENCE,  (facing == Direction.EAST))
				.setValue(WEST_FENCE,  (facing == Direction.WEST));
	}

	@Override
	protected void createBlockStateDefinition(StateDefinition.@NotNull Builder<Block, BlockState> builder) {
		super.createBlockStateDefinition(builder);
		builder.add(NORTH_FENCE);
		builder.add(SOUTH_FENCE);
		builder.add(EAST_FENCE);
		builder.add(WEST_FENCE);
	}

	@Override
	public @NotNull InteractionResult use(@NotNull BlockState state, @NotNull Level level, @NotNull BlockPos pos,
										  @NotNull Player player, @NotNull InteractionHand hand, @NotNull BlockHitResult hitResult) {
		if (state == null || !(state.getBlock() instanceof MultiPartBlock) || level == null)
		{
			return InteractionResult.PASS;
		}

		ItemStack stackInHand = player.getItemInHand(hand);
		Item itemInHand = stackInHand.getItem();
		Block blockInHand = null;

		if(itemInHand instanceof BlockItem) {
			blockInHand = ((BlockItem)itemInHand).getBlock();
		}

		if(blockInHand  == null || !(blockInHand instanceof MultiPartBlock)) {
			return InteractionResult.PASS;
		}

		Direction direction = hitResult.getDirection();

		BlockState newState = this.defaultBlockState()
				.setValue(NORTH_FENCE, (direction == Direction.NORTH))
				.setValue(WEST_FENCE, (direction == Direction.WEST))
				.setValue(EAST_FENCE, (direction == Direction.EAST))
				.setValue(SOUTH_FENCE, (direction == Direction.SOUTH));
		level.setBlockAndUpdate(pos, newState);

		return InteractionResult.PASS;
	}
}
