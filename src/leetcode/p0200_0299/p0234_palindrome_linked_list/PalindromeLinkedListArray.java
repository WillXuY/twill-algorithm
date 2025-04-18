/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.impl.bool;

import common.provide.ListNode;
import org.willxu.algorithm.service.bool.PalindromeLinkedList;

import java.util.ArrayList;
import java.util.List;

public class PalindromeLinkedListArray implements PalindromeLinkedList {
    @Override
    public boolean isPalindrome(ListNode head) {
        List<Integer> array = new ArrayList<>();
        while (head != null) {
            array.add(head.val);
            head = head.next;
        }
        int size = array.size();
        int iterateSize = size - size / 2;
        for (int i = 0; i < iterateSize; i++) {
            if (!array.get(i).equals(array.get(size - 1 - i))) {
                return false;
            }
        }
        return true;
    }
}
