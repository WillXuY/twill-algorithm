/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0206_reverse_linked_list;

import common.provide.ListNode;

public class ReverseLinkedListIterator implements ReverseLinkedList {
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode out = null;
        ListNode iterator = head;
        while (iterator!= null) {
            out = new ListNode(iterator.val, out);
            iterator = iterator.next;
        }
        return out;
    }
}
