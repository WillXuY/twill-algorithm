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

import java.util.ArrayList;

public class IntersectionOfTwoLinkedListsSaveNodes
        implements IntersectionOfTwoLinkedLists {
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (nodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
