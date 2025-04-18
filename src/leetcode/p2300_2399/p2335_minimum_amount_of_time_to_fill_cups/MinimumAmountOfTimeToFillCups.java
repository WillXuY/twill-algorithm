package leetcode.p2300_2399.p2335_minimum_amount_of_time_to_fill_cups;

public interface MinimumAmountOfTimeToFillCups {
    /**
     * You have a water dispenser that can dispense cold, warm, and hot
     * water. Every second, you can either fill up 2 cups with different
     * types of water, or 1 cup of any type of water.
     * <p>
     * You are given a 0-indexed integer array amount of length 3 where
     * amount[0], amount[1], and amount[2] denote the number of cold,
     * warm, and hot water cups you need to fill respectively. Return
     * the minimum number of seconds needed to fill up all the cups.
     *
     * @param amount amount.length == 3
     *               0 <= amount[i] <= 100
     */
    int fillCups(int[] amount);
}
