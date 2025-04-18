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
import org.willxu.algorithm.service.impl.integer.LongestHarmoniousSubsequenceCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestHarmoniousSubsequenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 3, 2, 2, 2, 3
                arguments(new int[] {1, 3, 2, 2, 5, 2, 3, 7}, 5),
                arguments(new int[] {1, 2, 3, 4}, 2),
                arguments(new int[] {1, 1, 1, 1}, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] input, int expected) {
        LongestHarmoniousSubsequence count =
                new LongestHarmoniousSubsequenceCount();
        assertEquals(expected, count.findLHS(input));
    }
}
