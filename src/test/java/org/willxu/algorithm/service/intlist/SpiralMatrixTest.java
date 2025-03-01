package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.SpiralMatrixEdge;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpiralMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{3, 2}},
                        Stream.of(3, 2).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {{1}},
                        Stream.of(1).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {
                                {1, 2, 3},
                                {4, 5, 6},
                                {7, 8, 9}
                        },
                        Stream.of(
                                1, 2, 3, 6, 9, 8, 7, 4, 5
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {
                                {1, 2, 3, 4},
                                {5, 6, 7, 8},
                                {9, 10, 11, 12}
                        },
                        Stream.of(
                                1, 2, 3, 4, 8, 12, 11, 10, 9, 5, 6, 7
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Edge {index}")
    @MethodSource("dataProvider")
    public void testEdge(int[][] matrix, List<Integer> expected) {
        SpiralMatrix edge = new SpiralMatrixEdge();
        assertArrayEquals(expected.toArray(),
                edge.spiralOrder(matrix).toArray());
    }
}
