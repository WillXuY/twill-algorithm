package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface ReconstructTwoRowBinaryMatrix {
    /**
     * Given the following details of a matrix with n columns and 2 rows :
     * <p>
     * - The matrix is a binary matrix, which means each element in the
     *   matrix can be 0 or 1.
     * - The sum of elements of the 0-th(upper) row is given as upper.
     * - The sum of elements of the 1-st(lower) row is given as lower.
     * - The sum of elements in the i-th column(0-indexed) is colsum[i],
     *   where colsum is given as an integer array with length n.
     * <p>
     * Your task is to reconstruct the matrix with upper, lower and
     * colsum.
     * <p>
     * Return it as a 2-D integer array.
     * <p>
     * If there are more than one valid solution, any of them will be
     * accepted.
     * <p>
     * If no valid solution exists, return an empty 2-D array.
     *
     * @param upper,lower 0 <= upper, lower <= colsum.length
     * @param colsum 1 <= colsum.length <= 10^5
     *               0 <= colsum[i] <= 2
     */
    List<List<Integer>> reconstructMatrix(int upper, int lower, int[] colsum);
}
