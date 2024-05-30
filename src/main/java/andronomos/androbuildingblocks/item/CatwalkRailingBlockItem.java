package andronomos.androbuildingblocks.item;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.CatwalkBlock;
import andronomos.androbuildingblocks.block.CatwalkRailingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import net.minecraft.world.phys.BlockHitResult;

public class CatwalkRailingBlockItem extends BlockItem {
	public CatwalkRailingBlockItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public InteractionResult useOn(UseOnContext ctx) {
		BlockPos pos    = ctx.getClickedPos();
		Direction face  = ctx.getClickedFace();
		Level level     = ctx.getLevel();
		Player player   = ctx.getPlayer();
		ItemStack stack = ctx.getItemInHand();
		BlockState state = level.getBlockState(pos);
		BlockHitResult ray = new BlockHitResult(ctx.getClickLocation(), face, pos, true);

		if(!(state.getBlock() instanceof CatwalkBlock)) {
			return InteractionResult.FAIL;
		}

		BlockPos abovePos = pos.relative(face);
		BlockState aboveState = level.getBlockState(pos.relative(face));

		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | pos: %s", pos));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | face: %s", face));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | clicked blockstate: %s", level.getBlockState(pos)));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | state.getBlock: %s", state.getBlock()));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | abovePos: %s", abovePos));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | aboveState: %s", aboveState));
		AndroBuildingBlocks.LOGGER.info(String.format("CatwalkRailingBlockItem#useOn | aboveState.getBlock: %s", aboveState.getBlock()));

		if(CatwalkRailingBlock.isRailing(aboveState.getBlock())) {
			pos = abovePos;
			state = aboveState;
		}

		boolean railMatchTest = player.isHolding(state.getBlock().asItem());

		if(!CatwalkRailingBlock.isRailing(state.getBlock()) ||
				(state.getValue(CatwalkRailingBlock.NORTH_FENCE)) &&
						(state.getValue(CatwalkRailingBlock.SOUTH_FENCE)) &&
						(state.getValue(CatwalkRailingBlock.EAST_FENCE)) &&
						(state.getValue(CatwalkRailingBlock.WEST_FENCE)) ||
				!railMatchTest) {
			return super.useOn(ctx);
		}

		Direction playerDirection = player.getDirection();
		state = state.setValue(CatwalkRailingBlock.fromDirection(playerDirection), true);

		if (!player.isShiftKeyDown()) {
			level.setBlock(abovePos, state, 3);
			level.gameEvent(GameEvent.BLOCK_PLACE, pos.relative(face), GameEvent.Context.of(player, state));

			if (!player.getAbilities().instabuild) {
				stack.shrink(1);
			}

			return InteractionResult.SUCCESS;
		}

		return super.useOn(ctx);
	}
}

