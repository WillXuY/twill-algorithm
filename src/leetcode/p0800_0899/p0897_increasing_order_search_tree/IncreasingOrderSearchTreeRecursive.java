package org.willxu.algorithm.service.impl.treenode;

import common.provide.TreeNode;
import org.willxu.algorithm.service.treenode.IncreasingOrderSearchTree;

public class IncreasingOrderSearchTreeRecursive
        implements IncreasingOrderSearchTree {
    /**
     * 1. Find the left node.
     * 2. Find the rightest sub node of leftNode.
     * 3. rightestNode.right = leftNode.
     */
    @Override
    public TreeNode increasingBST(TreeNode root) {
        if (root == null) {
            return null;
        } else if (root.left == null && root.right == null) {
            return root;
        }
        root.left = increasingBST(root.left);
        root.right = increasingBST(root.right);
        TreeNode output = root;
        if (root.left != null) {
            TreeNode rightest = findRightestNode(root.left);
            rightest.right = root;
            output = root.left;
            root.left = null;
        }
        return output;
    }

    private TreeNode findRightestNode(TreeNode node) {
        if (node == null) {
            return null;
        } else if (node.right == null) {
            return node;
        } else {
            return findRightestNode(node.right);
        }
    }
}
