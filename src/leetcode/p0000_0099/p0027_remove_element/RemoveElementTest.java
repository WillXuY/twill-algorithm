/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.RemoveElementBruteForce;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveElementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                 Your function should return length = 2, with the
                 first two elements of nums being 2.
                 It doesn't matter what you leave beyond the returned
                 length. For example if you return 2 with
                 nums = [2, 2, 3, 3] or nums = [2, 2, 0, 0], your
                 answer will be accepted.
                 */
                arguments(
                        new int[] {3, 2, 2, 3},
                        3,
                        2,
                        new int[] {2, 2}),
                /* Your function should return length = 5, with the
                 first five elements of nums containing 0, 1, 3, 0,
                 and 4. Note that the order of those five elements can
                 be arbitrary. It doesn't matter what values are set
                 beyond the returned length.
                 */
                arguments(
                        new int[] {0, 1, 2, 2, 3, 0, 4 ,2},
                        2,
                        5,
                        new int[] {0, 1, 4, 0, 3})
        );
    }

    @ParameterizedTest(name = "Brute Force {index}")
    @MethodSource("dataProvider")
    public void testRemoveElement(
            int[] nums, int val, int output, int[] result) {
        RemoveElement bruteForce = new RemoveElementBruteForce();
        assertEquals(output, bruteForce.removeElement(nums, val));
        // sort and assertArrayEquals
        int[] test = Arrays.copyOf(nums, output);
        Arrays.sort(test);
        Arrays.sort(result);
        assertArrayEquals(result, test);
    }

    /**
     * containsAll assert is wrong
     */
    @Test
    public void testContainsAll() {
        int[] a = new int[] {1, 1, 1, 2};
        int[] b = new int[] {1, 2, 2, 2};
        List<Integer> al =
                Arrays.stream(a).boxed().collect(Collectors.toList());
        List<Integer> bl =
                Arrays.stream(b).boxed().collect(Collectors.toList());
        assertTrue(al.containsAll(bl));
        assertTrue(bl.containsAll(al));
    }
}
