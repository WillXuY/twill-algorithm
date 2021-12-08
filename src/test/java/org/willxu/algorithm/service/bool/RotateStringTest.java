/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.RotateStringLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
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
    public void testLoop(String s, String goal, boolean excepted) {
        RotateString loop = new RotateStringLoop();
        assertEquals(excepted, loop.rotateString(s, goal));
    }
}
