package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumDistanceToTheTargetElementLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumDistanceToTheTargetElementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 4, 5}, 5, 3, 1),
                arguments(new int[] {1}, 1, 0, 0),
                arguments(new int[] {1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, 1, 0, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int target, int start, int expected) {
        MinimumDistanceToTheTargetElement loop =
                new MinimumDistanceToTheTargetElementLoop();
        assertEquals(expected, loop.getMinDistance(nums, target, start));
    }
}
