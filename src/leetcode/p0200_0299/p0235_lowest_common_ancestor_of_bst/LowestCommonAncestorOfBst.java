/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0235_lowest_common_ancestor_of_bst;

import common.provide.TreeNode;

public interface LowestCommonAncestorOfBst {
    /**
     * Given a binary search tree (BST), find the lowest common ancestor
     * (LCA) of two given nodes in the BST.
     *
     * According to the definition of LCA on Wikipedia: "The lowest
     * common ancestor is defined between two nodes p and q as the
     * lowest node in T that has both p and q as descendants (where we
     * allow a node to be a descendant of itself)."
     *
     * @param root 2 <= size <= 10^5
     *             -10^9 <= Node.val <= 10^9
     *             All Node.val are unique.
     * @param p p != q.
     * @param q p and q will exist in the BST.
     * @return node of lowest common ancestor.
     */
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);
}
