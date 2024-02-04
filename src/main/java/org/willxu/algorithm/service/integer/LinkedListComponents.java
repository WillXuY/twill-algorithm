package org.willxu.algorithm.service.integer;

import org.willxu.algorithm.provide.ListNode;

public interface LinkedListComponents {
    /**
     * You are given the head of a linked list containing unique integer
     * values and an integer array nums that is a subset of the linked
     * list values.
     * <p>
     * Return the number of connected components in nums where two
     * values are connected if they appear consecutively in the linked
     * list.
     *
     * @param head The number of nodes in the linked list is n.
     *             1 <= n <= 10^4
     *             0 <= Node.val < n
     *             All the values Node.val are unique.
     * @param nums 1 <= nums.length <= n
     *             0 <= nums[i] < n
     *             All the values of nums are unique.
     */
    int numComponents(ListNode head, int[] nums);
}
