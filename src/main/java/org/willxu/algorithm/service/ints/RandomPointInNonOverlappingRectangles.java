package org.willxu.algorithm.service.ints;

/**
 * You are given an array of non-overlapping axis-aligned rectangles
 * rects where rects[i] = [a_i, b_i, x_i, y_i] indicates that (a_i, b_i)
 * is the bottom-left corner point of the i^th rectangle and (x_i, y_i)
 * is the top-right corner point of the i^th rectangle. Design an
 * algorithm to pick a random integer point inside the space covered by
 * one of the given rectangles. A point on the perimeter of a rectangle
 * is included in the space covered by the rectangle.
 * <p>
 * Any integer point inside the space covered by one of the given
 * rectangles should be equally likely to be returned.
 * <p>
 * Note that an integer point is a point that has integer coordinates.
 * <p>
 * Implement the Solution class:
 * <p>
 * - Solution(int[][] rects) Initializes the object with the given
 *   rectangles rects.
 * <p>
 * 1 <= rects.length <= 100
 * rects[i].length == 4
 * -10^9 <= a_i < x_i <= 10^9
 * -10^9 <= b_i < y_i <= 10^9
 * x_i - a_i <= 2000
 * y_i - b_i <= 2000
 * All the rectangles do not overlap.
 * At most 104 calls will be made to pick.
 */
public interface RandomPointInNonOverlappingRectangles {
    /**
     * @return a random integer point [u, v] inside the space covered by
     *         one of the given rectangles.
     */
    int[] pick();
}
