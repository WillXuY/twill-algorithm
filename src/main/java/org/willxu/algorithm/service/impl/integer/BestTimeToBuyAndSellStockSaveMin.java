package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockSaveMin
        implements BestTimeToBuyAndSellStock {
    /**
     * save the index of max and min
     * the result is max value - min value where max.index > min.index
     *
     * @param prices 1 <= prices.length <= 10^5
     *               0 <= prices[i] <= 10^4
     * @return maxProfit
     */
    @Override
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int max = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < min) {
                min = prices[i];
            }
            if (prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
