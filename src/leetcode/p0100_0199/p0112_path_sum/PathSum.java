/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0112_path_sum;

import common.provide.TreeNode;

public interface PathSum {
    /**
     * Given the root of a binary tree and an integer targetSum, return
     * true if the tree has a root-to-leaf path such that adding up all
     * the values along the path equals targetSum.
     *
     * A leaf is a node with no children.
     *
     * @param root 0 <= root.size <= 5000
     *             -1000 <= Node.val <= 1000
     * @param targetSum -1000 <= targetSum <= 1000
     * @return has or not
     */
    boolean hasPathSum(TreeNode root, int targetSum);
}
