package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumProductOfTwoElementsInAnArray;

public class MaximumProductOfTwoElementsInAnArrayMax
        implements MaximumProductOfTwoElementsInAnArray {
    @Override
    public int maxProduct(int[] nums) {
        int max = 0, second = 0;
        for (int n: nums) {
            if (n > max) {
                second = max;
                max = n;
            } else if (n == max) {
                second = n;
            } else if (n > second) {
                second = n;
            }
        }
        return (max - 1) * (second - 1);
    }
}
