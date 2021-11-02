/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.treenode;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.MergeTwoBinaryTreesRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeTwoBinaryTreesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 3, 2, 5
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3, null, 4, null, 7
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                3, 4, 5, 5, 4, null, 7
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 2
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root1, TreeNode root2,
                              TreeNode excepted) throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(excepted);
        MergeTwoBinaryTrees recursive = new MergeTwoBinaryTreesRecursive();
        TreeNode output = recursive.mergeTrees(root1, root2);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
