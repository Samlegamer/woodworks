package com.teamabnormals.woodworks.core.registry;

import com.teamabnormals.blueprint.core.util.registry.SoundSubRegistryHelper;
import com.teamabnormals.woodworks.core.Woodworks;
import net.minecraft.sounds.SoundEvent;
import net.minecraftforge.common.util.ForgeSoundType;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.registries.RegistryObject;

@EventBusSubscriber(modid = Woodworks.MOD_ID, bus = EventBusSubscriber.Bus.MOD)
public class WoodworksSounds {
	public static final SoundSubRegistryHelper HELPER = Woodworks.REGISTRY_HELPER.getSoundSubHelper();

	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHEST_OPEN = HELPER.createSoundEvent("block.cherry_wood_chest.open");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHEST_CLOSE = HELPER.createSoundEvent("block.cherry_wood_chest.close");
	
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_LADDER_BREAK = HELPER.createSoundEvent("block.cherry_wood_ladder.break");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_LADDER_STEP = HELPER.createSoundEvent("block.cherry_wood_ladder.step");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_LADDER_PLACE = HELPER.createSoundEvent("block.cherry_wood_ladder.place");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_LADDER_HIT = HELPER.createSoundEvent("block.cherry_wood_ladder.hit");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_LADDER_FALL = HELPER.createSoundEvent("block.cherry_wood_ladder.fall");

	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHISELED_BOOKSHELF_BREAK = HELPER.createSoundEvent("block.cherry_wood_chiseled_bookshelf.break");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHISELED_BOOKSHELF_STEP = HELPER.createSoundEvent("block.cherry_wood_chiseled_bookshelf.step");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHISELED_BOOKSHELF_PLACE = HELPER.createSoundEvent("block.cherry_wood_chiseled_bookshelf.place");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHISELED_BOOKSHELF_HIT = HELPER.createSoundEvent("block.cherry_wood_chiseled_bookshelf.hit");
	public static final RegistryObject<SoundEvent> CHERRY_WOOD_CHISELED_BOOKSHELF_FALL = HELPER.createSoundEvent("block.cherry_wood_chiseled_bookshelf.fall");

	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CLOSET_OPEN = HELPER.createSoundEvent("block.bamboo_wood_closet.open");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CLOSET_CLOSE = HELPER.createSoundEvent("block.bamboo_wood_closet.close");

	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_LADDER_BREAK = HELPER.createSoundEvent("block.bamboo_wood_ladder.break");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_LADDER_STEP = HELPER.createSoundEvent("block.bamboo_wood_ladder.step");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_LADDER_PLACE = HELPER.createSoundEvent("block.bamboo_wood_ladder.place");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_LADDER_HIT = HELPER.createSoundEvent("block.bamboo_wood_ladder.hit");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_LADDER_FALL = HELPER.createSoundEvent("block.bamboo_wood_ladder.fall");

	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CHISELED_BOOKSHELF_BREAK = HELPER.createSoundEvent("block.bamboo_wood_chiseled_bookshelf.break");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CHISELED_BOOKSHELF_STEP = HELPER.createSoundEvent("block.bamboo_wood_chiseled_bookshelf.step");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CHISELED_BOOKSHELF_PLACE = HELPER.createSoundEvent("block.bamboo_wood_chiseled_bookshelf.place");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CHISELED_BOOKSHELF_HIT = HELPER.createSoundEvent("block.bamboo_wood_chiseled_bookshelf.hit");
	public static final RegistryObject<SoundEvent> BAMBOO_WOOD_CHISELED_BOOKSHELF_FALL = HELPER.createSoundEvent("block.bamboo_wood_chiseled_bookshelf.fall");

	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHEST_OPEN = HELPER.createSoundEvent("block.nether_wood_chest.open");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHEST_CLOSE = HELPER.createSoundEvent("block.nether_wood_chest.close");
	
