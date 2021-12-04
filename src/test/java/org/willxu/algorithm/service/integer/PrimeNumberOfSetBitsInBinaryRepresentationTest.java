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
import org.willxu.algorithm.service.impl.integer.PrimeNumberOfSetBitsInBinaryRepresentationArray;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
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
    public void testArray(int left, int right, int excepted) {
        PrimeNumberOfSetBitsInBinaryRepresentation array =
                new PrimeNumberOfSetBitsInBinaryRepresentationArray();
        assertEquals(excepted, array.countPrimeSetBits(left, right));
    }
}
