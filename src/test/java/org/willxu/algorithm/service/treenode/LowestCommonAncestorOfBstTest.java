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
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.LowestCommonAncestorOfBstRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LowestCommonAncestorOfBstTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                6, 2, 8, 0, 4, 7, 9, null, null, 3, 5
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 0, 4, null, null, 3, 5
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                8, 7, 9
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                6, 2, 8, 0, 4, 7, 9, null, null, 3, 5
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                6, 2, 8, 0, 4, 7, 9, null, null, 3, 5
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 0, 4, null, null, 3, 5
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                4, 3, 5
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 0, 4, null, null, 3, 5
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                2, 1
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, TreeNode p, TreeNode q,
                              TreeNode expectedNode) throws JsonProcessingException {
        LowestCommonAncestorOfBst recursive =
                new LowestCommonAncestorOfBstRecursive();
        TreeNode output = recursive.lowestCommonAncestor(root, p, q);
        ObjectMapper objectMapper = new ObjectMapper();
        String expected = objectMapper.writeValueAsString(expectedNode);
        assertEquals(expected, objectMapper.writeValueAsString(output));
    }
}
