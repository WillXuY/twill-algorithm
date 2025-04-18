/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 *
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.treenode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.InvertBinaryTreeRecursive;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.TreeNode.initByListLevel;

public class InvertBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer1:
                arguments(
                        initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                1, null, 2
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        initByListLevel(Stream.of(
                                4, 2, 7, 1, 3, 6, 9
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                4, 7, 2, 9, 6, 3, 1
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                2, 3, 1
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        initByListLevel(Collections.emptyList()),
                        initByListLevel(Collections.emptyList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, TreeNode except) throws JsonProcessingException {
        InvertBinaryTree recursive = new InvertBinaryTreeRecursive();
        TreeNode output = recursive.invertTree(input);
        ObjectMapper objectMapper = new ObjectMapper();
        String expected = objectMapper.writeValueAsString(except);
        assertEquals(expected, objectMapper.writeValueAsString(output));
    }
}
