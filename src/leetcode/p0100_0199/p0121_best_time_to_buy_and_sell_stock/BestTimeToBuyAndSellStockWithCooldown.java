package leetcode.p0100_0199.p0121_best_time_to_buy_and_sell_stock;

public interface BestTimeToBuyAndSellStockWithCooldown {
    /**
     * You are given an array prices where prices[i] is the price of a
     * given stock on the ith day.
     * <p>
     * Find the maximum profit you can achieve. You may complete as many
     * transactions as you like (i.e., buy one and sell one share of the
     * stock multiple times) with the following restrictions:
     * <p>
     * - After you sell your stock, you cannot buy stock on the next day
     *   (i.e., cooldown one day).
     * <p>
     * Note: You may not engage in multiple transactions simultaneously
     * (i.e., you must sell the stock before you buy again).
     *
     * @param prices 1 <= prices.length <= 5000
     *               0 <= prices[i] <= 1000
     */
    int maxProfit(int[] prices);
}
