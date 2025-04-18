package leetcode.p0000_0099.p0019_remove_nth_node_from_end_of_list;

import common.provide.ListNode;

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
