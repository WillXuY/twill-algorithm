package org.willxu.algorithm.domain.integer;

/**
 * Design an algorithm that collects daily price quotes for some stock
 * and returns the span of that stock's price for the current day.
 * <p>
 * The span of the stock's price in one day is the maximum number of
 * consecutive days (starting from that day and going backward) for
 * which the stock price was less than or equal to the price of that
 * day.
 * <p>
 * - For example, if the prices of the stock in the last four days is
 *   [7,2,1,2] and the price of the stock today is 2, then the span of
 *   today is 4 because starting from today, the price of the stock was
 *   less than or equal 2 for 4 consecutive days.
 * - Also, if the prices of the stock in the last four days is
 *   [7,34,1,2] and the price of the stock today is 8, then the span of
 *   today is 3 because starting from today, the price of the stock was
 *   less than or equal 8 for 3 consecutive days.
 * <p>
 * Implement the StockSpanner class:
 * <p>
 * StockSpanner() Initializes the object of the class.
 * <p>
 * At most 10^4 calls will be made to next.
 */
public interface OnlineStockSpan {
    /**
     * @param price 1 <= price <= 10^5
     * @return the span of the stock's price given that today's price is
     *         price.
     */
    int next(int price);
}
