package com.teamabnormals.woodworks.core.data.server;

import com.teamabnormals.blueprint.core.registry.BlueprintDataPackRegistries;
import com.teamabnormals.woodworks.core.Woodworks;
import com.teamabnormals.woodworks.core.other.WoodworksStructureRepaletters;
import net.minecraft.core.HolderLookup.Provider;
import net.minecraft.core.RegistrySetBuilder;
import net.minecraft.data.PackOutput;
import net.minecraftforge.common.data.DatapackBuiltinEntriesProvider;

import java.util.Set;
import java.util.concurrent.CompletableFuture;

public final class WoodworksDatapackBuiltinEntriesProvider extends DatapackBuiltinEntriesProvider {

	private static final RegistrySetBuilder BUILDER = new RegistrySetBuilder()
			.add(BlueprintDataPackRegistries.STRUCTURE_REPALETTERS, WoodworksStructureRepaletters::bootstrap);

	public WoodworksDatapackBuiltinEntriesProvider(PackOutput output, CompletableFuture<Provider> lookupProvider) {
		super(output, lookupProvider, BUILDER, Set.of(Woodworks.MOD_ID));
	}
}