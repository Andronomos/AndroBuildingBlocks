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
		createReinforcedConcreteRecipe(BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), "black", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), "blue", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), "brown", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), "green", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), "gray", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), "purple", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.RED_REINFORCED_CONCRETE.get(), "red", recipeConsumer);
		createReinforcedConcreteRecipe(BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), "white", recipeConsumer);

		for(DyeColor color : DyeColor.values()) {
			Block glassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, color + "_structural_glass"));
			createStructuralGlassRecipes(glassBlock, color.getName(), recipeConsumer);
		}

		createSteelRecipes(recipeConsumer);

		createSmeltingRecipe(Blocks.STONE, BlockRegistry.CHARRED_STONE.get(), recipeConsumer);
		createVariantRecipes(BlockRegistry.CHARRED_STONE.get(),true, true, true, recipeConsumer);

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

		createVariantRecipes(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), true, true, true, recipeConsumer);
		createVariantRecipes(BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), true, true, true, recipeConsumer);

		createTwoByTwoRecipe(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, recipeConsumer);
		createStoneCutterRecipe(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, 1, recipeConsumer);
		createVariantRecipes(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), true, true, true, recipeConsumer);

		createTwoByTwoRecipe(BlockRegistry.BASALT_BRICKS.get(), Blocks.SMOOTH_BASALT, recipeConsumer);
		createStoneCutterRecipe(BlockRegistry.BASALT_BRICKS.get(), Blocks.SMOOTH_BASALT, 1, recipeConsumer);
		createVariantRecipes(BlockRegistry.BASALT_BRICKS.get(), true, true, true, recipeConsumer);

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

		createVariantRecipes(BlockRegistry.SANDED_DEEPSLATE.get(), true, true, true, recipeConsumer);

		createSandedRecipe(BlockRegistry.SANDED_ANDESITE.get(), Blocks.ANDESITE, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_ANDESITE.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_GRANITE.get(), Blocks.GRANITE, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_GRANITE.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_DARK_PRISMARINE.get(), Blocks.DARK_PRISMARINE, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_DARK_PRISMARINE.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_BASALT.get(), Blocks.BASALT, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_BASALT.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_NETHERRACK.get(), Blocks.NETHERRACK, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_NETHERRACK.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_NETHERBRICKS.get(), Blocks.NETHER_BRICKS, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_NETHERBRICKS.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_PACKED_MUD.get(), Blocks.PACKED_MUD, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_PACKED_MUD.get(), true, true, true, recipeConsumer);
		createSandedRecipe(BlockRegistry.SANDED_CALCITE.get(), Blocks.CALCITE, recipeConsumer);
		createVariantRecipes(BlockRegistry.SANDED_CALCITE.get(), true, true, true, recipeConsumer);
	}

	private void createSandedRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder sandedRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, 1);
		sandedRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedRecipe.requires(input);
		sandedRecipe.unlockedBy("has_item", has(input));
		sandedRecipe.save(consumer);
	}

	private void createReinforcedConcreteRecipe(Block block, String color, Consumer<FinishedRecipe> recipeConsumer) {
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

		createVariantRecipes(block, true, true, true, recipeConsumer);
	}

	private void createStructuralGlassRecipes(Block block, String color, Consumer<FinishedRecipe> recipeConsumer) {
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
				createThreeByTwoRecipe(glassPaneBlock, block, recipeConsumer);
			}
		}
	}

	private void createSteelRecipes(Consumer<FinishedRecipe> recipeConsumer) {
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

		createVariantRecipes(BlockRegistry.STEEL.get(), true, true, true, recipeConsumer);
		createVariantRecipes(BlockRegistry.STEEL_PANEL.get(), true, true, true, recipeConsumer);
		createStoneCutterRecipe(BlockRegistry.STEEL_PANEL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);

		ShapedRecipeBuilder enderSteelFromCoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ENDER_STEEL.get(), 4);
		enderSteelFromCoalRecipe.define('C', Items.COAL);
		enderSteelFromCoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		enderSteelFromCoalRecipe.define('P', Items.ENDER_PEARL);
		enderSteelFromCoalRecipe.pattern("CIC");
		enderSteelFromCoalRecipe.pattern("IPI");
		enderSteelFromCoalRecipe.pattern("CIC");
		enderSteelFromCoalRecipe.group("ender_steel");
		enderSteelFromCoalRecipe.unlockedBy("has_item", has(Items.ENDER_PEARL));
		enderSteelFromCoalRecipe.save(recipeConsumer);

		ShapedRecipeBuilder enderSteelFromCharcoalRecipe = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, BlockRegistry.ENDER_STEEL.get(), 4);
		enderSteelFromCharcoalRecipe.define('C', Items.CHARCOAL);
		enderSteelFromCharcoalRecipe.define('I', Tags.Items.INGOTS_IRON);
		enderSteelFromCharcoalRecipe.define('P', Items.ENDER_PEARL);
		enderSteelFromCharcoalRecipe.pattern("CIC");
		enderSteelFromCharcoalRecipe.pattern("IPI");
		enderSteelFromCharcoalRecipe.pattern("CIC");
		enderSteelFromCharcoalRecipe.group("ender_steel");
		enderSteelFromCharcoalRecipe.unlockedBy("has_item", has(Items.ENDER_PEARL));
		enderSteelFromCharcoalRecipe.save(recipeConsumer, "ender_steel_from_charcoal");

		createVariantRecipes(BlockRegistry.ENDER_STEEL.get(), true, true, true, recipeConsumer);
		createVariantRecipes(BlockRegistry.ENDER_STEEL_PANEL.get(), true, true, true, recipeConsumer);
		createStoneCutterRecipe(BlockRegistry.ENDER_STEEL_PANEL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
	}

	private void createVariantRecipes(Block source, boolean stairs, boolean slab, boolean wall, Consumer<FinishedRecipe> recipeConsumer) {
		String name = ForgeRegistries.BLOCKS.getKey(source).getPath();

		Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", name)));
		Block slabBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", name)));
		Block wallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", name)));

		if(stairs && blockExists(stairBlock)) {
			createStairRecipe(stairBlock, source, recipeConsumer);
			createStoneCutterRecipe(stairBlock, source, 1, recipeConsumer);
		}

		if(slab && blockExists(slabBlock)) {
			createThreeByOneRecipe(slabBlock, source, recipeConsumer);
			createStoneCutterRecipe(slabBlock, source, 2, recipeConsumer);
		}

		if(wall && blockExists(wallBlock)) {
			createStoneCutterRecipe(wallBlock, source, 1, recipeConsumer);
			createThreeByTwoRecipe(wallBlock, source, recipeConsumer);
		}
	}

	private void createTwoByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void createThreeByOneRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void createThreeByTwoRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void createStoneCutterRecipe(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(output)).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void createSmeltingRecipe(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void createStairRecipe(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("#  ");
		shaped.pattern("## ");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private boolean blockExists(Block block) {
		return block != null && block != Blocks.AIR;
	}
}
