package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.InsertIntoBinarySearchTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class InsertIntoBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        null,
                        5,
                        TreeNode.initByListLevel(Stream.of(
                                5
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4,
                                2, 7,
                                1, 3
                        ).collect(Collectors.toList())),
                        5,
                        TreeNode.initByListLevel(Stream.of(
                                4,
                                2, 7,
                                1, 3, 5
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                40,
                                20, 60,
                                10, 30, 50, 70
                        ).collect(Collectors.toList())),
                        25,
                        TreeNode.initByListLevel(Stream.of(
                                40,
                                20, 60,
                                10, 30, 50, 70,
                                null, null, 25
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4,
                                2, 7,
                                1, 3, null, null,
                                null, null, null, null
                        ).collect(Collectors.toList())),
                        5,
                        TreeNode.initByListLevel(Stream.of(
                                4,
                                2, 7,
                                1, 3, 5
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, int val, TreeNode excepted) {
        InsertIntoBinarySearchTree recursive =
                new InsertIntoBinarySearchTreeRecursive();
        assertEquals(excepted, recursive.insertIntoBST(root, val));
    }
}
