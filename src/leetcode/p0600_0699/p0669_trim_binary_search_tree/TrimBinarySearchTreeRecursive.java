package leetcode.p0600_0699.p0669_trim_binary_search_tree;

import common.provide.TreeNode;

public class TrimBinarySearchTreeRecursive implements TrimBinarySearchTree {
    @Override
    public TreeNode trimBST(TreeNode root, int low, int high) {
        if (root == null) {
            return null;
        }
        TreeNode left = trimBST(root.left, low, high);
        TreeNode right = trimBST(root.right, low, high);
        if (root.val < low || root.val > high) {
            return left == null ? right : left;
        }
        root.left = left;
        root.right = right;
        return root;
    }
}
