/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0231_power_of_two;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PowerOfTwoTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Explanation: 2^0 = 1
                arguments(1, true),
                arguments(16, true),
                arguments(3, false),
                arguments(4, true),
                arguments(5, false)
        );
    }

    /**
     * It's much slower than binary.
     */
    @ParameterizedTest(name = "String {index}")
    @MethodSource("dataProvider")
    public void testString(int input, boolean expected) {
        PowerOfTwo string = new PowerOfTwoString();
        assertEquals(expected, string.isPowerOfTwo(input));
    }

    @ParameterizedTest(name = "Binary {index}")
    @MethodSource("dataProvider")
    public void testBinary(int input, boolean expected) {
        PowerOfTwo binary = new PowerOfTwoBinary();
        assertEquals(expected, binary.isPowerOfTwo(input));
    }
}
