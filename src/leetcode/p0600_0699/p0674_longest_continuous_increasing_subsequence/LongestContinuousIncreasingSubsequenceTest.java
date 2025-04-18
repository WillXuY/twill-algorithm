/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0674_longest_continuous_increasing_subsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestContinuousIncreasingSubsequenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1 (difference need not be same):
                arguments(new int[] {1, 2, 5, 8, 0}, 4),
                arguments(new int[] {1, 3, 5, 4, 7}, 3),
                arguments(new int[] {2, 2, 2, 2, 2}, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] input, int expected) {
        LongestContinuousIncreasingSubsequence loop =
                new LongestContinuousIncreasingSubsequenceLoop();
        assertEquals(expected, loop.findLengthOfLCIS(input));
    }
}
