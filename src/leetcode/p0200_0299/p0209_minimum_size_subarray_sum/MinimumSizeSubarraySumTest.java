/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0209_minimum_size_subarray_sum;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumSizeSubarraySumTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation: The subarray [4, 3] has the minimal length
                under the problem constraint.
                 */
                arguments(7, new int[] {2, 3, 1, 2, 4, 3}, 2),
                arguments(4, new int[] {1, 4, 4}, 1),
                arguments(11, new int[] {1, 1, 1, 1, 1, 1, 1, 1}, 0)
        );
    }

    @ParameterizedTest(name = "brute force {index}")
    @MethodSource("dataProvider")
    public void testBruteForce(int target, int[] nums, int output) {
        MinimumSizeSubarraySum bruteForce =
                new MinimumSizeSubarraySumBruteForce();
        assertEquals(output, bruteForce.minSubArrayLen(target, nums));
    }

    @ParameterizedTest(name = "better {index}")
    @MethodSource("dataProvider")
    public void testBetter(int target, int[] nums, int output) {
        MinimumSizeSubarraySum better = new MinimumSizeSubarraySumBetter();
        assertEquals(output, better.minSubArrayLen(target, nums));
    }
}
