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
import org.willxu.algorithm.service.impl.integer.SecondMinimumNodeInBinaryTreeLevel;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SecondMinimumNodeInBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 2:
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                      1,
                                    1,   3,
                                  1, 1, 3, 4,
                                3, 1
                        ).collect(Collectors.toList())),
                        3
                ),
                // Wrong answer 1:
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                                1,
                                          1,            3,
                                     1,        1,    3,    4,
                                  3,   1,    1,  1, 3, 8, 4, 8,
                                3, 3, 1, 6, 2, 1
                        ).collect(Collectors.toList())),
                        2
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                        2,
                                    2,       5,
                                null, null, 5, 7
                        ).collect(Collectors.toList())),
                        5
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 2, 2
                        ).collect(Collectors.toList())),
                        -1
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode root, int expected) {
        SecondMinimumNodeInBinaryTree level =
                new SecondMinimumNodeInBinaryTreeLevel();
        assertEquals(expected, level.findSecondMinimumValue(root));
    }
}
