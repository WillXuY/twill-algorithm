/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integerlist;

import org.willxu.algorithm.provide.TreeNode;

import java.util.List;

public interface BinaryTreePreorderTraversal {
    /**
     * Given the root of a binary tree, return the preorder traversal
     * of its nodes' values.
     *
     * Follow up: Recursive solution ts trivial, could you do it
     * iteratively?
     *
     * @param root 0 <= root.size <= 100
     *             -100 <= Node.val <= 100
     * @return preorder travel sal
     */
    List<Integer> preorderTraversal(TreeNode root);
}
