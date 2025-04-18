package org.willxu.algorithm.service.matrix;

public interface Convert1dArrayInto2dArray {
    /**
     * You are given a 0-indexed 1-dimensional (1D) integer array
     * original, and two integers, m and n. You are tasked with creating
     * a 2-dimensional (2D) array with m rows and n columns using all
     * the elements from original.
     * <p>
     * The elements from indices 0 to n - 1 (inclusive) of original
     * should form the first row of the constructed 2D array, the
     * elements from indices n to 2 * n - 1 (inclusive) should form the
     * second row of the constructed 2D array, and so on.
     * <p>
     * Return an m x n 2D array constructed according to the above
     * procedure, or an empty 2D array if it is impossible.
     *
     * @param original 1 <= original.length <= 5 * 104
     *                 1 <= original[i] <= 105
     * @param m,n 1 <= m, n <= 4 * 104
     */
    int[][] construct2DArray(int[] original, int m, int n);
}
