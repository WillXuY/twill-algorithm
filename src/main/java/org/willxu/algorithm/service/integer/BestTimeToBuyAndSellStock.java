package org.willxu.algorithm.service.integer;

public interface BestTimeToBuyAndSellStock {
    /**
     * You are given an array prices where prices[i] is the price of
     * a given stock on the i^th day.
     *
     * You want to maximize your profit by choosing a single day to buy
     * ont stock and choosing a different day in the future to sell
     * that stock.
     *
     * Return the maximum profit you can achieve from this transaction.
     * If you cannot achieve any profit, return 0.
     *
     * @param prices 1 <= prices.length <= 10^5
     *               0 <= prices[i] <= 10^4
     * @return max Profit
     */
    int maxProfit(int[] prices);
}
