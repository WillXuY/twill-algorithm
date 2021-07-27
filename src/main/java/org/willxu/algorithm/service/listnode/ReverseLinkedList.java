package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface ReverseLinkedList {
    /**
     * Given the head of a singly linked list, reverse the list, and
     * return the reversed list.
     *
     * Follow up:
     * A linked list can be reversed either iteratively or recursively.
     * Could you implement both?
     *
     * 1. Iteratively:
     * {@link org.willxu.algorithm.service.impl.listnode.ReverseLinkedListIterator}
     *
     * @param head 0 <= head.size <= 5000
     *             -5000 <= Node.val <= 5000
     * @return head of the reversed list
     */
    ListNode reverseList(ListNode head);
}
