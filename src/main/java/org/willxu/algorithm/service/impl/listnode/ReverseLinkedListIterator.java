package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.ReverseLinkedList;

public class ReverseLinkedListIterator implements ReverseLinkedList {
    @Override
    public ListNode reverseList(ListNode head) {
        ListNode out = null;
        ListNode iterator = head;
        while (iterator!= null) {
            out = new ListNode(iterator.val, out);
            iterator = iterator.next;
        }
        return out;
    }
}
