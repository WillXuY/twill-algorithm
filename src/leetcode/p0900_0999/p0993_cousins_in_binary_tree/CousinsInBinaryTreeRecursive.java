package leetcode.p0900_0999.p0993_cousins_in_binary_tree;

import common.provide.TreeNode;

public class CousinsInBinaryTreeRecursive implements CousinsInBinaryTree {
    @Override
    public boolean isCousins(TreeNode root, int x, int y) {
        int[] parentAndDepthX = getParentAndDepth(root, x);
        int[] parentAndDepthY = getParentAndDepth(root, y);
        return parentAndDepthX[1] == parentAndDepthY[1]
                && parentAndDepthX[0] != parentAndDepthY[0];
    }

    /**
     *
     * @param root root of tree node
     * @param value node's value which need to be find.
     * @return 0: parent's value; 1: value's depth.
     */
    private int[] getParentAndDepth(TreeNode root, int value) {
        int[] parentAndDepth = new int[2];
        parentAndDepth[1] = -1;
        if (root == null) {
            return parentAndDepth;
        } else if (root.val == value) {
            parentAndDepth[1] = 0;
            return parentAndDepth;
        }
        int[] left = getParentAndDepth(root.left, value);
        if (left[1] == 0) {
            parentAndDepth[0] = root.val;
            parentAndDepth[1] = 1;
            return parentAndDepth;
        } else if (left[1] > 0) {
            left[1] = left[1] + 1;
            return left;
        }
        int[] right = getParentAndDepth(root.right, value);
        if (right[1] == 0) {
            parentAndDepth[0] = root.val;
            parentAndDepth[1] = 1;
            return parentAndDepth;
        } else if (right[1] > 0) {
            right[1] = right[1] + 1;
            return right;
        }
        return parentAndDepth;
    }
}
