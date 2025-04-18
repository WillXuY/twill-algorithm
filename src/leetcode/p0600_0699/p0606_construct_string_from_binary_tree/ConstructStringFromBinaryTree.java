/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.string;

import common.provide.TreeNode;

public interface ConstructStringFromBinaryTree {
    /**
     * Given the root of a binary tree, construct a string consists of
     * parenthesis and integers from a binary tree with the preorder
     * traversing way, and return it.
     * Omit all the empty parenthesis pairs that do not affect the
     * one-to-one mapping relationship between the string and the
     * original binary tree.
     *
     * @param root 1 <= root.size <= 10^4
     *             -1000 <= Node.val <= 1000
     * @return binary tree to simplify string.
     */
    String tree2str(TreeNode root);
}
