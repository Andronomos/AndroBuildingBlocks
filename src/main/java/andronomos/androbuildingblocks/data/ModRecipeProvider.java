package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;
import net.minecraftforge.registries.ForgeRegistries;
import org.jetbrains.annotations.NotNull;

import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
	public ModRecipeProvider(PackOutput output) {
		super(output);
	}

	@Override
	protected void buildRecipes(@NotNull Consumer<FinishedRecipe> recipeConsumer) {
		//region Reinforced Concrete
		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE.get(), Items.WHITE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_WHITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_WHITE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_WHITE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_WHITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_WHITE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_WHITE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE.get(), Items.BLUE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_BLUE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_BLUE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_BLUE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_BLUE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BLUE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_BLUE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK.get(), Items.BLACK_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_BLACK.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_BLACK.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_BLACK.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_BLACK.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BLACK_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_BLACK.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN.get(), Items.BROWN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_BROWN.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_BROWN.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_BROWN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_BROWN.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_BROWN_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_BROWN.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN.get(), Items.GREEN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_GREEN.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_GREEN.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_GREEN.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_GREEN.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_GREEN_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_GREEN.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY.get(), Items.GRAY_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_GRAY.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_GRAY.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_GRAY.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_GRAY.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_GRAY_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_GRAY.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_RED.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_RED_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_RED.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_RED_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_RED_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_RED.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_RED_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_RED.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_RED_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_RED.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_RED_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_RED.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW.get(), Items.YELLOW_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_YELLOW.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_YELLOW.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_YELLOW.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_YELLOW.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_YELLOW_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_YELLOW.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE.get(), Items.PURPLE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_PURPLE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_PURPLE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_PURPLE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_PURPLE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_PURPLE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_PURPLE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_PINK.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_PINK.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_PINK.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_PINK.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_PINK.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_PINK_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_PINK.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE_STAIRS.get(), BlockRegistry.REINFORCED_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_ORANGE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE_SLAB.get(), BlockRegistry.REINFORCED_CONCRETE_ORANGE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_ORANGE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.REINFORCED_CONCRETE_ORANGE_WALL.get(), BlockRegistry.REINFORCED_CONCRETE_ORANGE.get(), 1, recipeConsumer);
		//endregion

		//region Structural Glass
		buildStructuralGlassRecipe(BlockRegistry.WHITE_STRUCTURAL_GLASS.get(), Blocks.WHITE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.WHITE_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.WHITE_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.BLUE_STRUCTURAL_GLASS.get(), Blocks.BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLUE_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.BLUE_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.BROWN_STRUCTURAL_GLASS.get(), Blocks.BROWN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BROWN_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.BROWN_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.CYAN_STRUCTURAL_GLASS.get(), Blocks.CYAN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.CYAN_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.CYAN_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.GREEN_STRUCTURAL_GLASS.get(), Blocks.GREEN_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GREEN_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.GREEN_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.GRAY_STRUCTURAL_GLASS.get(), Blocks.GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GRAY_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.GRAY_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.LIGHT_BLUE_STRUCTURAL_GLASS.get(), Blocks.LIGHT_BLUE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIGHT_BLUE_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.LIGHT_BLUE_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.LIGHT_GRAY_STRUCTURAL_GLASS.get(), Blocks.LIGHT_GRAY_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIGHT_GRAY_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.LIGHT_GRAY_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.LIME_STRUCTURAL_GLASS.get(), Blocks.LIME_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.LIME_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.LIME_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.MAGENTA_STRUCTURAL_GLASS.get(), Blocks.MAGENTA_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.MAGENTA_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.MAGENTA_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.ORANGE_STRUCTURAL_GLASS.get(), Blocks.ORANGE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.ORANGE_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.ORANGE_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.PINK_STRUCTURAL_GLASS.get(), Blocks.PINK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PINK_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.PINK_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.PURPLE_STRUCTURAL_GLASS.get(), Blocks.PURPLE_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PURPLE_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.PURPLE_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.RED_STRUCTURAL_GLASS.get(), Blocks.RED_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.RED_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.RED_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.YELLOW_STRUCTURAL_GLASS.get(), Blocks.YELLOW_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.YELLOW_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.YELLOW_STRUCTURAL_GLASS.get(), recipeConsumer);

		buildStructuralGlassRecipe(BlockRegistry.BLACK_STRUCTURAL_GLASS.get(), Blocks.BLACK_STAINED_GLASS, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLACK_STRUCTURAL_GLASS_PANE.get(), BlockRegistry.BLACK_STRUCTURAL_GLASS.get(), recipeConsumer);
		//endregion

		generateSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);

		//region Bentonite
		ShapedRecipeBuilder bentoniteRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.BENTONITE.get(), 1);
		bentoniteRecipe.define('C', Items.CLAY_BALL);
		bentoniteRecipe.define('G', Items.GUNPOWDER);
		bentoniteRecipe.pattern("CG");
		bentoniteRecipe.pattern("GC");
		bentoniteRecipe.unlockedBy("has_item", has(Items.CLAY_BALL));
		bentoniteRecipe.save(recipeConsumer);

		generateStoneCutterRecipe(BlockRegistry.BENTONITE_PILLAR.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BENTONITE_STAIRS.get(), BlockRegistry.BENTONITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_STAIRS.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BENTONITE_SLAB.get(), BlockRegistry.BENTONITE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BENTONITE_WALL.get(), BlockRegistry.BENTONITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_SLAB.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_GRATE.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);

		generateTwoByTwoRecipe(BlockRegistry.BENTONITE_BRICKS.get(), BlockRegistry.BENTONITE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICKS.get(), BlockRegistry.BENTONITE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BENTONITE_BRICK_STAIRS.get(), BlockRegistry.BENTONITE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICK_STAIRS.get(), BlockRegistry.BENTONITE_BRICKS.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BENTONITE_BRICK_SLAB.get(), BlockRegistry.BENTONITE_BRICKS.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICK_SLAB.get(), BlockRegistry.BENTONITE_BRICKS.get(), 1, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BENTONITE_BRICK_WALL.get(), BlockRegistry.BENTONITE_BRICKS.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BENTONITE_BRICK_WALL.get(), BlockRegistry.BENTONITE_BRICKS.get(), 1, recipeConsumer);
		//endregion

		//region Caution Stripes
		generateStripedRecipe(BlockRegistry.YELLOW_CAUTION_STRIPES.get(), Items.YELLOW_DYE, Items.BLACK_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.RED_CAUTION_STRIPES.get(), Items.RED_DYE, Items.WHITE_DYE, recipeConsumer);
		//endregion

		//region Carbon Steel
		ShapedRecipeBuilder carbonSteelCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CARBON_STEEL.get(), 4);
		carbonSteelCoalRecipe.define('C', Items.COAL);
		carbonSteelCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		carbonSteelCoalRecipe.pattern("CIC");
		carbonSteelCoalRecipe.pattern("ICI");
		carbonSteelCoalRecipe.pattern("CIC");
		carbonSteelCoalRecipe.group("carbon_steel");
		carbonSteelCoalRecipe.unlockedBy("has_item", has(Items.COAL));
		carbonSteelCoalRecipe.save(recipeConsumer);

		ShapedRecipeBuilder carbonSteelCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.CARBON_STEEL.get(), 4);
		carbonSteelCharcoalRecipe.define('C', Items.CHARCOAL);
		carbonSteelCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		carbonSteelCharcoalRecipe.pattern("CIC");
		carbonSteelCharcoalRecipe.pattern("ICI");
		carbonSteelCharcoalRecipe.pattern("CIC");
		carbonSteelCharcoalRecipe.group("carbon_steel");
		carbonSteelCharcoalRecipe.unlockedBy("has_item", has(Items.CHARCOAL));
		carbonSteelCharcoalRecipe.save(recipeConsumer, "carbon_steel_from_charcoal");

		generateStairRecipe(BlockRegistry.CARBON_STEEL_STAIRS.get(), BlockRegistry.CARBON_STEEL.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_STEEL_STAIRS.get(), BlockRegistry.CARBON_STEEL.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.CARBON_STEEL_SLAB.get(), BlockRegistry.CARBON_STEEL.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_STEEL_SLAB.get(), BlockRegistry.CARBON_STEEL.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_STEEL_WALL.get(), BlockRegistry.CARBON_STEEL.get(), 1, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.CARBON_STEEL_WALL.get(), BlockRegistry.CARBON_STEEL.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_STEEL_GRATING.get(), BlockRegistry.CARBON_STEEL.get(), 1, recipeConsumer);
		//endregion
	}


	private void buildStructuralGlassRecipe(Block output, Block Input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('1', Input);
		shaped.define('2', Items.SLIME_BALL);
		shaped.pattern("212");
		shaped.pattern("121");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Items.SLIME_BALL));
		shaped.save(consumer);
	}

	private void buildReinforcedConcreteRecipe(Block output, Item dye, Consumer<FinishedRecipe> consumer) {
		String concreteName = ForgeRegistries.BLOCKS.getKey(output).getPath();

		ShapedRecipeBuilder shapedGravel = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8);
		shapedGravel.define('1', Tags.Items.STONE);
		shapedGravel.define('2', Tags.Items.INGOTS_IRON);
		shapedGravel.define('3', Items.GRAVEL);
		shapedGravel.define('4', dye);
		shapedGravel.pattern("212");
		shapedGravel.pattern("343");
		shapedGravel.pattern("212");
		shapedGravel.group(concreteName);
		shapedGravel.unlockedBy("has_item", has(Tags.Items.STONE));
		shapedGravel.save(consumer);

		ShapedRecipeBuilder shapedSand = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 8);
		shapedSand.define('1', Tags.Items.STONE);
		shapedSand.define('2', Tags.Items.INGOTS_IRON);
		shapedSand.define('3', Items.SAND);
		shapedSand.define('4', dye);
		shapedSand.pattern("212");
		shapedSand.pattern("343");
		shapedSand.pattern("212");
		shapedSand.group(concreteName);
		shapedSand.unlockedBy("has_item", has(Tags.Items.STONE));
		shapedSand.save(consumer, concreteName + "_from_sand");
	}

	private void generateStripedRecipe(Block output, Item Dye, Item Dye2, Consumer<FinishedRecipe> consumer) {
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

	private void generateSmeltingRecipe(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void generateTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = ForgeRegistries.BLOCKS.getKey(output).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void generateSlabRecipe(SlabBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void generateStairRecipe(StairBlock output, Item input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}
}
