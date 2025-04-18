/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0747_largest_number_at_least_twice_of_others;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestNumberAtLeastTwiceOfOthersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 6, 1, 0}, 1),
                arguments(new int[] {1, 2, 3, 4}, -1),
                arguments(new int[] {1}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        LargestNumberAtLeastTwiceOfOthers loop =
                new LargestNumberAtLeastTwiceOfOthersLoop();
        assertEquals(expected, loop.dominantIndex(nums));
    }
}
