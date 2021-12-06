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
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.MinimumDistanceBetweenBstNodesRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumDistanceBetweenBstNodesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                27, null, 34, null, 58, 50, null, 44
                        ).collect(Collectors.toList())),
                        6
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 2, 6, 1, 3
                        ).collect(Collectors.toList())),
                        1
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 0, 48, null, null, 12, 49
                        ).collect(Collectors.toList())),
                        1
                )
        );
    }

    @ParameterizedTest
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int excepted) {
        MinimumDistanceBetweenBstNodes recursive =
                new MinimumDistanceBetweenBstNodesRecursive();
        assertEquals(excepted, recursive.minDiffInBST(root));
    }
}
