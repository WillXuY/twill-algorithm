/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.doublelist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.doublelist.AverageOfLevelsInBinaryTreeLevel;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AverageOfLevelsInBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList())),
                        Stream.of(
                                3.0, 14.5, 11.0
                        ).collect(Collectors.toList())
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 9, 20, 15, 7
                        ).collect(Collectors.toList())),
                        Stream.of(
                                3.0, 14.5, 11.0
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode root, List<Double> expected) {
        AverageOfLevelsInBinaryTree level =
                new AverageOfLevelsInBinaryTreeLevel();
        assertArrayEquals(expected.toArray(),
                level.averageOfLevels(root).toArray());
    }
}
