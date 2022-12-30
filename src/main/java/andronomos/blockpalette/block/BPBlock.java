package andronomos.blockpalette.block;

import net.minecraft.world.level.block.Block;

public class BPBlock extends Block {
	public String[] variants = {"tile", "strip", "column"};

	public BPBlock(Properties properties) {
		super(properties);
	}

	public String[] getVariants() {
		return new String[0];
	}
}
