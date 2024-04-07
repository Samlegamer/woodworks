package com.teamabnormals.woodworks.core.other;

import com.teamabnormals.blueprint.common.world.modification.structure.SimpleStructureRepaletter;
import com.teamabnormals.blueprint.common.world.modification.structure.StructureRepaletterEntry;
import com.teamabnormals.blueprint.core.registry.BlueprintDataPackRegistries;
import com.teamabnormals.blueprint.core.registry.BlueprintHolderSets;
import com.teamabnormals.woodworks.core.Woodworks;
import com.teamabnormals.woodworks.core.data.server.WoodworksRecipeProvider;
import com.teamabnormals.woodworks.core.registry.WoodworksBlocks;
import net.minecraft.core.HolderGetter;
import net.minecraft.core.HolderSet;
import net.minecraft.core.registries.Registries;
import net.minecraft.data.worldgen.BootstapContext;
import net.minecraft.resources.ResourceKey;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.levelgen.structure.Structure;
import net.minecraftforge.common.ForgeConfigSpec.ConfigValue;
import net.minecraftforge.common.crafting.conditions.AndCondition;
import net.minecraftforge.common.crafting.conditions.ICondition;

import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.teamabnormals.woodworks.core.WoodworksConfig.COMMON;
import static net.minecraft.world.level.levelgen.structure.BuiltinStructures.*;

public class WoodworksStructureRepaletters {

	public static void bootstrap(BootstapContext<StructureRepaletterEntry> context) {
		HolderGetter<Structure> structures = context.lookup(Registries.STRUCTURE);

		basicRepaletter(context, structures, chestConfig(), "oak_chests_in_villages", Blocks.CHEST, WoodworksBlocks.OAK_CHEST.get(), VILLAGE_PLAINS);
		basicRepaletter(context, structures, chestConfig(), "spruce_chests_in_villages", Blocks.CHEST, WoodworksBlocks.SPRUCE_CHEST.get(), VILLAGE_TAIGA, VILLAGE_SNOWY);
		basicRepaletter(context, structures, chestConfig(), "jungle_chests_in_villages", Blocks.CHEST, WoodworksBlocks.JUNGLE_CHEST.get(), VILLAGE_DESERT);
		basicRepaletter(context, structures, chestConfig(), "acacia_chests_in_villages", Blocks.CHEST, WoodworksBlocks.ACACIA_CHEST.get(), VILLAGE_SAVANNA);

		basicRepaletter(context, structures, bookshelfConfig(), "spruce_bookshelves_in_villages", Blocks.BOOKSHELF, WoodworksBlocks.SPRUCE_BOOKSHELF.get(), VILLAGE_TAIGA, VILLAGE_SNOWY);
		basicRepaletter(context, structures, bookshelfConfig(), "jungle_bookshelves_in_villages", Blocks.BOOKSHELF, WoodworksBlocks.JUNGLE_BOOKSHELF.get(), VILLAGE_DESERT);
		basicRepaletter(context, structures, bookshelfConfig(), "acacia_bookshelves_in_villages", Blocks.BOOKSHELF, WoodworksBlocks.ACACIA_BOOKSHELF.get(), VILLAGE_SAVANNA);

		basicRepaletter(context, structures, ladderConfig(), "spruce_ladders_in_villages", Blocks.LADDER, WoodworksBlocks.SPRUCE_LADDER.get(), VILLAGE_TAIGA, VILLAGE_SNOWY);
		basicRepaletter(context, structures, ladderConfig(), "jungle_ladders_in_villages", Blocks.LADDER, WoodworksBlocks.JUNGLE_LADDER.get(), VILLAGE_DESERT);
		basicRepaletter(context, structures, ladderConfig(), "acacia_ladders_in_villages", Blocks.LADDER, WoodworksBlocks.ACACIA_LADDER.get(), VILLAGE_SAVANNA);
	}

	@SafeVarargs
	private static void basicRepaletter(BootstapContext<StructureRepaletterEntry> context, HolderGetter<Structure> structures, ICondition condition, String name, Block replacesBlock, Block replacesWith, ResourceKey<Structure>... selector) {
		context.register(
				repaletterKey(name),
				new StructureRepaletterEntry(
						BlueprintHolderSets.conditional(HolderSet.direct(Stream.of(selector).map(structures::getOrThrow).collect(Collectors.toList())), condition),
						Optional.empty(), false, new SimpleStructureRepaletter(replacesBlock, replacesWith))
		);
	}

	private static ICondition bookshelfConfig() {
		return configCondition(COMMON.woodenBookshelves, "wooden_bookshelves", COMMON.woodenBookshelvesInVillages, "wooden_bookshelves_in_villages");
	}

	private static ICondition ladderConfig() {
		return configCondition(COMMON.woodenLadders, "wooden_ladders", COMMON.woodenLaddersInVillages, "wooden_ladders_in_villages");
	}

	private static ICondition chestConfig() {
		return configCondition(COMMON.woodenChests, "wooden_chests", COMMON.woodenChestsInVillages, "wooden_chests_in_villages");
	}

	private static ICondition configCondition(ConfigValue<?> value1, String key1, ConfigValue<?> value2, String key2) {
		return new AndCondition(WoodworksRecipeProvider.config(value1, key1), WoodworksRecipeProvider.config(value2, key2));
	}

	private static ResourceKey<StructureRepaletterEntry> repaletterKey(String name) {
		return ResourceKey.create(BlueprintDataPackRegistries.STRUCTURE_REPALETTERS, new ResourceLocation(Woodworks.MOD_ID, name));
	}
}
