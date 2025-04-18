package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.EvaluateBooleanBinaryTreeRecursice;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class EvaluateBooleanBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3, null, null, 0, 1
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                0
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, boolean expected) {
        EvaluateBooleanBinaryTree recursive =
                new EvaluateBooleanBinaryTreeRecursice();
        assertEquals(expected, recursive.evaluateTree(root));
    }
}
