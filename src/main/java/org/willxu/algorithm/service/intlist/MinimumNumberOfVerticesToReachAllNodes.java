package org.willxu.algorithm.service.intlist;

import java.util.List;

public interface MinimumNumberOfVerticesToReachAllNodes {
	/**
	 * Given a directed acyclic graph, with n vertices numbered from 0
	 * to n-1, and an array edges where edges[i] = [from_i, to_i]
	 * represents a directed edge from node from_i to node to_i.
	 * <p>
	 * Find the smallest set of vertices from which all nodes in the
	 * graph are reachable. It's guaranteed that a unique solution
	 * exists.
	 * <p>
	 * Notice that you can return the vertices in any order.
	 * 
	 * @param n 2 <= n <= 10^5
	 * @param edges 1 <= edges.length <= min(10^5, n * (n - 1) / 2)
	 *              edges[i].length == 2
	 *              0 <= from_i, to_i < n
	 *              All pairs (from_i, to_i) are distinct.
	 */
List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges);
}
