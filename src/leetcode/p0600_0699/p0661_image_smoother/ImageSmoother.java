/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0661_image_smoother;

public interface ImageSmoother {
    /**
     * An image smoother is a filter of the size 3 x 3 that can be
     * applied to each cell of an image by rounding down the average of
     * the cell and the eight surrounding cells (i.e., the average of
     * the nine cells is not present, we do not consider it in the
     * average (i.e., the average of the four cells in the red
     * smoother).
     * Given an m x n integer matrix img representing the grayscale of
     * an image, return the image after applying the smoother on each
     * cell of it.
     *
     * @param img m == img.length, n == img[i].length
     *            1 <= m, n <= 200
     *            0 <= img[i][i] <= 255
     * @return output of the image smoother.
     */
    int[][] imageSmoother(int[][] img);
}
