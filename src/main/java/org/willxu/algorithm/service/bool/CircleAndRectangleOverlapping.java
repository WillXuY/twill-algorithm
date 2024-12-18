package org.willxu.algorithm.service.bool;

public interface CircleAndRectangleOverlapping {
    /**
     * You are given a circle represented as (radius, xCenter, yCenter)
     * and an axis-aligned rectangle represented as (x1, y1, x2, y2),
     * where (x1, y1) are the coordinates of the bottom-left corner, and
     * (x2, y2) are the coordinates of the top-right corner of the
     * rectangle.
     * <p>
     * Return true if the circle and rectangle are overlapped otherwise
     * return false. In other words, check if there is any point
     * (x_i, y_i) that belongs to the circle and the rectangle at the
     * same time.
     *
     * @param radius 1 <= radius <= 2000
     * @param xCenter,yCenter -10^4 <= xCenter, yCenter <= 10^4
     * @param x1,x2 -10^4 <= x1 < x2 <= 10^4
     * @param y1,y2 -10^4 <= y1 < y2 <= 10^4
     */
    boolean checkOverlap(int radius, int xCenter, int yCenter,
                         int x1, int y1, int x2, int y2);
}
