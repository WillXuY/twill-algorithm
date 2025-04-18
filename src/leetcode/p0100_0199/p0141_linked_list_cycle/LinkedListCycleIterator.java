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
import org.willxu.algorithm.service.bool.LinkedListCycle;

import java.util.HashSet;

public class LinkedListCycleIterator implements LinkedListCycle {
    @Override
    public boolean hasCycle(ListNode head) {
        if (head == null) {
            return false;
        }
        HashSet<Integer> set = new HashSet<>();
        set.add(head.hashCode());
        ListNode iterator = head;
        while (iterator.next != null) {
            int hashCode = iterator.next.hashCode();
            if (set.contains(hashCode)) {
                return true;
            } else {
                set.add(hashCode);
            }
            iterator = iterator.next;
        }
        return false;
    }
}
