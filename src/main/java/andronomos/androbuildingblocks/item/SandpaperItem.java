package andronomos.androbuildingblocks.item;

import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public class SandpaperItem extends Item {
	public SandpaperItem(Properties properties) {
		super(properties);
	}

	@Override
	public int getMaxDamage(ItemStack stack) {
		return 1728;
	}

	@Override
	public ItemStack getCraftingRemainingItem(ItemStack itemStack) {
		return super.getCraftingRemainingItem(itemStack);
	}

	@Override
	public boolean hasCraftingRemainingItem() {
		return super.hasCraftingRemainingItem();
	}
}
