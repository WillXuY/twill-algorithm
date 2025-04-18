package leetcode.p0600_0699.p0654_maximum_binary_tree;

import common.provide.TreeNode;

public interface MaximumBinaryTree {
    /**
     * You are given an integer array nums with no duplicates. A maximum
     * binary tree can be built recursively from nums using the
     * following algorithm:
     * <p>
     * 1. Create a root node whose value is the maximum value in nums.
     * 2. Recursively build the left subtree on the subarray prefix to
     *    the left of the maximum value.
     * 3. Recursively build the right subtree on the subarray suffix to
     *    the right of the maximum value.
     * <p>
     * Return the maximum binary tree built from nums.
     *
     * @param nums 1 <= nums.length <= 1000
     *             0 <= nums[i] <= 1000
     *             All integers in nums are unique.
     */
    TreeNode constructMaximumBinaryTree(int[] nums);
}
