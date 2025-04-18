package leetcode.p0000_0099.p0092_reverse_linked_list_ii;

import common.provide.ListNode;

public class ReverseLinkedListIiLoop implements ReverseLinkedListIi {
    @Override
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if (left >= right) {
            return head;
        }
        ListNode result;
        ListNode start = null, reverse = null, end = null;
        ListNode startNode = null, reverseNode = null, endNode = null;
        boolean startReverse = false, endReverse = false;
        int index = 1;
        while (head != null) {
            ListNode next = new ListNode(head.val);
            if (endReverse) {
                if (end == null) {
                    end = next;
                    endNode = next;
                } else {
                    endNode.next = next;
                    endNode = next;
                }
            } else if (startReverse) {
                if (index == right) {
                    // end reverse
                    endReverse = true;
                }
                // reverse Node
                next.next = reverse;
                reverse = next;
            } else if (index == left) {
                // start reverse
                reverse = next;
                reverseNode = reverse;
                startReverse = true;
            } else {
                if (start == null) {
                    start = new ListNode(head.val);
                    startNode = start;
                } else {
                    startNode.next = next;
                    startNode = next;
                }
            }
            index++;
            head = head.next;
        }
        if (reverse == null) {
            reverse = end;
        } else {
            reverseNode.next = end;
        }
        if (start == null) {
            result = reverse;
        } else {
            result = start;
            startNode.next = reverse;
        }
        return result;
    }
}
