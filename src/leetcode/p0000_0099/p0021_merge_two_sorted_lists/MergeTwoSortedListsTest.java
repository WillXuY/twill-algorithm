/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.listnode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.ListNode;
import org.willxu.algorithm.service.impl.listnode.MergeTwoSortedListsBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.ListNode.getListNodeFromIntArray;

public class MergeTwoSortedListsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        getListNodeFromIntArray(new int[] {1, 2, 4}),
                        getListNodeFromIntArray(new int[] {1, 3, 4}),
                        getListNodeFromIntArray(new int[] {1, 1, 2, 3, 4, 4})
                ),
                arguments(
                        // leetcode [] means input and output is null
                        null,
                        null,
                        null
                ),
                arguments(
                        null,
                        getListNodeFromIntArray(new int[] {0}),
                        getListNodeFromIntArray(new int[] {0})
                )
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testMergeTwoLists(ListNode l1, ListNode l2, ListNode output) {
        MergeTwoSortedLists bruteForce = new MergeTwoSortedListsBruteForce();
        ListNode result = bruteForce.mergeTwoLists(l1, l2);
        if (output != null && result != null) {
            assertArrayEquals(output.toIntArray(), result.toIntArray());
        } else {
            assertNull(output);
            assertNull(result);
        }
    }
}
