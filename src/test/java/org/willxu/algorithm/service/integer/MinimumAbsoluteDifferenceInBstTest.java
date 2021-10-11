package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.integer.MinimumAbsoluteDifferenceInBstRecursive;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumAbsoluteDifferenceInBstTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                236, 104, 701, null, 227, null, 911
                        ).collect(Collectors.toList())),
                        9
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                4, 2, 6, 1, 3
                        ).collect(Collectors.toList())),
                        1
                ),
                arguments(
                        TreeNode.initByListLevel(Stream.of(
                                1, 0, 48, null, null, 12, 49
                        ).collect(Collectors.toList())),
                        1
                )
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(TreeNode input, int excepted) {
        MinimumAbsoluteDifferenceInBst recursive =
                new MinimumAbsoluteDifferenceInBstRecursive();
        assertEquals(excepted, recursive.getMinimumDifference(input));
    }
}
