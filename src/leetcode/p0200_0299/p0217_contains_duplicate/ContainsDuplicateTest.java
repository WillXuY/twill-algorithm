/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0217_contains_duplicate;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ContainsDuplicateTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /* Wrong answer1 of set. */
                arguments(new int[] {3, 3}, true),
                arguments(new int[] {1, 2, 3, 1}, true),
                arguments(new int[] {1, 2, 3, 4}, false),
                arguments(new int[] {1, 1, 1, 3, 3, 4, 3, 2, 4, 2}, true)
        );
    }

    /**
     * Use Hash set
     */
    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] input, boolean expected) {
        ContainsDuplicate set = new ContainsDuplicateSet();
        assertEquals(expected, set.containsDuplicate(input));
    }

    /**
     * Time limit exceeded.
     */
    @ParameterizedTest(name = "Bubble {index}")
    @MethodSource("dataProvider")
    public void testBubble(int[] input, boolean expected) {
        ContainsDuplicate bubble = new ContainsDuplicateBubble();
        assertEquals(expected, bubble.containsDuplicate(input));
    }
}
