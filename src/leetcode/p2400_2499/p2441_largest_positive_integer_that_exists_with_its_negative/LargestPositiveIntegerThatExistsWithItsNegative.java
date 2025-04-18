package leetcode.p2400_2499.p2441_largest_positive_integer_that_exists_with_its_negative;

public interface LargestPositiveIntegerThatExistsWithItsNegative {
    /**
     * Given an integer array nums that does not contain any zeros,
     * find the largest positive integer k such that -k also exists in
     * the array.
     * <p>
     * Return the positive integer k. If there is no such integer,
     * return -1.
     *
     * @param nums 1 <= nums.length <= 1000
     *             -1000 <= nums[i] <= 1000
     *             nums[i] != 0
     */
    int findMaxK(int[] nums);
}
