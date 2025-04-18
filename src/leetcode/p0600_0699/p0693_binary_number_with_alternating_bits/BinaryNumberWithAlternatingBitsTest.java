/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0693_binary_number_with_alternating_bits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinaryNumberWithAlternatingBitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 101
                arguments(5, true),
                arguments(7, false),
                arguments(11, false),
                // 1010
                arguments(10, true),
                arguments(3, false)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int input, boolean expected) {
        BinaryNumberWithAlternatingBits divide =
                new BinaryNumberWithAlternatingBitsDivide();
        assertEquals(expected, divide.hasAlternatingBits(input));
    }
}
