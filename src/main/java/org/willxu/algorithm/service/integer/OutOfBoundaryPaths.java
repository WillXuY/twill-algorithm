package org.willxu.algorithm.service.integer;

public interface OutOfBoundaryPaths {
    /**
     * There is an m x n grid with a ball. The ball is initially at the
     * position [startRow, startColumn]. You are allowed to move the
     * ball to one of the four adjacent cells in the grid (possibly out
     * of the grid crossing the grid boundary). You can apply at most
     * maxMove moves to the ball.
     * <p>
     * Given the five integers m, n, maxMove, startRow, startColumn,
     * return the number of paths to move the ball out of the grid
     * boundary. Since the answer can be very large, return it modulo
     * 10^9 + 7.
     *
     * @param m,n 1 <= m, n <= 50
     * @param maxMove 0 <= maxMove <= 50
     * @param startRow 0 <= startRow < m
     * @param startColumn 0 <= startColumn < n
     */
    int findPaths(int m, int n, int maxMove, int startRow, int startColumn);
}
