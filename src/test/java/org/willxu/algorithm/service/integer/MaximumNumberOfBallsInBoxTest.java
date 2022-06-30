package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumNumberOfBallsInBoxCount;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfBallsInBoxTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(1, 10, 2),
                arguments(5, 15, 2),
                arguments(19, 28, 2)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int lowLimit, int highLimit, int excepted) {
        MaximumNumberOfBallsInBox count = new MaximumNumberOfBallsInBoxCount();
        assertEquals(excepted, count.countBalls(lowLimit, highLimit));
    }
}
