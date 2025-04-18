package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfEquivalentDominoPairsCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfEquivalentDominoPairsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2}, {2, 1}, {3, 4}, {5, 6}}, 1),
                arguments(
                        new int[][] {{1, 2}, {1, 2}, {1, 1}, {1, 2}, {2, 2}},
                        3
                ),
                arguments(
                        new int[][] {{1, 2}, {1, 2}, {2, 2}, {1, 2}, {2, 2}},
                        4
                ),
                arguments(
                        new int[][] {
                                {1, 2}, {1, 2}, {2, 3}, {1, 2}, {3, 2}, {3, 2}
                        },
                        6
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[][] dominoes, int expected) {
        NumberOfEquivalentDominoPairs count =
                new NumberOfEquivalentDominoPairsCount();
        assertEquals(expected, count.numEquivDominoPairs(dominoes));
    }
}
