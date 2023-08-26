package org.willxu.algorithm.service.treenode;

import org.willxu.algorithm.provide.TreeNode;

public interface DeleteNodeInBst {
    /**
     * Given a root node reference of a BST and a key, delete the node
     * with the given key in the BST. Return the root node reference
     * (possibly updated) of the BST.
     * <p>
     * Basically, the deletion can be divided into two stages:
     * <p>
     * 1. Search for a node to remove.
     * 2. If the node is found, delete the node.
     *
     * @param root The number of nodes in the tree is in the range
     *             [0, 10^4].
     *             -10^5 <= Node.val <= 10^5
     *             Each node has a unique value.
     *             root is a valid binary search tree.
     * @param key -10^5 <= key <= 10^5
     */
    TreeNode deleteNode(TreeNode root, int key);
}
