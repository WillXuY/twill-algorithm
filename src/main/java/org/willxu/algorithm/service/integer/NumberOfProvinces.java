package org.willxu.algorithm.service.integer;

public interface NumberOfProvinces {
    /**
     * There are n cities. Some of them are connected, while some are not.
     * If city a is connected directly with city b, and city b is
     * connected directly with city c, then city a is connected
     * indirectly with city c.
     * <p>
     * A province is a group of directly or indirectly connected cities
     * and no other cities outside of the group.
     * <p>
     * You are given an n x n matrix isConnected where
     * isConnected[i][j] = 1 if the ith city and the jth city are
     * directly connected, and isConnected[i][j] = 0 otherwise.
     * <p>
     * Return the total number of provinces.
     *
     * @param isConnected 1 <= n <= 200
     *                    n == isConnected.length
     *                    n == isConnected[i].length
     *                    isConnected[i][j] is 1 or 0.
     *                    isConnected[i][i] == 1
     *                    isConnected[i][j] == isConnected[j][i]
     */
    int findCircleNum(int[][] isConnected);
}
