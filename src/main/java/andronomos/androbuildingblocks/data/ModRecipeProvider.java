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
	protected void buildRecipes(@NotNull Consumer<FinishedRecipe> consumer) {
		createReinforcedConcrete(BlockRegistry.BLACK_REINFORCED_CONCRETE.get(), "black", consumer);
		createReinforcedConcrete(BlockRegistry.BLUE_REINFORCED_CONCRETE.get(), "blue", consumer);
		createReinforcedConcrete(BlockRegistry.BROWN_REINFORCED_CONCRETE.get(), "brown", consumer);
		createReinforcedConcrete(BlockRegistry.GREEN_REINFORCED_CONCRETE.get(), "green", consumer);
		createReinforcedConcrete(BlockRegistry.GRAY_REINFORCED_CONCRETE.get(), "gray", consumer);
		createReinforcedConcrete(BlockRegistry.PURPLE_REINFORCED_CONCRETE.get(), "purple", consumer);
		createReinforcedConcrete(BlockRegistry.RED_REINFORCED_CONCRETE.get(), "red", consumer);
		createReinforcedConcrete(BlockRegistry.WHITE_REINFORCED_CONCRETE.get(), "white", consumer);

		for(DyeColor color : DyeColor.values()) {
			Block glassBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, color + "_structural_glass"));
			createStructuralGlass(glassBlock, color.getName(), consumer);
		}

		createSteel(consumer);

		createSmelting(Blocks.STONE, BlockRegistry.CHARRED_STONE.get(), consumer);
		createVariants(BlockRegistry.CHARRED_STONE.get(),true, true, true, consumer);

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

		createVariants(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get(), true, true, true, consumer);
		createVariants(BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get(), true, true, true, consumer);

		createTwoByTwo(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, consumer);
		createStoneCutter(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), Blocks.DARK_PRISMARINE, 1, consumer);
		createVariants(BlockRegistry.DARK_PRISMARINE_BRICKS.get(), true, true, true, consumer);

		createTwoByTwo(BlockRegistry.BASALT_BRICKS.get(), Blocks.SMOOTH_BASALT, consumer);
		createStoneCutter(BlockRegistry.BASALT_BRICKS.get(), Blocks.SMOOTH_BASALT, 1, consumer);
		createVariants(BlockRegistry.BASALT_BRICKS.get(), true, true, true, consumer);

		ShapelessRecipeBuilder sandpaperRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, ItemRegistry.SANDPAPER.get(), 1);
		sandpaperRecipe.requires(Items.SAND);
		sandpaperRecipe.requires(Items.PAPER);
		sandpaperRecipe.unlockedBy("has_item", has(Items.PAPER));
		sandpaperRecipe.save(consumer, "sandpaper");

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

		createVariants(BlockRegistry.SANDED_DEEPSLATE.get(), true, true, true, consumer);

		createSanded(BlockRegistry.SANDED_ANDESITE.get(), Blocks.ANDESITE, consumer);
		createVariants(BlockRegistry.SANDED_ANDESITE.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_GRANITE.get(), Blocks.GRANITE, consumer);
		createVariants(BlockRegistry.SANDED_GRANITE.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_DARK_PRISMARINE.get(), Blocks.DARK_PRISMARINE, consumer);
		createVariants(BlockRegistry.SANDED_DARK_PRISMARINE.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_BASALT.get(), Blocks.BASALT, consumer);
		createVariants(BlockRegistry.SANDED_BASALT.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_NETHERRACK.get(), Blocks.NETHERRACK, consumer);
		createVariants(BlockRegistry.SANDED_NETHERRACK.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_NETHERBRICKS.get(), Blocks.NETHER_BRICKS, consumer);
		createVariants(BlockRegistry.SANDED_NETHERBRICKS.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_PACKED_MUD.get(), Blocks.PACKED_MUD, consumer);
		createVariants(BlockRegistry.SANDED_PACKED_MUD.get(), true, true, true, consumer);
		createSanded(BlockRegistry.SANDED_CALCITE.get(), Blocks.CALCITE, consumer);
		createVariants(BlockRegistry.SANDED_CALCITE.get(), true, true, true, consumer);
	}

	private void createSanded(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapelessRecipeBuilder sandedRecipe = ShapelessRecipeBuilder.shapeless(RecipeCategory.BUILDING_BLOCKS, output, 1);
		sandedRecipe.requires(ItemRegistry.SANDPAPER.get());
		sandedRecipe.requires(input);
		sandedRecipe.unlockedBy("has_item", has(input));
		sandedRecipe.save(consumer);
	}

	private void createReinforcedConcrete(Block concreateBlock, String color, Consumer<FinishedRecipe> consumer) {
		Item dye = ForgeRegistries.ITEMS.getValue(new ResourceLocation("minecraft", color + "_dye"));
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, concreateBlock, 8);
		shaped.define('1', Tags.Items.STONE);
		shaped.define('2', Tags.Items.INGOTS_IRON);
		shaped.define('3', Items.GRAVEL);
		shaped.define('4', dye);
		shaped.pattern("212");
		shaped.pattern("343");
		shaped.pattern("212");
		shaped.unlockedBy("has_item", has(Tags.Items.STONE));
		shaped.save(consumer);

		createVariants(concreateBlock, true, true, true, consumer);
	}

	private void createStructuralGlass(Block block, String color, Consumer<FinishedRecipe> recipeConsumer) {
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
				createThreeByTwo(glassPaneBlock, block, recipeConsumer);
			}
		}
	}

	private void createSteel(Consumer<FinishedRecipe> recipeConsumer) {
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

		createVariants(BlockRegistry.STEEL.get(), true, true, true, recipeConsumer);
		createVariants(BlockRegistry.STEEL_PANEL.get(), true, true, true, recipeConsumer);
		createStoneCutter(BlockRegistry.STEEL_PANEL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);

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

		createVariants(BlockRegistry.ENDER_STEEL.get(), true, true, true, recipeConsumer);
		createVariants(BlockRegistry.ENDER_STEEL_PANEL.get(), true, true, true, recipeConsumer);
		createStoneCutter(BlockRegistry.ENDER_STEEL_PANEL.get(), BlockRegistry.STEEL.get(), 1, recipeConsumer);
	}

	private void createVariants(Block source, boolean stairs, boolean slab, boolean wall, Consumer<FinishedRecipe> recipeConsumer) {
		String name = ForgeRegistries.BLOCKS.getKey(source).getPath();

		Block stairBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_stairs", name)));
		Block slabBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_slab", name)));
		Block wallBlock = ForgeRegistries.BLOCKS.getValue(new ResourceLocation(MODID, String.format("%s_wall", name)));

		if(stairs && blockExists(stairBlock)) {
			createStair(stairBlock, source, recipeConsumer);
			createStoneCutter(stairBlock, source, 1, recipeConsumer);
		}

		if(slab && blockExists(slabBlock)) {
			createThreeByOne(slabBlock, source, recipeConsumer);
			createStoneCutter(slabBlock, source, 2, recipeConsumer);
		}

		if(wall && blockExists(wallBlock)) {
			createStoneCutter(wallBlock, source, 1, recipeConsumer);
			createThreeByTwo(wallBlock, source, recipeConsumer);
		}
	}

	private void createTwoByTwo(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 4);
		shaped.define('#', input);
		shaped.pattern("##");
		shaped.pattern("##");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void createThreeByOne(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void createThreeByTwo(Block output, Block input, Consumer<FinishedRecipe> consumer) {
		ShapedRecipeBuilder shaped = ShapedRecipeBuilder.shaped(RecipeCategory.BUILDING_BLOCKS, output, 6);
		shaped.define('#', input);
		shaped.pattern("###");
		shaped.pattern("###");
		shaped.unlockedBy("has_item", has(input));
		shaped.save(consumer);
	}

	private void createStoneCutter(Block output, Block input, int amount, Consumer<FinishedRecipe> consumer) {
		String blockName = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(output)).getPath();
		SingleItemRecipeBuilder stonecutting = SingleItemRecipeBuilder.stonecutting(Ingredient.of(input), RecipeCategory.BUILDING_BLOCKS, output, amount);
		stonecutting.unlockedBy("has_item", has(input));
		stonecutting.save(consumer, blockName + "_from_stonecutting");
	}

	private void createSmelting(Block input, Block output, Consumer<FinishedRecipe> consumer) {
		SimpleCookingRecipeBuilder cooking = SimpleCookingRecipeBuilder.smelting(Ingredient.of(input),
				RecipeCategory.BUILDING_BLOCKS,	output, 0.1F, 200);
		cooking.unlockedBy("has_item", has(input));
		cooking.save(consumer);
	}

	private void createStair(Block output, Block input, Consumer<FinishedRecipe> consumer) {
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
