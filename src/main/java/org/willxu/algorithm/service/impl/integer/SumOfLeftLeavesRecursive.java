package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.integer.SumOfLeftLeaves;

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
