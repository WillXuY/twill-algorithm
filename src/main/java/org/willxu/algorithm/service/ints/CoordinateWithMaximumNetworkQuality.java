package org.willxu.algorithm.service.ints;

public interface CoordinateWithMaximumNetworkQuality {

	/**
	 * You are given an array of network towers towers, where
	 * towers[i] = [x_i, y_i, q_i] denotes the i^th network tower with
	 * location (x_i, y_i) and quality factor q_i. All the coordinates
	 * are integral coordinates on the X-Y plane, and the distance
	 * between the two coordinates is the Euclidean distance.
	 * <p>
	 * You are also given an integer radius where a tower is reachable
	 * if the distance is less than or equal to radius. Outside that
	 * distance, the signal becomes garbled, and the tower is not
	 * reachable.
	 * <p>
	 * The signal quality of the i^th tower at a coordinate (x, y) is
	 * calculated with the formula ⌊q_i / (1 + d)⌋, where d is the
	 * distance between the tower and the coordinate. The network
	 * quality at a coordinate is the sum of the signal qualities from
	 * all the reachable towers.
	 * <p>
	 * Return the array [c_x, c_y] representing the integral coordinate
	 * (c_x, c_y) where the network quality is maximum. If there are
	 * multiple coordinates with the same network quality, return the
	 * lexicographically minimum non-negative coordinate.
	 * <p>
	 * Note:
	 * <p>
	 * - A coordinate (x1, y1) is lexicographically smaller than (x2, y2)
	 *   if either:
	 *   - x1 < x2, or
	 *   - x1 == x2 and y1 < y2.
	 * - ⌊val⌋ is the greatest integer less than or equal to val (the
	 *   floor function).
	 * 
	 * @param towers 1 <= towers.length <= 50
	 *               towers[i].length == 3
	 *               0 <= x_i, y_i, q_i <= 50
	 * @param radius 1 <= radius <= 50
	 */
	int[] bestCoordinate(int[][] towers, int radius);
}
