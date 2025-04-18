package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.TheWeakestRowsInMatrixSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class TheWeakestRowsInMatrixTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 0},
                                {1, 0, 0, 0, 0},
                                {1, 1, 0, 0, 0},
                                {1, 1, 1, 1, 1}
                        }, 3,
                        new int[] {2, 0, 3}
                ),
                arguments(
                        new int[][] {
                                {1, 0, 0, 0},
                                {1, 1, 1, 1},
                                {1, 0, 0, 0},
                                {1, 0, 0, 0}
                        }, 2,
                        new int[] {0, 2}
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[][] mat, int k, int[] expected) {
        TheWeakestRowsInMatrix sort = new TheWeakestRowsInMatrixSort();
        assertArrayEquals(expected, sort.kWeakestRows(mat, k));
    }
}
