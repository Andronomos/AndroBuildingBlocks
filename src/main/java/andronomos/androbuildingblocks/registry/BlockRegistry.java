package andronomos.androbuildingblocks.registry;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.block.CatwalkBlock;
import andronomos.androbuildingblocks.block.CatwalkRailingBlock;
import andronomos.androbuildingblocks.block.CatwalkStepBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.DyeColor;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class BlockRegistry {
	public static Block.Properties GENERIC_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE);
	public static Block.Properties REINFORCED_CONCRETE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.WHITE_CONCRETE);
	public static Block.Properties METAL_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK);
	public static Block.Properties GLASS_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS).strength(0.75f);
	public static Block.Properties GLASS_PANE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.GLASS_PANE);
	public static Block.Properties DARK_PRISMARINE_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.DARK_PRISMARINE);
	public static Block.Properties BASALT_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.BASALT);
	public static Block.Properties ClAY_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.CLAY);
	public static Block.Properties ASPHALT_PROPERTIES = BlockBehaviour.Properties.copy(Blocks.STONE).speedFactor(1.3F);

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, AndroBuildingBlocks.MODID);

	//region concrete
	public static RegistryObject<Block> BLACK_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> BLACK_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> BLACK_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> BLACK_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> BLACK_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> BLACK_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> BLACK_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> BLACK_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> BLUE_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> BLUE_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> BLUE_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> BLUE_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> BLUE_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> BLUE_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> BLUE_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> BLUE_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> BROWN_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> BROWN_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> BROWN_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> BROWN_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> BROWN_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> BROWN_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> BROWN_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> BROWN_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> GREEN_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> GREEN_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> GREEN_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> GREEN_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> GREEN_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> GREEN_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> GREEN_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> GREEN_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> GRAY_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> GRAY_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> GRAY_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> GRAY_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> GRAY_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> GRAY_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> GRAY_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> GRAY_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> PINK_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> PINK_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> PINK_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> PINK_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> PINK_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> PINK_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> PINK_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> PINK_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> PURPLE_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> PURPLE_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> PURPLE_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> PURPLE_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> PURPLE_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> PURPLE_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> PURPLE_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> PURPLE_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> RED_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> RED_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> RED_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> RED_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> RED_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> RED_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> RED_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> RED_REINFORCED_CONCRETE_TILE_SLAB;

	public static RegistryObject<Block> WHITE_REINFORCED_CONCRETE;
	public static RegistryObject<StairBlock> WHITE_REINFORCED_CONCRETE_STAIRS;
	public static RegistryObject<WallBlock> WHITE_REINFORCED_CONCRETE_WALL;
	public static RegistryObject<SlabBlock> WHITE_REINFORCED_CONCRETE_SLAB;
	public static RegistryObject<Block> WHITE_REINFORCED_CONCRETE_TILE;
	public static RegistryObject<StairBlock> WHITE_REINFORCED_CONCRETE_TILE_STAIRS;
	public static RegistryObject<WallBlock> WHITE_REINFORCED_CONCRETE_TILE_WALL;
	public static RegistryObject<SlabBlock> WHITE_REINFORCED_CONCRETE_TILE_SLAB;
	//endregion

	//region sanded
	public static RegistryObject<Block> SANDED_ANDESITE;
	public static RegistryObject<StairBlock> SANDED_ANDESITE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_ANDESITE_WALL;
	public static RegistryObject<SlabBlock> SANDED_ANDESITE_SLAB;

	public static RegistryObject<Block> SANDED_DARK_PRISMARINE;
	public static RegistryObject<StairBlock> SANDED_DARK_PRISMARINE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_DARK_PRISMARINE_WALL;
	public static RegistryObject<SlabBlock> SANDED_DARK_PRISMARINE_SLAB;

	public static RegistryObject<Block> SANDED_GRANITE;
	public static RegistryObject<StairBlock> SANDED_GRANITE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_GRANITE_WALL;
	public static RegistryObject<SlabBlock> SANDED_GRANITE_SLAB;

	public static RegistryObject<Block> SANDED_DEEPSLATE;
	public static RegistryObject<StairBlock> SANDED_DEEPSLATE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_DEEPSLATE_WALL;
	public static RegistryObject<SlabBlock> SANDED_DEEPSLATE_SLAB;

	public static RegistryObject<Block> SANDED_BASALT;
	public static RegistryObject<StairBlock> SANDED_BASALT_STAIRS;
	public static RegistryObject<WallBlock> SANDED_BASALT_WALL;
	public static RegistryObject<SlabBlock> SANDED_BASALT_SLAB;

	public static RegistryObject<Block> SANDED_NETHERRACK;
	public static RegistryObject<StairBlock> SANDED_NETHERRACK_STAIRS;
	public static RegistryObject<WallBlock> SANDED_NETHERRACK_WALL;
	public static RegistryObject<SlabBlock> SANDED_NETHERRACK_SLAB;

	public static RegistryObject<Block> SANDED_NETHERBRICKS;
	public static RegistryObject<StairBlock> SANDED_NETHERBRICKS_STAIRS;
	public static RegistryObject<WallBlock> SANDED_NETHERBRICKS_WALL;
	public static RegistryObject<SlabBlock> SANDED_NETHERBRICKS_SLAB;

	public static RegistryObject<Block> SANDED_PACKED_MUD;
	public static RegistryObject<StairBlock> SANDED_PACKED_MUD_STAIRS;
	public static RegistryObject<WallBlock> SANDED_PACKED_MUD_WALL;
	public static RegistryObject<SlabBlock> SANDED_PACKED_MUD_SLAB;

	public static RegistryObject<Block> SANDED_CALCITE;
	public static RegistryObject<StairBlock> SANDED_CALCITE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_CALCITE_WALL;
	public static RegistryObject<SlabBlock> SANDED_CALCITE_SLAB;

	public static RegistryObject<Block> SANDED_STONE;
	public static RegistryObject<StairBlock> SANDED_STONE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_STONE_WALL;
	public static RegistryObject<SlabBlock> SANDED_STONE_SLAB;

	public static RegistryObject<Block> SANDED_BLACKSTONE;
	public static RegistryObject<StairBlock> SANDED_BLACKSTONE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_BLACKSTONE_WALL;
	public static RegistryObject<SlabBlock> SANDED_BLACKSTONE_SLAB;

	public static RegistryObject<Block> SANDED_END_STONE;
	public static RegistryObject<StairBlock> SANDED_END_STONE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_END_STONE_WALL;
	public static RegistryObject<SlabBlock> SANDED_END_STONE_SLAB;

	public static RegistryObject<Block> SANDED_DRIPSTONE;
	public static RegistryObject<StairBlock> SANDED_DRIPSTONE_STAIRS;
	public static RegistryObject<WallBlock> SANDED_DRIPSTONE_WALL;
	public static RegistryObject<SlabBlock> SANDED_DRIPSTONE_SLAB;

	public static RegistryObject<Block> SANDED_TUFF;
	public static RegistryObject<StairBlock> SANDED_TUFF_STAIRS;
	public static RegistryObject<WallBlock> SANDED_TUFF_WALL;
	public static RegistryObject<SlabBlock> SANDED_TUFF_SLAB;
	//endregion

	//region misc
	public static RegistryObject<Block> MOSSY_COBBLED_DEEPLSATE;
	public static RegistryObject<StairBlock> MOSSY_COBBLED_DEEPLSATE_STAIRS;
	public static RegistryObject<WallBlock> MOSSY_COBBLED_DEEPLSATE_WALL;
	public static RegistryObject<SlabBlock> MOSSY_COBBLED_DEEPLSATE_SLAB;

	public static RegistryObject<Block> MOSSY_DEEPLSATE_BRICKS;
	public static RegistryObject<StairBlock> MOSSY_DEEPLSATE_BRICK_STAIRS;
	public static RegistryObject<WallBlock> MOSSY_DEEPLSATE_BRICK_WALL;
	public static RegistryObject<SlabBlock> MOSSY_DEEPLSATE_BRICK_SLAB;

	public static RegistryObject<Block> DARK_PRISMARINE_BRICKS;
	public static RegistryObject<StairBlock> DARK_PRISMARINE_BRICK_STAIRS;
	public static RegistryObject<WallBlock> DARK_PRISMARINE_BRICK_WALL;
	public static RegistryObject<SlabBlock> DARK_PRISMARINE_BRICK_SLAB;

	public static RegistryObject<Block> BASALT_BRICKS;
	public static RegistryObject<StairBlock> BASALT_BRICK_STAIRS;
	public static RegistryObject<WallBlock> BASALT_BRICK_WALL;
	public static RegistryObject<SlabBlock> BASALT_BRICK_SLAB;

	public static Supplier<Block> MARBLE;
	public static RegistryObject<StairBlock> MARBLE_STAIRS;
	public static RegistryObject<SlabBlock> MARBLE_SLAB;
	public static RegistryObject<WallBlock> MARBLE_WALL;

	public static Supplier<Block> MARBLE_PILLAR;

	public static Supplier<Block> POLISHED_MARBLE;
	public static RegistryObject<StairBlock> POLISHED_MARBLE_STAIRS;
	public static RegistryObject<SlabBlock> POLISHED_MARBLE_SLAB;
	public static RegistryObject<WallBlock> POLISHED_MARBLE_WALL;

	public static Supplier<Block> CAUTION_STRIPES;

	public static Supplier<Block> GRAPHITE;
	public static Supplier<StairBlock> GRAPHITE_STAIRS;
	public static Supplier<SlabBlock> GRAPHITE_SLAB;
	public static Supplier<WallBlock> GRAPHITE_WALL;
	public static Supplier<Block> GRAPHITE_TILE;
	public static Supplier<StairBlock> GRAPHITE_TILE_STAIRS;
	public static Supplier<SlabBlock> GRAPHITE_TILE_SLAB;
	public static Supplier<WallBlock> GRAPHITE_TILE_WALL;
	public static Supplier<Block> GRAPHITE_PILLAR;

	public static Supplier<Block> CUT_GRAPHITE;
	public static Supplier<StairBlock> CUT_GRAPHITE_STAIRS;
	public static Supplier<SlabBlock> CUT_GRAPHITE_SLAB;
	public static Supplier<WallBlock> CUT_GRAPHITE_WALL;
	//endregion

	//region steel
	public static RegistryObject<Block> STEEL_BLOCK;
	public static RegistryObject<StairBlock> STEEL_STAIRS;
	public static RegistryObject<WallBlock> STEEL_WALL;
	public static RegistryObject<SlabBlock> STEEL_SLAB;

	public static RegistryObject<Block> STEEL_TILE;
	public static RegistryObject<StairBlock> STEEL_TILE_STAIRS;
	public static RegistryObject<WallBlock> STEEL_TILE_WALL;
	public static RegistryObject<SlabBlock> STEEL_TILE_SLAB;

	public static RegistryObject<Block> STEEL_PILLAR;
	public static RegistryObject<Block> STEEL_TRAPDOOR;

	public static RegistryObject<Block> CUT_STEEL;
	public static RegistryObject<StairBlock> CUT_STEEL_STAIRS;
	public static RegistryObject<WallBlock> CUT_STEEL_WALL;
	public static RegistryObject<SlabBlock> CUT_STEEL_SLAB;

	public static RegistryObject<Block> STEEL_SIDING;
	public static RegistryObject<StairBlock> STEEL_SIDING_STAIRS;
	public static RegistryObject<WallBlock> STEEL_SIDING_WALL;
	public static RegistryObject<SlabBlock> STEEL_SIDING_SLAB;

	public static Supplier<Block> STEEL_CATWALK;
	public static Supplier<Block> STEEL_CATWALK_STEP;
	public static Supplier<Block> STEEL_CATWALK_RAIL;
	//endregion

	//region asphalt
	public static Supplier<Block> ASPHALT;
	public static RegistryObject<StairBlock> ASPHALT_STAIRS;
	public static RegistryObject<SlabBlock> ASPHALT_SLAB;

	public static Supplier<Block> RED_ASPHALT;
	public static RegistryObject<StairBlock> RED_ASPHALT_STAIRS;
	public static RegistryObject<SlabBlock> RED_ASPHALT_SLAB;

	public static Supplier<Block> BLUE_ASPHALT;
	public static RegistryObject<StairBlock> BLUE_ASPHALT_STAIRS;
	public static RegistryObject<SlabBlock> BLUE_ASPHALT_SLAB;

	public static Supplier<Block> GREEN_ASPHALT;
	public static RegistryObject<StairBlock> GREEN_ASPHALT_STAIRS;
	public static RegistryObject<SlabBlock> GREEN_ASPHALT_SLAB;
	//endregion

	public static Supplier<Block> TEXTURE_TEST_ONE;
	public static Supplier<Block> TEXTURE_TEST_TWO;

	public static void register() {
		//region concrete
		BLACK_REINFORCED_CONCRETE = registerBlockWithItem("black_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_STAIRS = registerStairBlock("black_reinforced_concrete_stairs", BLACK_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_WALL = registerWallBlock("black_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_SLAB = registerSlabBlock("black_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_TILE = registerBlockWithItem("black_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("black_reinforced_concrete_tile_stairs", BLACK_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("black_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		BLACK_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("black_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		BLUE_REINFORCED_CONCRETE = registerBlockWithItem("blue_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("blue_reinforced_concrete_stairs", BLUE_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_WALL = registerWallBlock("blue_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("blue_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_TILE = registerBlockWithItem("blue_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("blue_reinforced_concrete_tile_stairs", BLUE_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("blue_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		BLUE_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("blue_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		BROWN_REINFORCED_CONCRETE = registerBlockWithItem("brown_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_STAIRS = registerStairBlock("brown_reinforced_concrete_stairs", BROWN_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_WALL = registerWallBlock("brown_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_SLAB = registerSlabBlock("brown_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_TILE = registerBlockWithItem("brown_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("brown_reinforced_concrete_tile_stairs", BROWN_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("brown_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		BROWN_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("brown_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		GREEN_REINFORCED_CONCRETE = registerBlockWithItem("green_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_STAIRS = registerStairBlock("green_reinforced_concrete_stairs", GREEN_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_WALL = registerWallBlock("green_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_SLAB = registerSlabBlock("green_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_TILE = registerBlockWithItem("green_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("green_reinforced_concrete_tile_stairs", GREEN_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("green_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		GREEN_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("green_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		GRAY_REINFORCED_CONCRETE = registerBlockWithItem("gray_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_STAIRS = registerStairBlock("gray_reinforced_concrete_stairs", GRAY_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_WALL = registerWallBlock("gray_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_SLAB = registerSlabBlock("gray_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_TILE = registerBlockWithItem("gray_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("gray_reinforced_concrete_tile_stairs", GRAY_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("gray_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		GRAY_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("gray_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		PURPLE_REINFORCED_CONCRETE = registerBlockWithItem("purple_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("purple_reinforced_concrete_stairs", PURPLE_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_WALL = registerWallBlock("purple_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("purple_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_TILE = registerBlockWithItem("purple_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("purple_reinforced_concrete_tile_stairs", PURPLE_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("purple_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		PURPLE_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("purple_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		PINK_REINFORCED_CONCRETE = registerBlockWithItem("pink_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_STAIRS = registerStairBlock("pink_reinforced_concrete_stairs", PINK_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_WALL = registerWallBlock("pink_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_SLAB = registerSlabBlock("pink_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_TILE = registerBlockWithItem("pink_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("pink_reinforced_concrete_tile_stairs", PINK_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("pink_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		PINK_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("pink_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		RED_REINFORCED_CONCRETE = registerBlockWithItem("red_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_STAIRS = registerStairBlock("red_reinforced_concrete_stairs", RED_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_WALL = registerWallBlock("red_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_SLAB = registerSlabBlock("red_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_TILE = registerBlockWithItem("red_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("red_reinforced_concrete_tile_stairs", RED_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("red_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		RED_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("red_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);

		WHITE_REINFORCED_CONCRETE = registerBlockWithItem("white_reinforced_concrete", REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_STAIRS = registerStairBlock("white_reinforced_concrete_stairs", WHITE_REINFORCED_CONCRETE, REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_WALL = registerWallBlock("white_reinforced_concrete_wall", REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_SLAB = registerSlabBlock("white_reinforced_concrete_slab", REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_TILE = registerBlockWithItem("white_reinforced_concrete_tile", REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_TILE_STAIRS = registerStairBlock("white_reinforced_concrete_tile_stairs", WHITE_REINFORCED_CONCRETE_TILE, REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_TILE_WALL = registerWallBlock("white_reinforced_concrete_tile_wall", REINFORCED_CONCRETE_PROPERTIES);
		WHITE_REINFORCED_CONCRETE_TILE_SLAB = registerSlabBlock("white_reinforced_concrete_tile_slab", REINFORCED_CONCRETE_PROPERTIES);
		//endregion

		//region sanded
		SANDED_ANDESITE = registerBlockWithItem("sanded_andesite", BlockBehaviour.Properties.copy(Blocks.ANDESITE));
		SANDED_ANDESITE_STAIRS = registerStairBlock("sanded_andesite_stairs", SANDED_ANDESITE, BlockBehaviour.Properties.copy(Blocks.ANDESITE));
		SANDED_ANDESITE_WALL = registerWallBlock("sanded_andesite_wall", BlockBehaviour.Properties.copy(Blocks.ANDESITE));
		SANDED_ANDESITE_SLAB = registerSlabBlock("sanded_andesite_slab", BlockBehaviour.Properties.copy(Blocks.ANDESITE));

		SANDED_DARK_PRISMARINE = registerBlockWithItem("sanded_dark_prismarine", DARK_PRISMARINE_PROPERTIES);
		SANDED_DARK_PRISMARINE_STAIRS = registerStairBlock("sanded_dark_prismarine_stairs", SANDED_DARK_PRISMARINE, DARK_PRISMARINE_PROPERTIES);
		SANDED_DARK_PRISMARINE_WALL = registerWallBlock("sanded_dark_prismarine_wall", DARK_PRISMARINE_PROPERTIES);
		SANDED_DARK_PRISMARINE_SLAB = registerSlabBlock("sanded_dark_prismarine_slab", DARK_PRISMARINE_PROPERTIES);

		SANDED_GRANITE = registerBlockWithItem("sanded_granite", BlockBehaviour.Properties.copy(Blocks.GRANITE));
		SANDED_GRANITE_STAIRS = registerStairBlock("sanded_granite_stairs", SANDED_GRANITE, BlockBehaviour.Properties.copy(Blocks.GRANITE));
		SANDED_GRANITE_WALL = registerWallBlock("sanded_granite_wall", BlockBehaviour.Properties.copy(Blocks.GRANITE));
		SANDED_GRANITE_SLAB = registerSlabBlock("sanded_granite_slab", BlockBehaviour.Properties.copy(Blocks.GRANITE));

		SANDED_DEEPSLATE = registerBlockWithItem("sanded_deepslate", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE));
		SANDED_DEEPSLATE_STAIRS = registerStairBlock("sanded_deepslate_stairs", SANDED_DEEPSLATE, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE));
		SANDED_DEEPSLATE_WALL = registerWallBlock("sanded_deepslate_wall", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE));
		SANDED_DEEPSLATE_SLAB = registerSlabBlock("sanded_deepslate_slab", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE));

		SANDED_BASALT = registerBlockWithItem("sanded_basalt", BASALT_PROPERTIES);
		SANDED_BASALT_STAIRS = registerStairBlock("sanded_basalt_stairs", SANDED_BASALT, BASALT_PROPERTIES);
		SANDED_BASALT_WALL = registerWallBlock("sanded_basalt_wall", BASALT_PROPERTIES);
		SANDED_BASALT_SLAB = registerSlabBlock("sanded_basalt_slab", BASALT_PROPERTIES);

		SANDED_NETHERRACK = registerBlockWithItem("sanded_netherrack", BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
		SANDED_NETHERRACK_STAIRS = registerStairBlock("sanded_netherrack_stairs", SANDED_NETHERRACK, BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
		SANDED_NETHERRACK_WALL = registerWallBlock("sanded_netherrack_wall", BlockBehaviour.Properties.copy(Blocks.NETHERRACK));
		SANDED_NETHERRACK_SLAB = registerSlabBlock("sanded_netherrack_slab", BlockBehaviour.Properties.copy(Blocks.NETHERRACK));

		SANDED_NETHERBRICKS = registerBlockWithItem("sanded_netherbricks", BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS));
		SANDED_NETHERBRICKS_STAIRS = registerStairBlock("sanded_netherbricks_stairs", SANDED_NETHERBRICKS, BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS));
		SANDED_NETHERBRICKS_WALL = registerWallBlock("sanded_netherbricks_wall", BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS));
		SANDED_NETHERBRICKS_SLAB = registerSlabBlock("sanded_netherbricks_slab", BlockBehaviour.Properties.copy(Blocks.NETHER_BRICKS));

		SANDED_PACKED_MUD = registerBlockWithItem("sanded_packed_mud", BlockBehaviour.Properties.copy(Blocks.PACKED_MUD));
		SANDED_PACKED_MUD_STAIRS = registerStairBlock("sanded_packed_mud_stairs", SANDED_PACKED_MUD, BlockBehaviour.Properties.copy(Blocks.PACKED_MUD));
		SANDED_PACKED_MUD_WALL = registerWallBlock("sanded_packed_mud_wall", BlockBehaviour.Properties.copy(Blocks.PACKED_MUD));
		SANDED_PACKED_MUD_SLAB = registerSlabBlock("sanded_packed_mud_slab", BlockBehaviour.Properties.copy(Blocks.PACKED_MUD));

		SANDED_CALCITE = registerBlockWithItem("sanded_calcite", BlockBehaviour.Properties.copy(Blocks.CALCITE));
		SANDED_CALCITE_STAIRS = registerStairBlock("sanded_calcite_stairs", SANDED_CALCITE, BlockBehaviour.Properties.copy(Blocks.CALCITE));
		SANDED_CALCITE_WALL = registerWallBlock("sanded_calcite_wall", BlockBehaviour.Properties.copy(Blocks.CALCITE));
		SANDED_CALCITE_SLAB = registerSlabBlock("sanded_calcite_slab", BlockBehaviour.Properties.copy(Blocks.CALCITE));

		SANDED_STONE = registerBlockWithItem("sanded_stone", GENERIC_PROPERTIES);
		SANDED_STONE_STAIRS = registerStairBlock("sanded_stone_stairs", SANDED_STONE, GENERIC_PROPERTIES);
		SANDED_STONE_WALL = registerWallBlock("sanded_stone_wall", GENERIC_PROPERTIES);
		SANDED_STONE_SLAB = registerSlabBlock("sanded_stone_slab", GENERIC_PROPERTIES);

		SANDED_BLACKSTONE = registerBlockWithItem("sanded_blackstone", BlockBehaviour.Properties.copy(Blocks.BLACKSTONE));
		SANDED_BLACKSTONE_STAIRS = registerStairBlock("sanded_blackstone_stairs", SANDED_BLACKSTONE, BlockBehaviour.Properties.copy(Blocks.BLACKSTONE));
		SANDED_BLACKSTONE_WALL = registerWallBlock("sanded_blackstone_wall", BlockBehaviour.Properties.copy(Blocks.BLACKSTONE));
		SANDED_BLACKSTONE_SLAB = registerSlabBlock("sanded_blackstone_slab", BlockBehaviour.Properties.copy(Blocks.BLACKSTONE));

		SANDED_END_STONE = registerBlockWithItem("sanded_end_stone", BlockBehaviour.Properties.copy(Blocks.END_STONE));
		SANDED_END_STONE_STAIRS = registerStairBlock("sanded_end_stone_stairs", SANDED_END_STONE, BlockBehaviour.Properties.copy(Blocks.END_STONE));
		SANDED_END_STONE_WALL = registerWallBlock("sanded_end_stone_wall", BlockBehaviour.Properties.copy(Blocks.END_STONE));
		SANDED_END_STONE_SLAB = registerSlabBlock("sanded_end_stone_slab", BlockBehaviour.Properties.copy(Blocks.END_STONE));

		SANDED_DRIPSTONE = registerBlockWithItem("sanded_dripstone", BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK));
		SANDED_DRIPSTONE_STAIRS = registerStairBlock("sanded_dripstone_stairs", SANDED_DRIPSTONE, BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK));
		SANDED_DRIPSTONE_WALL = registerWallBlock("sanded_dripstone_wall", BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK));
		SANDED_DRIPSTONE_SLAB = registerSlabBlock("sanded_dripstone_slab", BlockBehaviour.Properties.copy(Blocks.DRIPSTONE_BLOCK));

		SANDED_TUFF = registerBlockWithItem("sanded_tuff", BlockBehaviour.Properties.copy(Blocks.TUFF));
		SANDED_TUFF_STAIRS = registerStairBlock("sanded_tuff_stairs", SANDED_TUFF, BlockBehaviour.Properties.copy(Blocks.TUFF));
		SANDED_TUFF_WALL = registerWallBlock("sanded_tuff_wall", BlockBehaviour.Properties.copy(Blocks.TUFF));
		SANDED_TUFF_SLAB = registerSlabBlock("sanded_tuff_slab", BlockBehaviour.Properties.copy(Blocks.TUFF));
		//endregion

		//region misc
		MOSSY_COBBLED_DEEPLSATE = registerBlockWithItem("mossy_cobbled_deepslate", BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE));
		MOSSY_COBBLED_DEEPLSATE_STAIRS = registerStairBlock("mossy_cobbled_deepslate_stairs", MOSSY_COBBLED_DEEPLSATE, BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE));
		MOSSY_COBBLED_DEEPLSATE_WALL = registerWallBlock("mossy_cobbled_deepslate_wall", BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE));
		MOSSY_COBBLED_DEEPLSATE_SLAB = registerSlabBlock("mossy_cobbled_deepslate_slab", BlockBehaviour.Properties.copy(Blocks.COBBLED_DEEPSLATE));

		MOSSY_DEEPLSATE_BRICKS = registerBlockWithItem("mossy_deepslate_bricks", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS));
		MOSSY_DEEPLSATE_BRICK_STAIRS = registerStairBlock("mossy_deepslate_brick_stairs", MOSSY_DEEPLSATE_BRICKS, BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS));
		MOSSY_DEEPLSATE_BRICK_WALL = registerWallBlock("mossy_deepslate_brick_wall", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS));
		MOSSY_DEEPLSATE_BRICK_SLAB = registerSlabBlock("mossy_deepslate_brick_slab", BlockBehaviour.Properties.copy(Blocks.DEEPSLATE_BRICKS));

		DARK_PRISMARINE_BRICKS = registerBlockWithItem("dark_prismarine_bricks", DARK_PRISMARINE_PROPERTIES);
		DARK_PRISMARINE_BRICK_STAIRS = registerStairBlock("dark_prismarine_brick_stairs", DARK_PRISMARINE_BRICKS, DARK_PRISMARINE_PROPERTIES);
		DARK_PRISMARINE_BRICK_WALL = registerWallBlock("dark_prismarine_brick_wall", DARK_PRISMARINE_PROPERTIES);
		DARK_PRISMARINE_BRICK_SLAB = registerSlabBlock("dark_prismarine_brick_slab", DARK_PRISMARINE_PROPERTIES);

		BASALT_BRICKS = registerBlockWithItem("basalt_bricks", BASALT_PROPERTIES);
		BASALT_BRICK_STAIRS = registerStairBlock("basalt_brick_stairs", BASALT_BRICKS, BASALT_PROPERTIES);
		BASALT_BRICK_WALL = registerWallBlock("basalt_brick_wall", BASALT_PROPERTIES);
		BASALT_BRICK_SLAB = registerSlabBlock("basalt_brick_slab", BASALT_PROPERTIES);

		ASPHALT = registerBlockWithItem("asphalt", () -> new Block(ASPHALT_PROPERTIES));
		ASPHALT_STAIRS = registerStairBlock("asphalt_stairs", ASPHALT, ASPHALT_PROPERTIES);
		ASPHALT_SLAB = registerSlabBlock("asphalt_slab", ASPHALT_PROPERTIES);

		RED_ASPHALT = registerBlockWithItem("red_asphalt", () -> new Block(ASPHALT_PROPERTIES));
		RED_ASPHALT_STAIRS = registerStairBlock("red_asphalt_stairs", ASPHALT, ASPHALT_PROPERTIES);
		RED_ASPHALT_SLAB = registerSlabBlock("red_asphalt_slab", ASPHALT_PROPERTIES);

		GREEN_ASPHALT = registerBlockWithItem("green_asphalt", () -> new Block(ASPHALT_PROPERTIES));
		GREEN_ASPHALT_STAIRS = registerStairBlock("green_asphalt_stairs", ASPHALT, ASPHALT_PROPERTIES);
		GREEN_ASPHALT_SLAB = registerSlabBlock("green_asphalt_slab", ASPHALT_PROPERTIES);

		BLUE_ASPHALT = registerBlockWithItem("blue_asphalt", () -> new Block(ASPHALT_PROPERTIES));
		BLUE_ASPHALT_STAIRS = registerStairBlock("blue_asphalt_stairs", ASPHALT, ASPHALT_PROPERTIES);
		BLUE_ASPHALT_SLAB = registerSlabBlock("blue_asphalt_slab", ASPHALT_PROPERTIES);

		MARBLE = registerBlockWithItem("marble", () -> new Block(GENERIC_PROPERTIES));
		MARBLE_STAIRS = registerStairBlock("marble_stairs", MARBLE, GENERIC_PROPERTIES);
		MARBLE_SLAB = registerSlabBlock("marble_slab", GENERIC_PROPERTIES);
		MARBLE_WALL = registerWallBlock("marble_wall", GENERIC_PROPERTIES);

		POLISHED_MARBLE = registerBlockWithItem("polished_marble", () -> new Block(GENERIC_PROPERTIES));
		POLISHED_MARBLE_STAIRS = registerStairBlock("polished_marble_stairs", POLISHED_MARBLE, GENERIC_PROPERTIES);
		POLISHED_MARBLE_SLAB = registerSlabBlock("polished_marble_slab", GENERIC_PROPERTIES);
		POLISHED_MARBLE_WALL = registerWallBlock("polished_marble_wall", GENERIC_PROPERTIES);

		MARBLE_PILLAR = registerBlockWithItem("marble_pillar", () -> new RotatedPillarBlock(GENERIC_PROPERTIES));

		CAUTION_STRIPES = registerBlockWithItem("caution_stripes", () -> new Block(GENERIC_PROPERTIES));
		//endregion

		//region graphite
		GRAPHITE = registerBlockWithItem("graphite", () -> new Block(GENERIC_PROPERTIES));
		GRAPHITE_STAIRS = registerStairBlock("graphite_stairs", POLISHED_MARBLE, GENERIC_PROPERTIES);
		GRAPHITE_SLAB = registerSlabBlock("graphite_slab", GENERIC_PROPERTIES);
		GRAPHITE_WALL = registerWallBlock("graphite_wall", GENERIC_PROPERTIES);
		GRAPHITE_TILE = registerBlockWithItem("graphite_tile", () -> new Block(GENERIC_PROPERTIES));
		GRAPHITE_TILE_STAIRS = registerStairBlock("graphite_tile_stairs", POLISHED_MARBLE, GENERIC_PROPERTIES);
		GRAPHITE_TILE_SLAB = registerSlabBlock("graphite_tile_slab", GENERIC_PROPERTIES);
		GRAPHITE_TILE_WALL = registerWallBlock("graphite_tile_wall", GENERIC_PROPERTIES);
		GRAPHITE_PILLAR = registerBlockWithItem("graphite_pillar", () -> new RotatedPillarBlock(GENERIC_PROPERTIES));
		CUT_GRAPHITE = registerBlockWithItem("cut_graphite", () -> new Block(GENERIC_PROPERTIES));
		CUT_GRAPHITE_STAIRS = registerStairBlock("cut_graphite_stairs", POLISHED_MARBLE, GENERIC_PROPERTIES);
		CUT_GRAPHITE_SLAB = registerSlabBlock("cut_graphite_slab", GENERIC_PROPERTIES);
		CUT_GRAPHITE_WALL = registerWallBlock("cut_graphite_wall", GENERIC_PROPERTIES);
		//endregion

		//region steel
		STEEL_BLOCK = registerBlockWithItem("steel_block", METAL_PROPERTIES);
		STEEL_STAIRS = registerStairBlock("steel_stairs", STEEL_BLOCK, METAL_PROPERTIES);
		STEEL_WALL = registerWallBlock("steel_wall", METAL_PROPERTIES);
		STEEL_SLAB = registerSlabBlock("steel_slab", METAL_PROPERTIES);

		STEEL_TILE = registerBlockWithItem("steel_tile", METAL_PROPERTIES);
		STEEL_TILE_STAIRS = registerStairBlock("steel_tile_stairs", STEEL_TILE, METAL_PROPERTIES);
		STEEL_TILE_WALL = registerWallBlock("steel_tile_wall", METAL_PROPERTIES);
		STEEL_TILE_SLAB = registerSlabBlock("steel_tile_slab", METAL_PROPERTIES);

		STEEL_PILLAR = registerBlockWithItem("steel_pillar", () -> new RotatedPillarBlock(METAL_PROPERTIES));
		STEEL_TRAPDOOR = registerBlockWithItem("steel_trapdoor", () -> new TrapDoorBlock(METAL_PROPERTIES, BlockSetTypeRegistry.STEEL));

		CUT_STEEL = registerBlockWithItem("cut_steel", () -> new Block(METAL_PROPERTIES));
		CUT_STEEL_STAIRS = registerStairBlock("cut_steel_stairs", CUT_STEEL, METAL_PROPERTIES);
		CUT_STEEL_WALL = registerWallBlock("cut_steel_wall", METAL_PROPERTIES);
		CUT_STEEL_SLAB = registerSlabBlock("cut_steel_slab", METAL_PROPERTIES);

		STEEL_SIDING = registerBlockWithItem("steel_siding", METAL_PROPERTIES);
		STEEL_SIDING_STAIRS = registerStairBlock("steel_siding_stairs", STEEL_SIDING, METAL_PROPERTIES);
		STEEL_SIDING_WALL = registerWallBlock("steel_siding_wall", METAL_PROPERTIES);
		STEEL_SIDING_SLAB = registerSlabBlock("steel_siding_slab", METAL_PROPERTIES);

		STEEL_CATWALK = registerBlockWithItem("steel_catwalk", () -> new CatwalkBlock(METAL_PROPERTIES.noOcclusion()));
		STEEL_CATWALK_STEP = registerBlockWithItem("steel_catwalk_step", () -> new CatwalkStepBlock(METAL_PROPERTIES.noOcclusion()));
		STEEL_CATWALK_RAIL = registerBlockWithoutItem("steel_catwalk_rail", () -> new CatwalkRailingBlock(METAL_PROPERTIES.noOcclusion()));
		//endregion

		TEXTURE_TEST_ONE = registerBlockWithItem("texture_test_one", () -> new Block(GENERIC_PROPERTIES));
		TEXTURE_TEST_TWO = registerBlockWithItem("texture_test_two", () -> new Block(GENERIC_PROPERTIES));

		for(DyeColor color : DyeColor.values()) {
			registerGlassBlock(color + "_structural_glass", color);
			registerStainedGlassPaneBlock(color + "_structural_glass_pane", color);
			//registerLampBlock(color + "_lamp");
		}
	}

	private static RegistryObject<Block> registerBlockWithItem(final String name, Block.Properties properties) {
		return registerBlockWithItem(name, () -> new Block(properties));
	}

	private static RegistryObject<StairBlock> registerStairBlock(final String name, Supplier<Block> source, Block.Properties properties) {
		return registerBlockWithItem(name, () -> new StairBlock(() -> source.get().defaultBlockState(), properties));
	}

	private static RegistryObject<WallBlock> registerWallBlock(final String name, Block.Properties properties) {
		return registerBlockWithItem(name, () -> new WallBlock(properties));
	}

	private static RegistryObject<SlabBlock> registerSlabBlock(final String name, Block.Properties properties) {
		return registerBlockWithItem(name, () -> new SlabBlock(properties));
	}

	private static RegistryObject<StainedGlassBlock> registerGlassBlock(final String name, DyeColor color) {
		return registerBlockWithItem(name, () -> new StainedGlassBlock(color, GLASS_PROPERTIES));
	}

	private static RegistryObject<Block> registerLampBlock(final String name) {
		return registerBlockWithItem(name, () -> new Block(BlockBehaviour.Properties.of().lightLevel((i) -> 15)));
	}

	private static RegistryObject<Block> registerStainedGlassPaneBlock(final String name, DyeColor color) {
		return registerBlockWithItem(name, () -> new StainedGlassPaneBlock(color, GLASS_PANE_PROPERTIES));
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlockWithItem(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		ItemRegistry.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
		return block;
	}

	private static <BLOCK extends Block> RegistryObject<BLOCK> registerBlockWithoutItem(final String name, final Supplier<BLOCK> blockFactory) {
		final RegistryObject<BLOCK> block = BLOCKS.register(name, blockFactory);
		return block;
	}
}
