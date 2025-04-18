package leetcode.p1400_1499.p1464_maximum_product_of_two_elements_in_an_array;

public interface MaximumProductOfTwoElementsInAnArray {
    /**
     * Given the array of integers nums, you will choose two different
     * indices i and j of that array. Return the maximum value of
     * (nums[i] - 1) * (nums[j] - 1).
     *
     * @param nums 2 <= nums.length <= 500
     *             1 <= nums[i] <= 10^3
     * @return maximum value of (nums[i] - 1) * (nums[j] - 1)
     */
    int maxProduct(int[] nums);
}
