/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0204_count_primes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountPrimesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Time Limit Exceeded
                arguments(499979, 41537),
                /*
                Explanation: There are 4 prime numbers less than 10,
                they are 2, 3, 5, 7.
                 */
                arguments(10, 4),
                arguments(0, 0),
                arguments(1, 0)
        );
    }

    @ParameterizedTest(name = "Mark remove {index}")
    @MethodSource("dataProvider")
    public void testMarkRemove(int input, int expected) {
        CountPrimes markRemove = new CountPrimesMarkRemove();
        assertEquals(expected, markRemove.countPrimes(input));
    }

    /**
     * Time out
     */
    @ParameterizedTest(name = "Cycle calculate {index}")
    @MethodSource("dataProvider")
    public void testCycleCalculate(int input, int expected) {
        CountPrimes cycleCalculate = new CountPrimesCycleCalculate();
        assertEquals(expected, cycleCalculate.countPrimes(input));
    }
}
