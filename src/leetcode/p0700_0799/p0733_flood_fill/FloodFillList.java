/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.matrix;

import org.willxu.algorithm.service.matrix.FloodFill;

import java.util.ArrayList;
import java.util.List;

public class FloodFillList implements FloodFill {
    @Override
    public int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int originColor = image[sr][sc];
        Integer[] pixelIndex = new Integer[] {sr, sc};
        List<Integer[]> currentList = new ArrayList<>();
        currentList.add(pixelIndex);
        List<Integer[]> coloredList = new ArrayList<>();
        while (currentList.size() > 0) {
            List<Integer[]> nextList = new ArrayList<>();
            for (Integer[] pixel: currentList) {
                int row = pixel[0];
                int column = pixel[1];
                image[row][column] = newColor;
                if (row < image.length - 1
                        && originColor == image[row + 1][column]) {
                    nextList.add(new Integer[] {row + 1, column});
                }
                if (column < image[0].length - 1
                        && originColor == image[row][column + 1]) {
                    nextList.add(new Integer[] {row, column + 1});
                }
                if (row > 0 && originColor == image[row - 1][column]) {
                    nextList.add(new Integer[] {row - 1, column});
                }
                if (column > 0 && originColor == image[row][column - 1]) {
                    nextList.add(new Integer[] {row, column - 1});
                }
            }
            coloredList.addAll(currentList);
            for (Integer[] colored: coloredList) {
                nextList.removeIf(i
                        -> i[0].equals(colored[0]) && i[1].equals(colored[1]));
            }
            currentList = nextList;
        }
        return image;
    }
}
