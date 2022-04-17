package org.willxu.algorithm.service.boolist;

import java.util.List;

public interface BinaryPrefixDivisibleBy5 {
    /**
     * You are given a binary array nums (0-indexed).
     * We define x_i as the number whose binary representation is the
     * subarray nums[0..i] (from most-significant-bit to
     * least-significant-bit).
     * - For example, if nums = [1, 0, 1], then x_0 = 1, x_1 = 2, and
     *   x_2 = 5.
     * Return an array of booleans answer where answer[i] is true if x_i
     * is divisible by 5.
     *
     * @param nums 1 <= nums.length <= 10^5
     *             nums[i] is either 0 or 1.
     * @return binary num is divisible by 5.
     */
    List<Boolean> prefixesDivBy5(int[] nums);
}
