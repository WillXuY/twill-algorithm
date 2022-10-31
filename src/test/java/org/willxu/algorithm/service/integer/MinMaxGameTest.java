package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinMaxGameLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinMaxGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1,3,5,2,4,8,2,2}, 1),
                arguments(new int[] {3}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        MinMaxGame loop = new MinMaxGameLoop();
        assertEquals(excepted, loop.minMaxGame(nums));
    }
}
