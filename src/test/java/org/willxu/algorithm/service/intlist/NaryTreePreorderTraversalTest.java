/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or any
 * later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.service.intlist;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.Node;
import org.willxu.algorithm.service.impl.intlist.NaryTreePreorderTraversalRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NaryTreePreorderTraversalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        Node.getNodeByList(Stream.of(
                                1, null, 3, 2, 4, null, 5, 6
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 3, 5, 6, 2, 4
                        ).collect(Collectors.toList())
                ),
                arguments(
                        Node.getNodeByList(Stream.of(
                                1, null,
                                2, 3, 4, 5, null,
                                null, 6, 7, null, 8, null, 9, 10, null,
                                null, 11, null, 12, null, 13, null,
                                null, 14
                        ).collect(Collectors.toList())),
                        Stream.of(
                                1, 2, 3, 6, 7, 11, 14, 4, 8, 12, 5, 9, 13, 10
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(Node input, List<Integer> excepted)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(excepted);
        NaryTreePreorderTraversal recursive =
                new NaryTreePreorderTraversalRecursive();
        List<Integer> output = recursive.preorder(input);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
