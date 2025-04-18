package leetcode.p0400_0499.p0404_sum_of_left_leaves;

import common.provide.TreeNode;

public class SumOfLeftLeavesRecursive implements SumOfLeftLeaves {
    @Override
    public int sumOfLeftLeaves(TreeNode root) {
        return getLeftNodeSum(root, false);
    }

    public int getLeftNodeSum(TreeNode node, boolean left) {
        int sum = 0;
        if (node == null) {
            return 0;
        }
        if (node.left == null && node.right == null) {
            if (left) {
                return node.val;
            } else {
                return 0;
            }
        }
        sum += getLeftNodeSum(node.left, true);
        sum += getLeftNodeSum(node.right,false);
        return sum;
    }
}
