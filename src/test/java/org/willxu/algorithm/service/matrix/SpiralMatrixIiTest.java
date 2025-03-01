package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.SpiralMatrixIiEdge;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpiralMatrixIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        3,
                        new int[][] {
                                {1, 2, 3},
                                {8, 9, 4},
                                {7, 6, 5}
                        }
                ),
                arguments(1, new int[][] {{1}})
        );
    }

    @ParameterizedTest(name = "Edge {index}")
    @MethodSource("dataProvider")
    public void testEdge(int n, int[][] expected) {
        SpiralMatrixIi edge = new SpiralMatrixIiEdge();
        assertArrayEquals(expected, edge.generateMatrix(n));
    }
}
