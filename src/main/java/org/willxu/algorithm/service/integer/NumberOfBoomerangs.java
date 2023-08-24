package org.willxu.algorithm.service.integer;

public interface NumberOfBoomerangs {
    /**
     * You are given n points in the plane that are all distinct, where
     * points[i] = [x_i, y_i]. A boomerang is a tuple of points
     * (i, j, k) such that the distance between i and j equals the
     * distance between i and k (the order of the tuple matters).
     * <p>
     * Return the number of boomerangs.
     *
     * @param points n == points.length
     *               1 <= n <= 500
     *               points[i].length == 2
     *               -10^4 <= x_i, y_i <= 10^4
     *               All the points are unique.
     */
    int numberOfBoomerangs(int[][] points);
}
