package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface AllPathsFromSourceToTarget {
    /**
     * Given a directed acyclic graph (DAG) of n nodes labeled from 0 to
     * n - 1, find all possible paths from node 0 to node n - 1 and
     * return them in any order.
     * <p>
     * The graph is given as follows: graph[i] is a list of all nodes
     * you can visit from node i (i.e., there is a directed edge from
     * node i to node graph[i][j]).
     *
     * @param graph n == graph.length
     *              2 <= n <= 15
     *              0 <= graph[i][j] < n
     *              graph[i][j] != i (i.e., there will be no self-loops).
     *              All the elements of graph[i] are unique.
     *              The input graph is guaranteed to be a DAG.
     */
    List<List<Integer>> allPathsSourceTarget(int[][] graph);
}
