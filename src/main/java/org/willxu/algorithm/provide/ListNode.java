/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.provide;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNodeFromIntArray(int[] input) {
        ListNode iterator = null;
        for (int i = input.length - 1; i >= 0; i--) {
            iterator = new ListNode(input[i], iterator);
        }
        return iterator;
    }

    /**
     * Provide a head of LinkedList with int array and pos the index.
     *
     * @param head 0 <= head.size <= 10^4
     *             -10^5 <= Node.val <= 10^5
     * @param pos the index of ListNode that the last node.next equals
     *            -1 or a valid index in the linked-list.
     * @return the head of ListNode cycle or not.
     */
    public static ListNode getCycleLinkedList(int[] head, int pos) {
        if (head.length < 1) {
            return null;
        }
        ListNode lastOne = new ListNode(head[head.length - 1]);
        ListNode iterator = lastOne;
        for (int i = head.length - 2; i >= 0; i--) {
            iterator = new ListNode(head[i], iterator);
            if (i == pos) {
                lastOne.next = iterator;
            }
        }
        return iterator;
    }

    /**
     * 160. Intersection of Two Linked Lists.
     *
     * @param listA elements of list a
     * @param listB elements of list b
     * @param intersectVal the index of the same element
     *                     is 0 if listA and listB do not intersect.
     * @param skipA the index of intersect in list a
     *              0 <= skipA <= listA.length
     * @param skipB the index of intersect in list b
     *              0 <= skipB <= listB.length
     * @return head of ListNode a, head of ListNode b and the intersect result
     */
    public static List<ListNode> getIntersectLinkedLists(
            int[] listA, int[] listB, int intersectVal, int skipA, int skipB) {
        List<ListNode> r = new ArrayList<>();
        if (skipA >= listA.length || intersectVal != listA[skipA]) {
            r.add(getListNodeFromIntArray(listA));
            r.add(getListNodeFromIntArray(listB));
            return r;
        }
        ListNode intersect = null;
        for (int i = listA.length - 1; i >= skipA; i--) {
            intersect = new ListNode(listA[i], intersect);
        }
        ListNode headA = intersect;
        ListNode headB = intersect;
        for (int i = skipA - 1; i >= 0; i--) {
            headA = new ListNode(listA[i], headA);
        }
        for (int i = skipB - 1; i >= 0; i--) {
            headB = new ListNode(listB[i], headB);
        }
        r.add(headA);
        r.add(headB);
        r.add(intersect);
        return r;
    }

    public int[] toIntArray() {
        int[] r = new int[] {this.val};
        ListNode iterator = this;
        while (iterator.next != null) {
            iterator = iterator.next;
            r = Arrays.copyOf(r, r.length + 1);
            r[r.length - 1] = iterator.val;
        }
        return r;
    }
}
