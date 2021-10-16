/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.Node;
import org.willxu.algorithm.service.impl.integer.MaximumDepthOfNaryTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumDepthOfNaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        Node.getNodeByList(Stream.of(
                                1, null,
                                3, 2, 4, null,
                                5, 6
                        ).collect(Collectors.toList())),
                        3
                ),
                arguments(
                        Node.getNodeByList(Stream.of(
                                1, null,
                                2, 3, 4, 5, null,
                                null, 6, 7, null, 8, null, 9, 10, null,
                                null, 11, null, 12, null, 13, null, null,
                                14
                        ).collect(Collectors.toList())),
                        5
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(Node input, int excepted) {
        MaximumDepthOfNaryTree recursive =
                new MaximumDepthOfNaryTreeRecursive();
        assertEquals(excepted, recursive.maxDepth(input));
    }
}
