package org.willxu.algorithm.service.ints;

public interface ShortestPathWithAlternatingColors {
    /**
     * You are given an integer n, the number of nodes in a directed
     * graph where the nodes are labeled from 0 to n - 1. Each edge is
     * red or blue in this graph, and there could be self-edges and
     * parallel edges.
     * <p>
     * You are given two arrays redEdges and blueEdges where:
     * <p>
     * - redEdges[i] = [a_i, b_i] indicates that there is a directed red
     *   edge from node a_i to node b_i in the graph, and
     * - blueEdges[j] = [u_j, v_j] indicates that there is a directed
     *   blue edge from node u_j to node v_j in the graph.
     * <p>
     * Return an array answer of length n, where each answer[x] is the
     * length of the shortest path from node 0 to node x such that the
     * edge colors alternate along the path, or -1 if such a path does
     * not exist.
     *
     * @param n 1 <= n <= 100
     * @param redEdges,blueEdges 0 <= redEdges.length, blueEdges.length <= 400
     *                           redEdges[i].length == blueEdges[j].length == 2
     *                           0 <= a_i, b_i, u_j, v_j < n
     */
    int[] shortestAlternatingPaths(int n, int[][] redEdges, int[][] blueEdges);
}
