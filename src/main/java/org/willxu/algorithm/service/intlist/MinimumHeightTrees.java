package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface MinimumHeightTrees {
    /**
     * A tree is an undirected graph in which any two vertices are
     * connected by exactly one path. In other words, any connected
     * graph without simple cycles is a tree.
     * <p>
     * Given a tree of n nodes labelled from 0 to n - 1, and an array of
     * n - 1 edges where edges[i] = [ai, bi] indicates that there is an
     * undirected edge between the two nodes a_i and b_i in the tree, you
     * can choose any node of the tree as the root. When you select a
     * node x as the root, the result tree has height h. Among all
     * possible rooted trees, those with minimum height (i.e. min(h))
     * are called minimum height trees (MHTs).
     * <p>
     * Return a list of all MHTs' root labels. You can return the answer
     * in any order.
     * <p>
     * The height of a rooted tree is the number of edges on the longest
     * downward path between the root and a leaf.
     *
     * @param n 1 <= n <= 2 * 10^4
     *          0 <= a_i, b_i < n
     *          a_i != b_i
     *          All the pairs (a_i, b_i) are distinct.
     *          The given input is guaranteed to be a tree and there
     *          will be no repeated edges.
     * @param edges edges.length == n - 1
     */
    List<Integer> findMinHeightTrees(int n, int[][] edges);
}
