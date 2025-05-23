package leetcode.p0100_0199.p0129_sum_root_to_leaf_numbers;

import common.provide.TreeNode;

public interface SumRootToLeafNumbers {
    /**
     * You are given the root of a binary tree containing digits from 0
     * to 9 only.
     * <p>
     * Each root-to-leaf path in the tree represents a number.
     * <p>
     * - For example, the root-to-leaf path 1 -> 2 -> 3 represents the
     *   number 123.
     * <p>
     * Return the total sum of all root-to-leaf numbers. Test cases are
     * generated so that the answer will fit in a 32-bit integer.
     * <p>
     * A leaf node is a node with no children.
     *
     * @param root The number of nodes in the tree is in the range
     *             [1, 1000].
     *             0 <= Node.val <= 9
     *             The depth of the tree will not exceed 10.
     */
    int sumNumbers(TreeNode root);
}
