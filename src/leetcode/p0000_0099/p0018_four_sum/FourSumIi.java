package leetcode.p0000_0099.p0018_four_sum;

public interface FourSumIi {
    /**
     * Given four integer arrays nums1, nums2, nums3, and nums4 all
     * length n, return the number of tuples (i, j, k, l) such that:
     * <p>
     * - 0 <= i, j, k, l < n
     * - nums1[i] + nums2[j] + nums3[k] + nums4[l] == 0
     *
     * @param nums1 n == nums1.length
     * @param nums2 n == nums2.length
     * @param nums3 n == nums3.length
     * @param nums4 n == nums4.length
     *              1 <= n <= 200
     *              -2^28 <= nums1[i], nums2[i], nums3[i], nums4[i] <= 2^28
     */
    int fourSumCount(int[] nums1, int[] nums2, int[] nums3, int[] nums4);
}
