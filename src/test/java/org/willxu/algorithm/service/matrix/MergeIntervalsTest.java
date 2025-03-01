package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.MergeIntervalsSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MergeIntervalsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 3},
                                {2, 6},
                                {8, 10},
                                {15,18}
                        },
                        new int[][] {
                                {1, 6},
                                {8, 10},
                                {15, 18}
                        }
                ),
                arguments(
                        new int[][] {
                                {2, 3},
                                {4, 6},
                                {5, 7},
                                {3, 4}
                        },
                        new int[][] {{2, 7}}
                ),
                arguments(
                        new int[][] {
                                {2, 3},
                                {4, 5},
                                {6, 7},
                                {8, 9},
                                {1, 10}
                        },
                        new int[][] {{1, 10}}
                ),
                arguments(
                        new int[][] {
                                {4, 5},
                                {1, 4}
                        },
                        new int[][] {{1, 5}}
                ),
                arguments(
                        new int[][] {
                                {1, 4},
                                {4, 5}
                        },
                        new int[][] {{1, 5}}
                )
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[][] intervals, int[][] expected) {
        MergeIntervals sort = new MergeIntervalsSort();
        assertArrayEquals(expected, sort.merge(intervals));
    }
}
