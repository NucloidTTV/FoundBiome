package net.alureon.foundbiome.util;

import org.bukkit.block.Biome;

public class BiomeLists {

	/**
	 * These biomes should never be used for anything. They don't count towards the
	 * achievement, and there is no reason to ever announce them.
	 */
	// private static final List<Biome> completelyDisabledBiomes =
	// Arrays.asList(Biome.THE_VOID, Biome.MOUNTAIN_EDGE, Biome.DEEP_WARM_OCEAN);

	/**
	 * Gets the list of disabled biomes.
	 * 
	 * @return the list of disabled biomes.
	 */
	// public static List<Biome> getDisabledBiomes() {
	// return completelyDisabledBiomes;
	// }

	/**
	 * Checks if the biome is needed for the achievement.
	 * 
	 * @return true if the biome DOES NOT contribute to the vanilla achievement.
	 */
	public static boolean isNonAchievementBiome(Biome b) {
		switch (b) {
		case BADLANDS:
			return false;
		case BAMBOO_JUNGLE:
			return false;
		case BEACH:
			return false;
		case BIRCH_FOREST:
			return false;
		case COLD_OCEAN:
			return false;
		case CRIMSON_FOREST:
			return false;
		case DARK_FOREST:
			return false;
		case DEEP_DARK:
			return true;
		case DEEP_COLD_OCEAN:
			return false;
		case DEEP_FROZEN_OCEAN:
			return false;
		case DEEP_LUKEWARM_OCEAN:
			return false;
		case DEEP_OCEAN:
			return true;
		case DESERT:
			return false;
		case DRIPSTONE_CAVES:
			return false;
		case END_BARRENS:
			return true;
		case END_HIGHLANDS:
			return true;
		case END_MIDLANDS:
			return true;
		case ERODED_BADLANDS:
			return true;
		case FLOWER_FOREST:
			return true;
		case FOREST:
			return false;
		case FROZEN_OCEAN:
			return true;
		case FROZEN_RIVER:
			return false;
		case FROZEN_PEAKS:
			return true;
		case GROVE:
			return true;
		case ICE_SPIKES:
			return true;
		case JUNGLE:
			return false;
		case JAGGED_PEAKS:
			return false;
		case LUKEWARM_OCEAN:
			return false;
		case LUSH_CAVES:
			return true;
		case MANGROVE_SWAMP:
			return true;
		case MEADOW:
			return true;
		case MUSHROOM_FIELDS:
			return false;
		case NETHER_WASTES:
			return false;
		case OCEAN:
			return true;
		case OLD_GROWTH_BIRCH_FOREST:
			return true;
		case OLD_GROWTH_PINE_TAIGA:
			return true;
		case OLD_GROWTH_SPRUCE_TAIGA:
			return true;
		case PLAINS:
			return false;
		case RIVER:
			return false;
		case SAVANNA:
			return false;
		case SAVANNA_PLATEAU:
			return false;
		case SMALL_END_ISLANDS:
			return true;
		case SNOWY_BEACH:
			return false;
		case SNOWY_PLAINS:
			return false;
		case SNOWY_SLOPES:
			return false;
		case SNOWY_TAIGA:
			return false;
		case SOUL_SAND_VALLEY:
			return false;
		case SPARSE_JUNGLE:
			return true;
		case STONY_PEAKS:
			return false;
		case STONY_SHORE:
			return false;
		case SUNFLOWER_PLAINS:
			return true;
		case SWAMP:
			return false;
		case TAIGA:
			return false;
		case THE_END:
			return true;
		case THE_VOID:
			return true;
		case WARM_OCEAN:
			return false;
		case WARPED_FOREST:
			return false;
		case WINDSWEPT_FOREST:
			return false;
		case WINDSWEPT_GRAVELLY_HILLS:
			return false;
		case WINDSWEPT_HILLS:
			return false;
		case WINDSWEPT_SAVANNA:
			return false;
		case WOODED_BADLANDS:
			return false;
		default:
			return true;
		}
	}
}
