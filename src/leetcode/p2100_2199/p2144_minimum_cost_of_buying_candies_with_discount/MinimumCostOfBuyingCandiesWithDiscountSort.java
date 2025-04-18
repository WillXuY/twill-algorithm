package leetcode.p2100_2199.p2144_minimum_cost_of_buying_candies_with_discount;

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
