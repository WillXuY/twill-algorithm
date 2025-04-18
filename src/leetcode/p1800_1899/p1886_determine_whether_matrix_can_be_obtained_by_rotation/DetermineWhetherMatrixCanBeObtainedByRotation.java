package org.willxu.algorithm.service.bool;

public interface DetermineWhetherMatrixCanBeObtainedByRotation {
    /**
     * Given two n x n binary matrices mat and target, return true if it
     * is possible to make mat equal to target by rotating mat in
     * 90-degree increments, or false otherwise.
     *
     * @param mat,target n == mat.length == target.length
     *                   n == mat[i].length == target[i].length
     *                   1 <= n <= 10
     *                   mat[i][j] and target[i][j] are either 0 or 1.
     */
    boolean findRotation(int[][] mat, int[][] target);
}
