/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0563_binary_tree_tilt;

import common.provide.TreeNode;

public interface BinaryTreeTilt {
    /**
     * Given the root of a binary tree, return the sum of every tree
     * node's tilt.
     * The tilt of a tree node is the absolute difference between the
     * sum of all left subtree node values and all right subtree node
     * values. If a node does not have a left child, then the sum of the
     * left subtree node values is treated as 0. The rule is similar if
     * there the node does not have a right child.
     *
     * @param root 0 <= size <= 10^4
     *             -1000 <= Node.val <= 1000
     * @return the sum of every tree node's tilt.
     */
    int findTilt(TreeNode root);
}
