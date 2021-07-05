package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.provide.ListNode;
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
