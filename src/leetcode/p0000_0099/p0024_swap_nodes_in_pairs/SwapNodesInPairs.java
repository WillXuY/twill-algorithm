package leetcode.p0000_0099.p0024_swap_nodes_in_pairs;

import common.provide.ListNode;

public interface SwapNodesInPairs {
    /**
     * Given a linked list, swap every two adjacent nodes and return its
     * head. You must solve the problem without modifying the values in
     * the list's nodes (i.e., only nodes themselves may be changed.)
     *
     * @param head The number of nodes in the list is in the
     *             range [0, 100].
     *             0 <= Node.val <= 100
     */
    ListNode swapPairs(ListNode head);
}
