package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.ValidateBinarySearchTreeRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidateBinarySearchTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3,
                                1,               5,
                                0,        2,      4,6,
                                null,null, null,3
                        ).collect(Collectors.toList())),
                        false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 2, 2
                        ).collect(Collectors.toList())),
                        false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 4, 6, null, null, 3, 7
                        ).collect(Collectors.toList())),
                        false
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 1, 4, null, null, 3, 6
                        ).collect(Collectors.toList())),
                        false
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode root, boolean expected) {
        ValidateBinarySearchTree recursive =
                new ValidateBinarySearchTreeRecursive();
        assertEquals(expected, recursive.isValidBST(root));
    }
}
