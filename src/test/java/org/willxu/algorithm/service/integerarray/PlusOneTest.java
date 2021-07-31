/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integerarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integerarray.PlusOneBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PlusOneTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Explanation: The array represents the integer 123.
                arguments(new int[] {1, 2, 3}, new int[] {1, 2, 4}),
                // Explanation: The array represents the integer 4321.
                arguments(new int[] {4, 3, 2, 1}, new int[] {4, 3, 2, 2}),
                arguments(new int[] {0}, new int[] {1})
        );
    }

    @ParameterizedTest(name = "Error param {index}")
    @MethodSource("dataProvider")
    public void testPlusOne(int[] digits, int[] output) {
        PlusOne bruteForce = new PlusOneBruteForce();
        assertArrayEquals(output, bruteForce.plusOne(digits));
    }
}
