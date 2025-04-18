/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LongestCommonPrefixBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestCommonPrefixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"flower", "flow", "flight"}, "fl"),
                arguments(new String[] {"dog", "racecar", "car"}, ""),
                // wrong answer getting substring not the prefix
                arguments(new String[] {"reflower", "flow", "flight"}, "")
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testLongestCommonPrefix(String[] input, String output) {
        LongestCommonPrefix bruteForce = new LongestCommonPrefixBruteForce();
        assertEquals(output, bruteForce.longestCommonPrefix(input));
    }
}
