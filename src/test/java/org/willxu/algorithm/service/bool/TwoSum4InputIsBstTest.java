/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.TwoSum4InputIsBstRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TwoSum4InputIsBstTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1:
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                0, -1, 2, -3, null, null, 4
                        ).collect(Collectors.toList())),
                        -4,
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 3, 6, 2, 4, null, 7
                        ).collect(Collectors.toList())),
                        9,
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 3, 6, 2, 4, null, 7
                        ).collect(Collectors.toList())),
                        28,
                        false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList())),
                        4,
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList())),
                        1,
                        false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList())),
                        3,
                        true
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int k, boolean expected) {
        TwoSum4InputIsBst recursive = new TwoSum4InputIsBstRecursive();
        assertEquals(expected, recursive.findTarget(root, k));
    }
}
