/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0600_0699.p0605_can_place_flowers;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CanPlaceFlowersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(new int[] {1}, 0, true),
                arguments(new int[] {1, 0, 0, 0, 1}, 1, true),
                arguments(new int[] {1, 0, 0, 0, 1}, 2, false)
        );
    }

    @ParameterizedTest(name = "Iterator {index}")
    @MethodSource("dataProvider")
    public void testIterator(int[] flowerbed, int n, boolean expected) {
        CanPlaceFlowers iterator = new CanPlaceFlowersIterator();
        assertEquals(expected, iterator.canPlaceFlowers(flowerbed, n));
    }
}
