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
import org.willxu.algorithm.service.impl.integer.CountBinarySubstringsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountBinarySubstringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 0011, 01, 1100, 10, 0011 and 01
                arguments("00110011", 6),
                // 10, 01, 10, 01
                arguments("10101", 4)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String binary, int expected) {
        CountBinarySubstrings loop = new CountBinarySubstringsLoop();
        assertEquals(expected, loop.countBinarySubstrings(binary));
    }
}
