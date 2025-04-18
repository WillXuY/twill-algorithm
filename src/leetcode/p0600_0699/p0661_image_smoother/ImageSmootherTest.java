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
import org.willxu.algorithm.service.impl.matrix.ImageSmootherIterator;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ImageSmootherTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(
                        new int[][] {{1}},
                        new int[][] {{1}}
                ),
                arguments(
                        new int[][] {
                                {1, 1, 1},
                                {1, 0, 1},
                                {1, 1, 1}
                        },
                        new int[][] {
                                {0, 0, 0},
                                {0, 0, 0},
                                {0, 0, 0}
                        }
                ),
                arguments(
                        new int[][] {
                                {100, 200, 100},
                                {200, 50, 200},
                                {100, 200, 100}
                        },
                        new int[][] {
                                {137, 141, 137},
                                {141, 138, 141},
                                {137, 141, 137}
                        }
                )
        );
    }

    @ParameterizedTest(name = "Iterator {index}")
    @MethodSource("dataProvider")
    public void testIterator(int[][] input, int[][] output) {
        ImageSmoother iterator = new ImageSmootherIterator();
        assertArrayEquals(output, iterator.imageSmoother(input));
    }
}
