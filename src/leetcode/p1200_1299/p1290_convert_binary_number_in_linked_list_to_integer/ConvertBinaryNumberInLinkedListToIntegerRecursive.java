package org.willxu.algorithm.service.impl.integer;

import common.provide.ListNode;
import org.willxu.algorithm.service.integer.ConvertBinaryNumberInLinkedListToInteger;

public class ConvertBinaryNumberInLinkedListToIntegerRecursive
        implements ConvertBinaryNumberInLinkedListToInteger {
    @Override
    public int getDecimalValue(ListNode head) {
        return getSumAndBase(head)[0];
    }

    private int[] getSumAndBase(ListNode head) {
        int[] output = new int[2];
        if (head == null) {
            output[1] = 1;
            return output;
        }
        int[] sub = getSumAndBase(head.next);
        output[1] = 2 * sub[1];
        output[0] = sub[1] * head.val + sub[0];
        return output;
    }
}
