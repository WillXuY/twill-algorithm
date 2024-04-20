package org.willxu.algorithm.service.integer;

public interface MinimumAreaRectangle {
    /**
     * You are given an array of points in the X-Y plane points where
     * points[i] = [x_i, y_i].
     * <p>
     * Return the minimum area of a rectangle formed from these points,
     * with sides parallel to the X and Y axes. If there is not any such
     * rectangle, return 0.
     *
     * @param points 1 <= points.length <= 500
     *               points[i].length == 2
     *               0 <= x_i, y_i <= 4 * 10^4
     *               All the given points are unique.
     */
    int minAreaRect(int[][] points);
}
