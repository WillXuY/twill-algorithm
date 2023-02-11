package org.willxu.algorithm.service.integer;

public interface JumpGameIi {
    /**
     * You are given a 0-indexed array of integers nums of length n.
     * You are initially positioned at nums[0].
     * <p>
     * Each element nums[i] represents the maximum length of a forward
     * jump from index i. In other words, if you are at nums[i], you can
     * jump to any nums[i + j] where:
     * <p>
     * - 0 <= j <= nums[i] and
     * - i + j < n
     * Return the minimum number of jumps to reach nums[n - 1]. The test
     * cases are generated such that you can reach nums[n - 1].
     *
     * @param nums 1 <= nums.length <= 104
     *             0 <= nums[i] <= 1000
     *             It's guaranteed that you can reach nums[n - 1].
     */
    int jump(int[] nums);
}
