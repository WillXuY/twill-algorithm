package org.willxu.algorithm.service.integer;

public interface MinimumCostForTickets {
    /**
     * You have planned some train traveling one year in advance. The
     * days of the year in which you will travel are given as an integer
     * array days. Each day is an integer from 1 to 365.
     * <p>
     * Train tickets are sold in three different ways:
     * <p>
     * - a 1-day pass is sold for costs[0] dollars,
     * - a 7-day pass is sold for costs[1] dollars, and
     * - a 30-day pass is sold for costs[2] dollars.
     * <p>
     * The passes allow that many days of consecutive travel.
     * <p>
     * - For example, if we get a 7-day pass on day 2, then we can
     *   travel for 7 days: 2, 3, 4, 5, 6, 7, and 8.
     * <p>
     * Return the minimum number of dollars you need to travel every day
     * in the given list of days.
     *
     * @param days 1 <= days.length <= 365
     *             1 <= days[i] <= 365
     *             days is in strictly increasing order.
     * @param costs costs.length == 3
     *              1 <= costs[i] <= 1000
     */
    int mincostTickets(int[] days, int[] costs);
}
