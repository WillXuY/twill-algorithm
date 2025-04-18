package leetcode.p0000_0099.p0002_add_two_numbers;

import common.provide.ListNode;

public interface AddTwoNumbers {
    /**
     * You are given two non-empty linked lists representing two
     * non-negative integers. The digits are stored in reverse order, and
     * each of their nodes contains a single digit. Add the two numbers
     * and return the sum as a linked list.
     * <p>
     * You may assume the two numbers do not contain any leading zero,
     * except the number 0 itself.
     *
     * @param l1,l2 The number of nodes in each linked list is in the
     *              range [1, 100].
     *              0 <= Node.val <= 9
     *              It is guaranteed that the list represents a number
     *              that does not have leading zeros.
     */
    ListNode addTwoNumbers(ListNode l1, ListNode l2);
}
