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
import org.willxu.algorithm.service.impl.bool.BuddyStringsCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BuddyStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("ab", "ba", true),
                // only contains two letters, must change these letters.
                arguments("ab", "ab", false),
                arguments("aa", "aa", true),
                arguments("aaaaaaabc", "aaaaaaacb", true),
                // only one letter can't swap
                arguments("a", "a", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, String goal, boolean expected) {
        BuddyStrings count = new BuddyStringsCount();
        assertEquals(expected, count.buddyStrings(s, goal));
    }
}
