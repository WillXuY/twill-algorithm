/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0812_largest_triangle_area;

public class LargestTriangleAreaCombination implements LargestTriangleArea {
    @Override
    public double largestTriangleArea(int[][] points) {
        double max = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    max = Math.max(max,
                            calculateArea(points[i], points[j], points[k]));
                }
            }
        }
        return max;
    }

    private double calculateArea(int[] i, int[] j, int[] k) {
        return 0.5 * Math.abs(i[0] *(j[1] - k[1])
                + j[0] * (k[1] - i[1])
                + k[0] * (i[1] - j[1])
        );
    }
}
