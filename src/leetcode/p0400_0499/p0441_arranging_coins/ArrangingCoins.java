package leetcode.p0400_0499.p0441_arranging_coins;

public interface ArrangingCoins {
    /**
     * You have n coins and you want to build a staircase with these
     * coins. The staircase consists of k rows where the i^th row has
     * exactly i coins. The last row of the staircase may be incomplete.
     * Given the integer n, return the number of complete rows of the
     * staircase you will build.
     *
     * @param n 1 <= n <= 2^31 - 1
     * @return the number of complete rows which could be built.
     */
    int arrangeCoins(int n);
}
