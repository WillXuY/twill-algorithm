/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0058_length_of_last_word;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LengthOfLastWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("Hello World", 5),
                arguments(" ", 0)
        );
    }

    @ParameterizedTest(name = "Error param {index}")
    @MethodSource("dataProvider")
    public void testLengthOfLastWord(String s, int output) {
        LengthOfLastWord bruteForce = new LengthOfLastWordBruteForce();
        assertEquals(output, bruteForce.lengthOfLastWord(s));
    }
}
