package leetcode.p0000_0099.p0062_unique_paths;

public interface UniquePaths {
    /**
     * There is a robot on an m x n grid. The robot is initially located
     * at the top-left corner (i.e., grid[0][0]). The robot tries to
     * move to the bottom-right corner (i.e., grid[m - 1][n - 1]). The
     * robot can only move either down or right at any point in time.
     * <p>
     * Given the two integers m and n, return the number of possible
     * unique paths that the robot can take to reach the bottom-right
     * corner.
     * <p>
     * The test cases are generated so that the answer will be less than
     * or equal to 2 * 10^9.
     * <p>
     * Note:
     * Line 1: possible unique paths = 1.
     * Line 2: possible unique paths is 1, 2, 3, ..., n.
     * Line 3: possible unique paths is 1, 1(left) + 2(top) = 3, 3 + 3
     *                                  ..., (1 + n) * n / 2
     *
     * @param m,n 1 <= m, n <= 100
     */
    int uniquePaths(int m, int n);
}
