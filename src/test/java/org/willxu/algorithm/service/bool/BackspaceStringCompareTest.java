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
import org.willxu.algorithm.service.impl.bool.BackspaceStringCompareLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BackspaceStringCompareTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("y#fo##f", "y#f#o##f", true),
                arguments("ab#c", "ad#c", true),
                arguments("ab##", "c#d#", true),
                arguments("a##c", "#a#c", true),
                arguments("a#c", "b", false)
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(String s, String t, boolean expected) {
        BackspaceStringCompare loop = new BackspaceStringCompareLoop();
        assertEquals(expected, loop.backspaceCompare(s, t));
    }
}
