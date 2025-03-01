/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ValidAnagramRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidAnagramTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("anagram", "nagaram", true),
                arguments("rat", "car", false),
                arguments("aa", "a", false)
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(String s, String t, boolean expected) {
        ValidAnagram remove = new ValidAnagramRemove();
        assertEquals(expected, remove.isAnagram(s, t));
    }
}
