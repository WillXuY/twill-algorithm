/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package org.willxu.algorithm.framework;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class JackSonTest {
    static Stream<Arguments> treeData() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList()))
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, 2, 2, null, 3, null, 3
                        ).collect(Collectors.toList())),
                        initByListLevel(Stream.of(
                                1, 2, 2, null, 3, null, 3
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Tree same {index}")
    @MethodSource("treeData")
    public void testCheckSameForTree(TreeNode a, TreeNode b)
            throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();
        String s = mapper.writeValueAsString(a);
        String t = mapper.writeValueAsString(b);
        assertEquals(s, t);
    }
}
