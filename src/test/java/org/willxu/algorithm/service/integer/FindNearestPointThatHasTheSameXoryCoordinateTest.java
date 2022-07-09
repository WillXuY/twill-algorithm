package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindNearestPointThatHasTheSameXoryCoordinateLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindNearestPointThatHasTheSameXoryCoordinateTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        3,
                        4,
                        new int[][] {{1, 2}, {3, 1}, {2, 4}, {2, 3}, {4, 4}},
                        2
                ),
                arguments(3, 4, new int[][] {{3, 4}}, 0),
                arguments(3, 4, new int[][] {{2, 3}}, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int x, int y, int[][] points, int excepted) {
        FindNearestPointThatHasTheSameXoryCoordinate loop =
                new FindNearestPointThatHasTheSameXoryCoordinateLoop();
        assertEquals(excepted, loop.nearestValidPoint(x, y, points));
    }
}
