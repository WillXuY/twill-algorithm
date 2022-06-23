package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfRectanglesThatCanFormTheLargestSquareLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfRectanglesThatCanFormTheLargestSquareTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{5, 8}, {3, 9}, {5, 12}, {16, 5}}, 3),
                arguments(new int[][] {{2, 3}, {3, 7}, {4, 3}, {3, 7}}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] rectangles, int excepted) {
        NumberOfRectanglesThatCanFormTheLargestSquare loop =
                new NumberOfRectanglesThatCanFormTheLargestSquareLoop();
        assertEquals(excepted, loop.countGoodRectangles(rectangles));
    }
}
