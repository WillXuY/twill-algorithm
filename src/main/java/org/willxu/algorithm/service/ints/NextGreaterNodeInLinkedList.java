package org.willxu.algorithm.service.ints;

import org.willxu.algorithm.provide.ListNode;

public interface NextGreaterNodeInLinkedList {
    /**
     * You are given the head of a linked list with n nodes.
     * <p>
     * For each node in the list, find the value of the next greater
     * node. That is, for each node, find the value of the first node
     * that is next to it and has a strictly larger value than it.
     * <p>
     * Return an integer array answer where answer[i] is the value of
     * the next greater node of the ith node (1-indexed). If the i^th
     * node does not have a next greater node, set answer[i] = 0.
     *
     * @param head The number of nodes in the list is n.
     *             1 <= n <= 10^4
     *             1 <= Node.val <= 10^9
     */
    int[] nextLargerNodes(ListNode head);
}
