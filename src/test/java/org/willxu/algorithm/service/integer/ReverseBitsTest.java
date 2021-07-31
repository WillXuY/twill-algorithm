/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ReversBitsToString;

import java.util.Random;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseBitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        0b00000010100101000001111010011100,
                        // 964176192
                        0b00111001011110000010100101000000
                ),
                arguments(
                        0b11111111111111111111111111111101,
                        // 3221225471
                        0b10111111111111111111111111111111
                )
        );
    }

    @ParameterizedTest(name = "ToString {index}")
    @MethodSource("dataProvider")
    public void testToString(int input, int excepted) {
        ReverseBits toString = new ReversBitsToString();
        assertEquals(excepted, toString.reverseBits(input));
    }

    /**
     * TODO finish a bit calculate.
     */
    @Test
    public void testBits() {
        int i = 0b00000010100101000001111010011100;
        System.out.println(
                Integer.toBinaryString(~i) + "\n"
                        + Integer.toBinaryString(i << 29) + "\n"
                        + Integer.toBinaryString(i >> 3) + "\n"
                        + Integer.toBinaryString(i << 28) + "\n"
                        + Integer.toBinaryString(i >> 4) + "\n"
        );

        int swt = 0b000010;
        if (new Random().nextBoolean()) {
            swt = 0b111101;
        }
        boolean open1 = (swt & 1) == 1;
        boolean open2 = (swt & 2) == 2;
        boolean open3 = (swt & 4) == 4;
        boolean open4 = (swt & 8) == 8;
    }

    @Test
    public void test() {
        int k = Integer.MIN_VALUE;
        String ks = Integer.toBinaryString(k);
        int ki = Integer.valueOf(ks, 2);
        System.out.println(ki);
        int j = -1;
        String s = Integer.toBinaryString(j);
        int i = Integer.valueOf(s, 2);
        System.out.println(s);
    }
}
