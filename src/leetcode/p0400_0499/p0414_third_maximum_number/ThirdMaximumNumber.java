package leetcode.p0400_0499.p0414_third_maximum_number;

public interface ThirdMaximumNumber {
    /**
     * Given an integer array nums, return the third distinct maximum
     * number in this array. if the third maximum does not exist, return
     * the maximum number.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             -2^31 <= nums[i] <= 2^31 - 1
     * @return the third max or maximum if thirt not exit.
     */
    int thirdMax(int[] nums);
}
