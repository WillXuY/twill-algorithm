package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumDifferenceBetweenIncreasingElementsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumDifferenceBetweenIncreasingElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {7, 1, 5, 4}, 4),
                arguments(new int[] {9, 4, 3, 2}, -1),
                arguments(new int[] {1, 5, 2, 10}, 9)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        MaximumDifferenceBetweenIncreasingElements loop =
                new MaximumDifferenceBetweenIncreasingElementsLoop();
        assertEquals(expected, loop.maximumDifference(nums));
    }
}
