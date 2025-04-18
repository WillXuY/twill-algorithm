/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package leetcode.p0500_0599.p0572_subtree_of_another_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubtreeOfAnotherTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 4, 5, 1, 2
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                4, 1, 2
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 4, 5, 1, 2, null, null, null, null, 0
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                4, 1, 2
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(
            TreeNode tree, TreeNode subTree, boolean expected) {
        SubtreeOfAnotherTree recursive = new SubtreeOfAnotherTreeRecursive();
        assertEquals(expected, recursive.isSubtree(tree, subTree));
    }
}
