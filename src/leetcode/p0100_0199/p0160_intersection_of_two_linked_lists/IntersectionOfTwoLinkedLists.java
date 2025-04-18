/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0160_intersection_of_two_linked_lists;

import common.provide.ListNode;

public interface IntersectionOfTwoLinkedLists {
    /**
     * Given te heads of two singly linked-lists headA and headB,
     * return the node at which the two lists intersect. If the two
     * linked lists have no intersection at all, return null.
     *
     * For example, the following two linked lists begin to intersect
     * at node c1:
     *
     * a1 -> a2 -> c1 -> c2 -> c3
     *             ^
     *             |
     * b1 -> b2 -> b3
     *
     * It is guaranteed that there are no cycles anywhere in the entire
     * linked structure.
     *
     * Note that the linked lists must retain their original structure
     * after the function returns.
     *
     * Follow up: Could you write a solution that runs in O(n) time and
     * user only O(1) memory?
     *
     * @param headA 0 <= size <= 3 * 10^4
     *              1 <= Node.val <= 10^5
     * @param headB 0 <= size <= 3 * 10^4
     *              1 <= Node.val <= 10^5
     * @return the head of intersect list node
     */
    ListNode getIntersectionNode(ListNode headA, ListNode headB);
}
