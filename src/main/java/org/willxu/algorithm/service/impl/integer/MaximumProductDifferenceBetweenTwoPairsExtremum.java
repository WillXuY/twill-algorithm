package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MaximumProductDifferenceBetweenTwoPairs;

public class MaximumProductDifferenceBetweenTwoPairsExtremum
        implements MaximumProductDifferenceBetweenTwoPairs {
    @Override
    public int maxProductDifference(int[] nums) {
        int max1 = 0, max2 = 0,
                min1 = Integer.MAX_VALUE, min2 = Integer.MAX_VALUE;
        for (int n: nums) {
            if (n > max1) {
                max2 = max1;
                max1 = n;
            } else if (n > max2) {
                max2 = n;
            }
            if (n < min1) {
                min2 = min1;
                min1 = n;
            } else if (n < min2) {
                min2 = n;
            }
        }
        return max1 * max2 - min1 * min2;
    }
}
