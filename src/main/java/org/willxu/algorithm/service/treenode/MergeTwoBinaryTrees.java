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

public interface MergeTwoBinaryTrees {
    /**
     * You are given two binary trees root1 and root2.
     * Imagine that when you put one of them to cover the other,some
     * nodes of the two trees are overlapped while the others are not.
     * You need to merge the two trees into a new binary tree. The merge
     * rule is that if two nodes overlap, then sum node values up ad the
     * new value of the merged node. Otherwise, the NOT null node will
     * be used as the node of the new tree.
     * Return the merged tree.
     * Note: The merging process must start from the root nodes of both
     * trees.
     *
     * @param root1 0 <= size <= 2000
     *              -10^4 <= Node.val <= 10^4
     * @param root2 0 <= size <= 2000
     *              -10^4 <= Node.val <= 10^4
     * @return merged tree's root.
     */
    TreeNode mergeTrees(TreeNode root1, TreeNode root2);
}
