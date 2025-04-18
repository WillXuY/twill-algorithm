/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0121_best_time_to_buy_and_sell_stock;

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
