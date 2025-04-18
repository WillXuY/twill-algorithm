package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.RichestCustomerWealth;

public class RichestCustomerWealthCount implements RichestCustomerWealth {
    @Override
    public int maximumWealth(int[][] accounts) {
        int output = Integer.MIN_VALUE;
        for (int[] a: accounts) {
            int count = 0;
            for (int i: a) {
                count += i;
            }
            if (count > output) {
                output = count;
            }
        }
        return output;
    }
}
