package leetcode.p0400_0499.p0404_sum_of_left_leaves;

import common.provide.TreeNode;

public interface SumOfLeftLeaves {
    /**
     * Given the root of a binary tree, return the sum of all left
     * leaves.
     *
     * @param root 1 <= size <= 1000
     *             -1000 <= Node.val <= 1000
     * @return sum of left leaves.
     */
    int sumOfLeftLeaves(TreeNode root);
}
