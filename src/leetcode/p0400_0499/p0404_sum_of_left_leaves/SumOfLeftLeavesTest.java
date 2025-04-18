package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import common.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.SumOfLeftLeavesRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumOfLeftLeavesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                3, 9, 20, null, null, 15, 7
                        ).collect(Collectors.toList())),
                        24
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1
                        ).collect(Collectors.toList())),
                        0
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, int expected) {
        SumOfLeftLeaves recursive = new SumOfLeftLeavesRecursive();
        assertEquals(expected, recursive.sumOfLeftLeaves(input));
    }
}
