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
