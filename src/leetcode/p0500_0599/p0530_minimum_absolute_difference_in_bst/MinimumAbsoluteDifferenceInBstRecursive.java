package leetcode.p0500_0599.p0530_minimum_absolute_difference_in_bst;

import common.provide.TreeNode;

public class MinimumAbsoluteDifferenceInBstRecursive
        implements MinimumAbsoluteDifferenceInBst {

    @Override
    public int getMinimumDifference(TreeNode root) {
        int left = -1;
        int right = -1;
        if (root.left != null) {
            int leftVal = getTheRightest(root.left);
            int compare = root.val - leftVal;
            int leftNode = getMinimumDifference(root.left);
            if (leftNode == -1) {
                left = compare;
            } else {
                left = Math.min(compare, leftNode);
            }
        }
        if (root.right != null) {
            int rightVal = getTheLeftest(root.right);
            int compare = rightVal - root.val;
            int rightNode = getMinimumDifference(root.right);
            if (rightNode == -1) {
                right = compare;
            } else {
                right = Math.min(compare, rightNode);
            }
        }
        if (left == -1) {
            return right;
        } else if(right == -1) {
            return left;
        }
        return Math.min(left, right);
    }

    private int getTheLeftest(TreeNode node) {
        if (node.left == null) {
            return node.val;
        } else {
            return getTheLeftest(node.left);
        }
    }

    private int getTheRightest(TreeNode node) {
        if (node.right == null) {
            return node.val;
        } else {
            return getTheRightest(node.right);
        }
    }
}
