/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.other;

import org.willxu.algorithm.provide.ListNode;

public interface RemoveDuplicatesFromSortedList {

    /**
     * Given the head of a sorted linked list, delete all duplicates
     * such that each element appears only once. Return the linked list
     * sorted as well.
     *
     * Constraints:
     * - The number of nodes in the list is int the range [0, 300].
     * - The list is guaranteed to be sorted in ascending order.
     *
     * @param head -100 <= Node.val <= 100
     * @return result ListNode without duplicates
     */
    ListNode deleteDuplicates(ListNode head);
}
