package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface ReverseLinkedListIi {
    /**
     * Given the head of a singly linked list and two integers left and
     * right where left <= right, reverse the nodes of the list from
     * position left to position right, and return the reversed list.
     *
     * @param head The number of nodes in the list is n.
     *             1 <= n <= 500
     *             -500 <= Node.val <= 500
     * @param left,right 1 <= left <= right <= n
     */
    ListNode reverseBetween(ListNode head, int left, int right);
}
