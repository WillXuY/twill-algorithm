package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.CousinsInBinaryTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CousinsInBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, 4
                        ).collect(Collectors.toList())),
                        4, 3, false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, null, 4, null, 5
                        ).collect(Collectors.toList())),
                        5, 4, true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, null, 4
                        ).collect(Collectors.toList())),
                        2, 3, false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int x, int y, boolean expected) {
        CousinsInBinaryTree recursive = new CousinsInBinaryTreeRecursive();
        assertEquals(expected, recursive.isCousins(root, x, y));
    }
}
