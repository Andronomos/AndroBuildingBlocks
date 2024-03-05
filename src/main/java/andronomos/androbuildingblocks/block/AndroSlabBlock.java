package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.SlabBlock;

public class AndroSlabBlock extends SlabBlock {
	public final boolean isTranslucent;

	public AndroSlabBlock(Properties properties, boolean isTranslucent) {
		super(properties);
		this.isTranslucent = isTranslucent;
	}
}
