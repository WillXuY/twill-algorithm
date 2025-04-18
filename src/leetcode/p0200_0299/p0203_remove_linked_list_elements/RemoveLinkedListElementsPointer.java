/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0203_remove_linked_list_elements;

import common.provide.ListNode;

public class RemoveLinkedListElementsPointer
        implements RemoveLinkedListElements {
    @Override
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) {
            return null;
        }
        while (head.val == val) {
            head = head.next;
            if (head == null) {
                return null;
            }
        }
        ListNode pre = head;
        ListNode iterator = head.next;
        while (iterator != null) {
            if (iterator.val == val) {
                pre.next = iterator.next;
            } else {
                pre = iterator;
            }
            iterator = iterator.next;
        }
        return head;
    }
}
