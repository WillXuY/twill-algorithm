package org.willxu.algorithm.service.other;

import org.willxu.algorithm.provide.ListNode;

public interface MergeTwoSortedLists {
    /**
     * Merge two sorted linked lists and return it as a sorted list.
     * The list should be mage by splicing together the nodes of the
     * first two lists.
     *
     * @param l1 sorted linked lists
     * @param l2 sorted linked lists
     * @return sorted linked lists merged by l1 and l2
     */
    ListNode mergeTwoLists(ListNode l1, ListNode l2);
}
