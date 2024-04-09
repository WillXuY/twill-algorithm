package org.willxu.algorithm.domain.tree;

import org.willxu.algorithm.provide.TreeNode;

/**
 * A complete binary tree is a binary tree in which every level, except
 * possibly the last, is completely filled, and all nodes are as far
 * left as possible.
 * <p>
 * Design an algorithm to insert a new node to a complete binary tree
 * keeping it complete after the insertion.
 * <p>
 * Implement the CBTInserter class:
 * <p>
 * CBTInserter(TreeNode root) Initializes the data structure with the
 * root of the complete binary tree.
 * <p>
 * - The number of nodes in the tree will be in the range [1, 1000].
 * - 0 <= Node.val <= 5000
 * - root is a complete binary tree.
 * - At most 10^4 calls will be made to insert and get_root.
 */
public interface CompleteBinaryTreeInserter {
    /**
     * Inserts a TreeNode into the tree with value Node.val == val so
     * that the tree remains complete, and returns the value of the
     * parent of the inserted TreeNode.
     *
     * @param val 0 <= val <= 5000
     */
    int insert(int val);

    /**
     * @return the root node of the tree.
     */
    TreeNode get_root();
}
