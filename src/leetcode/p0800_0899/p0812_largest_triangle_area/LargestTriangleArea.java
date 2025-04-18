/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0812_largest_triangle_area;

public interface LargestTriangleArea {
    /**
     * Given an array of points on the X-Y plane points where
     * points[i] = [x_i, y_i], return the area of the largest triangle
     * that can be formed by any three different points. Answers within
     * 10^-5 of the actual answer will be accepted.
     *
     * @param points 3 <= points.length <= 50
     *               -50 <= x_i, y_i <= 50
     *               All the given points are unique.
     * @return area of largest triangle.
     */
    double largestTriangleArea(int[][] points);
}
