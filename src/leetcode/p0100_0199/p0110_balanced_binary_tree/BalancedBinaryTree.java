/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0110_balanced_binary_tree;

import common.provide.TreeNode;

public interface BalancedBinaryTree {
    /**
     * Given a binary tree, determine if it is height-balanced.
     *
     * For this problem, a height-balanced binary tree is defined as:
     *   a binary tree in which the left and right subtrees of every
     *   node differ in height by no more than 1.
     *
     * @param root 0 <= root.size <= 5000
     *             - 10^4 <= Node.val <= 10^4
     * @return balanced or not
     */
    boolean isBalanced(TreeNode root);
}
