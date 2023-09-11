package org.willxu.algorithm.domain;

/**
 * Given the radius and the position of the center of a circle,
 * implement the function randPoint which generates a uniform random
 * point inside the circle.
 * <p>
 * Implement the Solution class:
 * <p>
 * - Solution(double radius, double x_center, double y_center)
 *   initializes the object with the radius of the circle radius and
 *   the position of the center (x_center, y_center).
 *   0 < radius <= 10^8
 *   -10^7 <= x_center, y_center <= 10^7
 * - randPoint() returns a random point inside the circle. A point on
 *   the circumference of the circle is considered to be in the circle.
 *   The answer is returned as an array [x, y].
 * <p>
 * At most 3 * 10^4 calls will be made to randPoint.
 */
public interface GenerateRandomPointInCircle {
    double[] randPoint();
}
