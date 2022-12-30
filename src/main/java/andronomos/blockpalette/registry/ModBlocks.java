package andronomos.blockpalette.registry;

import andronomos.blockpalette.BlockPalette;
import andronomos.blockpalette.block.BPRotatableBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
	//region properties
	public static Block.Properties PROPERTIES = Block.Properties.of(Material.STONE)
			.strength(3.0F, 3.0F)
			.sound(SoundType.STONE);

	public static Block.Properties METAL_PROPERTIES = Block.Properties.of(Material.METAL, MaterialColor.METAL)
			.strength(5.0F, 6.0F)
			.sound(SoundType.METAL);
	//endregion

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, BlockPalette.MODID);


	public static final RegistryObject<Block> UN_ONE = registerBlock("un_one", () -> new Block(PROPERTIES));
	public static final RegistryObject<Block> UN_TWO = registerBlock("un_two", () -> new Block(PROPERTIES));




	public static RegistryObject<StairBlock> registerStairBlock(final String name, Supplier<Block> source) {
		return registerBlock(name, () -> new StairBlock(() -> source.get().defaultBlockState(), PROPERTIES), ModItems.GetBaseProperties());
	}

	public static RegistryObject<SlabBlock> registerSlabBlock(final String name) {
		return registerBlock(name, () -> new SlabBlock(PROPERTIES), ModItems.GetBaseProperties());
	}

	public static RegistryObject<WallBlock> registerWallBlock(final String name) {
		return registerBlock(name, () -> new WallBlock(PROPERTIES), ModItems.GetBaseProperties());
	}

	public static RegistryObject<FenceBlock> registerFenceBlock(final String name) {
		return registerBlock(name, () -> new FenceBlock(PROPERTIES), ModItems.GetBaseProperties());
	}

	public static RegistryObject<BPRotatableBlock> registerRotatableBlock(final String name, Block.Properties properties, String topTexture) {
		return registerBlock(name, () -> new BPRotatableBlock(properties, topTexture), ModItems.GetBaseProperties());
	}

	public static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory) {
		return registerBlock(name, blockFactory, block -> new BlockItem(block, ModItems.GetBaseProperties()));
	}

	public static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory, Item.Properties properties) {
		return registerBlock(name, blockFactory, block -> new BlockItem(block, properties));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlock(final String name, final Supplier<BLOCK> blockFactory, final IBlockItemFactory<BLOCK> itemFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ModItems.ITEMS.register(name, () -> itemFactory.create(block.get()));
		return block;
	}

	/**
	 * A factory function used to create block items.
	 *
	 * @param <BLOCK> The block type
	 */
	@FunctionalInterface
	public interface IBlockItemFactory<BLOCK> {
		Item create(BLOCK block);
	}
}
