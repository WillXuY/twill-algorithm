/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0200_0299.p0219_contains_duplicate_ii;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateIiList;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateIiMapKey;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateIiMapValue;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ContainsDuplicateIiTest {
    private static int[] generateIntArray(int start, int end) {
        int[] ints = new int[end - start + 1];
        for (int i = 0; i <= end - start; i++) {
            ints[i] = start + i;
        }
        return ints;
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /* Time Limit Exceeded. */
                arguments(generateIntArray(-24500, 29999), 35000, false),
                arguments(new int[] {1, 2, 3, 1}, 3, true),
                arguments(new int[] {1, 0, 1, 1}, 1, true),
                arguments(new int[] {1, 2, 3, 1, 2, 3}, 2, false)
        );
    }

    @ParameterizedTest(name = "Map key {index}")
    @MethodSource("dataProvider")
    public void testMapKey(int[] nums, int k, boolean expected) {
        ContainsDuplicateIi mapKey = new ContainsDuplicateIiMapKey();
        assertEquals(expected, mapKey.containsNearbyDuplicate(nums, k));
    }

    /**
     * Time Limit Exceeded.
     */
    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(int[] nums, int k, boolean expected) {
        ContainsDuplicateIi list = new ContainsDuplicateIiList();
        assertEquals(expected, list.containsNearbyDuplicate(nums, k));
    }

    /**
     * Time Limit Exceeded.
     */
    @ParameterizedTest(name = "Map value {index}")
    @MethodSource("dataProvider")
    public void testMapValue(int[] nums, int k, boolean expected) {
        ContainsDuplicateIi mapValue = new ContainsDuplicateIiMapValue();
        assertEquals(expected, mapValue.containsNearbyDuplicate(nums, k));
    }
}
