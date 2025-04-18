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
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.SearchInBinarySearchTreeRecursive;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SearchInBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 2, 7, 1, 3
                        ).collect(Collectors.toList())),
                        2,
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 2, 7, 1, 3
                        ).collect(Collectors.toList())),
                        5,
                        TreeNode.initByListLevel(Collections.emptyList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int val, TreeNode expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(expected);
        SearchInBinarySearchTree recursive =
                new SearchInBinarySearchTreeRecursive();
        TreeNode output = recursive.searchBST(root, val);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
