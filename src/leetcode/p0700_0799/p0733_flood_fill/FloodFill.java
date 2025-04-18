/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.matrix;

public interface FloodFill {
    /**
     * An image is represented by an m x n integer grid image where
     * image[i][j] represents the pixel value of the image.
     * You are also given three integers sr, sc, and new Color. You
     * should perform a flood fill on the image starting from the pixel
     * image[sr][sc].
     * To perform a flood fill, consider the starting pixel, plus any
     * pixel, plus any pixels connected 4-directionally to the starting
     * pixel of the same color as the starting pixel, plus any pixels
     * connected 4-directionally to those pixels (also with the same
     * color), and so on. Replace the color of all of the aforementioned
     * pixels with newColor.
     * Return the modified image after performing the flood fill.
     *
     * @param image the source image matrix.
     *              1 <= image.length, image[i].length <= 50
     *              0 <= image[i][j] < 2^16
     * @param sr source row
     *           0 < sr < image.length
     * @param sc source column
     *           0 < sc < image[i].length
     * @param newColor 0 <= newColor < 2^16
     * @return the new image matrix
     */
    int[][] floodFill(int[][] image, int sr, int sc, int newColor);
}
