/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.ReshapeTheMatrixIterator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReshapeTheMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{1, 2}, {3, 4}}, 1, 4,
                        new int[][] {{1, 2, 3, 4}}
                ),
                // Return the origin matrix.
                arguments(
                        new int[][] {{1, 2}, {3, 4}}, 2, 4,
                        new int[][] {{1, 2}, {3, 4}}
                )
        );
    }

    @ParameterizedTest(name = "Iterator {index}")
    @MethodSource("dataProvider")
    public void testIterator(int[][] origin, int r, int c, int[][] expected) {
        ReshapeTheMatrix iterator = new ReshapeTheMatrixIterator();
        assertArrayEquals(expected, iterator.matrixReshape(origin, r, c));
    }
}
