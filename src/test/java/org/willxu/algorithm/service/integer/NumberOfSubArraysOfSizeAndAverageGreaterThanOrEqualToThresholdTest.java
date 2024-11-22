package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {2, 2, 2, 2, 5, 5, 5, 8},
                        3, 4, 3
                ),
                Arguments.arguments(
                        new int[] {11,13,17,23,29,31,7,5,2,3},
                        3, 5, 6
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr, int k, int threshold, int excepted) {
        NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThreshold loop =
                new NumberOfSubArraysOfSizeAndAverageGreaterThanOrEqualToThresholdLoop();
        assertEquals(excepted, loop.numOfSubarrays(arr, k, threshold));
    }
}
