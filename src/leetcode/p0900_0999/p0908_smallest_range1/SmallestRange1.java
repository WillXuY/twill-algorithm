package leetcode.p0900_0999.p0908_smallest_range1;

public interface SmallestRange1 {
    /**
     * You are given an integer array nums and an integer k.
     * In one operation, you can choose any index i where
     * 0 <= i < nums.length and change nums[i] to nums[i] + x where x is
     * an integer from the range [-k, k]. You can apply this operation
     * at most once for each index i.
     * The score of nums is the difference between the maximum and
     * minimum elements in nums.
     * Return the minimum score of nums after applying the mentioned
     * operation at most once for each index in it.
     *
     * @param nums 1 <= nums.length <= 10^4
     *             0 <= nums[i] <= 10^4
     * @param k 0 <= k <= 10^4
     * @return smallest range in nums after operation.
     */
    int smallestRangeI(int[] nums, int k);
}
