package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.registry.BlockRegistry;
import andronomos.androbuildingblocks.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.Objects;
import java.util.function.Consumer;

import static andronomos.androbuildingblocks.AndroBuildingBlocks.MODID;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder sandpaperRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SANDPAPER.get(), 1);
		sandpaperRecipe.requires(Items.SAND);
		sandpaperRecipe.requires(Items.PAPER);
		sandpaperRecipe.unlockedBy("has_item", has(Items.PAPER));
		sandpaperRecipe.save(consumer, "sandpaper");

		buildReinforcedConcrete(BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), "black", consumer);
		buildReinforcedConcrete(BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), "blue", consumer);
		buildReinforcedConcrete(BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), "brown", consumer);
		buildReinforcedConcrete(BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), "green", consumer);
		buildReinforcedConcrete(BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), "gray", consumer);
		buildReinforcedConcrete(BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), "purple", consumer);
		buildReinforcedConcrete(BlockRegistry.RED_REINFORCED_CONCRETE.get(), "red", consumer);
		buildReinforcedConcrete(BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), "white", consumer);

		buildSanded(BlockRegistry.SANDED_ANDESITE.get(), Blocks.ANDESITE, consumer);
		buildVariants(BlockRegistry.SANDED_ANDESITE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_GRANITE.get(), Blocks.GRANITE, consumer);
		buildVariants(BlockRegistry.SANDED_GRANITE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_DARK_PRISMARINE.get(), Blocks.DARK_PRISMARINE, consumer);
		buildVariants(BlockRegistry.SANDED_DARK_PRISMARINE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_BASALT.get(), Blocks.BASALT, consumer);
		buildVariants(BlockRegistry.SANDED_BASALT.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_NETHERRACK.get(), Blocks.NETHERRACK, consumer);
		buildVariants(BlockRegistry.SANDED_NETHERRACK.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_NETHERBRICKS.get(), Blocks.NETHER_BRICKS, consumer);
		buildVariants(BlockRegistry.SANDED_NETHERBRICKS.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_PACKED_MUD.get(), Blocks.PACKED_MUD, consumer);
		buildVariants(BlockRegistry.SANDED_PACKED_MUD.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_CALCITE.get(), Blocks.CALCITE, consumer);
		buildVariants(BlockRegistry.SANDED_CALCITE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_STONE.get(), Blocks.STONE, consumer);
		buildVariants(BlockRegistry.SANDED_STONE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_BLACKSTONE.get(), Blocks.BLACKSTONE, consumer);
		buildVariants(BlockRegistry.SANDED_BLACKSTONE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_END_STONE.get(), Blocks.END_STONE, consumer);
		buildVariants(BlockRegistry.SANDED_END_STONE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_DRIPSTONE.get(), Blocks.DRIPSTONE_BLOCK, consumer);
		buildVariants(BlockRegistry.SANDED_DRIPSTONE.get(), true, true, true, consumer);
		buildSanded(BlockRegistry.SANDED_TUFF.get(), Blocks.TUFF, consumer);
		buildVariants(BlockRegistry.SANDED_TUFF.get(), true, true, true, consumer);

		ShapelessRecipeBuilder sandedDeepslate = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_DEEPSLATE.get(), 1);
		sandedDeepslate.requires(ItemRegistry.SANDPAPER.get());
		sandedDeepslate.requires(Items.DEEPSLATE);
		sandedDeepslate.group("sanded_deepslate");
		sandedDeepslate.unlockedBy("has_item", has(Items.DEEPSLATE));
		sandedDeepslate.save(consumer, "sanded_deepslate");

		ShapelessRecipeBuilder sandedDeepslateFromCobbled = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_DEEPSLATE.get(), 1);
		sandedDeepslateFromCobbled.requires(ItemRegistry.SANDPAPER.get());
		sandedDeepslateFromCobbled.requires(Items.COBBLED_DEEPSLATE);
		sandedDeepslateFromCobbled.group("sanded_deepslate");
		sandedDeepslateFromCobbled.unlockedBy("has_item", has(Items.COBBLED_DEEPSLATE));
		sandedDeepslateFromCobbled.save(consumer, "sanded_deepslate_from_cobbled");
		
		ShapelessRecipeBuilder mossyCobbledDeepslate = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), 1);
		mossyCobbledDeepslate.group("mossy_cobbled_deepslate");
		mossyCobbledDeepslate.requires(Items.COBBLED_DEEPSLATE);
		mossyCobbledDeepslate.requires(Items.MOSS_BLOCK);
		mossyCobbledDeepslate.unlockedBy("has_item", has(Items.MOSS_BLOCK));
		mossyCobbledDeepslate.save(consumer);

		ShapelessRecipeBuilder mossyCobbledDeepslateFromVines = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), 1);
		mossyCobbledDeepslateFromVines.group("mossy_cobbled_deepslate");
		mossyCobbledDeepslateFromVines.requires(Items.COBBLED_DEEPSLATE);
		mossyCobbledDeepslateFromVines.requires(Items.VINE);
		mossyCobbledDeepslateFromVines.unlockedBy("has_item", has(Items.VINE));
		mossyCobbledDeepslateFromVines.save(consumer, "mossy_cobbled_deepslate_from_vines");

		ShapelessRecipeBuilder mossyDeepslateBricks = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), 1);
		mossyDeepslateBricks.group("mossy_deepslate_bricks");
		mossyDeepslateBricks.requires(Items.DEEPSLATE_BRICKS);
		mossyDeepslateBricks.requires(Items.MOSS_BLOCK);
		mossyDeepslateBricks.unlockedBy("has_item", has(Items.MOSS_BLOCK));
		mossyDeepslateBricks.save(consumer);

		ShapelessRecipeBuilder mossyDeepslateBricksFromVines = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), 1);
		mossyDeepslateBricksFromVines.group("mossy_deepslate_bricks");
		mossyDeepslateBricksFromVines.requires(Items.DEEPSLATE_BRICKS);
		mossyDeepslateBricksFromVines.requires(Items.VINE);
		mossyDeepslateBricksFromVines.unlockedBy("has_item", has(Items.VINE));
		mossyDeepslateBricksFromVines.save(consumer, "mossy_deepslate_bricks_from_vines");

		buildVariants(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), true, true, true, consumer);
		buildVariants(BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), true, true, true, consumer);

		buildTwoByTwo(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, consumer);
		buildStoneCutter(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, 1, consumer);
		buildVariants(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), true, true, true, consumer);

		buildSmelting(Blocks.STONE, BlockRegistry.CHARRED_STONE.get(), consumer);
		buildVariants(BlockRegistry.CHARRED_STONE.get(),true, true, true, consumer);

		ShapedRecipeBuilder silt = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SILT.get(), 4);
		silt.define('S', Items.CLAY);
		silt.define('C', Items.SAND);
		silt.pattern("SCS");
		silt.pattern("CSC");
		silt.pattern("SCS");
		silt.unlockedBy("has_item", has(BlockRegistry.SILT.get()));
		silt.save(consumer);

		buildVariants(BlockRegistry.SILT.get(), true, true, true, consumer);
	}

	private void buildReinforcedConcrete(Block concreteBlock, String color, Consumer<FinishedRecipe> consumer) {
		Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color + "_dye"));
		String name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(concreteBlock)).getPath();

		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, concreteBlock, 8);
		shaped.define('1', Tags.Items.STONE);
		shaped.define('2', Tags.Items.INGOTS_IRON);
		shaped.define('3', Items.GRAVEL);
		shaped.define('4', Objects.requireNonNull(dye));
		shaped.pattern("212");
		shaped.pattern("343");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Tags.Items.STONE));
		shaped.save(consumer);

		buildVariants(concreteBlock, true, true, true, consumer);

		Block tileBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_tile", name)));

		if (blockExists(tileBlock)) {
			ShapedRecipeBuilder tile = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, tileBlock, 8);
			tile.define('1', concreteBlock);
			tile.pattern("11");
			tile.pattern("11");
			tile.unlockedBy("has_item", has(concreteBlock));
			tile.save(consumer, name + "_tile");

			buildVariants(tileBlock, true, true, true, consumer);
		}
	}

	private void buildSanded(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder sandedRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, 1);
		sandedRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedRecipe.requires(input);
		sandedRecipe.unlockedBy("has_item", has(input));
		sandedRecipe.save(consumer);
	}

	private void buildVariants(Block source, boolean stairs, boolean slab, boolean wall, Consumer<FinishedRecipe> consumer) {
		String name = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(source)).getPath();

		Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", name)));
		Block slabBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", name)));
		Block wallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", name)));

		if(stairs && blockExists(stairBlock)) {
			buildStair(stairBlock, source, consumer);
			buildStoneCutter(stairBlock, source, 1, consumer);
		}

		if(slab && blockExists(slabBlock)) {
			buildThreeByOne(slabBlock, source, consumer);
			buildStoneCutter(slabBlock, source, 2, consumer);
		}

		if(wall && blockExists(wallBlock)) {
			buildStoneCutter(wallBlock, source, 1, consumer);
			buildThreeByTwo(wallBlock, source, consumer);
		}
	}

	private void buildStair(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildStoneCutter(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(output)).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void buildTwoByTwo(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildThreeByOne(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildThreeByTwo(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildSmelting(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private boolean blockExists(Block block) {
		return block != null && block != Blocks.AIR;
	}
}
