/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package common.provide;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TreeNodeTest {

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        Stream.of(1, null, 2, 3).collect(Collectors.toList())
                ),
                arguments(
                        Collections.EMPTY_LIST
                ),
                arguments(
                        Stream.of(1).collect(Collectors.toList())
                ),
                arguments(
                        Stream.of(1, 2).collect(Collectors.toList())
                ),
                arguments(
                        Stream.of(1, null, 2).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "TreeNode {index}")
    @MethodSource("dataProvider")
    public void testTreeNode(List<Integer> origin) {
        TreeNode root = TreeNode.initByListLevel(origin);
        System.out.println(root.val);
    }
}
