/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0559_maximum_depth_of_nary_tree;

import common.provide.Node;

public interface MaximumDepthOfNaryTree {
    /**
     * Given a n-ary tree, find its maximum depth.
     * The maximum depth is the number of nudes along the longest path
     * from the root node down to the farthest leaf node.
     * Nary-Tree input serialization is represented in their level order
     * traversal, each group of children is separated by the null value
     * (See examples).
     *
     * @param root 0 <= size <= 10^4
     *             depth <= 1000
     * @return max depth of n-ary tree.
     */
    int maxDepth(Node root);
}
