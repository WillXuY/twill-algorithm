package leetcode.p1800_1899.p1863_sum_of_all_subset_xor_totals;

public interface SumOfAllSubsetXorTotals {
    /**
     * The XOR total of an array is defined as the bitwise XOR of all
     * its elements, or 0 if the array is empty.
     *
     * - For example, the XOR total of the array [2,5,6] is 2 XOR 5 XOR
     * 6 = 1.
     *
     * Given an array nums, return the sum of all XOR totals for every
     * subset of nums.
     *
     * Note: Subsets with the same elements should be counted multiple
     * times.
     *
     * An array a is a subset of an array b if a can be obtained from b
     * by deleting some (possibly zero) elements of b.
     *
     * @param nums 1 <= nums.length <= 12
     *             1 <= nums[i] <= 20
     */
    int subsetXORSum(int[] nums);
}
