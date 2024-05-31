package andronomos.androbuildingblocks.item;

import andronomos.androbuildingblocks.block.CatwalkBlock;
import andronomos.androbuildingblocks.block.CatwalkRailingBlock;
import net.minecraft.core.BlockPos;
import net.minecraft.core.Direction;
import net.minecraft.sounds.SoundSource;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.gameevent.GameEvent;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;

@SuppressWarnings("deprecation")
public class CatwalkRailingBlockItem extends BlockItem {
	public CatwalkRailingBlockItem(Block block, Properties properties) {
		super(block, properties);
	}

	@Override
	public @NotNull InteractionResult useOn(UseOnContext ctx) {
		BlockPos pos = ctx.getClickedPos();
		Direction face = ctx.getClickedFace();
		Level level = ctx.getLevel();
		Player player = ctx.getPlayer();
		ItemStack stack = ctx.getItemInHand();
		BlockState state = level.getBlockState(pos);

		if(!(state.getBlock() instanceof CatwalkBlock)) {
			return InteractionResult.FAIL;
		}

		BlockPos abovePos = pos.relative(face);
		BlockState aboveState = level.getBlockState(pos.relative(face));

		if(CatwalkRailingBlock.isRailing(aboveState.getBlock())) {
			pos = abovePos;
			state = aboveState;
		}

		boolean railMatchTest = Objects.requireNonNull(player).isHolding(state.getBlock().asItem());

		if(!CatwalkRailingBlock.isRailing(state.getBlock()) ||
				(state.getValue(CatwalkRailingBlock.NORTH_FENCE)) &&
						(state.getValue(CatwalkRailingBlock.SOUTH_FENCE)) &&
						(state.getValue(CatwalkRailingBlock.EAST_FENCE)) &&
						(state.getValue(CatwalkRailingBlock.WEST_FENCE)) ||
				!railMatchTest) {
			return super.useOn(ctx);
		}

		Direction playerDirection = player.getDirection();

		//If there's already a railing in this direction, cancel placing
		if (state.getValue(CatwalkRailingBlock.fromDirection(playerDirection))) {
			return InteractionResult.FAIL;
		}

		state = state.setValue(CatwalkRailingBlock.fromDirection(playerDirection), true);

		if (!player.isShiftKeyDown()) {
			SoundType soundType = state.getSoundType();
			level.setBlock(abovePos, state, 3);
			level.playSound(player, pos, this.getPlaceSound(state), SoundSource.BLOCKS, (soundType.getVolume() + 1.0F) / 2.0F, soundType.getPitch() * 0.8F);
			level.gameEvent(GameEvent.BLOCK_PLACE, pos.relative(face), GameEvent.Context.of(player, state));

			if (!player.getAbilities().instabuild) {
				stack.shrink(1);
			}

			return InteractionResult.SUCCESS;
		}

		return super.useOn(ctx);
	}
}

