/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.TreeNode;

public interface TwoSum4InputIsBst {
    /**
     * Given the root of a Binary Search Tree and a target number k,
     * return true if there exist two elements in the BST such that
     * their sum is equal to the given target.
     *
     * @param root 1 <= root.size <= 10^4
     *             -10^4 <= Node.val <= 10^4
     *             is guaranteed to be a valid binary search tree.
     * @param k -10^5 <= k <= 10^5
     * @return exit two numbers' sum equals k.
     */
    boolean findTarget(TreeNode root, int k);
}
