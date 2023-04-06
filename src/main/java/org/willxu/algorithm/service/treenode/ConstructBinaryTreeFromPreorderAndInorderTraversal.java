package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface ConstructBinaryTreeFromPreorderAndInorderTraversal {
    /**
     * Given two integer arrays preorder and inorder where preorder is
     * the preorder traversal of a binary tree and inorder is the
     * inorder traversal of the same tree, construct and return the
     * binary tree.
     *
     * @param preorder 1 <= preorder.length <= 3000
     *                 inorder.length == preorder.length
     *                 -3000 <= preorder[i], inorder[i] <= 3000
     *                 preorder and inorder consist of unique values.
     *                 Each value of inorder also appears in preorder.
     *                 preorder is guaranteed to be the preorder
     *                 traversal of the tree.
     * @param inorder is guaranteed to be the inorder traversal of the
     *                tree.
     */
    TreeNode buildTree(int[] preorder, int[] inorder);
}
