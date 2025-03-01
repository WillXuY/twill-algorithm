package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.DiameterOfBinaryTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DiameterOfBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 3 is the length of the path [4, 2, 1, 3]
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, 4, 5
                        ).collect(Collectors.toList())),
                        3
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2
                        ).collect(Collectors.toList())),
                        1
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, int expected) {
        DiameterOfBinaryTree recursive = new DiameterOfBinaryTreeRecursive();
        assertEquals(expected, recursive.diameterOfBinaryTree(input));
    }
}
