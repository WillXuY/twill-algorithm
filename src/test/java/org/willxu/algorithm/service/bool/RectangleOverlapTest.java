/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.RectangleOverlapCenter;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RectangleOverlapTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 3: out of int.
                arguments(
                        new int[] {-257926405, -680763313, 702840196,454409669},
                        new int[] {-275916328, -417802221, 22808107, 675629469},
                        true
                ),
                // Wrong answer2
                arguments(
                        new int[] {-526, -216, 109, 495},
                        new int[] {-211, -777, 630, -18},
                        true
                ),
                // Wrong answer1: every corner can be out of another rec
                arguments(
                        new int[] {4, 4, 14, 7}, new int[] {4, 3, 8, 8}, true
                ),
                arguments(
                        new int[] {0, 0, 2, 2}, new int[] {1, 1, 3, 3}, true
                ),
                arguments(
                        new int[] {0, 0, 1, 1}, new int[] {1, 0, 2, 1}, false
                ),
                arguments(
                        new int[] {0, 0, 1, 1}, new int[] {2, 2, 3, 3}, false
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testCenter(int[] rec1, int[] rec2, boolean expected) {
        RectangleOverlap center = new RectangleOverlapCenter();
        assertEquals(expected, center.isRectangleOverlap(rec1,  rec2));
    }
}
