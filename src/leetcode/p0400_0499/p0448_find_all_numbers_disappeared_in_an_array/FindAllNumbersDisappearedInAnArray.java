package leetcode.p0400_0499.p0448_find_all_numbers_disappeared_in_an_array;

import java.util.List;

public interface FindAllNumbersDisappearedInAnArray {
    /**
     * Given an array nums of n integers where nums[i] is in the range
     * [1, n], return an array of all the integers in the range [1, n]
     * that do not appear in nums.
     *
     * Follow up:
     * Could you do it without extra space and in O(n) runtime? You may
     * assume the returned list does not count as extra space.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             1 <= nums[i] <= n
     * @return the list of number not appear in nums.
     */
    List<Integer> findDisappearedNumbers(int[] nums);
}
