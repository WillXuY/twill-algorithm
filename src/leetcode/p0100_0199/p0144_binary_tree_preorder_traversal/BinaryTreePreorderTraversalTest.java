/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0144_binary_tree_preorder_traversal;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static common.provide.TreeNode.initByListLevel;

public class BinaryTreePreorderTraversalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(
                                1, null, 2, 3
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())
                ),
                arguments(
                        initByListLevel(Collections.emptyList()),
                        Collections.emptyList()
                ),
                arguments(
                        initByListLevel(Collections.singletonList(1)),
                        Collections.singletonList(1)
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 2
                        ).collect(Collectors.toList())
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, null, 2
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 2
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, List<Integer> expected)
            throws JsonProcessingException {
        BinaryTreePreorderTraversal recursive =
                new BinaryTreePreorderTraversalRecursive();
        ObjectMapper mapper = new ObjectMapper();
        String except = mapper.writeValueAsString(expected);
        List<Integer> output = recursive.preorderTraversal(input);
        assertEquals(except, mapper.writeValueAsString(output));
    }
}
