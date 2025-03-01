package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountNegativeNumbersInSortedMatrixStile;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountNegativeNumbersInSortedMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                2. Count the remaining rows which contains all negative
                   numbers.
                 */
                arguments(
                        new int[][] {{3, 2}, {-3, -3}, {-3, -3}, {-3, -3}},
                        6
                ),
                // 1. Exchange the row's size and column's size.
                arguments(new int[][] {{5, 1, 0}, {-5, -5, -5}}, 3),
                arguments(
                        new int[][] {
                                {4, 3, 2, -1},
                                {3, 2, 1, -1},
                                {1, 1, -1, -2},
                                {-1, -1, -2, -3}
                        }, 8
                ),
                arguments(new int[][] {{3, 2}, {1, 0}}, 0)
        );
    }

    @ParameterizedTest(name = "Stile {index}")
    @MethodSource("dataProvider")
    public void testStile(int[][] grid, int expected) {
        CountNegativeNumbersInSortedMatrix stile
                = new CountNegativeNumbersInSortedMatrixStile();
        assertEquals(expected, stile.countNegatives(grid));
    }
}
