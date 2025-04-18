package org.willxu.algorithm.service.impl.bool;

import common.provide.TreeNode;
import org.willxu.algorithm.service.bool.EvaluateBooleanBinaryTree;

public class EvaluateBooleanBinaryTreeRecursice
        implements EvaluateBooleanBinaryTree {
    @Override
    public boolean evaluateTree(TreeNode root) {
        if (root.val == 1) {
            return true;
        } else if (root.val == 0) {
            return false;
        }
        boolean left = evaluateTree(root.left);
        boolean right = evaluateTree(root.right);
        // root.val: 2 = or, 3 = and
        if (root.val == 2) {
            return left || right;
        }
        return left && right;
    }
}
