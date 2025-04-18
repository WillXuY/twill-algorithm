package leetcode.p2400_2499.p2485_find_the_pivot_integer;

public interface FindThePivotInteger {
    /**
     * Given a positive integer n, find the pivot integer x such that:
     * <p>
     * - The sum of all elements between 1 and x inclusively equals the
     *   sum of all elements between x and n inclusively.
     * <p>
     * Return the pivot integer x. If no such integer exists, return -1.
     * It is guaranteed that there will be at most one pivot index for
     * the given input.
     *
     * @param n 1 <= n <= 1000
     */
    int pivotInteger(int n);
}
