package leetcode.p2200_2299.p2200_find_all_distant_indices_in_an_array;

import java.util.List;

public interface FindAllDistantIndicesInAnArray {
    /**
     * You are given a 0-indexed integer array nums and two integers key
     * and k. A k-distant index is an index i of nums for which there
     * exists at least one index j such that |i - j| <= k and
     * nums[j] == key.
     * <p>
     * Return a list of all k-distant indices sorted in increasing
     * order.
     *
     * @param nums 1 <= nums.length <= 1000
     *             1 <= nums[i] <= 1000
     * @param key is an integer from the array nums.
     * @param k 1 <= k <= nums.length
     */
    List<Integer> findKDistantIndices(int[] nums, int key, int k);
}
