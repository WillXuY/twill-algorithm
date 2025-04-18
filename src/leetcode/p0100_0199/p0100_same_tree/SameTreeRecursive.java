/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0100_same_tree;

import common.exception.BreakException;
import common.provide.TreeNode;

public class SameTreeRecursive implements SameTree {
    @Override
    public boolean isSameTree(TreeNode p, TreeNode q) {
        try {
            isSame(p, q);
        } catch (BreakException e) {
            return false;
        }
        return true;
    }

    private void isSame(TreeNode p, TreeNode q) throws BreakException {
        if (p == null && q == null) {
            return;
        } else if (p == null) {
            throw new BreakException();
        } else if (q == null) {
            throw new BreakException();
        }
        isSame(p.left, q.left);
        if (p.val != q.val) {
            throw new BreakException();
        }
        isSame(p.right, q.right);
    }
}
