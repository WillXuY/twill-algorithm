package org.willxu.algorithm.service.listnode;

import common.provide.ListNode;

public interface SortList {
    /**
     * Given the head of a linked list, return the list after sorting it
     * in ascending order.
     *
     * @param head The number of nodes in the list is in the range
     *             [0, 5 * 10^4].
     *             -10^5 <= Node.val <= 10^5
     */
    ListNode sortList(ListNode head);
}
