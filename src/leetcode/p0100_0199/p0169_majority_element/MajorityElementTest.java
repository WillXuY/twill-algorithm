/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0169_majority_element;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MajorityElementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 2, 3}, 3),
                arguments(new int[] {2, 2, 1, 1, 1, 2, 2}, 2)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] input, int expected) {
        MajorityElement map = new MajorityElementMap();
        assertEquals(expected, map.majorityElement(input));
    }
}
