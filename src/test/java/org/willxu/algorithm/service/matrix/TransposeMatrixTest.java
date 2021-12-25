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
import org.willxu.algorithm.service.impl.matrix.TransposeMatrixLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TransposeMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][]{
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        new int[][] {
                                {1, 4, 7},
                                {2, 5, 8},
                                {3, 6, 9}
                        }
                ),
                arguments(
                        new int[][] {
                                {1, 2, 3},
                                {4, 5, 6}
                        },
                        new int[][] {
                                {1, 4},
                                {2, 5},
                                {3, 6}
                        }
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] matrix, int[][] excepted) {
        TransposeMatrix loop = new TransposeMatrixLoop();
        assertArrayEquals(excepted, loop.transpose(matrix));
    }
}
