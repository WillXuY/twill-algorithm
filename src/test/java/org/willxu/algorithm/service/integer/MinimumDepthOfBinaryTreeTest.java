/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.MinimumDepthOfBinaryTreeLevel;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class MinimumDepthOfBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList())),
                        2
                ),
                arguments(
                        initByListLevel(Stream.of(
                                2, null, 3, null, 4, null, 5, null, 6
                        ).collect(Collectors.toList())),
                        5
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode input, int expected) {
        MinimumDepthOrBinaryTree level = new MinimumDepthOfBinaryTreeLevel();
        assertEquals(expected, level.minDepth(input));
    }
}
