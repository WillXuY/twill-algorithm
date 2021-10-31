/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.string.ConstructStringFromBinaryTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConstructStringFromBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, 4
                        ).collect(Collectors.toList())),
                        "1(2(4))(3)"
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, null, 4
                        ).collect(Collectors.toList())),
                        "1(2()(4))(3)"
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, String excepted) {
        ConstructStringFromBinaryTree recursive =
                new ConstructStringFromBinaryTreeRecursive();
        assertEquals(excepted, recursive.tree2str(root));
    }
}
