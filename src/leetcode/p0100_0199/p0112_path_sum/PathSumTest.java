/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.PathSumRecursive;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.TreeNode.initByListLevel;

public class PathSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Wrong answer 5:
                 */
                arguments(
                        initByListLevel(Stream.of(
                                1, -2, -3, 1, 3, -2, null, -1
                        ).collect(Collectors.toList())),
                        -4,
                        true
                ),
                arguments(
                        initByListLevel(Stream.of(
                                5, 4, 8, 11, null, 13, 4, 7, 2,
                                null, null, null, 1
                        ).collect(Collectors.toList())),
                        22,
                        true
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())),
                        5,
                        false
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        0,
                        false
                ),
                /*
                Wrong answer 1
                 */
                arguments(initByListLevel(Collections.emptyList()),
                        0,
                        false
                ),
                /*
                Wrong answer 2: root.right be null cannot only
                calculate the root.value
                 */
                arguments(
                        initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        1,
                        false
                ),
                /*
                Wrong answer 3: root.right and left be null only
                calculate the root.value
                 */
                arguments(
                        initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        1,
                        true
                ),
                /*
                Wrong answer 4:
                 */
                arguments(
                        initByListLevel(Stream.of(
                                1, 2, null, 3, null, 4, null, 5
                        ).collect(Collectors.toList())),
                        6,
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int target, boolean expected) {
        PathSum recursive = new PathSumRecursive();
        assertEquals(expected, recursive.hasPathSum(root, target));
    }
}
