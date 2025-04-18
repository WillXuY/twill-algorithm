/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0589_nary_tree_preorder_traversal;

import common.provide.Node;

import java.util.List;

public interface NaryTreePreorderTraversal {
    /**
     * Given the root of an n-ary tree, return the preorder traversal of
     * its nodes' values.
     * Nary-Tree input serialization is represented in their level order
     * traversal. Each group of children is separated by the null value
     * (See examples)
     *
     * Follow up:
     * Recursive solution is trivial, could you do it iteratively?
     *
     * @param root 0 <= root.size <= 10^4
     *             0 <= Node.val <= 10^4
     *             The height of tree is less than or equal to 1000.
     * @return preorder list.
     */
    List<Integer> preorder(Node root);
}
