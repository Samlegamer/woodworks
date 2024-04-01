package com.teamabnormals.woodworks.core.data.client;

import com.teamabnormals.woodworks.core.Woodworks;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.common.data.SoundDefinition;
import net.minecraftforge.common.data.SoundDefinitionsProvider;

import javax.annotation.Nullable;

import static com.teamabnormals.woodworks.core.registry.WoodworksSounds.*;

public class WoodworksSoundDefinitionsProvider extends SoundDefinitionsProvider {

	public WoodworksSoundDefinitionsProvider(PackOutput output, ExistingFileHelper fileHelper) {
		super(output, Woodworks.MOD_ID, fileHelper);
	}

	@Override
	public void registerSounds() {
		this.add(CHERRY_WOOD_CHISELED_BOOKSHELF_PLACE.get(), define("block/cherry_wood_chiseled_bookshelf/break", 6, "subtitles.block.generic.place"));
		this.add(CHERRY_WOOD_CHISELED_BOOKSHELF_BREAK.get(), define("block/cherry_wood_chiseled_bookshelf/break", 6, "subtitles.block.generic.break"));
		this.add(CHERRY_WOOD_CHISELED_BOOKSHELF_HIT.get(), define("block/cherry_wood_chiseled_bookshelf/step", 5, "subtitles.block.generic.hit"));
		this.add(CHERRY_WOOD_CHISELED_BOOKSHELF_STEP.get(), define("block/cherry_wood_chiseled_bookshelf/step", 5, "subtitles.block.generic.footsteps"));
		this.add(CHERRY_WOOD_CHISELED_BOOKSHELF_FALL.get(), define("block/cherry_wood_chiseled_bookshelf/step", 5, null));

		this.add(BAMBOO_WOOD_CHISELED_BOOKSHELF_PLACE.get(), define("block/bamboo_wood_chiseled_bookshelf/break", 6, "subtitles.block.generic.place"));
		this.add(BAMBOO_WOOD_CHISELED_BOOKSHELF_BREAK.get(), define("block/bamboo_wood_chiseled_bookshelf/break", 6, "subtitles.block.generic.break"));
		this.add(BAMBOO_WOOD_CHISELED_BOOKSHELF_HIT.get(), define("block/bamboo_wood_chiseled_bookshelf/step", 5, "subtitles.block.generic.hit"));
		this.add(BAMBOO_WOOD_CHISELED_BOOKSHELF_STEP.get(), define("block/bamboo_wood_chiseled_bookshelf/step", 5, "subtitles.block.generic.footsteps"));
		this.add(BAMBOO_WOOD_CHISELED_BOOKSHELF_FALL.get(), define("block/bamboo_wood_chiseled_bookshelf/step", 5, null));
		
		this.add(NETHER_WOOD_CHISELED_BOOKSHELF_PLACE.get(), define("block/nether_wood_chiseled_bookshelf/break", 6, "subtitles.block.generic.place"));
		this.add(NETHER_WOOD_CHISELED_BOOKSHELF_BREAK.get(), define("block/nether_wood_chiseled_bookshelf/break", 6, "subtitles.block.generic.break"));
		this.add(NETHER_WOOD_CHISELED_BOOKSHELF_HIT.get(), define("block/nether_wood_chiseled_bookshelf/step", 5, "subtitles.block.generic.hit"));
		this.add(NETHER_WOOD_CHISELED_BOOKSHELF_STEP.get(), define("block/nether_wood_chiseled_bookshelf/step", 5, "subtitles.block.generic.footsteps"));
		this.add(NETHER_WOOD_CHISELED_BOOKSHELF_FALL.get(), define("block/nether_wood_chiseled_bookshelf/step", 5, null));
	}

	public static SoundDefinition define(String path, int count, @Nullable String subtitle) {
		SoundDefinition definition = definition();
		if (subtitle != null) {
			definition.subtitle(subtitle);
		}

		for (int i = 1; i <= count; i++) {
			definition.with(sound(new ResourceLocation(Woodworks.MOD_ID, path + i)));
		}

		return definition;
	}
}