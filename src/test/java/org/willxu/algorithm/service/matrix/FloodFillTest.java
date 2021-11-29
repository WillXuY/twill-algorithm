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
import org.willxu.algorithm.service.impl.matrix.FloodFillList;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FloodFillTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Time Limit Exceeded
                arguments(
                        new int[][] {
                                {0, 0, 0},
                                {0, 1, 1}
                        },
                        1, 1, 1,
                        new int[][] {
                                {0, 0, 0},
                                {0, 1, 1}
                        }
                ),
                arguments(
                        new int[][] {
                                {1, 1, 1},
                                {1, 1, 0},
                                {1, 0, 1}
                        },
                        1, 1, 2,
                        new int[][] {
                                {2, 2, 2},
                                {2, 2, 0},
                                {2, 0, 1}
                        }
                ),
                arguments(
                        new int[][] {
                                {0, 0, 0},
                                {0, 0, 0}
                        },
                        0, 0, 2,
                        new int[][] {
                                {2, 2, 2},
                                {2, 2, 2}
                        }
                )
        );
    }

    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(int[][] image, int sr, int sc, int newColor,
                         int[][] excepted) {
        FloodFill list = new FloodFillList();
        assertArrayEquals(excepted, list.floodFill(image, sr, sc, newColor));
    }
}
