package andronomos.androbuildingblocks.block;

import net.minecraft.core.BlockPos;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.state.BlockState;

public class AsphaltBlock extends Block {
	public AsphaltBlock(Properties properties) {
		super(properties);
	}

	//@Override
	//public void stepOn(Level p_152431_, BlockPos p_152432_, BlockState p_152433_, Entity p_152434_) {
	//	super.stepOn(p_152431_, p_152432_, p_152433_, p_152434_);
	//}

	@Override
	public float getSpeedFactor() {
		return 1.3F;
	}
}
