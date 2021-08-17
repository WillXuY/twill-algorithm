/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.treenode;

import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.treenode.ConvertSortedArrayToBinarySearchTree;

import java.util.Arrays;

public class ConvertSortedArrayToBstHalfRecursive
        implements ConvertSortedArrayToBinarySearchTree {
    /**
     * select the half of the nums as the middle node
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -10^4 <= nums[i] <= 10^4
     *             is sorted in a strictly increasing order
     * @return height-balanced Binary Search Tree
     */
    @Override
    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums == null || nums.length == 0) {
            return null;
        } else if (nums.length == 1) {
            return new TreeNode(nums[0]);
        } else if (nums.length == 2) {
            if (nums[0] > nums[1]) {
                return new TreeNode(nums[0], new TreeNode(nums[1]), null);
            } else {
                return new TreeNode(nums[0], null,  new TreeNode(nums[1]));
            }
        }
        int middle = nums.length / 2;
        TreeNode t = new TreeNode(nums[middle]);
        int[] left = Arrays.copyOf(nums, middle);
        int[] right = Arrays.copyOfRange(nums, middle + 1, nums.length);
        t.left = sortedArrayToBST(left);
        t.right = sortedArrayToBST(right);
        return t;
    }
}
