package leetcode.p0700_0799.p0701_insert_into_binary_search_tree;

import common.provide.TreeNode;

public class InsertIntoBinarySearchTreeRecursive
        implements InsertIntoBinarySearchTree {
    @Override
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if (root == null || root.val == val) {
            return new TreeNode(val);
        }
        if (root.val > val) {
            if (root.left == null) {
                root.left = new TreeNode(val);
            } else {
                root.left = insertIntoBST(root.left, val);
            }
        } else {
            if (root.right == null) {
                root.right = new TreeNode(val);
            } else {
                root.right = insertIntoBST(root.right, val);
            }
        }
        return root;
    }
}
