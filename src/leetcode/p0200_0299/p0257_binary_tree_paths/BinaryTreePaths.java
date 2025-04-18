/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.strlist;

import common.provide.TreeNode;

import java.util.List;

public interface BinaryTreePaths {
    /**
     * Given the root of a binary tree, return all root-to-leaf paths
     * in any order.
     *
     * A leaf is a node with no children.
     *
     * @param root 1 <= size <= 100
     *             -100 <= Node.val <= 100
     * @return binary tree string list.
     */
    List<String> binaryTreePaths(TreeNode root);
}
