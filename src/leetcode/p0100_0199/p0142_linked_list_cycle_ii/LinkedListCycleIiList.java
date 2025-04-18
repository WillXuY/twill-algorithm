package leetcode.p0100_0199.p0142_linked_list_cycle_ii;

import common.provide.ListNode;

import java.util.HashSet;
import java.util.Set;

public class LinkedListCycleIiList implements LinkedListCycleIi {
    @Override
    public ListNode detectCycle(ListNode head) {
        ListNode result = head;
        Set<ListNode> nodeList = new HashSet<>();
        while (result != null) {
            if (nodeList.contains(result)) {
                return result;
            } else {
                nodeList.add(result);
            }
            result = result.next;
        }
        return null;
    }
}
