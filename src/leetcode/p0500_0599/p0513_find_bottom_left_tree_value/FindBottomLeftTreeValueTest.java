package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.FindBottomLeftTreeValueRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindBottomLeftTreeValueTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                2, 1, 3
                        ).collect(Collectors.toList())),
                        1
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3, 4, null, 5, 6, null, null, 7
                        ).collect(Collectors.toList())),
                        7
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode node, int expected) {
        FindBottomLeftTreeValue recursive =
                new FindBottomLeftTreeValueRecursive();
        assertEquals(expected, recursive.findBottomLeftValue(node));
    }
}
