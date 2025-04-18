package leetcode.p0100_0199.p0113_path_sum_ii;

import common.provide.TreeNode;

import java.util.List;

public interface PathSumIi {
    /**
     * Given the root of a binary tree and an integer targetSum, return
     * all root-to-leaf paths where the sum of the node values in the
     * path equals targetSum. Each path should be returned as a list of
     * the node values, not node references.
     * <p>
     * A root-to-leaf path is a path starting from the root and ending
     * at any leaf node. A leaf is a node with no children.
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 5000].
     *             -1000 <= Node.val <= 1000
     * @param targetSum -1000 <= targetSum <= 1000
     */
    List<List<Integer>> pathSum(TreeNode root, int targetSum);
}
