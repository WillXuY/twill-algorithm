/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.UniqueMorseCodeWordsSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UniqueMorseCodeWordsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new String[] {"gin", "zen", "gig", "msg"}, 2),
                arguments(new String[] {"a"}, 1)

        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testSet(String[] words, int expected) {
        UniqueMorseCodeWords set = new UniqueMorseCodeWordsSet();
        assertEquals(expected, set.uniqueMorseRepresentations(words));
    }
}
