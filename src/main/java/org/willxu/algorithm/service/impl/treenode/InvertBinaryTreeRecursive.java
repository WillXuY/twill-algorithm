/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 *
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.treenode;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.treenode.InvertBinaryTree;

public class InvertBinaryTreeRecursive implements InvertBinaryTree {
    @Override
    public TreeNode invertTree(TreeNode root) {
        if (root == null) {
            return null;
        }
        TreeNode left = root.left;
        if (root.right == null) {
            root.left = null;
        } else {
            root.left = invertTree(root.right);
        }
        if (left == null) {
            root.right = null;
        } else {
            root.right = invertTree(left);
        }
        return root;
    }
}
