package org.willxu.algorithm.service.impl.listnode;

import org.willxu.algorithm.provide.ListNode;
import org.willxu.algorithm.service.listnode.IntersectionOfTwoLinkedLists;

import java.util.ArrayList;

public class IntersectionOfTwoLinkedListsSaveNodes
        implements IntersectionOfTwoLinkedLists {
    @Override
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ArrayList<ListNode> nodes = new ArrayList<>();
        while (headA != null) {
            nodes.add(headA);
            headA = headA.next;
        }
        while (headB != null) {
            if (nodes.contains(headB)) {
                return headB;
            }
            headB = headB.next;
        }
        return null;
    }
}
