package com.teamabnormals.woodworks.core.other;

import com.teamabnormals.blueprint.common.world.storage.tracking.DataProcessors;
import com.teamabnormals.blueprint.common.world.storage.tracking.TrackedData;
import com.teamabnormals.blueprint.common.world.storage.tracking.TrackedDataManager;
import com.teamabnormals.woodworks.core.Woodworks;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.registries.ForgeRegistries;

public class WoodworksDataProcessors {
	public static final TrackedData<ResourceLocation> CHEST_VARIANT = TrackedData.Builder.create(DataProcessors.RESOURCE_LOCATION, () -> ForgeRegistries.BLOCKS.getKey(Blocks.CHEST)).enableSaving().build();

	public static void registerTrackedData() {
		TrackedDataManager.INSTANCE.registerData(new ResourceLocation(Woodworks.MOD_ID, "chest_variant"), CHEST_VARIANT);
	}
}