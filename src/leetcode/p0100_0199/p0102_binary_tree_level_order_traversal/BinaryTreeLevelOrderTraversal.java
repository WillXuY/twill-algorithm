package leetcode.p0100_0199.p0102_binary_tree_level_order_traversal;

import common.provide.TreeNode;

import java.util.List;

public interface BinaryTreeLevelOrderTraversal {
    /**
     * Given the root of a binary tree, return the level order traversal
     * of its nodes' values. (i.e., from left to right, level by level).
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 2000].
     *             -1000 <= Node.val <= 1000
     */
    List<List<Integer>> levelOrder(TreeNode root);
}
