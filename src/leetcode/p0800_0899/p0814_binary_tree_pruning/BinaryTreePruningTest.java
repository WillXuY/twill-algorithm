package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.BinaryTreePruningRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BinaryTreePruningTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 0, 0, 1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 0, null, 1
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 0, 1, 0, 0, 0, 1
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 1, null, 1
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 1, 0, 1, 1, 0, 1, 0
                        ).collect(Collectors.toList())),
                        TreeNode.initByListLevel(Stream.of(
                                1, 1, 0, 1, 1, null, 1
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, TreeNode expected) {
        BinaryTreePruning recursive = new BinaryTreePruningRecursive();
        assertEquals(expected, recursive.pruneTree(root));
    }
}
