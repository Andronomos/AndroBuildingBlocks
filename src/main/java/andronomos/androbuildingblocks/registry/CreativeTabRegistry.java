package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class CreativeTabRegistry {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AndroBuildingBlocks.MODID);

	private static List<String> modernBlocks = Arrays.asList(
			"reinforced_concrete",
			"structural_glass",
			"steel",
			"asphalt"
	);

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_ITEMS_TAB = CREATIVE_MODE_TABS.register("androbuildingblocks_items_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab.androbuildingblocks_items_tab"))
			.icon(ItemRegistry.SANDPAPER.get()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				output.accept(ItemRegistry.SANDPAPER.get());
				output.accept(ItemRegistry.STEEL_INGOT.get());
			})
			.build());

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_MODERN_TAB = CREATIVE_MODE_TABS.register("androbuildingblocks_modern_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab.androbuildingblocks_modern_tab"))
			.icon(BlockRegistry.WHITE_REINFORCED_CONCRETE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> isModernBlock(block)).forEach(block -> output.accept(block));
			})
			.build());

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_MISC_TAB = CREATIVE_MODE_TABS.register("androbuildingblocks_misc_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab.androbuildingblocks_misc_tab"))
			.icon(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				//BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> output.accept(b));
				output.accept(BlockRegistry.CHARRED_STONE.get());
				output.accept(BlockRegistry.CHARRED_STONE_STAIRS.get());
				output.accept(BlockRegistry.CHARRED_STONE_SLAB.get());
				output.accept(BlockRegistry.CHARRED_STONE_WALL.get());
				output.accept(BlockRegistry.BASALT_BRICKS.get());
				output.accept(BlockRegistry.BASALT_BRICK_STAIRS.get());
				output.accept(BlockRegistry.BASALT_BRICK_SLAB.get());
				output.accept(BlockRegistry.BASALT_BRICK_WALL.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICKS.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICK_STAIRS.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICK_SLAB.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICK_WALL.get());
				output.accept(BlockRegistry.SANDED_DEEPSLATE.get());
				output.accept(BlockRegistry.SANDED_DEEPSLATE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_DEEPSLATE_WALL.get());
				output.accept(BlockRegistry.SANDED_DEEPSLATE_SLAB.get());
				output.accept(BlockRegistry.SANDED_BASALT.get());
				output.accept(BlockRegistry.SANDED_BASALT_STAIRS.get());
				output.accept(BlockRegistry.SANDED_BASALT_WALL.get());
				output.accept(BlockRegistry.SANDED_BASALT_SLAB.get());
				output.accept(BlockRegistry.SANDED_NETHERRACK.get());
				output.accept(BlockRegistry.SANDED_NETHERRACK_STAIRS.get());
				output.accept(BlockRegistry.SANDED_NETHERRACK_WALL.get());
				output.accept(BlockRegistry.SANDED_NETHERRACK_SLAB.get());
				output.accept(BlockRegistry.SANDED_NETHERBRICKS.get());
				output.accept(BlockRegistry.SANDED_NETHERBRICKS_STAIRS.get());
				output.accept(BlockRegistry.SANDED_NETHERBRICKS_WALL.get());
				output.accept(BlockRegistry.SANDED_NETHERBRICKS_SLAB.get());
				output.accept(BlockRegistry.SANDED_PACKED_MUD.get());
				output.accept(BlockRegistry.SANDED_PACKED_MUD_STAIRS.get());
				output.accept(BlockRegistry.SANDED_PACKED_MUD_WALL.get());
				output.accept(BlockRegistry.SANDED_PACKED_MUD_SLAB.get());
				output.accept(BlockRegistry.SANDED_CALCITE.get());
				output.accept(BlockRegistry.SANDED_CALCITE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_CALCITE_WALL.get());
				output.accept(BlockRegistry.SANDED_CALCITE_SLAB.get());
				output.accept(BlockRegistry.SANDED_STONE.get());
				output.accept(BlockRegistry.SANDED_STONE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_STONE_WALL.get());
				output.accept(BlockRegistry.SANDED_STONE_SLAB.get());
				output.accept(BlockRegistry.SANDED_BLACKSTONE.get());
				output.accept(BlockRegistry.SANDED_BLACKSTONE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_BLACKSTONE_WALL.get());
				output.accept(BlockRegistry.SANDED_BLACKSTONE_SLAB.get());
				output.accept(BlockRegistry.SANDED_END_STONE.get());
				output.accept(BlockRegistry.SANDED_END_STONE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_END_STONE_WALL.get());
				output.accept(BlockRegistry.SANDED_END_STONE_SLAB.get());
				output.accept(BlockRegistry.SANDED_DRIPSTONE.get());
				output.accept(BlockRegistry.SANDED_DRIPSTONE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_DRIPSTONE_WALL.get());
				output.accept(BlockRegistry.SANDED_DRIPSTONE_SLAB.get());
				output.accept(BlockRegistry.SANDED_TUFF.get());
				output.accept(BlockRegistry.SANDED_TUFF_STAIRS.get());
				output.accept(BlockRegistry.SANDED_TUFF_WALL.get());
				output.accept(BlockRegistry.SANDED_TUFF_SLAB.get());
				output.accept(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get());
				output.accept(BlockRegistry.MOSSY_COBBLED_DEEPLSATE_STAIRS.get());
				output.accept(BlockRegistry.MOSSY_COBBLED_DEEPLSATE_WALL.get());
				output.accept(BlockRegistry.MOSSY_COBBLED_DEEPLSATE_SLAB.get());
				output.accept(BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get());
				output.accept(BlockRegistry.MOSSY_DEEPLSATE_BRICK_STAIRS.get());
				output.accept(BlockRegistry.MOSSY_DEEPLSATE_BRICK_WALL.get());
				output.accept(BlockRegistry.MOSSY_DEEPLSATE_BRICK_SLAB.get());
				output.accept(BlockRegistry.SILT.get());
				output.accept(BlockRegistry.SILT_STAIRS.get());
				output.accept(BlockRegistry.SILT_WALL.get());
				output.accept(BlockRegistry.SILT_SLAB.get());
				output.accept(BlockRegistry.BLACK_SILT.get());
				output.accept(BlockRegistry.BLACK_SILT_STAIRS.get());
				output.accept(BlockRegistry.BLACK_SILT_WALL.get());
				output.accept(BlockRegistry.BLACK_SILT_SLAB.get());
			})
			.build());

	private static boolean isModernBlock(Block block) {
		String blockPath = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
		return modernBlocks.stream().anyMatch(blockPath::contains);
	}
}
