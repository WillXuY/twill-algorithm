package leetcode.p0000_0099.p0086_partition_list;

import common.provide.ListNode;

public class PartitionListSave implements PartitionList {
    @Override
    public ListNode partition(ListNode head, int x) {
        ListNode small = null;
        ListNode smallNode = null;
        ListNode large = null;
        ListNode largeNode = null;
        while (head != null) {
            int val = head.val;
            if (val < x) {
                if (small == null) {
                    small = new ListNode(val);
                    smallNode = small;
                } else {
                    smallNode.next = new ListNode(val);
                    smallNode = smallNode.next;
                }
            } else {
                if (large == null) {
                    large = new ListNode(val);
                    largeNode = large;
                } else {
                    largeNode.next = new ListNode(val);
                    largeNode = largeNode.next;
                }
            }
            head = head.next;
        }
        if (small == null) {
            return large;
        } else {
            smallNode.next = large;
            return small;
        }
    }
}
