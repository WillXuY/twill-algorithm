package leetcode.p2400_2499.p2481_minimum_cuts_to_divide_circle;

public interface MinimumCutsToDivideCircle {
    /**
     * A valid cut in a circle can be:
     * <p>
     * - A cut that is represented by a straight line that touches two
     *   points on the edge of the circle and passes through its center,
     *   or
     * - A cut that is represented by a straight line that touches one
     *   point on the edge of the circle and its center.
     * <p>
     * Some valid and invalid cuts are shown in the figures below.
     * <p>
     * Given the integer n, return the minimum number of cuts needed to
     * divide a circle into n equal slices.
     *
     * @param n 1 <= n <= 100
     */
    int numberOfCuts(int n);
}
