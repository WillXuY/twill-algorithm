package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.InsertIntervalLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class InsertIntervalTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {{1, 2}},
                        new int[] {5, 6},
                        new int[][] {{1, 2}, {5, 6}}
                ),
                arguments(
                        new int[][] {{1, 5}},
                        new int[] {2, 7},
                        new int[][] {{1, 7}}
                ),
                arguments(
                        new int[][] {},
                        new int[] {5, 7},
                        new int[][] {{5, 7}}
                ),
                arguments(
                        new int[][] {{1, 3}, {6, 9}},
                        new int[] {2, 5},
                        new int[][] {{1, 5}, {6, 9}}
                ),
                arguments(
                        new int[][] {{1, 2}, {3, 5}, {6, 7}, {8, 10}, {12, 16}},
                        new int[] {4, 8},
                        new int[][] {{1, 2}, {3, 10}, {12, 16}}
                )

        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(
            int[][] intervals, int[] newInterval, int[][] expected) {
        InsertInterval loop = new InsertIntervalLoop();
        assertArrayEquals(expected, loop.insert(intervals, newInterval));
    }
}
