package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.BestTimeToBuyAndSellStockIi;

public class BestTimeToBuyAndSellStockIiGreedy
        implements BestTimeToBuyAndSellStockIi {
    /**
     * 1. When the price is continued decline, keep waiting.
     * 2. When the next price is rise, remember the min price.
     * 3. Then keep waiting until the price trend turns.
     *
     * @param prices 1 <= prices.length <= 3 * 10^4
     *               0 <= prices[i] <= 10^4
     * @return max profit
     */
    @Override
    public int maxProfit(int[] prices) {
        int profit = 0;
        int lastMin = prices[0];
        boolean keepRise = true;
        boolean inflect;
        if (prices.length < 2) {
            return 0;
        }
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < prices[i - 1]) {
                /*
                simplify here, when keep rise change to decline,
                inflect is here.
                */
                inflect = keepRise;
                keepRise = false;
            } else if (prices[i] > prices[i - 1]) {
                /*
                simplify here, when keep decline change to rise,
                inflect is here.
                */
                inflect = !keepRise;
                keepRise = true;
            } else {
                // Wrong answer 4, if prices same is not the inflect
                inflect = false;
            }
            if (inflect) {
                // min price is the last
                if (keepRise) {
                    lastMin = prices[i - 1];
                // maybe keep rise forever
                } else {
                    profit += prices[i - 1] - lastMin;
                    // reset the max and min after sale.
                    lastMin = prices[i];
                }
            }
        }
        /*
        Wrong answer 2
        the last price maybe never has a inflect, can't use inflect
        as the flag
        */
        if (keepRise) {
            profit += prices[prices.length - 1] - lastMin;
        }
        return profit;
    }
}
