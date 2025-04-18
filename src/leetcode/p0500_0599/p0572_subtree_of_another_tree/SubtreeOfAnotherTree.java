/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import common.provide.TreeNode;

public interface SubtreeOfAnotherTree {
    /**
     * Given the roots of two binary trees root and subRoot, return
     * true if there is a subtree of root with the same structure and
     * node values of subRoot and false otherwise.
     * A subtree of a binary tree 'tree' is a tree that consists of a
     * node in 'tree' and all of this node's descendants. The tree
     * 'tree' could also be considered as a subtree of itself.
     *
     * @param root 1 <= root.size <= 2000
     *             -10^4 <= root.val <= 10^4
     * @param subRoot 1 <= subRoot.size <= 1000
     *             -10^4 <= subRoot.val <= 10^4
     * @return SubRoot is subtree of root.
     */
    boolean isSubtree(TreeNode root, TreeNode subRoot);
}
