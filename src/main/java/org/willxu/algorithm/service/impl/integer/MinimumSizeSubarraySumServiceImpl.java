package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.MinimumSizeSubarraySumService;

public class MinimumSizeSubarraySumServiceImpl implements MinimumSizeSubarraySumService {
    /**
     * 暴力求解复杂度过高
     * Brute force [Time Limit Exceeded]
     * Time complexity: O(n^3).
     * Space complexity: O(1).
     * @param s s
     * @param nums nums
     * @return int
     */
    @Override
    public int getMinimumSizeSubarraySum(int s, int[] nums) {
        // 第一层循环： int里截取的长度 i 从0到nums.length
        for (int i = 1; i <= nums.length; i++) {
            // 第二层循环： j 从0到 nums.length - i，求和第j到第j+i-1个数
            for (int j = 0; j <= nums.length - i; j++) {
                int sum = 0;
                for (int k = 0; k < i; k++) {
                    sum += nums[j + k];
                }
                if (sum >= s) {
                    return i;
                }
            }
        }
        return 0;
    }
}
