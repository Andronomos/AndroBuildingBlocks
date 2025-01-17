package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.item.CatwalkRailingBlockItem;
import andronomos.androbuildingblocks.item.SandpaperItem;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ItemRegistry {
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, AndroBuildingBlocks.MODID);

	public static final RegistryObject<Item> SANDPAPER = ITEMS.register("sandpaper",
			() -> new SandpaperItem(new Item.Properties()));

	public static final RegistryObject<Item> STEEL_INGOT = ITEMS.register("steel_ingot",
			() -> new Item(new Item.Properties()));

	public static final RegistryObject<Item> STEEL_CATWALK_RAIL = ITEMS.register("steel_catwalk_rail",
			() -> new CatwalkRailingBlockItem(BlockRegistry.STEEL_CATWALK_RAIL.get(), new Item.Properties()));
}
