/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0800_0899.p0821_shortest_distance_to_character;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ShortestDistanceToCharacterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "loveleetcode",
                        "e",
                        new int[] {3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0}
                ),
                arguments(
                        "aaab", "b", new int[] {3, 2, 1, 0}
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(String s, char c, int[] expected) {
        ShortestDistanceToCharacter loop =
                new ShortestDistanceToCharacterLoop();
        assertArrayEquals(expected, loop.shortestToChar(s, c));
    }
}
