package org.willxu.algorithm.service.integer;

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
