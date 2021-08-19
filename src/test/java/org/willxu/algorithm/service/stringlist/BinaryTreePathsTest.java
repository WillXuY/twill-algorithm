/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.stringlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.stringlist.BinaryTreePathsRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class BinaryTreePathsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, null, 5
                        ).collect(Collectors.toList())),
                        Stream.of(
                                "1->2->5", "1->3"
                        ).collect(Collectors.toList())
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        Stream.of(
                                "1"
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, List<String> excepted)
            throws JsonProcessingException {
        BinaryTreePaths recursive = new BinaryTreePathsRecursive();
        List<String> output = recursive.binaryTreePaths(input);
        ObjectMapper objectMapper = new ObjectMapper();
        String exceptStr = objectMapper.writeValueAsString(excepted);
        assertEquals(exceptStr, objectMapper.writeValueAsString(output));
    }
}
