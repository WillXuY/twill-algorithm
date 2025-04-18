/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0122_best_time_to_buy_and_sell_stock_ii;

public interface BestTimeToBuyAndSellStockIi {
    /**
     * You are given an array prices where prices[i] is the price of a
     * given stock on the i^th day.
     *
     * Find the maximum profit you can achieve. You may complete as
     * many transactions as you like (i.e., buy one and sale one share
     * of the stock multiple times).
     *
     * Note: You may not engage in multiple transactions simultaneously
     * (i.e., you must sell the stock before you buy again).
     *
     * @param prices 1 <= prices.length <= 3 * 10^4
     *               0 <= prices[i] <= 10^4
     * @return max profit
     */
    int maxProfit(int[] prices);
}
