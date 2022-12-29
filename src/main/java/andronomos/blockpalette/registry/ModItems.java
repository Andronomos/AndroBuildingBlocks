package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, BlockPalette.MODID);

	public static Item.Properties GetBaseProperties() {
		return new Item.Properties().tab(BlockPalette.BLOCKPALETTE_TAB);
	}
}
