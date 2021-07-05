package org.willxu.algorithm.provide;

import java.util.Arrays;

public class ListNode {

    public int val;

    public ListNode next;

    public ListNode() {}

    public ListNode(int val) {
        this.val = val;
    }

    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public static ListNode getListNodeFromIntArray(int[] input) {
        ListNode iterator = null;
        for (int i = input.length - 1; i >= 0; i--) {
            iterator = new ListNode(input[i], iterator);
        }
        return iterator;
    }

    /**
     * Provide a head of LinkedList with int array and pos the index.
     *
     * @param head 0 <= head.size <= 10^4
     *             -10^5 <= Node.val <= 10^5
     * @param pos the index of ListNode that the last node.next equals
     *            -1 or a valid index in the linked-list.
     * @return the head of ListNode cycle or not.
     */
    public static ListNode getCycleLinkedList(int[] head, int pos) {
        if (head.length < 1) {
            return null;
        }
        ListNode lastOne = new ListNode(head[head.length - 1]);
        ListNode iterator = lastOne;
        for (int i = head.length - 2; i >= 0; i--) {
            iterator = new ListNode(head[i], iterator);
            if (i == pos) {
                lastOne.next = iterator;
            }
        }
        return iterator;
    }

    public int[] toIntArray() {
        int[] r = new int[] {this.val};
        ListNode iterator = this;
        while (iterator.next != null) {
            iterator = iterator.next;
            r = Arrays.copyOf(r, r.length + 1);
            r[r.length - 1] = iterator.val;
        }
        return r;
    }
}
