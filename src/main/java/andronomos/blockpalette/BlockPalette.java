package andronomos.blockpalette;

import andronomos.blockpalette.registry.ModBlocks;
import andronomos.blockpalette.registry.ModItems;
import com.mojang.logging.LogUtils;
import net.minecraft.client.renderer.ItemBlockRenderTypes;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Items;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.slf4j.Logger;

@Mod(BlockPalette.MODID)
public class BlockPalette {
	public static final String MODID = "blockpalette";
	public static final Logger LOGGER = LogUtils.getLogger();
	public static final String TAB_NAME = "blockpalette_group";
	public static final CreativeModeTab BLOCKPALETTE_TAB = new BlockPaletteItemGroup(TAB_NAME);

	public BlockPalette() {
		IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

		// Register the commonSetup method for modloading
		modEventBus.addListener(this::commonSetup);
		modEventBus.addListener(this::clientSetup);

		ModBlocks.BLOCKS.register(modEventBus);
		ModItems.ITEMS.register(modEventBus);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void commonSetup(final FMLCommonSetupEvent event)
	{
		BlockPalette.LOGGER.info("BlockPalette#commonSetup | block getPath >> {}", ForgeRegistries.BLOCKS.getKey(ModBlocks.BYTL.get()).getPath());
		BlockPalette.LOGGER.info("BlockPalette#commonSetup | item getPath >> {}", ForgeRegistries.ITEMS.getKey(Items.ALLAY_SPAWN_EGG).getPath());

		ResourceLocation r = new ResourceLocation(BlockPalette.MODID, ForgeRegistries.BLOCKS.getKey(ModBlocks.BYTL.get()).getPath());
		BlockPalette.LOGGER.info("BlockPalette#commonSetup | r.toString >> {}", r.toString());
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		//ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
		//	if(b instanceof GlassBlock || b instanceof StainedGlassPaneBlock || ForgeRegistries.BLOCKS.getKey(b).getPath().contains("lytl")) {
		//		ItemBlockRenderTypes.setRenderLayer(b, RenderType.cutout());
		//	}
		//});

		//ItemBlockRenderTypes.setRenderLayer(ModBlocks.TRUS.get(), RenderType.cutout());
	}
}
