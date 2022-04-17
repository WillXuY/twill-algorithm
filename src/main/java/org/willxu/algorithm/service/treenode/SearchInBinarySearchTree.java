/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface SearchInBinarySearchTree {
    /**
     * You are given the root of a binary search tree (BST) and an
     * integer val.
     * Find the node in the BST that the node's value equals val and
     * return the subtree rooted with that node. If such a node does not
     * exist, return null.
     *
     * @param root 1 <= root.length <= 5000
     *             1 <= Node.val <= 10^7
     *             is a binary search tree.
     * @param val 1 <= val <= 10^7
     * @return the subtree which contains value equals input val.
     */
    TreeNode searchBST(TreeNode root, int val);
}
