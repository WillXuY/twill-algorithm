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
import org.willxu.algorithm.service.impl.integer.PeakIndexInMountainArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PeakIndexInMountainArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {0, 1, 0}, 1),
                arguments(new int[] {0, 2, 1, 0}, 1),
                arguments(new int[] {0, 10, 5, 2}, 1),
                arguments(new int[] {3, 4, 5, 1}, 2),
                arguments(
                        new int[] {24, 69, 100, 99, 79, 78, 67, 36, 26, 19},
                        2
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int expected) {
        PeakIndexInMountainArray loop = new PeakIndexInMountainArrayLoop();
        assertEquals(expected, loop.peakIndexInMountainArray(arr));
    }
}
