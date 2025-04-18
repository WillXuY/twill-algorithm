/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.empty;

import common.provide.ListNode;
import org.willxu.algorithm.service.empty.DeleteNodeInLinkedList;

public class DeleteNodeInLinkedListPoint implements DeleteNodeInLinkedList {
    @Override
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}
