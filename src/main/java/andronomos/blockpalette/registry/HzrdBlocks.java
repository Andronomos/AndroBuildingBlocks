package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static andronomos.blockpalette.registry.ModBlocks.*;

public class HzrdBlocks {
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<Block> HZRD = registerBlock("hzrd", () -> new Block(PROPERTIES));
	public static final RegistryObject<SlabBlock> HZRD_SLAB = registerSlabBlock("hzrd_slab");
	public static final RegistryObject<StairBlock> HZRD_STAIRS = registerStairBlock("hzrd_stairs", HZRD);

	public static final RegistryObject<Block> HZRD_YELLOW = registerBlock("hzrd_yellow", () -> new Block(PROPERTIES));
	public static final RegistryObject<SlabBlock> HZRD_YELLOW_SLAB = registerSlabBlock("hzrd_yellow_slab");
	public static final RegistryObject<StairBlock> HZRD_YELLOW_STAIRS = registerStairBlock("hzrd_yellow_stairs", HZRD_YELLOW);

	public static final RegistryObject<Block> HZRD_GRAY = registerBlock("hzrd_gray", () -> new Block(PROPERTIES));
	public static final RegistryObject<SlabBlock> HZRD_GRAY_SLAB = registerSlabBlock("hzrd_gray_slab");
	public static final RegistryObject<StairBlock> HZRD_GRAY_STAIRS = registerStairBlock("hzrd_gray_stairs", HZRD_GRAY);


	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
