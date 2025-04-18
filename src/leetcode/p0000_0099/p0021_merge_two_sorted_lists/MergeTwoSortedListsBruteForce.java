/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0021_merge_two_sorted_lists;

import common.provide.ListNode;

public class MergeTwoSortedListsBruteForce implements MergeTwoSortedLists {
    @Override
    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode result;
        ListNode node1 = l1;
        ListNode node2 = l2;
        if (l1 == null && l2 == null) {
            return null;
        } else if (l1 == null) {
            result = new ListNode(l2.val);
            node2 = l2.next;
        } else if (l2 == null){
            result = new ListNode(l1.val);
            node1 = l1.next;
        } else if (l1.val > l2.val) {
            result = new ListNode(l2.val);
            node2 = l2.next;
        } else {
            result = new ListNode(l1.val);
            node1 = l1.next;
        }
        ListNode iterator = result;
        while (node1 != null || node2 != null) {
            if (node1 == null) {
                ListNode newNode = new ListNode(node2.val);
                iterator.next = newNode;
                iterator = newNode;
                node2 = node2.next;
            } else if (node2 == null) {
                ListNode newNode = new ListNode(node1.val);
                iterator.next = newNode;
                iterator = newNode;
                node1 = node1.next;
            } else if (node1.val > node2.val) {
                ListNode newNode = new ListNode(node2.val);
                iterator.next = newNode;
                iterator = newNode;
                node2 = node2.next;
            } else {
                ListNode newNode = new ListNode(node1.val);
                iterator.next = newNode;
                iterator = newNode;
                node1 = node1.next;
            }
        }
        return result;
    }
}
