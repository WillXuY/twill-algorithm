package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumCostOfBuyingCandiesWithDiscount;

import java.util.Arrays;

public class MinimumCostOfBuyingCandiesWithDiscountSort
        implements MinimumCostOfBuyingCandiesWithDiscount {
    @Override
    public int minimumCost(int[] cost) {
        int len = cost.length;
        Arrays.sort(cost);
        int output = 0;
        for (int i = 0; i < len; i += 3) {
            output += cost[len - i - 1];
            if (len - i - 2 >= 0) {
                output += cost[len - i - 2];
            }
        }
        return output;
    }
}
