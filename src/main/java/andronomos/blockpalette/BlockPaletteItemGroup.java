package andronomos.blockpalette;

import andronomos.blockpalette.registry.ModBlocks;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class BlockPaletteItemGroup extends CreativeModeTab {
	public BlockPaletteItemGroup(String name) {
		super(name);
	}

	@Override
	public ItemStack makeIcon() {
		return new ItemStack(
				ModBlocks.BLOCKS.getEntries().stream().findFirst().get().get()
		);
	}
}
