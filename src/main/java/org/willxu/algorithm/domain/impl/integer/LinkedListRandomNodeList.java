package org.willxu.algorithm.domain.impl.integer;

import org.willxu.algorithm.domain.integer.LinkedListRandomNode;
import org.willxu.algorithm.provide.ListNode;

import java.util.ArrayList;
import java.util.List;

public class LinkedListRandomNodeList implements LinkedListRandomNode {
    private final List<Integer> list;

    public LinkedListRandomNodeList(ListNode head) {
        list = new ArrayList<>();
        while (head != null) {
            list.add(head.val);
            head = head.next;
        }
    }

    @Override
    public int getRandom() {
        int random = (int) (Math.random() * list.size());
        return list.get(random);
    }
}
