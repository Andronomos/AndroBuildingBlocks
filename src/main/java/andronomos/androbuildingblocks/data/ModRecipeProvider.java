package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.registry.BlockRegistry;
import andronomos.androbuildingblocks.registry.ItemRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.DyeColor;
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
	protected void buildRecipes(@NotNull Consumer<FinishedRecipe> recipeConsumer) {
		buildReinforcedConcreteRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), "black", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), "blue", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), "brown", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), "green", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), "gray", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), "purple", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.RED_REINFORCED_CONCRETE.get(), "red", recipeConsumer);
		buildReinforcedConcreteRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), "white", recipeConsumer);

		for(DyeColor color : DyeColor.values()) {
			Block glassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, color + "_structural_glass"));
			buildStructuralGlassRecipes(glassBlock, color.getName(), recipeConsumer);
		}

		buildSteelRecipes(recipeConsumer);
		buildGraphiteRecipes(recipeConsumer);

		buildStripedRecipe(BlockRegistry.YELLOW_CAUTION_STRIPES.get(), Items.YELLOW_DYE, Items.BLACK_DYE, recipeConsumer);
		buildVariantRecipes(BlockRegistry.YELLOW_CAUTION_STRIPES.get(),false, true, true, recipeConsumer);
		buildStripedRecipe(BlockRegistry.RED_CAUTION_STRIPES.get(), Items.RED_DYE, Items.WHITE_DYE, recipeConsumer);
		buildVariantRecipes(BlockRegistry.RED_CAUTION_STRIPES.get(),false, true, true, recipeConsumer);

		buildSmeltingRecipe(Blocks.STONE, BlockRegistry.CHARRED_STONE.get(), recipeConsumer);
		buildVariantRecipes(BlockRegistry.CHARRED_STONE.get(),true, true, true, recipeConsumer);

		ShapedRecipeBuilder shaleRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SHALE.get(), 4);
		shaleRecipe.define('M', Blocks.MUD);
		shaleRecipe.define('C', Blocks.CALCITE);
		shaleRecipe.pattern("MCM");
		shaleRecipe.pattern("CMC");
		shaleRecipe.pattern("MCM");
		shaleRecipe.unlockedBy("has_item", has(Blocks.MUD));
		shaleRecipe.save(recipeConsumer);
		buildVariantRecipes(BlockRegistry.SHALE.get(),true, true, true, recipeConsumer);

		ShapelessRecipeBuilder mossyCobbledDeepslate = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), 1);
		mossyCobbledDeepslate.group("mossy_cobbled_deepslate");
		mossyCobbledDeepslate.requires(Items.COBBLED_DEEPSLATE);
		mossyCobbledDeepslate.requires(Items.MOSS_BLOCK);
		mossyCobbledDeepslate.unlockedBy("has_item", has(Items.MOSS_BLOCK));
		mossyCobbledDeepslate.save(recipeConsumer);

		ShapelessRecipeBuilder mossyCobbledDeepslateFromVines = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), 1);
		mossyCobbledDeepslateFromVines.group("mossy_cobbled_deepslate");
		mossyCobbledDeepslateFromVines.requires(Items.COBBLED_DEEPSLATE);
		mossyCobbledDeepslateFromVines.requires(Items.VINE);
		mossyCobbledDeepslateFromVines.unlockedBy("has_item", has(Items.VINE));
		mossyCobbledDeepslateFromVines.save(recipeConsumer, "mossy_cobbled_deepslate_from_vines");

		ShapelessRecipeBuilder mossyDeepslateBricks = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), 1);
		mossyDeepslateBricks.group("mossy_deepslate_bricks");
		mossyDeepslateBricks.requires(Items.DEEPSLATE_BRICKS);
		mossyDeepslateBricks.requires(Items.MOSS_BLOCK);
		mossyDeepslateBricks.unlockedBy("has_item", has(Items.MOSS_BLOCK));
		mossyDeepslateBricks.save(recipeConsumer);

		ShapelessRecipeBuilder mossyDeepslateBricksFromVines = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), 1);
		mossyDeepslateBricksFromVines.group("mossy_deepslate_bricks");
		mossyDeepslateBricksFromVines.requires(Items.DEEPSLATE_BRICKS);
		mossyDeepslateBricksFromVines.requires(Items.VINE);
		mossyDeepslateBricksFromVines.unlockedBy("has_item", has(Items.VINE));
		mossyDeepslateBricksFromVines.save(recipeConsumer, "mossy_deepslate_bricks_from_vines");

		buildVariantRecipes(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), true, true, true, recipeConsumer);

		buildTwoByTwoRecipe(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, 1, recipeConsumer);
		buildVariantRecipes(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), true, true, true, recipeConsumer);

		buildTwoByTwoRecipe(BlockRegistry.BASALT_BRICKS.get(), Blocks.SMOOTH_BASALT, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.BASALT_BRICKS.get(), Blocks.SMOOTH_BASALT, 1, recipeConsumer);
		buildVariantRecipes(BlockRegistry.BASALT_BRICKS.get(), true, true, true, recipeConsumer);

		ShapelessRecipeBuilder sandpaperRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SANDPAPER.get(), 1);
		sandpaperRecipe.requires(Items.SAND);
		sandpaperRecipe.requires(Items.PAPER);
		sandpaperRecipe.unlockedBy("has_item", has(Items.PAPER));
		sandpaperRecipe.save(recipeConsumer, "sandpaper");

		ShapelessRecipeBuilder sandedDeepslateRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_DEEPSLATE.get(), 1);
		sandedDeepslateRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedDeepslateRecipe.requires(Items.DEEPSLATE);
		sandedDeepslateRecipe.group("sanded_deepslate");
		sandedDeepslateRecipe.unlockedBy("has_item", has(Items.DEEPSLATE));
		sandedDeepslateRecipe.save(recipeConsumer, "sanded_deepslate");

		ShapelessRecipeBuilder sandedDeepslateFromCobbledRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_DEEPSLATE.get(), 1);
		sandedDeepslateFromCobbledRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedDeepslateFromCobbledRecipe.requires(Items.COBBLED_DEEPSLATE);
		sandedDeepslateFromCobbledRecipe.group("sanded_deepslate");
		sandedDeepslateFromCobbledRecipe.unlockedBy("has_item", has(Items.COBBLED_DEEPSLATE));
		sandedDeepslateFromCobbledRecipe.save(recipeConsumer, "sanded_deepslate_from_cobbled");

		ShapelessRecipeBuilder sandedDeepslateBricksRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_DEEPSLATE_BRICKS.get(), 1);
		sandedDeepslateBricksRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedDeepslateBricksRecipe.requires(Items.DEEPSLATE_BRICKS);
		sandedDeepslateBricksRecipe.unlockedBy("has_item", has(Items.DEEPSLATE_BRICKS));
		sandedDeepslateBricksRecipe.save(recipeConsumer, "sanded_deepslate_bricks");

		ShapelessRecipeBuilder sandedDarkPrismarineBricksRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_DARK_PRISMARINE_BRICKS.get(), 1);
		sandedDarkPrismarineBricksRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedDarkPrismarineBricksRecipe.requires(BlockRegistry.DARK_PRISMARINE_BRICKS.get());
		sandedDarkPrismarineBricksRecipe.unlockedBy("has_item", has(BlockRegistry.DARK_PRISMARINE_BRICKS.get()));
		sandedDarkPrismarineBricksRecipe.save(recipeConsumer, "sanded_dark_prismarine_bricks");

		ShapelessRecipeBuilder sandedGraniteRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_GRANITE.get(), 1);
		sandedGraniteRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedGraniteRecipe.requires(Items.GRANITE);
		sandedGraniteRecipe.unlockedBy("has_item", has(Items.GRANITE));
		sandedGraniteRecipe.save(recipeConsumer, "sanded_granite");

		ShapelessRecipeBuilder sandedBasaltRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_BASALT.get(), 1);
		sandedBasaltRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedBasaltRecipe.requires(Items.BASALT);
		sandedBasaltRecipe.unlockedBy("has_item", has(Items.BASALT));
		sandedBasaltRecipe.save(recipeConsumer, "sanded_basalt");

		ShapelessRecipeBuilder sandedBasaltBricksRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_BASALT_BRICKS.get(), 1);
		sandedBasaltBricksRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedBasaltBricksRecipe.requires(BlockRegistry.SANDED_BASALT_BRICKS.get());
		sandedBasaltBricksRecipe.unlockedBy("has_item", has(BlockRegistry.SANDED_BASALT_BRICKS.get()));
		sandedBasaltBricksRecipe.save(recipeConsumer, "sanded_basalt_bricks");

		ShapelessRecipeBuilder sandedNetherrackRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.SANDED_NETHERRACK.get(), 1);
		sandedNetherrackRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedNetherrackRecipe.requires(Items.NETHERRACK);
		sandedNetherrackRecipe.unlockedBy("has_item", has(Items.NETHERRACK));
		sandedNetherrackRecipe.save(recipeConsumer, "sanded_netherrack");

		buildVariantRecipes(BlockRegistry.SANDED_GRANITE.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.SANDED_DEEPSLATE.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.SANDED_DEEPSLATE_BRICKS.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.SANDED_DARK_PRISMARINE_BRICKS.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.SANDED_BASALT.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.SANDED_BASALT_BRICKS.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.SANDED_NETHERRACK.get(), true, true, true, recipeConsumer);
	}

	private void buildReinforcedConcreteRecipe(Block block, String color, Consumer<FinishedRecipe> recipeConsumer) {
		Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color + "_dye"));
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 8);
		shaped.define('1', Tags.Items.STONE);
		shaped.define('2', Tags.Items.INGOTS_IRON);
		shaped.define('3', Items.GRAVEL);
		shaped.define('4', dye);
		shaped.pattern("212");
		shaped.pattern("343");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Tags.Items.STONE));
		shaped.save(recipeConsumer);

		buildVariantRecipes(block, true, true, true, recipeConsumer);
	}

	private void buildStructuralGlassRecipes(Block block, String color, Consumer<FinishedRecipe> recipeConsumer) {
		Block vanillaGlassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation("minecraft", color + "_stained_glass"));

		if(blockExists(vanillaGlassBlock)) {
			ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, block, 4);
			shaped.define('1', vanillaGlassBlock);
			shaped.define('2', Items.SLIME_BALL);
			shaped.pattern("212");
			shaped.pattern("121");
			shaped.pattern("212");
			shaped.unlockedBy("has_item", has(Items.SLIME_BALL));
			shaped.save(recipeConsumer);

			String name = ForgeRegistries.BLOCKS.getKey(block).getPath();
			Block glassPaneBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_pane", name)));

			if(blockExists(glassPaneBlock)) {
				buildThreeByTwoRecipe(glassPaneBlock, block, recipeConsumer);
			}
		}
	}

	private void buildSteelRecipes(Consumer<FinishedRecipe> recipeConsumer) {
		ShapedRecipeBuilder steelFromCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.STEEL.get(), 4);
		steelFromCoalRecipe.define('C', Items.COAL);
		steelFromCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		steelFromCoalRecipe.pattern("CIC");
		steelFromCoalRecipe.pattern("ICI");
		steelFromCoalRecipe.pattern("CIC");
		steelFromCoalRecipe.group("steel");
		steelFromCoalRecipe.unlockedBy("has_item", has(Items.COAL));
		steelFromCoalRecipe.save(recipeConsumer);

		ShapedRecipeBuilder steelFromCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.STEEL.get(), 4);
		steelFromCharcoalRecipe.define('C', Items.CHARCOAL);
		steelFromCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		steelFromCharcoalRecipe.pattern("CIC");
		steelFromCharcoalRecipe.pattern("ICI");
		steelFromCharcoalRecipe.pattern("CIC");
		steelFromCharcoalRecipe.group("steel");
		steelFromCharcoalRecipe.unlockedBy("has_item", has(Items.CHARCOAL));
		steelFromCharcoalRecipe.save(recipeConsumer, "steel_from_charcoal");

		buildTwoByTwoRecipe(BlockRegistry.STEEL_TILE.get(), BlockRegistry.STEEL.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.STEEL_TILE.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);

		buildVariantRecipes(BlockRegistry.STEEL.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.STEEL_TILE.get(), true, true, true, recipeConsumer);
	}
	
	private void buildGraphiteRecipes(Consumer<FinishedRecipe> recipeConsumer) {
		buildSmeltingRecipe(Blocks.COAL_BLOCK, BlockRegistry.GRAPHITE.get(), recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.GRAPHITE_MESH.get(), BlockRegistry.GRAPHITE.get(), 1, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.GRAPHITE_TILE.get(), BlockRegistry.GRAPHITE.get(), 1, recipeConsumer);
		buildStoneCutterRecipe(BlockRegistry.GRAPHITE_PILLAR.get(), BlockRegistry.GRAPHITE.get(), 1, recipeConsumer);
		buildTwoByTwoRecipe(BlockRegistry.GRAPHITE_TILE.get(), BlockRegistry.GRAPHITE.get(), recipeConsumer);
		buildVariantRecipes(BlockRegistry.GRAPHITE.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.GRAPHITE_MESH.get(), true, true, true, recipeConsumer);
		buildVariantRecipes(BlockRegistry.GRAPHITE_TILE.get(), true, true, true, recipeConsumer);
	}

	private void buildVariantRecipes(Block source, boolean stairs, boolean slab, boolean wall, Consumer<FinishedRecipe> recipeConsumer) {
		String name = ForgeRegistries.BLOCKS.getKey(source).getPath();

		Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", name)));
		Block slabBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", name)));
		Block wallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", name)));

		if(stairs && blockExists(stairBlock)) {
			buildStairRecipe(stairBlock, source, recipeConsumer);
			buildStoneCutterRecipe(stairBlock, source, 1, recipeConsumer);
		}

		if(slab && blockExists(slabBlock)) {
			buildThreeByOneRecipe(slabBlock, source, recipeConsumer);
			buildStoneCutterRecipe(slabBlock, source, 2, recipeConsumer);
		}

		if(wall && blockExists(wallBlock)) {
			buildStoneCutterRecipe(wallBlock, source, 1, recipeConsumer);
			buildThreeByTwoRecipe(wallBlock, source, recipeConsumer);
		}
	}

	private boolean blockExists(Block block) {
		return block != null && block != Blocks.AIR;
	}

	private void buildStripedRecipe(Block output, Item Dye, Item Dye2, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.DECORATIONS, output, 4);
		shaped.define('1', Dye);
		shaped.define('2', Dye2);
		shaped.define('3', Tags.Items.STONE);
		shaped.pattern("212");
		shaped.pattern("131");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Tags.Items.DYES));
		shaped.save(consumer);
	}

	private void buildTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildThreeByOneRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void buildStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(output)).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void buildSmeltingRecipe(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void buildStairRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
