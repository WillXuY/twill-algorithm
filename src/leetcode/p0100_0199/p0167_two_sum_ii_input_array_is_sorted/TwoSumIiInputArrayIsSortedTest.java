/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0167_two_sum_ii_input_array_is_sorted;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSumIiInputArrayIsSortedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 7, 11, 15}, 9, new int[] {1, 2}),
                arguments(new int[] {2, 3, 4}, 6, new int[] {1, 3}),
                arguments(new int[] {-1, 0}, -1, new int[] {1, 2})
        );
    }

    @ParameterizedTest(name = "Traversal {index}")
    @MethodSource("dataProvider")
    public void testTraversal(int[] numbers, int target, int[] expected) {
        TwoSumIiInputArrayIsSorted traversal =
                new TwoSumIiInputArrayIsSortedTraversal();
        assertArrayEquals(expected, traversal.twoSum(numbers, target));
    }
}
