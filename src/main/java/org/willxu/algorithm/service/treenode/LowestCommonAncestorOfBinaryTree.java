package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface LowestCommonAncestorOfBinaryTree {
    /**
     * Given a binary tree, find the lowest common ancestor (LCA) of two
     * given nodes in the tree.
     * <p>
     * According to the definition of LCA on Wikipedia: “The lowest
     * common ancestor is defined between two nodes p and q as the
     * lowest node in T that has both p and q as descendants (where we
     * allow a node to be a descendant of itself).”
     *
     * @param root The number of nodes in the tree is in the range
     *             [2, 105].
     *             -109 <= Node.val <= 109
     *             All Node.val are unique.
     * @param p,q p != q
     *            p and q will exist in the tree.
     */
    TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q);
}
