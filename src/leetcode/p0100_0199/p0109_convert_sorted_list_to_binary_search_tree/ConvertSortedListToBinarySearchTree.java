package org.willxu.algorithm.service.treenode;

import common.provide.ListNode;
import common.provide.TreeNode;

public interface ConvertSortedListToBinarySearchTree {
    /**
     * Given the head of a singly linked list where elements are sorted
     * in ascending order, convert it to a height-balanced binary search
     * tree.
     * <p>
     * 1
     * <p>
     * 1
     *  \
     *   2
     * <p>
     * 1
     *  \
     *   2
     *    \
     *     3
     * left rotate
     *   2
     *  / \
     * 1   3
     * <p>
     *   2
     *  / \
     * 1   3
     *      \
     *       4
     * <p>
     *   2
     *  / \
     * 1   3
     *      \
     *       4
     *        \
     *         5
     * left rotate
     *   2
     *  / \
     * 1   4
     *    / \
     *   3   5
     * <p>
     *   2
     *  / \
     * 1   4
     *    / \
     *   3   5
     *        \
     *         6
     * left rotate
     *     4
     *    / \
     *   2   5
     *  / \   \
     * 1   3   6
     *
     * @param head The number of nodes in head is in the range
     *             [0, 2 * 104].
     *             -10^5 <= Node.val <= 10^5
     */
    TreeNode sortedListToBST(ListNode head);
}
