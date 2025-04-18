/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0572_subtree_of_another_tree;

import common.provide.TreeNode;

public class SubtreeOfAnotherTreeRecursive implements SubtreeOfAnotherTree {
    @Override
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if (isSame(root, subRoot)) {
            return true;
        }
        if (root == null || subRoot == null) {
            return false;
        }
        return isSubtree(root.left, subRoot)
                || isSubtree(root.right, subRoot);
    }

    private boolean isSame(TreeNode node, TreeNode subNode) {
        if (node == null && subNode == null) {
            return true;
        } else if (node == null || subNode == null) {
            return false;
        }
        if (node.val != subNode.val) {
            return false;
        }
        return isSame(node.left, subNode.left)
                && isSame(node.right, subNode.right);
    }
}
