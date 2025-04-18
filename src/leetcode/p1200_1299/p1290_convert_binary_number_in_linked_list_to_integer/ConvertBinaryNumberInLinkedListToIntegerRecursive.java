package leetcode.p1200_1299.p1290_convert_binary_number_in_linked_list_to_integer;

import common.provide.ListNode;

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
