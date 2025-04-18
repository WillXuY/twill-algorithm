package leetcode.p2000_2099.p2078_two_furthest_houses_with_different_colors;

public interface TwoFurthestHousesWithDifferentColors {
    /**
     * There are n houses evenly lined up on the street, and each house
     * is beautifully painted. You are given a 0-indexed integer array
     * colors of length n, where colors[i] represents the color of the
     * ith house.
     * <p>
     * Return the maximum distance between two houses with different
     * colors.
     * <p>
     * The distance between the ith and jth houses is abs(i - j), where
     * abs(x) is the absolute value of x.
     *
     * @param colors n == colors.length
     *               2 <= n <= 100
     *               0 <= colors[i] <= 100
     *               Test data are generated such that at least two
     *               houses have different colors.
     */
    int maxDistance(int[] colors);
}
