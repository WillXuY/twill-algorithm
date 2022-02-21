package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.DistanceBetweenBusStopsExhaustive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DistanceBetweenBusStopsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. Forgot the start.
                arguments(new int[] {3, 6, 7, 2, 9, 10, 7, 16, 11}, 6, 2, 28),
                /*
                0 = 1
                ||  ||
                3 = 2
                 */
                arguments(new int[] {1, 2, 3, 4}, 0, 1, 1),
                arguments(new int[] {1, 2, 3, 4}, 0, 2, 3),
                arguments(new int[] {1, 2, 3, 4}, 0, 3, 4)
        );
    }

    @ParameterizedTest(name = "Exhaustive {index}")
    @MethodSource("dataProvider")
    public void testExhaustive(int[] distance, int start, int destination,
                               int excepted) {
        DistanceBetweenBusStops exhaustive =
                new DistanceBetweenBusStopsExhaustive();
        assertEquals(excepted, exhaustive.distanceBetweenBusStops(
                distance, start, destination));
    }
}
