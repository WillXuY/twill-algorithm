package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface IncreasingOrderSearchTree {
    /**
     * Given the root of a binary search tree, rearrange the tree in
     * in-order so that the leftmost node in the tree is now the root of
     * the tree, and every node has no left child and only one right
     * child.
     *
     * @param root 1 <= root.size <= 100.
     *             0 <= Node.val <= 1000.
     * @return increasing BST of root.
     */
    TreeNode increasingBST(TreeNode root);
}
