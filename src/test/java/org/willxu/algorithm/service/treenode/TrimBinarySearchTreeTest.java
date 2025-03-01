package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.TrimBinarySearchTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrimBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 0, 2
                        ).collect(Collectors.toList())),
                        1, 2,
                        TreeNode.initByListLevel(Stream.of(
                                1, null, 2
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3,
                                0, 4,
                                null, 2, null, null,
                                1
                        ).collect(Collectors.toList())),
                        1, 3,
                        TreeNode.initByListLevel(Stream.of(
                                3,
                                2, null,
                                1
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(
            TreeNode root, int low, int high, TreeNode expected) {
        TrimBinarySearchTree recursive = new TrimBinarySearchTreeRecursive();
        assertEquals(expected, recursive.trimBST(root, low, high));
    }
}
