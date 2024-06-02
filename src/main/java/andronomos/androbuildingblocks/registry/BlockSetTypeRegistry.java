package andronomos.androbuildingblocks.registry;

import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class BlockSetTypeRegistry {
	public static final BlockSetType STEEL = registerBlockSetType("steel", true,
			SoundType.METAL, SoundEvents.IRON_DOOR_CLOSE, SoundEvents.IRON_DOOR_OPEN,
			SoundEvents.IRON_TRAPDOOR_CLOSE, SoundEvents.IRON_TRAPDOOR_OPEN, SoundEvents.METAL_PRESSURE_PLATE_CLICK_OFF,
			SoundEvents.METAL_PRESSURE_PLATE_CLICK_ON, SoundEvents.STONE_BUTTON_CLICK_OFF, SoundEvents.STONE_BUTTON_CLICK_ON);


	public static BlockSetType registerBlockSetType(String name, boolean canOpenByHand, SoundType soundType, SoundEvent doorClose, SoundEvent doorOpen,
													SoundEvent trapdoorClose, SoundEvent trapdoorOpen, SoundEvent pressurePlateClickOff, SoundEvent pressurePlateClickOn,
													SoundEvent buttonClickOff, SoundEvent buttonClickOn) {
		return BlockSetType.register(new BlockSetType(name,	canOpenByHand, soundType, doorClose, doorOpen, trapdoorClose, trapdoorOpen,
				pressurePlateClickOff, pressurePlateClickOn, buttonClickOff, buttonClickOn)
		);
	}
}
