package org.willxu.algorithm.domain.integer;

/**
 * Given a singly linked list, return a random node's value from the
 * linked list. Each node must have the same probability of being chosen.
 * <p>
 * Implement the Solution class:
 * <p>
 * Solution(ListNode head) Initializes the object with the head of the
 * singly-linked list head.
 * <p>
 * The number of nodes in the linked list will be in the range [1, 10^4].
 * -10^4 <= Node.val <= 10^4
 * At most 10^4 calls will be made to getRandom.
 */
public interface LinkedListRandomNode {
    /**
     * Chooses a node randomly from the list and returns its value. All
     * the nodes of the list should be equally likely to be chosen.
     */
    int getRandom();
}
