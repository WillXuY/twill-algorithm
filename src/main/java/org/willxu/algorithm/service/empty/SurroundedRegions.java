package org.willxu.algorithm.service.empty;

public interface SurroundedRegions {
    /**
     * Given an m x n matrix board containing 'X' and 'O', capture all
     * regions that are 4-directionally surrounded by 'X'.
     * <p>
     * A region is captured by flipping all 'O's into 'X's in that
     * surrounded region.
     *
     * @param board m == board.length
     *              n == board[i].length
     *              1 <= m, n <= 200
     *              board[i][j] is 'X' or 'O'.
     */
    void solve(char[][] board);
}
