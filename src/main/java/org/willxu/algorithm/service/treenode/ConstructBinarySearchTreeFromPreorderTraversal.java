package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface ConstructBinarySearchTreeFromPreorderTraversal {
    /**
     * Given an array of integers preorder, which represents the
     * preorder traversal of a BST (i.e., binary search tree), construct
     * the tree and return its root.
     * <p>
     * It is guaranteed that there is always possible to find a binary
     * search tree with the given requirements for the given test cases.
     * <p>
     * A binary search tree is a binary tree where for every node, any
     * descendant of Node.left has a value strictly less than Node.val,
     * and any descendant of Node.right has a value strictly greater
     * than Node.val.
     * <p>
     * A preorder traversal of a binary tree displays the value of the
     * node first, then traverses Node.left, then traverses Node.right.
     *
     * @param preorder 1 <= preorder.length <= 100
     *                 1 <= preorder[i] <= 1000
     *                 All the values of preorder are unique.
     */
    TreeNode bstFromPreorder(int[] preorder);
}
