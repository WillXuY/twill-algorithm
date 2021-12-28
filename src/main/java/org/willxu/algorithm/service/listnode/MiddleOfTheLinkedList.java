package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface MiddleOfTheLinkedList {
    /**
     * Given the head of a single linked list, return the middle node of
     * the linked list.
     * If there are two middle nodes, return the second middle node.
     *
     * @param head the number of nodes in the list is in the range
     *             [1, 100].
     *             1 <= Node.val <= 100
     * @return middle(right) node of head.
     */
    ListNode middleNode(ListNode head);
}
