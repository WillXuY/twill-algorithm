package org.willxu.algorithm.service.empty;

public interface RotateImage {
    /**
     * You are given an n x n 2D matrix representing an image, rotate
     * the image by 90 degrees (clockwise).
     * <p>
     * You have to rotate the image in-place, which means you have to
     * modify the input 2D matrix directly. DO NOT allocate another 2D
     * matrix and do the rotation.
     *
     * @param matrix n == matrix.length == matrix[i].length
     *               1 <= n <= 20
     *               -1000 <= matrix[i][j] <= 1000
     */
    void rotate(int[][] matrix);
}
