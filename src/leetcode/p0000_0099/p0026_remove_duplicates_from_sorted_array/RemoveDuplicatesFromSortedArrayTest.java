/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0026_remove_duplicates_from_sorted_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDuplicatesFromSortedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /* Your function should return length = 2, with the
                 * first two elements of nums being 1 and 2
                 * respectively. It doesn't matter what you leave
                 * beyond the returned length.
                 */
                arguments(new int[] {1, 1, 2}, 2, new int[] {1, 2}),
                arguments(
                        new int[] {0, 0, 1, 1, 1, 2, 2, 3, 3, 4},
                        5,
                        new int[] {0, 1, 2, 3, 4})
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testRemoveDuplicates(int[] input, int size, int[] result) {
        RemoveDuplicatesFromSortedArray bruteForce =
                new RemoveDuplicatesFromSortedArrayBruteForce();
        assertEquals(size, bruteForce.removeDuplicates(input));
        assertArrayEquals(result, Arrays.copyOf(input, size));
    }
}
