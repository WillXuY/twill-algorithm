/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.MostCommonWordLoop;

import java.util.stream.Stream;

import static groovy.test.GroovyTestCase.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MostCommonWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments("Bob", new String[0], "bob"),
                arguments(
                        "Bob hit a ball, the hit BALL flew far after it was"
                        + "hit.",
                        new String[] {"hit"},
                        "ball"
                ),
                arguments(
                        "a.",
                        new String[0],
                        "a"
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(String paragraph, String[] banned, String excepted) {
        MostCommonWord loop = new MostCommonWordLoop();
        assertEquals(excepted, loop.mostCommonWord(paragraph, banned));
    }
}
