package andronomos.blockpalette;

import andronomos.blockpalette.registry.*;
import com.mojang.logging.LogUtils;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

@Mod(BlockPalette.MODID)
public class BlockPalette {
	public static final String MODID = "blockpalette";
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final String TAB_NAME = "blockpalette_group";
	public static final CreativeModeTab BLOCKPALETTE_TAB = new BlockPaletteItemGroup(TAB_NAME);

	public BlockPalette() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		modEventBus.addListener(this::commonSetup);
		modEventBus.addListener(this::clientSetup);

		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);
		BytlBlocks.register(modEventBus);
		MytlBlocks.register(modEventBus);
		HzrdBlocks.register(modEventBus);
		GlaxBlocks.register(modEventBus);
		CarbonBlocks.register(modEventBus);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void commonSetup(final FMLCommonSetupEvent event) {

	}

	private void clientSetup(final FMLClientSetupEvent event) {

	}
}
