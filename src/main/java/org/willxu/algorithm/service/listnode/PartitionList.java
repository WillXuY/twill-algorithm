package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface PartitionList {
    /**
     * Given the head of a linked list and a value x, partition it such
     * that all nodes less than x come before nodes greater than or
     * equal to x.
     * <p>
     * You should preserve the original relative order of the nodes in
     * each of the two partitions.
     *
     * @param head The number of nodes in the list is in the range
     *            [0, 200].
     *             -100 <= Node.val <= 100
     * @param x -200 <= x <= 200
     */
    ListNode partition(ListNode head, int x);
}
