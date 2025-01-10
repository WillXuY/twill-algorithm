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
import org.willxu.algorithm.service.impl.integer.MinCostClimbingStairsGreedy;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinCostClimbingStairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1
                arguments(new int[] {0, 2, 2, 1}, 2),
                arguments(new int[] {10, 15, 20}, 15),
                arguments(new int[] {1, 100, 1, 1, 1, 100, 1, 1, 100, 1}, 6)
        );
    }

    @ParameterizedTest(name = "Step {index}")
    @MethodSource("dataProvider")
    public void testStep(int[] cost, int excepted) {
        MinCostClimbingStairs step = new MinCostClimbingStairsGreedy();
        assertEquals(excepted, step.minCostClimbingStairs(cost));
    }
}
