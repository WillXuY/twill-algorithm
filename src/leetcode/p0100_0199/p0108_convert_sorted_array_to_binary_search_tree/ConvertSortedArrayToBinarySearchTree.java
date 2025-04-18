/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.treenode;

import common.provide.TreeNode;

public interface ConvertSortedArrayToBinarySearchTree {
    /**
     * Given an integer array nums where the elements are sorted in
     * ascending order, convert it to a height-balanced binary search
     * tree.
     *
     * A height-balanced binary tree is a binary tree in which the
     * depth of the two subtrees of every node never differs by more
     * than one.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^4 <= nums[i] <= 10^4
     *             is sorted in a strictly increasing order
     * @return height-balanced Binary Search Tree
     */
    TreeNode sortedArrayToBST(int[] nums);
}
