package leetcode.p0600_0699.p0654_maximum_binary_tree;

import common.provide.TreeNode;

import java.util.Arrays;

public class MaximumBinaryTreeRecursive implements MaximumBinaryTree {
    @Override
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        if (nums.length == 0) {
            return null;
        } else if (nums.length == 1) {
            return new TreeNode(nums[0]);
        }
        int maxIndex = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] > nums[maxIndex]) {
                maxIndex = i;
            }
        }
        int[] leftNums = Arrays.copyOfRange(nums, 0, maxIndex);
        TreeNode left = constructMaximumBinaryTree(leftNums);
        int[] rightNums = Arrays.copyOfRange(nums, maxIndex + 1, nums.length);
        TreeNode right = constructMaximumBinaryTree(rightNums);
        return new TreeNode(nums[maxIndex], left, right);
    }
}
