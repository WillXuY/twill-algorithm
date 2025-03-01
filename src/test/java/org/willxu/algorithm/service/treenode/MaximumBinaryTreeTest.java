package org.willxu.algorithm.service.treenode;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.treenode.MaximumBinaryTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {3, 2, 1, 6, 0, 5},
                        TreeNode.initByListLevel(Stream.of(
                                6,
                                3, 5,
                                null, 2, 0, null,
                                null, 1
                        ).collect(Collectors.toList()))
                ),
                Arguments.arguments(
                        new int[] {3, 2, 1},
                        TreeNode.initByListLevel(Stream.of(
                                3,
                                null, 2,
                                null, 1
                        ).collect(Collectors.toList()))
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, TreeNode expected) {
        MaximumBinaryTree recursive = new MaximumBinaryTreeRecursive();
        TreeNode output = recursive.constructMaximumBinaryTree(nums);
        assertEquals(expected, output);
    }
}
