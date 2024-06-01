package andronomos.androbuildingblocks.data.loot;

import andronomos.androbuildingblocks.block.CatwalkRailingBlock;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.advancements.critereon.StatePropertiesPredicate;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.properties.BlockStateProperties;
import net.minecraft.world.level.block.state.properties.BooleanProperty;
import net.minecraft.world.level.block.state.properties.DoubleBlockHalf;
import net.minecraft.world.level.storage.loot.LootPool;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.entries.LootPoolEntryContainer;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.predicates.LootItemBlockStatePropertyCondition;
import net.minecraft.world.level.storage.loot.providers.number.ConstantValue;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.NotNull;

import java.util.Collections;

public class ModBlockLootSubProvider extends BlockLootSubProvider {
	public ModBlockLootSubProvider() {
		super(Collections.emptySet(), FeatureFlags.REGISTRY.allFlags());
	}

	@Override
	protected void generate() {
		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).forEach(b -> {
			switch (b.getClass().getSimpleName()) {
				case "GlassBlock", "StainedGlassBlock", "StainedGlassPaneBlock" -> this.dropWhenSilkTouch(b);
				case "CatwalkRailingBlock" -> this.railingBlock(b);
				default -> this.dropSelf(b);
			}
		});
	}

	private void railingBlock(Block block) {
		LootTable.Builder table = LootTable.lootTable();
		LootPool.Builder pool = LootPool.lootPool();
		pool.setRolls(ConstantValue.exactly(1));

		LootItem.Builder<?> entry = LootItem.lootTableItem(block);

		entry.apply(SetItemCountFunction.setCount(ConstantValue.exactly(1), true)
				.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
						.setProperties(StatePropertiesPredicate.Builder.properties()
								.hasProperty(BlockStateProperties.NORTH, true))));

		entry.apply(SetItemCountFunction.setCount(ConstantValue.exactly(1), true)
				.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
						.setProperties(StatePropertiesPredicate.Builder.properties()
								.hasProperty(BlockStateProperties.NORTH, true))));

		entry.apply(SetItemCountFunction.setCount(ConstantValue.exactly(1), true)
				.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
						.setProperties(StatePropertiesPredicate.Builder.properties()
								.hasProperty(BlockStateProperties.EAST, true))));

		entry.apply(SetItemCountFunction.setCount(ConstantValue.exactly(1), true)
				.when(LootItemBlockStatePropertyCondition.hasBlockStateProperties(block)
						.setProperties(StatePropertiesPredicate.Builder.properties()
								.hasProperty(BlockStateProperties.WEST, true))));

		pool.add(entry);
		table.withPool(pool);
		this.add(block, table);
	}


	@Override
	protected @NotNull Iterable<Block> getKnownBlocks() {
		return BlockRegistry.BLOCKS.getEntries()
				.stream()
				.flatMap(RegistryObject::stream)
				::iterator;
	}
}
