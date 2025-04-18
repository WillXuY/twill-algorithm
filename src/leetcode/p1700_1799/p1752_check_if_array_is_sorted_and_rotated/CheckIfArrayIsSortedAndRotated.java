package leetcode.p1700_1799.p1752_check_if_array_is_sorted_and_rotated;

public interface CheckIfArrayIsSortedAndRotated {
    /**
     * Given an array nums, return true if the array was originally
     * sorted in non-decreasing order, then rotated some number of
     * positions (including zero). Otherwise, return false.
     *
     * There may be duplicates in the original array.
     *
     * Note: An array A rotated by x positions results in an array B of
     * the same length such that A[i] == B[(i+x) % A.length], where % is
     * the modulo operation.
     *
     * @param nums 1 <= nums.length <= 100
     *             1 <= nums[i] <= 100
     */
    boolean check(int[] nums);
}
