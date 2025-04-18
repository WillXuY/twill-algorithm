package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfMatrixIsxMatrixLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfMatrixIsxMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {2, 0, 0, 1},
                                {0, 3, 1, 0},
                                {0, 5, 2, 0},
                                {4, 0, 0, 2}
                        },
                        true
                ),
                arguments(new int[][] {{5, 7, 0}, {0, 3, 1}, {0, 5, 0}}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] grid, boolean expected) {
        CheckIfMatrixIsxMatrix loop = new CheckIfMatrixIsxMatrixLoop();
        assertEquals(expected, loop.checkXMatrix(grid));
    }
}
