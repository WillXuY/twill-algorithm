/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0100_same_tree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.TreeNode.initByListLevel;

public class SameTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(1, 2, 3)
                                .collect(Collectors.toList())),
                        initByListLevel(Stream.of(1, 2, 3)
                                .collect(Collectors.toList())),
                        true
                ),
                arguments(
                        initByListLevel(Stream.of(1, 2)
                                .collect(Collectors.toList())),
                        initByListLevel(Stream.of(1, null, 2)
                                .collect(Collectors.toList())),
                        false
                ),
                arguments(
                        initByListLevel(Stream.of(1, 2, 1)
                                .collect(Collectors.toList())),
                        initByListLevel(Stream.of(1, 1, 2)
                                .collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode p, TreeNode q, boolean output) {
        SameTree recursive = new SameTreeRecursive();
        assertEquals(output, recursive.isSameTree(p, q));
    }
}
