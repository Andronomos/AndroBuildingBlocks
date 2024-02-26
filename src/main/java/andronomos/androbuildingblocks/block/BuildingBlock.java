package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.Block;

public class BuildingBlock extends Block {
	public final boolean isTranslucent;

	public BuildingBlock(Properties properties, boolean isTranslucent) {
		super(properties);
		this.isTranslucent = isTranslucent;
	}
}
