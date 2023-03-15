package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.RemoveDuplicatesFromSortedListIi;

public class RemoveDuplicatesFromSortedListIiLoop
        implements RemoveDuplicatesFromSortedListIi {
    @Override
    public ListNode deleteDuplicates(ListNode head) {
        if (head == null) {
            return null;
        }
        ListNode result = null;
        ListNode lastNode = null;
        int lastNum = head.val;
        boolean lastSame = false;
        while (head.next != null) {
            if (lastNum == head.next.val) {
                lastSame = true;
            } else {
                if (!lastSame) {
                    if (result == null) {
                        result = new ListNode();
                        result.val = lastNum;
                        lastNode = result;
                    } else {
                        ListNode next = new ListNode();
                        next.val = lastNum;
                        lastNode.next = next;
                        lastNode = lastNode.next;
                    }
                }
                lastSame = false;
            }
            lastNum = head.next.val;
            head = head.next;
        }
        if (!lastSame) {
            if (result == null) {
                result = new ListNode();
                result.val = lastNum;
            } else {
                ListNode next = new ListNode();
                next.val = lastNum;
                lastNode.next = next;
            }
        }
        return result;
    }
}
