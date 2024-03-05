package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.Block;

public class AndroBlock extends Block {
	public final boolean isTranslucent;

	public AndroBlock(Properties properties, boolean isTranslucent) {
		super(properties);
		this.isTranslucent = isTranslucent;
	}
}
