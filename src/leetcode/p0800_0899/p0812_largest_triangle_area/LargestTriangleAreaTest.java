/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0812_largest_triangle_area;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
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
    public void testCombination(int[][] points, double expected) {
        LargestTriangleArea combination = new LargestTriangleAreaCombination();
        assertEquals(expected, combination.largestTriangleArea(points));
    }
}
