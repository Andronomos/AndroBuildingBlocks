package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPRotatableBlock;
import net.minecraft.world.level.block.*;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static andronomos.blockpalette.registry.ModBlocks.*;

public class CarbonBlocks {
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<Block> CARBON =  registerBlock("carbon", () -> new Block(PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<SlabBlock> CARBON_SLAB = registerSlabBlock("carbon_slab");
	public static final RegistryObject<StairBlock> CARBON_STAIRS = registerStairBlock("carbon_stairs", CARBON);
	public static final RegistryObject<WallBlock> CARBON_WALL = registerWallBlock("carbon_wall");
	public static final RegistryObject<FenceBlock> CARBON_FENCE = registerFenceBlock("carbon_fence");

	public static final RegistryObject<Block> CARBON_TILE =  registerBlock("carbon_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<SlabBlock> CARBON_TILE_SLAB = registerSlabBlock("carbon_tile_slab");
	public static final RegistryObject<StairBlock> CARBON_TILE_STAIRS = registerStairBlock("carbon_tile_stairs", CARBON);
	public static final RegistryObject<WallBlock> CARBON_TILE_WALL = registerWallBlock("carbon_tile_wall");
	public static final RegistryObject<FenceBlock> CARBON_TILE_FENCE = registerFenceBlock("carbon_tile_fence");

	public static final RegistryObject<BPRotatableBlock> CARBON_STRIPES =  registerRotatableBlock("carbon_stripes", PROPERTIES, "carbon");


	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
