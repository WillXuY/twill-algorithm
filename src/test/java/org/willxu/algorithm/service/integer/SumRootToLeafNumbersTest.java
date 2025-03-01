package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.SumRootToLeafNumbersLevel;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumRootToLeafNumbersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 2, 3
                        ).collect(Collectors.toList())),
                        25
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 9, 0, 5, 1
                        ).collect(Collectors.toList())),
                        1026
                )
        );
    }

    @ParameterizedTest(name = "Level {index}")
    @MethodSource("dataProvider")
    public void testLevel(TreeNode root, int expected) {
        SumRootToLeafNumbers level = new SumRootToLeafNumbersLevel();
        assertEquals(expected, level.sumNumbers(root));
    }
}
