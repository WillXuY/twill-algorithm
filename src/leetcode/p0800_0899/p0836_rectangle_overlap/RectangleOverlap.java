/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

public interface RectangleOverlap {
    /**
     * An axis-aligned rectangle is represented as a list
     * [x1, y1, x2, y2], where (x1, y1) is the coordinate of its
     * bottom-left corner, and (x2, y2) is the coordinate of its
     * top-right corner. Its top and bottom edges are parallel to the
     * X-axis, and its left and right edges are parallel to the Y-axis.
     * Two rectangles overlap if the area of their intersection is
     * positive. To be clear, two rectangles that only touch at the
     * corner or edges do not overlap.
     * Given two axis-aligned rectangles rec1 and rec2, return true if
     * they overlap, otherwise return false.
     *
     * @param rec1 length == 4
     *             -10^9 <= rec1[i] <= 10^9
     *             represent a valid rectangle with a non-zero area.
     * @param rec2 length == 4
     *             -10^9 <= rec2[i] <= 10^9
     *             represent a valid rectangle with a non-zero area.
     * @return is two rectangles overlap.
     */
    boolean isRectangleOverlap(int[] rec1, int[] rec2);
}
