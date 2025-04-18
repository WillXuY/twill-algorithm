package org.willxu.algorithm.service.impl.listnode;

import common.provide.ListNode;
import org.willxu.algorithm.service.listnode.RemoveNthNodeFromEndOfList;

import java.util.ArrayList;
import java.util.List;

public class RemoveNthNodeFromEndOfListLoop
        implements RemoveNthNodeFromEndOfList {
    @Override
    public ListNode removeNthFromEnd(ListNode head, int n) {
        List<ListNode> listNodeList = new ArrayList<>();
        while (head != null) {
            listNodeList.add(head);
            head = head.next;
        }
        int index = listNodeList.size() - n - 1;
        if (index < 0) {
            if (listNodeList.size() <= 1) {
                return null;
            } else {
                return listNodeList.get(1);
            }
        }
        ListNode parentNode = listNodeList.get(index);
        parentNode.next = parentNode.next.next;
        return listNodeList.get(0);
    }
}
