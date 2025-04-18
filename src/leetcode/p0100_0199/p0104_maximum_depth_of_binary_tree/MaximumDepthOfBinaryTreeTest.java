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
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.MaximumDepthOfBinaryTreeLevel;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.TreeNode.initByListLevel;

public class MaximumDepthOfBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(3, 9, 20, null, null, 15, 7)
                                .collect(Collectors.toList())),
                        3
                ),
                arguments(
                        initByListLevel(Stream.of(1, null, 2)
                                .collect(Collectors.toList())),
                        2
                ),
                arguments(
                        initByListLevel(Collections.emptyList()),
                        0
                ),
                arguments(
                        initByListLevel(Stream.of(0)
                                .collect(Collectors.toList())),
                        1
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode input, int output) {
        MaximumDepthOfBinaryTree level = new MaximumDepthOfBinaryTreeLevel();
        assertEquals(output, level.maxDepth(input));
    }
}
