package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.TreeNode;

public interface LongestUnivaluePath {
    /**
     * Given the root of a binary tree, return the length of the longest
     * path, where each node in the path has the same value. This path
     * may or may not pass through the root.
     * <p>
     * The length of the path between two nodes is represented by the
     * number of edges between them.
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 10^4].
     *             -1000 <= Node.val <= 1000
     *             The depth of the tree will not exceed 1000.
     */
    int longestUnivaluePath(TreeNode root);
}
