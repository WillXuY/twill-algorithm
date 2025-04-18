package leetcode.p1200_1299.p1290_convert_binary_number_in_linked_list_to_integer;

import common.provide.ListNode;

public interface ConvertBinaryNumberInLinkedListToInteger {
    /**
     * Given head which is a reference node to a singly-linked list.
     * The value of each node in the linked list is either 0 or 1. The
     * linked list holds the binary representation of a number.
     * Return the decimal value of the number in the linked list.
     *
     * @param head The linked list is not empty.
     *             Number of nodes will not exceed 30.
     *             Each node's value is either 0 or 1.
     * @return the decimal value of the binary list in head.
     */
    int getDecimalValue(ListNode head);
}
