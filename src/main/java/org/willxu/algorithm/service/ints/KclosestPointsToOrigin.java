package org.willxu.algorithm.service.ints;

public interface KclosestPointsToOrigin {
    /**
     * Given an array of points where points[i] = [x_i, y_i] represents
     * a point on the X-Y plane and an integer k, return the k closest
     * points to the origin (0, 0).
     * <p>
     * The distance between two points on the X-Y plane is the Euclidean
     * distance (i.e., √(x_1 - x_2)^2 + (y_1 - y_2)^2).
     * <p>
     * You may return the answer in any order. The answer is guaranteed
     * to be unique (except for the order that it is in).
     *
     * @param points 1 <= k <= points.length <= 10^4
     * @param k -10^4 <= x_i, y_i <= 10^4
     */
    int[][] kClosest(int[][] points, int k);
}
