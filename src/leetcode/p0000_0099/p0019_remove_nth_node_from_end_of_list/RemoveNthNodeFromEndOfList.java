package leetcode.p0000_0099.p0019_remove_nth_node_from_end_of_list;

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
