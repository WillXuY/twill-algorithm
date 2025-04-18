/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0069_sqrt;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SqrtTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 2),
                /*
                Explanation:
                The square root of 8 is 2.82842..., and since the
                decimal part is truncated, 2 is returned.
                 */
                arguments(8, 2),
                // wrong answer 1: 0
                arguments(1, 1),
                // wrong answer 2: 46339
                arguments(2147395600, 46340),
                // wrong answer 3: 46339
                arguments(2147483647, 46340)
        );
    }

    @ParameterizedTest(name = "Param {index}")
    @MethodSource("dataProvider")
    public void testSqrt(int input, int output) {
        Sqrt sqrt = new SqrtBruteForce();
        assertEquals(output, sqrt.mySqrt(input));
    }
}
