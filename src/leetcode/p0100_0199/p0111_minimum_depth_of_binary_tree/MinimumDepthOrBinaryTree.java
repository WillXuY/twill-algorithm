/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0111_minimum_depth_of_binary_tree;

import common.provide.TreeNode;

public interface MinimumDepthOrBinaryTree {
    /**
     * Given a binary tree, find its minimum depth.
     *
     * The minimum depth is the number of nodes along the shortest path
     * from the root node down to the nearest leaf node.
     *
     * Note:
     * A leaf is a node with no children.
     *
     * @param root 0 <= root.size <= 10^5
     *             -1000 <= Node.val <= 1000
     * @return min depth
     */
    int minDepth(TreeNode root);
}
