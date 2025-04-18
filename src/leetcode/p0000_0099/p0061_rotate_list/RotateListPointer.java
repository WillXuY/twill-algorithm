package leetcode.p0000_0099.p0061_rotate_list;

import common.provide.ListNode;

import java.util.ArrayList;
import java.util.List;

public class RotateListPointer implements RotateList {
    @Override
    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) {
            return head;
        } else if (head == null) {
            return null;
        }
        List<ListNode> nodeList = new ArrayList<>();
        ListNode node = head;
        while (node != null) {
            nodeList.add(node);
            node = node.next;
        }
        int size = nodeList.size();
        int remainder = k % size;
        if (remainder == 0) {
            return head;
        }
        nodeList.get(size - 1).next = nodeList.get(0);
        int index = size - remainder;
        nodeList.get(index - 1).next = null;
        return nodeList.get(index);
    }
}
