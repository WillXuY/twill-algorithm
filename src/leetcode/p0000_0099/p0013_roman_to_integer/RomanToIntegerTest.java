/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0013_roman_to_integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RomanToIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("III", 3),
                arguments("IV", 4),
                arguments("IX", 9),
                arguments("LVIII", 58),
                arguments("MCMXCIV", 1994)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testRomanToInteger(String input, int output) {
        RomanToInteger bruteForce = new RomanToIntegerBruteForce();
        assertEquals(output, bruteForce.romanToInteger(input));
    }
}
