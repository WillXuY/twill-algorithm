package org.willxu.algorithm.service.bool;

public interface FindIfPathExistsInGraph {
    /**
     * There is a bi-directional graph with n vertices, where each
     * vertex is labeled from 0 to n - 1 (inclusive). The edges in the
     * graph are represented as a 2D integer array edges, where each
     * edges[i] = [u_i, v_i] denotes a bi-directional edge between
     * vertex u_i and vertex v_i. Every vertex pair is connected by at
     * most one edge, and no vertex has an edge to itself.
     * <p>
     * You want to determine if there is a valid path that exists from
     * vertex source to vertex destination.
     * <p>
     * Given edges and the integers n, source, and destination, return
     * true if there is a valid path from source to destination, or
     * false otherwise.
     *
     * @param n 1 <= n <= 2 * 105
     *          There are no duplicate edges.
     *          There are no self edges.
     * @param edges 0 <= edges.length <= 2 * 105
     *              edges[i].length == 2
     *              0 <= ui, vi <= n - 1
     *              ui != vi
     * @param source 0 <= source, destination <= n - 1
     */
    boolean validPath(int n, int[][] edges, int source, int destination);
}
