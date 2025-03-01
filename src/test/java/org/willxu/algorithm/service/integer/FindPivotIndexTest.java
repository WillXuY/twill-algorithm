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
import org.willxu.algorithm.service.impl.integer.FindPivotIndexLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindPivotIndexTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1 + 7 + 3 = 5 + 6
                arguments(new int[] {1, 7, 3, 6, 5, 6}, 3),
                // not exit
                arguments(new int[] {1, 2, 3}, -1),
                // null = 1 - 1
                arguments(new int[] {2, 1, -1}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] input, int expected) {
        FindPivotIndex loop = new FindPivotIndexLoop();
        assertEquals(expected, loop.pivotIndex(input));
    }
}
