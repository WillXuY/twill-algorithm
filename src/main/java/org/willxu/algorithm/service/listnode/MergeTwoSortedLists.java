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

public interface MergeTwoSortedLists {
    /**
     * Merge two sorted linked lists and return it as a sorted list.
     * The list should be mage by splicing together the nodes of the
     * first two lists.
     *
     * @param l1 sorted linked lists
     * @param l2 sorted linked lists
     * @return sorted linked lists merged by l1 and l2
     */
    ListNode mergeTwoLists(ListNode l1, ListNode l2);
}
