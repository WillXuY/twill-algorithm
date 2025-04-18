package org.willxu.algorithm.service.listnode;

import common.provide.ListNode;

public interface RemoveNthNodeFromEndOfList {
    /**
     * Given the head of a linked list, remove the nth node from the end
     * of the list and return its head.
     *
     * @param head The number of nodes in the list is sz.
     *             1 <= sz <= 30
     *             0 <= Node.val <= 100
     * @param n 1 <= n <= sz
     */
    ListNode removeNthFromEnd(ListNode head, int n);
}
