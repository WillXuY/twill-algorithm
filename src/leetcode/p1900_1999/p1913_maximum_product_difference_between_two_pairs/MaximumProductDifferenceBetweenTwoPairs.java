package leetcode.p1900_1999.p1913_maximum_product_difference_between_two_pairs;

public interface MaximumProductDifferenceBetweenTwoPairs {
    /**
     * The product difference between two pairs (a, b) and (c, d) is
     * defined as (a * b) - (c * d).
     *
     * - For example, the product difference between (5, 6) and (2, 7)
     *   is (5 * 6) - (2 * 7) = 16.
     *
     * Given an integer array nums, choose four distinct indices
     * w, x, y, and z such that the product difference between pairs
     * (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
     *
     * Return the maximum such product difference.
     *
     * @param nums 4 <= nums.length <= 104
     *             1 <= nums[i] <= 104
     */
    int maxProductDifference(int[] nums);
}
