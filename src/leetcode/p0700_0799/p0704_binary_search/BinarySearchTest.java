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
import org.willxu.algorithm.service.impl.integer.BinarySearchIndex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinarySearchTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(new int[] {2, 5}, 2, 0),
                arguments(new int[] {-1, 0, 3, 5, 9, 12}, 9, 4),
                arguments(new int[] {-1, 0, 3, 5, 9, 12}, 2, -1)
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(int[] input, int target, int expected) {
        BinarySearch index = new BinarySearchIndex();
        assertEquals(expected, index.search(input, target));
    }
}
