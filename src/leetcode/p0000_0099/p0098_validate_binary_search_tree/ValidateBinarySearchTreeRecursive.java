package leetcode.p0000_0099.p0098_validate_binary_search_tree;

import common.provide.TreeNode;

public class ValidateBinarySearchTreeRecursive
        implements ValidateBinarySearchTree {
    @Override
    public boolean isValidBST(TreeNode root) {
        return isValidBstRange(null, null, root);
    }

    public boolean isValidBstRange(Integer min, Integer max, TreeNode node) {
        if (node == null) {
            return true;
        }
        if ((min != null && min >= node.val)
                || (max != null && max <= node.val)) {
            return false;
        }
        if (node.left == null) {
            if (node.right == null) {
                return true;
            } else {
                if (node.right.val <= node.val) {
                    return false;
                }
                return isValidBstRange(node.val, max, node.right);
            }
        } else {
            if (node.right == null) {
                if (node.left.val >= node.val) {
                    return false;
                }
                return isValidBstRange(min, node.val, node.left);
            } else {
                if (node.right.val <= node.val) {
                    return false;
                }
                if (node.left.val >= node.val) {
                    return false;
                }
                return isValidBstRange(min, node.val, node.left)
                        && isValidBstRange(node.val, max, node.right);
            }
        }
    }
}
