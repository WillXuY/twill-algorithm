package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface OddEvenLinkedList {
    /**
     * Given the head of a singly linked list, group all the nodes with
     * odd indices together followed by the nodes with even indices, and
     * return the reordered list.
     * <p>
     * The first node is considered odd, and the second node is even,
     * and so on.
     * <p>
     * Note that the relative order inside both the even and odd groups
     * should remain as it was in the input.
     * <p>
     * You must solve the problem in O(1) extra space complexity and
     * O(n) time complexity.
     *
     * @param head The number of nodes in the linked list is in the
     *             range [0, 10^4].
     *             -10^6 <= Node.val <= 10^6
     */
    ListNode oddEvenList(ListNode head);
}
