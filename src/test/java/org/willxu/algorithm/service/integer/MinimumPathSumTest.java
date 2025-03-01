package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumPathSumMatrix;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumPathSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 3, 1},
                                {1, 5, 1},
                                {4, 2, 1}
                        },
                        7
                ),
                arguments(
                        new int[][] {
                                {1, 2, 3},
                                {4, 5, 6}
                        },
                        12
                )
        );
    }

    @ParameterizedTest(name = "Matrix {index}")
    @MethodSource("dataProvider")
    public void testMatrix(int[][] grid, int expected) {
        MinimumPathSum matrix = new MinimumPathSumMatrix();
        assertEquals(expected, matrix.minPathSum(grid));
    }
}
