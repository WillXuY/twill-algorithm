/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOf1BitsMoveRight;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOf1BitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation: The input binary string has a total of
                three '1' bits.
                 */
                arguments(
                        0b00000000000000000000000000001011,
                        3
                ),
                arguments(
                        0b00000000000000000000000010000000,
                        1
                ),
                arguments(
                        0b11111111111111111111111111111101,
                        31
                )
        );
    }

    @ParameterizedTest(name = "Move right {index}")
    @MethodSource("dataProvider")
    public void testMoveRight(int input, int expected) {
        NumberOf1Bits moveRight = new NumberOf1BitsMoveRight();
        assertEquals(expected, moveRight.hammingWeight(input));
    }
}
