package leetcode.p2400_2499.p2465_number_of_distinct_averages;

public interface NumberOfDistinctAverages {
    /**
     * You are given a 0-indexed integer array nums of even length.
     * <p>
     * As long as nums is not empty, you must repetitively:
     * <p>
     * - Find the minimum number in nums and remove it.
     * - Find the maximum number in nums and remove it.
     * - Calculate the average of the two removed numbers.
     * <p>
     * The average of two numbers a and b is (a + b) / 2.
     * <p>
     * - For example, the average of 2 and 3 is (2 + 3) / 2 = 2.5.
     * <p>
     * Return the number of distinct averages calculated using the above
     * process.
     * <p>
     * Note that when there is a tie for a minimum or maximum number,
     * any can be removed.
     *
     * @param nums 2 <= nums.length <= 100
     *             nums.length is even.
     *             0 <= nums[i] <= 100
     */
    int distinctAverages(int[] nums);
}
