/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p1100_1199.p1137_nth_tribonacci_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NthTribonacciNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 4),
                arguments(25, 1389537)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testGetNthTribonacciNumberBruteForce(int input, int output) {
        NthTribonacciNumberService bruteForce = new NthTribonacciNumberServiceImpl();
        assertEquals(output, bruteForce.getNthTribonacciNumber(input));
    }

    @ParameterizedTest(name = "recursive {index}")
    @MethodSource("dataProvider")
    public void testGetNthTribonacciNumberRecursive(int input, int output) {
        NthTribonacciNumberService recursive = new NthTribonacciNumberRecursiveImpl();
        assertEquals(output, recursive.getNthTribonacciNumber(input));
    }

}
