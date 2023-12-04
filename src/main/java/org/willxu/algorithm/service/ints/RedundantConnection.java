package org.willxu.algorithm.service.ints;

public interface RedundantConnection {
    /**
     * In this problem, a tree is an undirected graph that is connected
     * and has no cycles.
     * <p>
     * You are given a graph that started as a tree with n nodes labeled
     * from 1 to n, with one additional edge added. The added edge has
     * two different vertices chosen from 1 to n, and was not an edge
     * that already existed. The graph is represented as an array edges
     * of length n where edges[i] = [a_i, b_i] indicates that there is
     * an edge between nodes a_i and b_i in the graph.
     * <p>
     * Return an edge that can be removed so that the resulting graph is
     * a tree of n nodes. If there are multiple answers, return the
     * answer that occurs last in the input.
     *
     * @param edges n == edges.length
     *              3 <= n <= 1000
     *              edges[i].length == 2
     *              1 <= a_i < b_i <= edges.length
     *              a_i != b_i
     *              There are no repeated edges.
     *              The given graph is connected.
     */
    int[] findRedundantConnection(int[][] edges);
}
