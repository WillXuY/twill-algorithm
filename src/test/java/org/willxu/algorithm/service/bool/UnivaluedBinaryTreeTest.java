package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.UnivaluedBinaryTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UnivaluedBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 1, 1, 1, 1, null, 1
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 2, 2, 5, 2
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, boolean excepted) {
        UnivaluedBinaryTree recursive = new UnivaluedBinaryTreeRecursive();
        assertEquals(excepted, recursive.isUnivalTree(root));
    }
}
