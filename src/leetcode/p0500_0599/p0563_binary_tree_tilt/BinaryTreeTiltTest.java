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
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.BinaryTreeTiltRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinaryTreeTiltTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())),
                        1
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 2, 9, 3, 5, null, 7
                        ).collect(Collectors.toList())),
                        15
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                21, 7, 14, 1, 1, 2, 2, 3, 3
                        ).collect(Collectors.toList())),
                        9
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, int expected) {
        BinaryTreeTilt recursive = new BinaryTreeTiltRecursive();
        assertEquals(expected, recursive.findTilt(input));
    }
}
