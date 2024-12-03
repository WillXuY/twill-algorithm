package org.willxu.algorithm.service.bool;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.provide.TreeNode;

public interface LinkedListInBinaryTree {
    /**
     * Given a binary tree root and a linked list with head as the first
     * node.
     * <p>
     * Return True if all the elements in the linked list starting from
     * the head correspond to some downward path connected in the binary
     * tree otherwise return False.
     * <p>
     * In this context downward path means a path that starts at some
     * node and goes downwards.
     *
     * @param head,root The number of nodes in the tree will be in the
     *                  range [1, 2500].
     *                  The number of nodes in the list will be in the
     *                  range [1, 100].
     *                  1 <= Node.val <= 100 for each node in the linked
     *                  list and binary tree.
     */
    boolean isSubPath(ListNode head, TreeNode root);
}