	public static final RegistryObject<SoundEvent> NETHER_WOOD_LADDER_BREAK = HELPER.createSoundEvent("block.nether_wood_ladder.break");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_LADDER_STEP = HELPER.createSoundEvent("block.nether_wood_ladder.step");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_LADDER_PLACE = HELPER.createSoundEvent("block.nether_wood_ladder.place");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_LADDER_HIT = HELPER.createSoundEvent("block.nether_wood_ladder.hit");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_LADDER_FALL = HELPER.createSoundEvent("block.nether_wood_ladder.fall");

	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHISELED_BOOKSHELF_BREAK = HELPER.createSoundEvent("block.nether_wood_chiseled_bookshelf.break");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHISELED_BOOKSHELF_STEP = HELPER.createSoundEvent("block.nether_wood_chiseled_bookshelf.step");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHISELED_BOOKSHELF_PLACE = HELPER.createSoundEvent("block.nether_wood_chiseled_bookshelf.place");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHISELED_BOOKSHELF_HIT = HELPER.createSoundEvent("block.nether_wood_chiseled_bookshelf.hit");
	public static final RegistryObject<SoundEvent> NETHER_WOOD_CHISELED_BOOKSHELF_FALL = HELPER.createSoundEvent("block.nether_wood_chiseled_bookshelf.fall");

	public static class WoodworksSoundTypes {
		public static final ForgeSoundType CHERRY_WOOD_CHISELED_BOOKSHELF = new ForgeSoundType(1.0F, 1.0F, CHERRY_WOOD_CHISELED_BOOKSHELF_BREAK, CHERRY_WOOD_CHISELED_BOOKSHELF_STEP, CHERRY_WOOD_CHISELED_BOOKSHELF_PLACE, CHERRY_WOOD_CHISELED_BOOKSHELF_HIT, CHERRY_WOOD_CHISELED_BOOKSHELF_FALL);
		public static final ForgeSoundType CHERRY_WOOD_LADDER = new ForgeSoundType(1.0F, 1.0F, CHERRY_WOOD_LADDER_BREAK, CHERRY_WOOD_LADDER_STEP, CHERRY_WOOD_LADDER_PLACE, CHERRY_WOOD_LADDER_HIT, CHERRY_WOOD_LADDER_FALL);
		
		public static final ForgeSoundType BAMBOO_WOOD_CHISELED_BOOKSHELF = new ForgeSoundType(1.0F, 1.0F, BAMBOO_WOOD_CHISELED_BOOKSHELF_BREAK, BAMBOO_WOOD_CHISELED_BOOKSHELF_STEP, BAMBOO_WOOD_CHISELED_BOOKSHELF_PLACE, BAMBOO_WOOD_CHISELED_BOOKSHELF_HIT, BAMBOO_WOOD_CHISELED_BOOKSHELF_FALL);
		public static final ForgeSoundType BAMBOO_WOOD_LADDER = new ForgeSoundType(1.0F, 1.0F, BAMBOO_WOOD_LADDER_BREAK, BAMBOO_WOOD_LADDER_STEP, BAMBOO_WOOD_LADDER_PLACE, BAMBOO_WOOD_LADDER_HIT, BAMBOO_WOOD_LADDER_FALL);
		
		public static final ForgeSoundType NETHER_WOOD_CHISELED_BOOKSHELF = new ForgeSoundType(1.0F, 1.0F, NETHER_WOOD_CHISELED_BOOKSHELF_BREAK, NETHER_WOOD_CHISELED_BOOKSHELF_STEP, NETHER_WOOD_CHISELED_BOOKSHELF_PLACE, NETHER_WOOD_CHISELED_BOOKSHELF_HIT, NETHER_WOOD_CHISELED_BOOKSHELF_FALL);
		public static final ForgeSoundType NETHER_WOOD_LADDER = new ForgeSoundType(1.0F, 1.0F, NETHER_WOOD_LADDER_BREAK, NETHER_WOOD_LADDER_STEP, NETHER_WOOD_LADDER_PLACE, NETHER_WOOD_LADDER_HIT, NETHER_WOOD_LADDER_FALL);
	}
}
