package org.willxu.algorithm.service.listnode;

import common.provide.ListNode;

public interface RotateList {
    /**
     * Given the head of a linked list, rotate the list to the right
     * by k places.
     *
     * @param head The number of nodes in the list is in the
     *             range [0, 500].
     *             -100 <= Node.val <= 100
     * @param k 0 <= k <= 2 * 109
     */
    ListNode rotateRight(ListNode head, int k);
}
