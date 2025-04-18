/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0700_0799.p0796_rotate_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RotateStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aa", "a", false),
                arguments("abcde", "cdeab", true),
                arguments("abcde", "abced", false)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(String s, String goal, boolean expected) {
        RotateString loop = new RotateStringLoop();
        assertEquals(expected, loop.rotateString(s, goal));
    }
}
