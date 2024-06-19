package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class CreativeTabRegistry {
	public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS = DeferredRegister.create(Registries.CREATIVE_MODE_TAB, AndroBuildingBlocks.MODID);

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
				//BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> isModernBlock(block)).forEach(block -> output.accept(block));
				BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(block -> {
					String blockPath = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();

					if(blockPath.contains("asphalt") || blockPath.contains("reinforced_concrete") || blockPath.contains("structural_glass") || blockPath.contains("graphite")) {
						output.accept(block);
					}

					if(blockPath.contains("steel") && !blockPath.contains("catwalk")) {
						output.accept(block);
					}

				});
				output.accept(BlockRegistry.CAUTION_STRIPES.get());
			})
			.build());

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_DEV_TAB = CREATIVE_MODE_TABS.register("androbuildingblocks_dev_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab.androbuildingblocks_dev_tab"))
			.icon(BlockRegistry.TEXTURE_TEST_ONE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				output.accept(BlockRegistry.TEXTURE_TEST_ONE.get());
				output.accept(BlockRegistry.TEXTURE_TEST_TWO.get());
				output.accept(BlockRegistry.STEEL_CATWALK.get());
				output.accept(BlockRegistry.STEEL_CATWALK_RAIL.get());
				output.accept(BlockRegistry.STEEL_CATWALK_STEP.get());
			})
			.build());

	public static final RegistryObject<CreativeModeTab> ANDROBUILDINGBLOCKS_MISC_TAB = CREATIVE_MODE_TABS.register("androbuildingblocks_misc_tab", () -> CreativeModeTab.builder()
			.title(Component.translatable("creativetab.androbuildingblocks_misc_tab"))
			.icon(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get().asItem()::getDefaultInstance)
			.displayItems((parameters, output) -> {
				//BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> output.accept(b));
				output.accept(BlockRegistry.BASALT_BRICKS.get());
				output.accept(BlockRegistry.BASALT_BRICK_STAIRS.get());
				output.accept(BlockRegistry.BASALT_BRICK_SLAB.get());
				output.accept(BlockRegistry.BASALT_BRICK_WALL.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICKS.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICK_STAIRS.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICK_SLAB.get());
				output.accept(BlockRegistry.DARK_PRISMARINE_BRICK_WALL.get());
				output.accept(BlockRegistry.SANDED_DARK_PRISMARINE.get());
				output.accept(BlockRegistry.SANDED_DARK_PRISMARINE_STAIRS.get());
				output.accept(BlockRegistry.SANDED_DARK_PRISMARINE_SLAB.get());
				output.accept(BlockRegistry.SANDED_DARK_PRISMARINE_WALL.get());
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
				output.accept(BlockRegistry.MARBLE.get());
				output.accept(BlockRegistry.POLISHED_MARBLE.get());
				output.accept(BlockRegistry.POLISHED_MARBLE_STAIRS.get());
				output.accept(BlockRegistry.POLISHED_MARBLE_WALL.get());
				output.accept(BlockRegistry.POLISHED_MARBLE_SLAB.get());
				output.accept(BlockRegistry.MARBLE_PILLAR.get());
			})
			.build());
}
