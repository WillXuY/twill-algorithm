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
import org.willxu.algorithm.service.impl.integer.RangeAddition2Conjunction;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RangeAddition2Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                0,0,0    1,1,0    2,2,1
                0,0,0 -> 1,1,0 -> 2,2,1
                0,0,0    0,0,0    1,1,1
                The maximum integer in M is 2, and there are four of it
                in M. So return 4.
                 */
                arguments(3, 3, new int[][] {{2, 2}, {3, 3}}, 4),
                arguments(
                        3,
                        3,
                        new int[][] {
                                {2, 2}, {3, 3}, {3, 3}, {3, 3},
                                {2, 2}, {3, 3}, {3, 3}, {3, 3},
                                {2, 2}, {3, 3}, {3, 3}, {3, 3}
                        },
                        4
                ),
                arguments(3, 3, new int[][] {}, 9)
        );
    }

    @ParameterizedTest(name = "Conjunction {index}")
    @MethodSource("dataProvider")
    public void testConjunction(int m, int n, int[][] ops, int expected) {
        RangeAddition2 conjunction = new RangeAddition2Conjunction();
        assertEquals(expected, conjunction.maxCount(m, n, ops));
    }
}
