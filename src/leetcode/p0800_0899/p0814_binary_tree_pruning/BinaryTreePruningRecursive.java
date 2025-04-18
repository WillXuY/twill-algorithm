package org.willxu.algorithm.service.impl.treenode;

import common.provide.TreeNode;
import org.willxu.algorithm.service.treenode.BinaryTreePruning;

public class BinaryTreePruningRecursive implements BinaryTreePruning {
    @Override
    public TreeNode pruneTree(TreeNode root) {
        if (root.left == null && root.right == null) {
            if (root.val == 0) {
                return null;
            } else {
                return root;
            }
        }
        TreeNode result = new TreeNode(root.val);
        if (root.left != null) {
            result.left = pruneTree(root.left);
        }
        if (root.right != null) {
            result.right = pruneTree(root.right);
        }
        if (result.right == null && result.left == null && result.val == 0) {
            return null;
        }
        return result;
    }
}
