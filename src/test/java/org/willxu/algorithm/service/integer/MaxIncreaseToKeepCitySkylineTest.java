package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaxIncreaseToKeepCitySkylineLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaxIncreaseToKeepCitySkylineTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[][] {
                                {3, 0, 8, 4},
                                {2, 4, 5, 7},
                                {9, 2, 6, 3},
                                {0, 3, 1, 0}
                        },
                        35
                ),
                Arguments.arguments(
                        new int[][]{
                                {0, 0, 0},
                                {0, 0, 0},
                                {0, 0, 0}
                        },
                        0
                )
        );
    }

    @ParameterizedTest(name  = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] grid, int excepted) {
        MaxIncreaseToKeepCitySkyline loop =
                new MaxIncreaseToKeepCitySkylineLoop();
        assertEquals(excepted, loop.maxIncreaseKeepingSkyline(grid));
    }
}
