package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumTimeVisitingAllPointsAbs;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumTimeVisitingAllPointsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 1}, {3, 4}, {-1, 0}}, 7),
                arguments(new int[][] {{3, 2}, {-2, 2}}, 5)
        );
    }

    @ParameterizedTest(name = "Abs {index}")
    @MethodSource("dataProvider")
    public void testAbs(int[][] points, int excepted) {
        MinimumTimeVisitingAllPoints abs =
                new MinimumTimeVisitingAllPointsAbs();
        assertEquals(excepted, abs.minTimeToVisitAllPoints(points));
    }
}
