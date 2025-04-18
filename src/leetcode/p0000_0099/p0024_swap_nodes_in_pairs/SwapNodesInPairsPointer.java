package org.willxu.algorithm.service.impl.listnode;

import common.provide.ListNode;
import org.willxu.algorithm.service.listnode.SwapNodesInPairs;

public class SwapNodesInPairsPointer implements SwapNodesInPairs {
    @Override
    public ListNode swapPairs(ListNode head) {
        if (head == null) {
            return null;
        } else if (head.next == null) {
            return head;
        }
        ListNode left = head;
        ListNode right = head.next;
        head = head.next;
        ListNode parent = null;
        while (right != null) {
            ListNode rightNext = right.next;
            if (parent != null) {
                parent.next = right;
            }
            right.next = left;
            left.next = rightNext;
            if (rightNext == null) {
                break;
            }
            parent = left;
            left = rightNext;
            right = rightNext.next;
        }
        return head;
    }
}
