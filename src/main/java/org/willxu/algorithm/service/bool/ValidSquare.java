package org.willxu.algorithm.service.bool;

public interface ValidSquare {
    /**
     * Given the coordinates of four points in 2D space p1, p2, p3 and
     * p4, return true if the four points construct a square.
     * <p>
     * The coordinate of a point p_i is represented as [x_i, y_i]. The
     * input is not given in any order.
     * <p>
     * A valid square has four equal sides with positive length and four
     * equal angles (90-degree angles).
     *
     * @param p1,p2,p3,p4 length = 2
     *                    -10^4 <= x_i, y_i <= 10^4
     */
    boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4);
}
