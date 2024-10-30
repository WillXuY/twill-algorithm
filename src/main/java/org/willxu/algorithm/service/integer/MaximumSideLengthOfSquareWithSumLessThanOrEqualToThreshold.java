package org.willxu.algorithm.service.integer;

public interface MaximumSideLengthOfSquareWithSumLessThanOrEqualToThreshold {
    /**
     * Given a m x n matrix mat and an integer threshold, return the
     * maximum side-length of a square with a sum less than or equal to
     * threshold or return 0 if there is no such square.
     *
     * @param mat m == mat.length
     *            n == mat[i].length
     *            1 <= m, n <= 300
     *            0 <= mat[i][j] <= 10^4
     * @param threshold 0 <= threshold <= 10^5
     */
    int maxSideLength(int[][] mat, int threshold);
}
