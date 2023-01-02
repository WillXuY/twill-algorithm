package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.AddTwoNumbers;

public class AddTwoNumbersLoop implements AddTwoNumbers {
    @Override
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode sub1 = l1.next;
        ListNode sub2 = l2.next;
        int add = 0;
        int sum = l1.val + l2.val;
        if (sum > 9) {
            add = 1;
            sum -= 10;
        }
        ListNode output = new ListNode(sum);
        ListNode sub = output;
        while (sum > 0 || add > 0 || sub1 != null || sub2 != null) {
            int n1 = 0;
            if (sub1 != null) {
                n1 = sub1.val;
                sub1 = sub1.next;
            }
            int n2 = 0;
            if (sub2 != null) {
                n2 = sub2.val;
                sub2 = sub2.next;
            }
            sum = n1 + n2 + add;
            if (sum > 9) {
                add = 1;
                sum -= 10;
            } else {
                add = 0;
            }
            if (sum == 0 && add == 0 && sub1 == null && sub2 == null) {
                break;
            }
            ListNode nextSub = new ListNode(sum);
            sub.next = nextSub;
            sub = nextSub;
        }
        return output;
    }
}
