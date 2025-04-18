/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0101_symmetric_tree;

import common.exception.BreakException;
import common.provide.TreeNode;

public class SymmetricTreeRecursive implements SymmetricTree {
    @Override
    public boolean isSymmetric(TreeNode root) {
        try {
            isNodeSymmetric(root.left, root.right);
        } catch (BreakException e) {
            return false;
        }
        return true;
    }

    private void isNodeSymmetric(TreeNode left, TreeNode right)
            throws BreakException {
        if (left == null && right == null) {
            return;
        } else if (left == null) {
            throw new BreakException();
        } else if (right == null) {
            throw new BreakException();
        }
        if (left.val != right.val) {
            throw new BreakException();
        }
        isNodeSymmetric(left.left, right.right);
        isNodeSymmetric(left.right, right.left);
    }
}
