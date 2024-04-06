package com.teamabnormals.woodworks.core.other.tags;

import com.teamabnormals.blueprint.core.util.TagUtil;
import com.teamabnormals.woodworks.core.Woodworks;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;

public class WoodworksBlockTags {
	public static final TagKey<Block> LADDERS = TagUtil.blockTag("forge", "ladders");

	public static final TagKey<Block> WOODEN_BOARDS = blockTag("wooden_boards");
	public static final TagKey<Block> WOODEN_CHESTS = blockTag("wooden_chests");
	public static final TagKey<Block> WOODEN_TRAPPED_CHESTS = blockTag("wooden_trapped_chests");
	public static final TagKey<Block> WOODEN_LADDERS = blockTag("wooden_chests");
	public static final TagKey<Block> WOODEN_BEEHIVES = blockTag("wooden_beehives");
	public static final TagKey<Block> WOODEN_BOOKSHELVES = blockTag("wooden_bookshelves");
	public static final TagKey<Block> WOODEN_CHISELED_BOOKSHELVES = blockTag("wooden_chiseled_bookshelves");

	public static final TagKey<Block> LEAF_PILES = blockTag("leaf_piles");

	private static TagKey<Block> blockTag(String name) {
		return TagUtil.blockTag(Woodworks.MOD_ID, name);
	}
}