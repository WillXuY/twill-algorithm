/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.matrix;

public interface FlippingAnImage {
    /**
     * Given an n x n binary matrix image, flip the image horizontally,
     * then invert it, and return the resulting image.
     * To flip an image horizontally means that each row of the image is
     * reversed.
     * - For example, flipping [1, 1, 0] horizontally results in
     *   [0, 1, 1].
     * To invert an image means that each 0 is replaced by 1, and each 1
     * is replaced by 0.
     * - For example, inverting [0, 1, 1] results in [1, 0, 0].
     *
     * @param image 1 <= image.length = image[i].length <= 20
     *              images[i][j] is either 0 or 1.
     * @return reverse and invert the image.
     */
    int[][] flipAndInvertImage(int[][] image);
}
