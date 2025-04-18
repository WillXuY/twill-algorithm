/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0100_same_tree;

import common.provide.TreeNode;

public interface SameTree {
    /**
     * Given the roots of two binary trees p and q, write a function to
     * check if they are the same or not.
     *
     * Two binary trees are considered the same if they are
     * structurally identical, and the nodes have the same value.
     *
     * Constraints:
     * - The number of nodes in both trees is in the range [0, 100],
     * - -10^4 <= Node.val <= 10^4
     *
     * @param p 0 <= p.size <= 100
     *          -10^4 <= Node.val <= 10^4
     * @param q 0 <= q.size <= 100
     *          -10^4 <= Node.val <= 10^4
     * @return same or not
     */
    boolean isSameTree(TreeNode p, TreeNode q);
}
