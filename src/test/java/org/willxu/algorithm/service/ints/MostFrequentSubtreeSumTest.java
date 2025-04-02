package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.provide.TreeNode;
import org.willxu.algorithm.service.impl.ints.MostFrequentSubtreeSumMap;

import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class MostFrequentSubtreeSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 2, -3
                        ).collect(Collectors.toList())),
                        new int[] {2, -3, 4}
                ),
                Arguments.arguments(
                        TreeNode.initByListLevel(Stream.of(
                                5, 2, -5
                        ).collect(Collectors.toList())),
                        new int[] {2}
                )
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(TreeNode root, int[] expected) {
        MostFrequentSubtreeSum map = new MostFrequentSubtreeSumMap();
        assertArrayEquals(expected, map.findFrequentTreeSum(root));
    }
}
