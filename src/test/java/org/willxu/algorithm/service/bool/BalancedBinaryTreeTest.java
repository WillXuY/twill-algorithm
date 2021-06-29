package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.bool.BalancedBinaryTreeRecursive;

import java.util.Collections;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;
import static org.willxu.algorithm.provide.TreeNode.initByListLevel;

public class BalancedBinaryTreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList())),
                        true
                ),
                arguments(
                        initByListLevel(Stream.of(
                                1, 2, 2, 3, 3, null, null, 4, 4
                        ).collect(Collectors.toList())),
                        false
                ),
                arguments(
                        initByListLevel(Collections.emptyList()),
                        true
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, boolean excepted) {
        BalancedBinaryTree recursive = new BalancedBinaryTreeRecursive();
        assertEquals(excepted, recursive.isBalanced(input));
    }
}
