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
import org.willxu.algorithm.service.impl.integer.DistributeCandiesGroup;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DistributeCandiesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 2, 2, 3, 3}, 3),
                arguments(new int[] {1, 1, 2, 3}, 2),
                arguments(new int[] {6, 6, 6, 6}, 1)
        );
    }

    @ParameterizedTest(name = "Group {index}")
    @MethodSource("dataProvider")
    public void testGroup(int[] input, int expected) {
        DistributeCandies group = new DistributeCandiesGroup();
        assertEquals(expected, group.distributeCandies(input));
    }
}
