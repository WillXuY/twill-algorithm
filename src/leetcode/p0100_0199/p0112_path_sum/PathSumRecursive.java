/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0112_path_sum;

import common.exception.BreakException;
import common.provide.TreeNode;

public class PathSumRecursive implements PathSum {
    @Override
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return false;
        }
        try {
            return hasSubPathSum(root, targetSum);
        } catch (BreakException e) {
            return true;
        }
    }

    private boolean hasSubPathSum(TreeNode node, int target)
            throws BreakException {
        if (node == null) {
            return target == 0;
        }
        int dif = target - node.val;
        boolean left = hasSubPathSum(node.left, dif) && node.right == null;
        boolean right = hasSubPathSum(node.right, dif) && node.left == null;
        if (left || right) {
            throw new BreakException();
        }
        return false;
    }
}
