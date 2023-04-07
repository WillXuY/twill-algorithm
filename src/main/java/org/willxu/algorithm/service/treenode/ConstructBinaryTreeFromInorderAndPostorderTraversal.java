package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface ConstructBinaryTreeFromInorderAndPostorderTraversal {
    /**
     * Given two integer arrays inorder and postorder where inorder is
     * the inorder traversal of a binary tree and postorder is the
     * postorder traversal of the same tree, construct and return the
     * binary tree.
     *
     * @param inorder 1 <= inorder.length <= 3000
     *                postorder.length == inorder.length
     *                -3000 <= inorder[i], postorder[i] <= 3000
     *                inorder and postorder consist of unique values.
     *                Each value of postorder also appears in inorder.
     *                is guaranteed to be the inorder traversal of the
     *                tree.
     * @param postorder is guaranteed to be the postorder traversal of
     *                  the tree.
     */
    TreeNode buildTree(int[] inorder, int[] postorder);
}
