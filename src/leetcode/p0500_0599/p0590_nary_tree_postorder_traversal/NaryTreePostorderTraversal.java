/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0590_nary_tree_postorder_traversal;

import common.provide.Node;

import java.util.List;

public interface NaryTreePostorderTraversal {
    /**
     * Given the root of an n-ary tree, return the postorder traversal
     * of its nodes' values.
     * Nary-Tree input serialization is represented in their level order
     * traversal. Each group or children is separated by the null value
     * (See examples)
     *
     * @param root 0 <= size <= 10^4
     *             0 <= Node.val <= 10^4
     *             The height of the n-ary tree is <= 1000.
     * @return post order traversal.
     */
    List<Integer> postorder(Node root);
}
