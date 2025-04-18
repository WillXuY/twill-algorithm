package leetcode.p0100_0199.p0121_best_time_to_buy_and_sell_stock;

public interface BestTimeToBuyAndSellStockWithTransactionFee {
    /**
     * You are given an array prices where prices[i] is the price of a
     * given stock on the i^th day, and an integer fee representing a
     * transaction fee.
     * <p>
     * Find the maximum profit you can achieve. You may complete as many
     * transactions as you like, but you need to pay the transaction fee
     * for each transaction.
     * <p>
     * Note:
     * <p>
     * - You may not engage in multiple transactions simultaneously
     *   (i.e., you must sell the stock before you buy again).
     * - The transaction fee is only charged once for each stock
     *   purchase and sale.
     *
     * @param prices 1 <= prices.length <= 5 * 10^4
     *               1 <= prices[i] < 5 * 10^4
     * @param fee 0 <= fee < 5 * 10^4
     */
    int maxProfit(int[] prices, int fee);
}
