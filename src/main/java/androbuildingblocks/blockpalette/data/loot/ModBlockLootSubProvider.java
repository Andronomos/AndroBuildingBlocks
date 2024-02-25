package androbuildingblocks.blockpalette.data.loot;

import androbuildingblocks.blockpalette.registry.BlockRegistry;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.level.block.*;
import net.minecraftforge.registries.RegistryObject;

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
				default -> this.dropSelf(b);
			}
		});
	}

	@Override
	protected Iterable<Block> getKnownBlocks() {
		return BlockRegistry.BLOCKS.getEntries()
				.stream()
				.flatMap(RegistryObject::stream)
				::iterator;
	}
}
