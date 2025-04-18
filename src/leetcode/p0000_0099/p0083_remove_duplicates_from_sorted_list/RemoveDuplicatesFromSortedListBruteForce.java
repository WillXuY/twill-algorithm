/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0083_remove_duplicates_from_sorted_list;

import common.provide.ListNode;

public class RemoveDuplicatesFromSortedListBruteForce
        implements RemoveDuplicatesFromSortedList {

    @Override
    public ListNode deleteDuplicates(ListNode head) {
        // Exception 1: NullPointException
        if (head == null) {
            return null;
        }
        ListNode r = new ListNode(head.val, head.next);
        ListNode iterator = r;
        while (iterator.next != null) {
            if (iterator.val == iterator.next.val) {
                iterator.next = iterator.next.next;
            } else {
                /*
                Wrong answer 1: do this only if
                iterator != iterator.next
                 */
                iterator = iterator.next;
            }
        }
        return r;
    }
}
