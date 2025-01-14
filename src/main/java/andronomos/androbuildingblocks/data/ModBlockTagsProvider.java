package andronomos.androbuildingblocks.data;

import andronomos.androbuildingblocks.AndroBuildingBlocks;
import andronomos.androbuildingblocks.registry.BlockRegistry;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import org.jetbrains.annotations.Nullable;

import java.util.Objects;
import java.util.concurrent.CompletableFuture;

public class ModBlockTagsProvider extends BlockTagsProvider {
	public ModBlockTagsProvider(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
		super(output, lookupProvider, AndroBuildingBlocks.MODID, existingFileHelper);
	}

	@Override
	public String getName() {
		return "AndroBuildingBlocks Tags";
	}

	@Override
	protected void addTags(HolderLookup.Provider provider) {
		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> {
			String blockPath = Objects.requireNonNull(ForgeRegistries.BLOCKS.getKey(block)).getPath();
			return blockPath.contains("concrete") || blockPath.contains("asphalt") || blockPath.contains("steel");
		}).forEach(block -> tag(BlockTags.MINEABLE_WITH_PICKAXE).add(block));

		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> block instanceof StairBlock).forEach(block -> {
			tag(BlockTags.STAIRS).add(block);
		});

		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> block instanceof WallBlock).forEach(block -> {
			tag(BlockTags.WALLS).add(block);
		});

		BlockRegistry.BLOCKS.getEntries().stream().map(RegistryObject::get).filter(block -> block instanceof SlabBlock).forEach(block -> {
			tag(BlockTags.SLABS).add(block);
		});

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_ANDESITE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_ANDESITE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_ANDESITE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_ANDESITE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BASALT.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BASALT_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BASALT_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BASALT_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BLACKSTONE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BLACKSTONE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BLACKSTONE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_BLACKSTONE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_CALCITE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_CALCITE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_CALCITE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_CALCITE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DARK_PRISMARINE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DARK_PRISMARINE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DARK_PRISMARINE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DARK_PRISMARINE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DEEPSLATE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DEEPSLATE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DEEPSLATE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DEEPSLATE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DRIPSTONE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DRIPSTONE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DRIPSTONE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_DRIPSTONE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_END_STONE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_END_STONE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_END_STONE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_END_STONE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_GRANITE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_GRANITE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_GRANITE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_GRANITE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERBRICKS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERBRICKS_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERBRICKS_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERBRICKS_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERRACK.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERRACK_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERRACK_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_NETHERRACK_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_PACKED_MUD.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_PACKED_MUD_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_PACKED_MUD_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_PACKED_MUD_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_STONE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_STONE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_STONE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_STONE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_TUFF.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_TUFF_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_TUFF_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.SANDED_TUFF_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_COBBLED_DEEPLSATE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_COBBLED_DEEPLSATE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_COBBLED_DEEPLSATE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_COBBLED_DEEPLSATE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_DEEPLSATE_BRICKS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_DEEPLSATE_BRICK_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_DEEPLSATE_BRICK_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MOSSY_DEEPLSATE_BRICK_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.BASALT_BRICKS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.BASALT_BRICK_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.BASALT_BRICK_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.BASALT_BRICK_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.DARK_PRISMARINE_BRICKS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.DARK_PRISMARINE_BRICK_STAIRS.get());
		tag(BlockTags.STAIRS).add(BlockRegistry.DARK_PRISMARINE_BRICK_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.DARK_PRISMARINE_BRICK_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.DARK_PRISMARINE_BRICK_WALL.get());
		tag(BlockTags.WALLS).add(BlockRegistry.DARK_PRISMARINE_BRICK_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MARBLE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MARBLE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MARBLE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.MARBLE_WALL.get());

		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.POLISHED_MARBLE.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.POLISHED_MARBLE_STAIRS.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.POLISHED_MARBLE_SLAB.get());
		tag(BlockTags.MINEABLE_WITH_PICKAXE).add(BlockRegistry.POLISHED_MARBLE_WALL.get());
	}
}
