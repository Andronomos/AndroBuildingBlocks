package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPRotatableBlock;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static andronomos.blockpalette.registry.ModBlocks.*;

public class CarbonBlocks {
	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<Block> CARBON =  registerBlock("carbon", () -> new Block(PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<Block> CARBON_TILE =  registerBlock("carbon_tile", () -> new Block(PROPERTIES));
	public static final RegistryObject<BPRotatableBlock> CARBON_STRIPES =  registerRotatableBlock("carbon_stripes", PROPERTIES, "carbon");


	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
