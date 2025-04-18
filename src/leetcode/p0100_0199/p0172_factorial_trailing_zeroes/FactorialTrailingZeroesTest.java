/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0172_factorial_trailing_zeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FactorialTrailingZeroesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Explanation: 3! = 6, no trailing zero.
                arguments(3, 0),
                arguments(5, 1),
                arguments(0, 0)
        );
    }

    @ParameterizedTest(name = "Find5 {index}")
    @MethodSource("dataProvider")
    public void testFind5(int input, int expected) {
        FactorialTrailingZeroes find5 = new FactorialTrailingZeroesFind5();
        assertEquals(expected, find5.trailingZeroes(input));
    }
}
