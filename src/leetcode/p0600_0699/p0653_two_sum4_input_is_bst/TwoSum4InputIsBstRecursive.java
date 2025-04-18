/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0653_two_sum4_input_is_bst;

import common.provide.TreeNode;

public class TwoSum4InputIsBstRecursive implements TwoSum4InputIsBst {
    @Override
    public boolean findTarget(TreeNode root, int k) {
        return findTargetWithRoot(root, root, k);
    }

    private boolean findTargetWithRoot(TreeNode node, TreeNode root, int k) {
        if (node == null) {
            return false;
        } else if (findTargetWithRoot(node.left, root, k)) {
            return true;
        } else if (findTargetWithRoot(node.right, root, k)) {
            return true;
        } else if (k - node.val == node.val) {
            // Same value.
            return false;
        }
        return containsValue(root, k - node.val);
    }

    private boolean containsValue(TreeNode node, int diff) {
        if (node == null) {
            return false;
        } else if (node.val == diff) {
            return true;
        } else if (containsValue(node.left, diff)) {
            return true;
        } else {
            return containsValue(node.right, diff);
        }
    }
}
