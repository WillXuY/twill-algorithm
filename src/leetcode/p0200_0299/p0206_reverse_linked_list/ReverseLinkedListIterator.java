/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.listnode;

import common.provide.ListNode;
import org.willxu.algorithm.service.listnode.ReverseLinkedList;

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
