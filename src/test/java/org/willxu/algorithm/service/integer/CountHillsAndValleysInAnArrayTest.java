package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountHillsAndValleysInAnArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountHillsAndValleysInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 4, 1, 1, 6, 5}, 3),
                arguments(new int[] {6, 6, 5, 5, 4, 1}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        CountHillsAndValleysInAnArray loop =
                new CountHillsAndValleysInAnArrayLoop();
        assertEquals(expected, loop.countHillValley(nums));
    }
}
