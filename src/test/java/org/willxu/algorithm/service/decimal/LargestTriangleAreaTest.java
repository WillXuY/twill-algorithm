/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.decimal;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.decimal.LargestTriangleAreaCombination;

import java.util.stream.Stream;

import static groovy.test.GroovyTestCase.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestTriangleAreaTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}},
                        2.00000
                ),
                arguments(
                        new int[][] {{1, 0}, {0, 0}, {0, 1}},
                        0.50000
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testCombination(int[][] points, double excepted) {
        LargestTriangleArea combination = new LargestTriangleAreaCombination();
        assertEquals(excepted, combination.largestTriangleArea(points));
    }
}
