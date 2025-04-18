package leetcode.p0100_0199.p0107_binary_tree_level_order_traversal_ii;

import common.provide.TreeNode;

import java.util.List;

public interface BinaryTreeLevelOrderTraversalIi {
    /**
     * Given the root of a binary tree, return the bottom-up level order
     * traversal of its nodes' values. (i.e., from left to right, level
     * by level from leaf to root).
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 2000].
     *             -1000 <= Node.val <= 1000
     */
    List<List<Integer>> levelOrderBottom(TreeNode root);
}
