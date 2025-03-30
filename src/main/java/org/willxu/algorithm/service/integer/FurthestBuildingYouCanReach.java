package org.willxu.algorithm.service.integer;

public interface FurthestBuildingYouCanReach {

	/**
	 * You are given an integer array heights representing the heights
	 * of buildings, some bricks, and some ladders.
	 * <p>
	 * You start your journey from building 0 and move to the next
	 * building by possibly using bricks or ladders.
	 * <p>
	 * While moving from building i to building i+1 (0-indexed),
	 * <p>
	 * - If the current building's height is greater than or equal to
	 *   the next building's height, you do not need a ladder or bricks.
	 * - If the current building's height is less than the next
	 *   building's height, you can either use one ladder or
	 *   (h[i+1] - h[i]) bricks.
	 * <p>
	 * Return the furthest building index (0-indexed) you can reach if
	 * you use the given ladders and bricks optimally.
	 * 
	 * @param heights 1 <= heights.length <= 10^5
	 *                1 <= heights[i] <= 10^6
	 * @param bricks 0 <= bricks <= 10^9
	 * @param ladders 0 <= ladders <= heights.length
	 */
	int furthestBuilding(int[] heights, int bricks, int ladders);
}
