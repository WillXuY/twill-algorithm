package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface BalanceBinarySearchTree {
    /**
     * Given the root of a binary search tree, return a balanced binary
     * search tree with the same node values. If there is more than one
     * answer, return any of them.
     * <p>
     * A binary search tree is balanced if the depth of the two subtrees
     * of every node never differs by more than 1.
     *
     * @param root The number of nodes in the tree is in the range [1, 10^4].
     *             1 <= Node.val <= 10^5
     */
    TreeNode balanceBST(TreeNode root);
}
