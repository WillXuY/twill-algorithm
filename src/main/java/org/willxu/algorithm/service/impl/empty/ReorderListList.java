package org.willxu.algorithm.service.impl.empty;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.empty.ReorderList;

import java.util.ArrayList;
import java.util.List;

public class ReorderListList implements ReorderList {
    @Override
    public void reorderList(ListNode head) {
        List<ListNode> nodeList = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            nodeList.add(node);
            node = node.next;
        }
        int size = nodeList.size();
        for (int i = 0; i <= size / 2; i++) {
            int endIndex = size - 1 - i;
            if (i == endIndex || i + 1 == endIndex) {
                break;
            }
            ListNode node1 = nodeList.get(i);
            ListNode node2 = nodeList.get(endIndex);
            ListNode node2Parent = nodeList.get(endIndex - 1);
            node2Parent.next = null;
            node2.next = node1.next;
            node1.next = node2;
        }
    }
}
