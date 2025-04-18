package leetcode.p0000_0099.p0082_remove_duplicates_from_sorted_list_ii;

import common.provide.ListNode;

public interface RemoveDuplicatesFromSortedListIi {
    /**
     * Given the head of a sorted linked list, delete all nodes that
     * have duplicate numbers, leaving only distinct numbers from the
     * original list. Return the linked list sorted as well.
     *
     * @param head The number of nodes in the list is in the range
     *             [0, 300].
     *             -100 <= Node.val <= 100
     *             The list is guaranteed to be sorted in ascending order.
     */
    ListNode deleteDuplicates(ListNode head);
}
