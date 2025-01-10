package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumOperationsToMakeTheArrayIncreasingLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinumumOperationsToMakeTheArrayIncreasingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1, 1}, 3),
                arguments(new int[] {1, 5, 2, 4, 1}, 14),
                arguments(new int[] {8}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        MinimumOperationsToMakeTheArrayIncreasing loop =
                new MinimumOperationsToMakeTheArrayIncreasingLoop();
        assertEquals(excepted, loop.minOperations(nums));
    }
}
