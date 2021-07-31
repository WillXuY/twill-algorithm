/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.listnode;

import org.willxu.algorithm.provide.ListNode;

public interface RemoveLinkedListElements {
    /**
     * Given the head of a linked list and an integer val, remove all
     * the nodes of the linked list that has Node.val = val, and return
     * the head.
     *
     * @param head head of the linked list
     *             0 <= size <= 10^4
     *             1 <= Node.val <= 50
     * @param val 0 <= val <= 50
     * @return the head of the result list node
     */
    ListNode removeElements(ListNode head, int val);
}
