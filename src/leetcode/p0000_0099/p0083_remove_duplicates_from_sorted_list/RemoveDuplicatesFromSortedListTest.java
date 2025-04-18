/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0083_remove_duplicates_from_sorted_list;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.ListNode.getListNodeFromIntArray;

public class RemoveDuplicatesFromSortedListTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        getListNodeFromIntArray(new int[] {1, 1, 2}),
                        getListNodeFromIntArray(new int[] {1, 2})),
                arguments(
                        getListNodeFromIntArray(new int[] {1, 1, 2, 3, 3}),
                        getListNodeFromIntArray(new int[] {1, 2, 3})),
                /*
                Wrong Answer 1
                 */
                arguments(
                        getListNodeFromIntArray(new int[] {1, 1, 1}),
                        getListNodeFromIntArray(new int[] {1})
                )
        );
    }

    @ParameterizedTest(name = "RemoveDuplicates {index}")
    @MethodSource("dataProvider")
    public void testRemoveDuplicatesFromSortedList(
            ListNode input, ListNode output) {
        RemoveDuplicatesFromSortedList bruteForce =
                new RemoveDuplicatesFromSortedListBruteForce();
        assertArrayEquals(output.toIntArray(),
                bruteForce.deleteDuplicates(input).toIntArray());
    }
}
