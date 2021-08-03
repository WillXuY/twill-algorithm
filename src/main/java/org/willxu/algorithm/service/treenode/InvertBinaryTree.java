/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 *
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface InvertBinaryTree {
    /**
     * Given the root of a binary tree, invert the tree, and return
     * its root.
     *
     * @param root 0 <= size <= 100
     *             -100 <= Node.val <= 100
     * @return root of invert tree
     */
    TreeNode invertTree(TreeNode root);
}
