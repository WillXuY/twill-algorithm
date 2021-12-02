/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.LargestNumberAtLeastTwiceOfOthersLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
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
    public void testLoop(int[] nums, int excepted) {
        LargestNumberAtLeastTwiceOfOthers loop =
                new LargestNumberAtLeastTwiceOfOthersLoop();
        assertEquals(excepted, loop.dominantIndex(nums));
    }
}
