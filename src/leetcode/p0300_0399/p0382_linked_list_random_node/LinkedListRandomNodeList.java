package leetcode.p0300_0399.p0382_linked_list_random_node;

import common.provide.ListNode;

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
