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
import org.willxu.algorithm.service.impl.matrix.FlippingAnImageLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FlippingAnImageTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 1, 0},
                                {1, 0, 1},
                                {0, 0, 0}
                        },
                        new int[][] {
                                {1, 0, 0},
                                {0, 1, 0},
                                {1, 1, 1}
                        }
                ),
                arguments(
                        new int[][] {
                                {1, 1, 0, 0},
                                {1, 0, 0, 1},
                                {0, 1, 1, 1},
                                {1, 0, 1, 0}
                        },
                        new int[][] {
                                {1, 1, 0, 0},
                                {0, 1, 1, 0},
                                {0, 0, 0, 1},
                                {1, 0, 1, 0}
                        }
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(int[][] image, int[][] expected) {
        FlippingAnImage loop = new FlippingAnImageLoop();
        assertArrayEquals(expected, loop.flipAndInvertImage(image));
    }
}
