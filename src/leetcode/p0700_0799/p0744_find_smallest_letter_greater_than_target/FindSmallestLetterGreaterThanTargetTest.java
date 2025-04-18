/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.character;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.character.FindSmallestLetterGreaterThanTargetStep;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindSmallestLetterGreaterThanTargetTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new char[] {'c', 'f', 'j'}, 'a', 'c'),
                arguments(new char[] {'c', 'f', 'j'}, 'c', 'f'),
                arguments(new char[] {'c', 'f', 'j'}, 'd', 'f'),
                arguments(new char[] {'c', 'f', 'j'}, 'g', 'j'),
                arguments(new char[] {'c', 'f', 'j'}, 'j', 'c')
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(char[] letters, char target, char expected) {
        FindSmallestLetterGreaterThanTarget loop =
                new FindSmallestLetterGreaterThanTargetStep();
        assertEquals(expected, loop.nextGreatestLetter(letters, target));
    }
}
