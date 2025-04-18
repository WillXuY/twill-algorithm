package org.willxu.algorithm.service.matrix;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.matrix.Shift2dGridRemainder;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class Shift2dGridTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. offset += length rather than offset = length - 1.
                arguments(
                        new int[][] {{1}, {2}, {3}, {4}, {7}, {6}, {5}}, 23,
                        Stream.of(
                                Stream.of(6).collect(Collectors.toList()),
                                Stream.of(5).collect(Collectors.toList()),
                                Stream.of(1).collect(Collectors.toList()),
                                Stream.of(2).collect(Collectors.toList()),
                                Stream.of(3).collect(Collectors.toList()),
                                Stream.of(4).collect(Collectors.toList()),
                                Stream.of(7).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 1,
                        Stream.of(
                                Stream.of(
                                        9, 1, 2
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 4, 5
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        6, 7, 8
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {
                                {3, 8, 1, 9},
                                {19, 7, 2, 5},
                                {4, 6, 11, 10},
                                {12, 0, 21, 13}
                        }, 4,
                        Stream.of(
                                Stream.of(
                                        12, 0, 21, 13
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        3, 8, 1, 9
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        19, 7, 2, 5
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 6, 11, 10
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[][] {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}}, 9,
                        Stream.of(
                                Stream.of(
                                        1, 2, 3
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        4, 5, 6
                                ).collect(Collectors.toList()),
                                Stream.of(
                                        7, 8, 9
                                ).collect(Collectors.toList())
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Remainder {index}")
    @MethodSource("dataProvider")
    public void testRemainder(
            int[][] grid, int k, List<List<Integer>> expected) {
        Shift2dGrid remainder = new Shift2dGridRemainder();
        assertEquals(
                expected.toString(), remainder.shiftGrid(grid, k).toString());
    }
}
