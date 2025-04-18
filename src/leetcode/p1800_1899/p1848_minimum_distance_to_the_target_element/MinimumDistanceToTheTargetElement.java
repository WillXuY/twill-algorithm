package leetcode.p1800_1899.p1848_minimum_distance_to_the_target_element;

public interface MinimumDistanceToTheTargetElement {
    /**
     * Given an integer array nums (0-indexed) and two integers target
     * and start, find an index i such that nums[i] == target and
     * abs(i - start) is minimized. Note that abs(x) is the absolute
     * value of x.
     *
     * Return abs(i - start).
     *
     * It is guaranteed that target exists in nums.
     *
     * @param nums 1 <= nums.length <= 1000
     *             1 <= nums[i] <= 104
     * @param target is in nums.
     * @param start 0 <= start < nums.length
     */
    int getMinDistance(int[] nums, int target, int start);
}
