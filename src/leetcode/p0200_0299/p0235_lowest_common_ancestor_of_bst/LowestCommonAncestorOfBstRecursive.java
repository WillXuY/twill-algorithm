/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.treenode;

import common.provide.TreeNode;
import org.willxu.algorithm.service.treenode.LowestCommonAncestorOfBst;

public class LowestCommonAncestorOfBstRecursive
        implements LowestCommonAncestorOfBst {
    @Override
    public TreeNode lowestCommonAncestor(
            TreeNode root, TreeNode p, TreeNode q) {
        // todo write a single recursive.
        boolean leftContains = contains(root.left, p.val)
                && contains(root.left, q.val);
        boolean rightContains = contains(root.right, p.val)
                && contains(root.right, q.val);
        if (leftContains) {
            return lowestCommonAncestor(root.left, p, q);
        } else if (rightContains) {
            return lowestCommonAncestor(root.right, p, q);
        } else {
            return root;
        }
    }

    public boolean contains(TreeNode root, int node) {
        if (root == null) {
            return false;
        }
        if (root.val == node) {
            return true;
        } else {
            return contains(root.left, node) || contains(root.right, node);
        }
    }
}
