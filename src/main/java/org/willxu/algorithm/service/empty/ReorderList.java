package org.willxu.algorithm.service.empty;

import org.willxu.algorithm.provide.ListNode;

public interface ReorderList {
    /**
     * You are given the head of a singly linked-list. The list can be
     * represented as:
     * <p>
     * L_0 → L_1 → … → L_(n - 1) → L_n
     * <p>
     * Reorder the list to be on the following form:
     * <p>
     * L_0 → L_n → L_1 → L_(n - 1) → L_2 → L_(n - 2) → …
     * <p>
     * You may not modify the values in the list's nodes. Only nodes
     * themselves may be changed.
     *
     * @param head The number of nodes in the list is in the range
     *             [1, 5 * 10^4].
     *             1 <= Node.val <= 1000
     */
    void reorderList(ListNode head);
}
