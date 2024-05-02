package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.Block;

public class AsphaltBlock extends Block {
	public AsphaltBlock(Properties properties) {
		super(properties);
	}

	@Override
	public float getSpeedFactor() {
		return 1.3F;
	}
}
