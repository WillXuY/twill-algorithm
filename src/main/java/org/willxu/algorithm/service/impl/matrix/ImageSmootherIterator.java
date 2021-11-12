/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.ImageSmoother;

public class ImageSmootherIterator implements ImageSmoother {
    @Override
    public int[][] imageSmoother(int[][] img) {
        int row = img.length;
        int col = img[0].length;
        int[][] output = new int[row][col];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                int count = img[i][j];
                int size = 1;
                boolean hasTop = i > 0;
                boolean hasDown = i < row - 1;
                boolean hasLeft = j > 0;
                boolean hasRight = j < col - 1;
                if (hasTop) {
                    count += img[i - 1][j];
                    size++;
                }
                if (hasDown) {
                    count += img[i + 1][j];
                    size++;
                }
                if (hasLeft) {
                    count += img[i][j - 1];
                    size++;
                }
                if (hasRight) {
                    count += img[i][j + 1];
                    size++;
                }
                if (hasTop && hasLeft) {
                    count += img[i - 1][j - 1];
                    size++;
                }
                if (hasTop && hasRight) {
                    count += img[i - 1][j + 1];
                    size++;
                }
                if (hasDown && hasLeft) {
                    count += img[i + 1][j - 1];
                    size++;
                }
                if (hasDown && hasRight) {
                    count += img[i + 1][j + 1];
                    size++;
                }
                output[i][j] = count / size;
            }
        }
        return output;
    }
}
