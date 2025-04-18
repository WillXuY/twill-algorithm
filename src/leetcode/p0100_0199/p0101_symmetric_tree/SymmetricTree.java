/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import common.provide.TreeNode;

public interface SymmetricTree {
    /**
     * Given the root of a binary tree, check whether it is a mirror of
     * itself (i.e., symmetric around its center).
     *
     * @param root 1 <= root.size <= 1000
     *             -100 <= Node.val <= 100
     * @return symmetric or not
     */
    boolean isSymmetric(TreeNode root);
}
