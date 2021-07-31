/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.integerlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integerlist.BinaryTreePostOrderTraversalRecursive;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class BinaryTreePostOrderTraversalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(
                                1, null, 2, 3
                        ).collect(Collectors.toList())),
                        Stream.of(
                                3, 2, 1
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
                                2, 1
                        ).collect(Collectors.toList())
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, null, 2
                        ).collect(Collectors.toList())),
                        Stream.of(
                                2, 1
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, List<Integer> excepted)
            throws JsonProcessingException {
        BinaryTreePostOrderTraversal recursive =
                new BinaryTreePostOrderTraversalRecursive();
        ObjectMapper mapper = new ObjectMapper();
        String except = mapper.writeValueAsString(excepted);
        List<Integer> output = recursive.postorderTraversal(input);
        assertEquals(except, mapper.writeValueAsString(output));
    }
}
