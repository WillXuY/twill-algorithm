/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0121_best_time_to_buy_and_sell_stock;

public class BestTimeToBuyAndSellStockCycle
        implements BestTimeToBuyAndSellStock {
    /**
     * brute force
     * Time Limit Exceeded
     *
     * @param prices 1 <= prices.length <= 10^5
     *               0 <= prices[i] <= 10^4
     * @return max profit
     */
    @Override
    public int maxProfit(int[] prices) {
        int max = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                int dif = prices[j] - prices[i];
                if (dif > max) {
                    max = dif;
                }
            }
        }
        return max;
    }
}
