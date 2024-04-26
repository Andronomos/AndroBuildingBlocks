package andronomos.androbuildingblocks.block;

import net.minecraft.world.level.block.RotatedPillarBlock;

public class AndroRotatableBlock extends RotatedPillarBlock {
	public String topResource;

	public AndroRotatableBlock(Properties properties, String topResource) {
		super(properties);
		this.topResource = topResource;
	}
}
