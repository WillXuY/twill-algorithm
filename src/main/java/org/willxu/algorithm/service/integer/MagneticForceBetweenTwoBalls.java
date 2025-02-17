package org.willxu.algorithm.service.integer;

public interface MagneticForceBetweenTwoBalls {
	/**
	 * In the universe Earth C-137, Rick discovered a special form of
	 * magnetic force between two balls if they are put in his new
	 * invented basket. Rick has n empty baskets, the i^th basket is at
	 * position[i], Morty has m balls and needs to distribute the balls
	 * into the baskets such that the minimum magnetic force between any
	 * two balls is maximum.
	 * <p>
	 * Rick stated that magnetic force between two different balls at
	 * positions x and y is |x - y|.
	 * <p>
	 * Given the integer array position and the integer m. Return the
	 * required force.
	 * 
	 * @param position n == position.length
	 *                 2 <= n <= 10^5
	 *                 1 <= position[i] <= 10^9
	 *                 All integers in position are distinct.
	 * @param m 2 <= m <= position.length
	 */
int maxDistance(int[] position, int m);
}
