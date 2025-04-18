/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0762_prime_number_of_set_bits_in_binary_representation;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PrimeNumberOfSetBitsInBinaryRepresentationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                6 -> 110 -> 2 -> prime
                7 -> 111 -> 3 -> prime
                8 -> 1000 -> 1 -> not
                9 -> 1001 -> 2 -> prime
                10 -> 1010 -> 2 -> prime
                 */
                arguments(6, 10, 4),
                arguments(10, 15, 5)
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(int left, int right, int expected) {
        PrimeNumberOfSetBitsInBinaryRepresentation array =
                new PrimeNumberOfSetBitsInBinaryRepresentationArray();
        assertEquals(expected, array.countPrimeSetBits(left, right));
    }
}
