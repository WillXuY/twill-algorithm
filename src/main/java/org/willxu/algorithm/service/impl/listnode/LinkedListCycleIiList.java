package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.LinkedListCycleIi;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleIiList implements LinkedListCycleIi {
    @Override
    public ListNode detectCycle(ListNode head) {
        ListNode result = head;
        Set<ListNode> nodeList = new HashSet<>();
        while (result != null) {
            if (nodeList.contains(result)) {
                return result;
            } else {
                nodeList.add(result);
            }
            result = result.next;
        }
        return null;
    }
}
