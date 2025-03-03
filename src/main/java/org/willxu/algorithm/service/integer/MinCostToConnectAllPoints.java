package org.willxu.algorithm.service.integer;

public interface MinCostToConnectAllPoints {
	/**
	 * You are given an array points representing integer coordinates
	 * of some points on a 2D-plane, where points[i] = [x_i, y_i].
	 * <p>
	 * The cost of connecting two points [x_i, y_i] and [x_j, y_j] is
	 * the manhattan distance between them: |x_i - x_j| + |y_i - y_j|,
	 * where |val| denotes the absolute value of val.
	 * <p>
	 * Return the minimum cost to make all points connected. All points
	 * are connected if there is exactly one simple path between any two
	 * points.
	 * 
	 * @param points 1 <= points.length <= 1000
	 *               -10^6 <= x_i, y_i <= 10^6
	 *               All pairs (x_i, y_i) are distinct.
	 */
	int minCostConnectPoints(int[][] points);
}
