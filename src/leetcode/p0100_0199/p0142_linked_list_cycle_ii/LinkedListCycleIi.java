package leetcode.p0100_0199.p0142_linked_list_cycle_ii;

import common.provide.ListNode;

public interface LinkedListCycleIi {
    /**
     * Given the head of a linked list, return the node where the cycle
     * begins. If there is no cycle, return null.
     * <p>
     * There is a cycle in a linked list if there is some node in the
     * list that can be reached again by continuously following the next
     * pointer. Internally, pos is used to denote the index of the node
     * that tail's next pointer is connected to (0-indexed). It is -1 if
     * there is no cycle. Note that pos is not passed as a parameter.
     * <p>
     * Do not modify the linked list.
     *
     * @param head The number of the nodes in the list is in the range
     *             [0, 10^4].
     *             -10^5 <= Node.val <= 10^5
     *             pos is -1 or a valid index in the linked-list.
     */
    ListNode detectCycle(ListNode head);
}
