package leetcode.p2100_2199.p2144_minimum_cost_of_buying_candies_with_discount;

public interface MinimumCostOfBuyingCandiesWithDiscount {
    /**
     * A shop is selling candies at a discount. For every two candies
     * sold, the shop gives a third candy for free.
     * <p>
     * The customer can choose any candy to take away for free as long
     * as the cost of the chosen candy is less than or equal to the
     * minimum cost of the two candies bought.
     * <p>
     * - For example, if there are 4 candies with costs 1, 2, 3, and 4,
     *   and the customer buys candies with costs 2 and 3, they can take
     *   the candy with cost 1 for free, but not the candy with cost 4.
     * <p>
     * Given a 0-indexed integer array cost, where cost[i] denotes the
     * cost of the ith candy, return the minimum cost of buying all the
     * candies.
     *
     * @param cost 1 <= cost.length <= 100
     *             1 <= cost[i] <= 100
     */
    int minimumCost(int[] cost);
}
