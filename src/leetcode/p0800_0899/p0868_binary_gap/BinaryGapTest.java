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
import org.willxu.algorithm.service.impl.integer.BinaryGapCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinaryGapTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                "10110"
                101 distance = 2;
                11 distance = 1.
                 */
                arguments(22, 2),
                arguments(5, 2),
                arguments(6, 1),
                arguments(8, 0),
                arguments(1, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int n, int expected) {
        BinaryGap count = new BinaryGapCount();
        assertEquals(expected, count.binaryGap(n));
    }
}
