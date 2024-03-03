package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
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
		buildReinforcedConcreteRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), Items.WHITE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), Items.BLUE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), Items.BLACK_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), Items.BROWN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), Items.GREEN_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), Items.GRAY_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), Items.PURPLE_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildReinforcedConcreteRecipe(BlockRegistry.RED_REINFORCED_CONCRETE.get(), Items.RED_DYE, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_STAIRS.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), 2, recipeConsumer);
		generateSlabRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_SLAB.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get().asItem(), recipeConsumer);
		//generateThreeByTwoRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), recipeConsumer);
		//generateStoneCutterRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_WALL.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_GRATE.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), 1, recipeConsumer);
		generateTwoByTwoRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_TILE.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.RED_REINFORCED_CONCRETE_PILLAR.get(), BlockRegistry.RED_REINFORCED_CONCRETE.get(), 1, recipeConsumer);

		buildConcreteWallRecipes(BlockRegistry.RED_REINFORCED_CONCRETE.get(), recipeConsumer);

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

		//region Smooth Deepslate
		generateSmeltingRecipe(Blocks.DEEPSLATE, BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateStairRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_STAIRS.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.SMOOTH_DEEPSLATE_SLAB.get(), BlockRegistry.SMOOTH_DEEPSLATE.get().asItem(), recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.SMOOTH_DEEPSLATE_WALL.get(), BlockRegistry.SMOOTH_DEEPSLATE.get(), 1, recipeConsumer);
		//endregion

		//region Caution Stripes
		generateStripedRecipe(BlockRegistry.YELLOW_CAUTION_STRIPES.get(), Items.YELLOW_DYE, Items.BLACK_DYE, recipeConsumer);
		generateStripedRecipe(BlockRegistry.RED_CAUTION_STRIPES.get(), Items.RED_DYE, Items.WHITE_DYE, recipeConsumer);
		//endregion

		//region Steel
		ShapedRecipeBuilder carbonSteelCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.STEEL.get(), 4);
		carbonSteelCoalRecipe.define('C', Items.COAL);
		carbonSteelCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		carbonSteelCoalRecipe.pattern("CIC");
		carbonSteelCoalRecipe.pattern("ICI");
		carbonSteelCoalRecipe.pattern("CIC");
		carbonSteelCoalRecipe.group("carbon_steel");
		carbonSteelCoalRecipe.unlockedBy("has_item", has(Items.COAL));
		carbonSteelCoalRecipe.save(recipeConsumer);

		ShapedRecipeBuilder carbonSteelCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.STEEL.get(), 4);
		carbonSteelCharcoalRecipe.define('C', Items.CHARCOAL);
		carbonSteelCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		carbonSteelCharcoalRecipe.pattern("CIC");
		carbonSteelCharcoalRecipe.pattern("ICI");
		carbonSteelCharcoalRecipe.pattern("CIC");
		carbonSteelCharcoalRecipe.group("carbon_steel");
		carbonSteelCharcoalRecipe.unlockedBy("has_item", has(Items.CHARCOAL));
		carbonSteelCharcoalRecipe.save(recipeConsumer, "carbon_steel_from_charcoal");

		generateStairRecipe(BlockRegistry.STEEL_STAIRS.get(), BlockRegistry.STEEL.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_STAIRS.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		generateSlabRecipe(BlockRegistry.STEEL_SLAB.get(), BlockRegistry.STEEL.get().asItem(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_SLAB.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_WALL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		generateThreeByTwoRecipe(BlockRegistry.STEEL_WALL.get(), BlockRegistry.STEEL.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.STEEL_MESH.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
		//endregion

		generateSmeltingRecipe(Blocks.COAL_BLOCK, BlockRegistry.CARBON.get(), recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_MESH.get(), BlockRegistry.CARBON.get(), 1, recipeConsumer);
		generateStoneCutterRecipe(BlockRegistry.CARBON_GRATE.get(), BlockRegistry.CARBON.get(), 1, recipeConsumer);
	}



	private void buildConcreteWallRecipes(Block concrete, Consumer<FinishedRecipe> consumer) {
		String concreteName = ForgeRegistries.BLOCKS.getKey(concrete).getPath();
		String targetBlockName = String.format("%s_wall", concreteName);
		Block targetBlock =  ForgeRegistries.BLOCKS.getValue(new ResourceLocation(AndroBuildingBlocks.MODID, targetBlockName));
		generateThreeByTwoRecipe(targetBlock, concrete, consumer);
		generateStoneCutterRecipe(targetBlock, concrete,1, consumer);
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
