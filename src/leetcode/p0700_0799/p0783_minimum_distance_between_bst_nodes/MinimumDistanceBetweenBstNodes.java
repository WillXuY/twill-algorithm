/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0783_minimum_distance_between_bst_nodes;

import common.provide.TreeNode;

public interface MinimumDistanceBetweenBstNodes {
    /**
     * Given the root of a Binary Search Tree (BST), return the minimum
     * difference between the values of any two different nodes in the
     * tree.
     *
     * @param root 2 <= root.size <= 100
     *             0 <= Node.val <= 10^5
     * @return min difference between two nodes' value.
     */
    int minDiffInBST(TreeNode root);
}
