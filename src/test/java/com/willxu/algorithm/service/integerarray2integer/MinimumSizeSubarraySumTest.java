package com.willxu.algorithm.service.integerarray2integer;

import com.willxu.algorithm.service.impl.integerarray2integer.MinimumSizeSubarraySumBetterImpl;
import com.willxu.algorithm.service.impl.integerarray2integer.MinimumSizeSubarraySumServiceImpl;
import org.junit.jupiter.api.Test;

public class MinimumSizeSubarraySumTest {
    private final MinimumSizeSubarraySumService bruteForce = new MinimumSizeSubarraySumServiceImpl();

    private final MinimumSizeSubarraySumService better = new MinimumSizeSubarraySumBetterImpl();

    @Test
    public void testGetMinimumSizeSubarraySumBruteForce() {
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = bruteForce.getMinimumSizeSubarraySum(s, nums);
        System.out.println(result);
    }

    @Test
    public void testGetMinimumSizeSubarraySumBetter() {
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = better.getMinimumSizeSubarraySum(s, nums);
        System.out.println(result);
    }
}
