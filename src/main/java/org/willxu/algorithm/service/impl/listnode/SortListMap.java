package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.SortList;

import java.util.Map;
import java.util.TreeMap;

public class SortListMap implements SortList {
    @Override
    public ListNode sortList(ListNode head) {
        Map<Integer, Integer> countMap = new TreeMap<>();
        while (head != null) {
            int key = head.val;
            if (countMap.containsKey(key)) {
                countMap.put(key, countMap.get(key) + 1);
            } else {
                countMap.put(key, 1);
            }
            head = head.next;
        }
        ListNode result = null;
        ListNode node = null;
        for (int key: countMap.keySet()) {
            int count = countMap.get(key);
            if (result == null) {
                result = new ListNode(key);
                node = result;
                count--;
            }
            for (int i = 0; i < count; i++) {
                ListNode next = new ListNode(key);
                node.next = next;
                node = next;
            }
        }
        return result;
    }
}
