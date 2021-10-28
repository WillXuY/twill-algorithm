/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.strarray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.strarray.MinimumIndexSumOfTwoListsMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumIndexSumOfTwoListsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // The only restaurant they both like is "Shogun"
                arguments(
                        new String[] {"Shogun", "Tapioca Express",
                                "Burger King", "KFC"},
                        new String[] {"Piatti", "The Grill at Torrey Pines",
                                "Hunger Hunter Steakhouse", "Shogun"},
                        new String[] {"Shogun"}
                ),
                // Shogun has the index sun 1 which is minimum.
                arguments(
                        new String[] {"Shogun", "Tapioca Express",
                                "Burger King", "KFC"},
                        new String[] {"KFC", "Shogun", "Burger King"},
                        new String[] {"Shogun"}
                ),
                arguments(
                        new String[] {"Shogun", "Tapioca Express",
                                "Burger King", "KFC"},
                        new String[] {"KFC", "Burger King",
                                "Tapioca Express", "Shogun"},
                        new String[] {"KFC", "Burger King",
                                "Tapioca Express", "Shogun"}
                ),
                arguments(
                        new String[] {"Shogun", "Tapioca Express",
                                "Burger King", "KFC"},
                        new String[] {"KNN", "KFC", "Burger King",
                                "Tapioca Express", "Shogun"},
                        new String[] {"KFC", "Burger King",
                                "Tapioca Express", "Shogun"}
                ),
                arguments(
                        new String[] {"KFC"}, new String[] {"KFC"},
                        new String[] {"KFC"}
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String[] list1, String[] list2, String[] excepted) {
        MinimumIndexSumOfTwoLists map = new MinimumIndexSumOfTwoListsMap();
        assertArrayEquals(excepted, map.findRestaurant(list1, list2));
    }
}
