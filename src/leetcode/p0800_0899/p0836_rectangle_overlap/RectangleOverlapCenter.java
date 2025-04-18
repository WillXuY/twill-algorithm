/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.RectangleOverlap;

public class RectangleOverlapCenter implements RectangleOverlap {
    /**
     * c: center of rec1
     * xc = (x1 + x2) / 2
     * yc = (y1 + y2) / 2
     * d: center of rec2
     * xd = (x3 + x4) / 2
     * yd = (y3 + y4) / 2
     *
     * length and width of rec1:
     * lc = x2 - x1
     * wc = y2 - y1
     * length and width of rec2:
     * ld = x4 - x3
     * wd = y4 - y3
     *
     * Center point's x distance < (rec1's length + rec2's length) / 2
     * |xd - xc| < (lc + ld) / 2
     * 2 * |xd - xc| < lc + ld
     * |x1 + x2 - x3 - x4| < x2 - x1 + x4 - x3
     * |y1 + y2 - y3 - y4| < y2 - y1 + y4 - y3
     *
     * x1 = rec1[0], y1 = rec1[1], x2 = rec1[2], y2 = rec1[3]
     * x3 = rec2[0], y3 = rec2[1], x4 = rec2[2], y4 = rec2[3]
     *
     * @param rec1 length == 4
     *             -10^9 <= rec1[i] <= 10^9
     *             represent a valid rectangle with a non-zero area.
     * @param rec2 length == 4
     *             -10^9 <= rec2[i] <= 10^9
     *             represent a valid rectangle with a non-zero area.
     * @return Center point's x distance < (rec1's length + rec2's length) / 2
     *         and y distance < (width1 + width2) / 2
     */
    @Override
    public boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        long centerDistanceX2 = Math.abs(
                (long)rec1[0] + rec1[2] - rec2[0] - rec2[2]);
        long sumX = (long)rec1[2] - rec1[0] + rec2[2] - rec2[0];
        long centerDistanceY2 = Math.abs(
                (long)rec1[1] + rec1[3] - rec2[1] - rec2[3]);
        long sumY = (long)rec1[3] - rec1[1] + rec2[3] - rec2[1];
        return centerDistanceX2 < sumX && centerDistanceY2 < sumY;
    }
}
