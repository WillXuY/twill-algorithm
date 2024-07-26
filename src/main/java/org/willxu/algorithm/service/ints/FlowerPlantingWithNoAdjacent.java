package org.willxu.algorithm.service.ints;

public interface FlowerPlantingWithNoAdjacent {
    /**
     * You have n gardens, labeled from 1 to n, and an array paths where
     * paths[i] = [x_i, y_i] describes a bidirectional path between
     * garden x_i to garden y_i. In each garden, you want to plant one
     * of 4 types of flowers.
     * <p>
     * All gardens have at most 3 paths coming into or leaving it.
     * <p>
     * Your task is to choose a flower type for each garden such that,
     * for any two gardens connected by a path, they have different
     * types of flowers.
     * <p>
     * Return any such a choice as an array answer, where answer[i] is
     * the type of flower planted in the (i+1)th garden. The flower
     * types are denoted 1, 2, 3, or 4. It is guaranteed an answer exists.
     *
     * @param n 1 <= n <= 10^4
     * @param paths 0 <= paths.length <= 2 * 10^4
     *              paths[i].length == 2
     *              1 <= x_i, y_i <= n
     *              x_i != y_i
     *              Every garden has at most 3 paths coming into or
     *              leaving it.
     */
    int[] gardenNoAdj(int n, int[][] paths);
}
