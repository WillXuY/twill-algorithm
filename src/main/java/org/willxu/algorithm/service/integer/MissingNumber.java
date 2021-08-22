package org.willxu.algorithm.service.integer;

public interface MissingNumber {
    /**
     * Given an array nums containing n distinct numbers in the
     * range [0, n], return the only number in the range that is
     * missing from the array.
     *
     * Follow up:
     * Could you implement a solution using only O(1) extra space
     * complexity and O(n) runtime complexity?
     *
     * Constraints:
     * All the numbers of nums are unique.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             0 <= nums[i] <= n
     * @return  missing number in array.
     */
    int missingNumber(int[] nums);
}
