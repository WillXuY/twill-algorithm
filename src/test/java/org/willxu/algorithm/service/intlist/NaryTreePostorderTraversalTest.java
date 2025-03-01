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
import org.willxu.algorithm.service.impl.intlist.NaryTreePostorderTraversalRecursive;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NaryTreePostorderTraversalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        Node.getNodeByList(Stream.of(
                                1, null, 3, 2, 4, null, 5, 6
                        ).collect(Collectors.toList())),
                        Stream.of(
                                5, 6, 3, 2, 4, 1
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
                                2, 6, 14, 11, 7, 3, 12, 8, 4, 13, 9, 10, 5, 1
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(Node input, List<Integer> expected)
            throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        String except = objectMapper.writeValueAsString(expected);
        NaryTreePostorderTraversal recursive =
                new NaryTreePostorderTraversalRecursive();
        List<Integer> output = recursive.postorder(input);
        assertEquals(except, objectMapper.writeValueAsString(output));
    }
}
