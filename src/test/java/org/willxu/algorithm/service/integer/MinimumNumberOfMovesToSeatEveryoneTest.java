package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumNumberOfMovesToSeatEveryoneSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumNumberOfMovesToSeatEveryoneTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 1, 5}, new int[] {2, 7, 4}, 4),
                arguments(new int[] {4, 1, 5, 9}, new int[] {1, 3, 2, 6}, 7),
                arguments(new int[] {2, 2, 6, 6}, new int[] {1, 3, 2, 6}, 4)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] seats, int[] students, int expected) {
        MinimumNumberOfMovesToSeatEveryone sort =
                new MinimumNumberOfMovesToSeatEveryoneSort();
        assertEquals(expected, sort.minMovesToSeat(seats, students));
    }
}
