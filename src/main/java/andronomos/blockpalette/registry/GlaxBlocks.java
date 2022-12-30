package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.registry.ModItems;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.GlassBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StainedGlassPaneBlock;
import net.minecraft.world.level.material.Material;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import static andronomos.blockpalette.registry.ModBlocks.*;

public class GlaxBlocks {
	private static Block.Properties GLAX_PROPERTIES = Block.Properties.of(Material.GLASS)
			.strength(0.3F).sound(SoundType.GLASS).noOcclusion();

	private static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);

	public static final RegistryObject<GlassBlock> GLAX_CYAN =  registerBlock("glax_cyan", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_WHITE = registerBlock("glax_white", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_BLACK = registerBlock("glax_black", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_BROWN = registerBlock("glax_brown", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_RED = registerBlock("glax_red", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_PINK = registerBlock("glax_pink", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_BLUE = registerBlock("glax_blue", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_GREEN = registerBlock("glax_green", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_GRAY = registerBlock("glax_gray", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_ORANGE = registerBlock("glax_orange", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_PURPLE = registerBlock("glax_purple", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_MAGENTA = registerBlock("glax_magenta", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_LIME = registerBlock("glax_lime", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_LIGHT_BLUE = registerBlock("glax_light_blue", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_LIGHT_GRAY = registerBlock("glax_light_gray", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());
	public static final RegistryObject<GlassBlock> GLAX_YELLOW = registerBlock("glax_yellow", () -> new GlassBlock(GLAX_PROPERTIES), ModItems.GetBaseProperties());

	public static final RegistryObject<Block> GLAX_BLACK_PANE = registerGlaxPaneBlock("black", DyeColor.BLACK);
	public static final RegistryObject<Block> GLAX_BLUE_PANE = registerGlaxPaneBlock("blue", DyeColor.BLUE);
	public static final RegistryObject<Block> GLAX_BROWN_PANE = registerGlaxPaneBlock("brown", DyeColor.BROWN);
	public static final RegistryObject<Block> GLAX_CYAN_PANE = registerGlaxPaneBlock("cyan", DyeColor.CYAN);
	public static final RegistryObject<Block> GLAX_GRAY_PANE = registerGlaxPaneBlock("gray", DyeColor.GRAY);
	public static final RegistryObject<Block> GLAX_GREEN_PANE = registerGlaxPaneBlock("green", DyeColor.GREEN);
	public static final RegistryObject<Block> GLAX_LIGHT_BLUE_PANE = registerGlaxPaneBlock("light_blue", DyeColor.LIGHT_BLUE);
	public static final RegistryObject<Block> GLAX_LIGHT_GRAY_PANE = registerGlaxPaneBlock("light_gray", DyeColor.LIGHT_GRAY);
	public static final RegistryObject<Block> GLAX_LIME_PANE = registerGlaxPaneBlock("lime", DyeColor.LIME);
	public static final RegistryObject<Block> GLAX_MAGENTA_PANE = registerGlaxPaneBlock("magenta", DyeColor.MAGENTA);
	public static final RegistryObject<Block> GLAX_ORANGE_PANE = registerGlaxPaneBlock("orange", DyeColor.ORANGE);
	public static final RegistryObject<Block> GLAX_PINK_PANE = registerGlaxPaneBlock("pink", DyeColor.PINK);
	public static final RegistryObject<Block> GLAX_PURPLE_PANE = registerGlaxPaneBlock("purple", DyeColor.PURPLE);
	public static final RegistryObject<Block> GLAX_RED_PANE = registerGlaxPaneBlock("red", DyeColor.RED);
	public static final RegistryObject<Block> GLAX_WHITE_PANE = registerGlaxPaneBlock("white", DyeColor.WHITE);
	public static final RegistryObject<Block> GLAX_YELLOW_PANE = registerGlaxPaneBlock("yellow", DyeColor.YELLOW);

	private static RegistryObject<Block> registerGlaxPaneBlock(final String name, DyeColor color) {
		return registerBlock("glax_" + name + "_pane", () -> new StainedGlassPaneBlock(color, GLAX_PROPERTIES), ModItems.GetBaseProperties());
	}

	public static void register(IEventBus eventBus) {
		BLOCKS.register(eventBus);
	}
}
