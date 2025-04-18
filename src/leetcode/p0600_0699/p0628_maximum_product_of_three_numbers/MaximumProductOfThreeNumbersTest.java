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
import org.willxu.algorithm.service.impl.integer.MaximumProductOfThreeNumbersClassify;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumProductOfThreeNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1
                arguments(new int[] {-1, -2, -3, -4}, -6),
                arguments(new int[] {1, 2, 3}, 6),
                arguments(new int[] {1, 2, 3, 4}, 24),
                arguments(new int[] {-1, -2, -3}, -6)
        );
    }

    @ParameterizedTest(name = "Classify {index}")
    @MethodSource("dataProvider")
    public void testClassify(int[] input, int expected) {
        MaximumProductOfThreeNumbers classify =
                new MaximumProductOfThreeNumbersClassify();
        assertEquals(expected, classify.maximumProduct(input));
    }
}
