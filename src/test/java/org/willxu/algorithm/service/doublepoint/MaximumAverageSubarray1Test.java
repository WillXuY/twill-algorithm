/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.doublepoint;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.doublepoint.MaximumAverageSubarray1Loop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumAverageSubarray1Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 12, -5, -6, 50, 3}, 4, 12.75),
                arguments(new int[] {5}, 1, 5.0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] input, int k, double expected) {
        MaximumAverageSubarray1 loop = new MaximumAverageSubarray1Loop();
        assertEquals(expected, loop.findMaxAverage(input, k));
    }
}
