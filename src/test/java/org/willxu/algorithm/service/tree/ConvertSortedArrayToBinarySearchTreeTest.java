/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.tree;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.tree.ConvertSortedArrayToBstHalfRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class ConvertSortedArrayToBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {-10, -3, 0, 5, 9},
                        initByListLevel(Stream.of(
                                0, -3, 9, -10, null, 5
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                0, -10, 5, null, -3, null, 9
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        new int[] {1, 3},
                        /*
                        Explanation: [1, 3] and [3, 1] are both a
                        height-balanced BSTs.
                         */
                        initByListLevel(Stream.of(
                                3, 1
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                1, null, 3
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Half recursive {index}")
    @MethodSource("dataProvider")
    public void testHalfRecursive(int[] input, TreeNode a, TreeNode b)
            throws JsonProcessingException {
        ConvertSortedArrayToBinarySearchTree halfRecursive
                = new ConvertSortedArrayToBstHalfRecursive();
        TreeNode actual = halfRecursive.sortedArrayToBST(input);
        ObjectMapper mapper = new ObjectMapper();
        List<String> accepted = Stream.of(
                mapper.writeValueAsString(a), mapper.writeValueAsString(b)
        ).collect(Collectors.toList());
        String actualString = mapper.writeValueAsString(actual);
        assertTrue(accepted.contains(actualString));
    }
}
