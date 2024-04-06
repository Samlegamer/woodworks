package com.teamabnormals.woodworks.core.other.tags;

import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.woodworks.core.Woodworks;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;

public class WoodworksItemTags {
	public static final TagKey<Item> LADDERS = TagUtil.itemTag("forge", "ladders");

	public static final TagKey<Item> WOODEN_BOARDS = itemTag("wooden_boards");
	public static final TagKey<Item> WOODEN_CHESTS = itemTag("wooden_chests");
	public static final TagKey<Item> WOODEN_TRAPPED_CHESTS = itemTag("wooden_trapped_chests");
	public static final TagKey<Item> WOODEN_LADDERS = itemTag("wooden_chests");
	public static final TagKey<Item> WOODEN_BEEHIVES = itemTag("wooden_beehives");
	public static final TagKey<Item> WOODEN_BOOKSHELVES = itemTag("wooden_bookshelves");
	public static final TagKey<Item> WOODEN_CHISELED_BOOKSHELVES = itemTag("wooden_chiseled_bookshelves");

	public static final TagKey<Item> LEAF_PILES = itemTag("leaf_piles");

	private static TagKey<Item> itemTag(String name) {
		return TagUtil.itemTag(Woodworks.MOD_ID, name);
	}
}