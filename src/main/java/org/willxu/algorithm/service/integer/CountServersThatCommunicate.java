package org.willxu.algorithm.service.integer;

public interface CountServersThatCommunicate {
    /**
     * You are given a map of a server center, represented as a m * n
     * integer matrix grid, where 1 means that on that cell there is a
     * server and 0 means that it is no server. Two servers are said to
     * communicate if they are on the same row or on the same column.
     * <p>
     * Return the number of servers that communicate with any other
     * server.
     *
     * @param grid m == grid.length
     *             n == grid[i].length
     *             1 <= m <= 250
     *             1 <= n <= 250
     *             grid[i][j] == 0 or 1
     */
    int countServers(int[][] grid);
}
