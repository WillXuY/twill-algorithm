package org.willxu.algorithm.service.doublepoint;

public interface MinimumAreaRectangleIi {
    /**
     * You are given an array of points in the X-Y plane points where
     * points[i] = [x_i, y_i].
     * <p>
     * Return the minimum area of any rectangle formed from these
     * points, with sides not necessarily parallel to the X and Y axes.
     * If there is not any such rectangle, return 0.
     * <p>
     * Answers within 10^-5 of the actual answer will be accepted.
     *
     * @param points 1 <= points.length <= 50
     *               points[i].length == 2
     *               0 <= x_i, y_i <= 4 * 10^4
     *               All the given points are unique.
     */
    double minAreaFreeRect(int[][] points);
}
