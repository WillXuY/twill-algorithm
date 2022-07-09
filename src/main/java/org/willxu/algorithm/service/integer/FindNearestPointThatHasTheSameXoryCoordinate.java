package org.willxu.algorithm.service.integer;

public interface FindNearestPointThatHasTheSameXoryCoordinate {
    /**
     * You are given two integers, x and y, which represent your current
     * location on a Cartesian grid: (x, y). You are also given an array
     * points where each points[i] = [a_i, b_i] represents that a point
     * exists at (a_i, b_i). A point is valid if it shares the same
     * x-coordinate or the same y-coordinate as your location.
     *
     * Return the index (0-indexed) of the valid point with the smallest
     * Manhattan distance from your current location. If there are
     * multiple, return the valid point with the smallest index. If
     * there are no valid points, return -1.
     *
     * The Manhattan distance between two points (x1, y1) and (x2, y2)
     * is abs(x1 - x2) + abs(y1 - y2).
     *
     * @param x, y 1 <= x, y, ai, bi <= 104
     * @param points 1 <= points.length <= 104
     *               points[i].length == 2
     */
    int nearestValidPoint(int x, int y, int[][] points);
}
