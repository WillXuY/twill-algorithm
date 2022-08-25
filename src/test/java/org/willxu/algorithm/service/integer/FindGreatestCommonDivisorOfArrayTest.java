package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindGreatestCommonDivisorOfArrayLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindGreatestCommonDivisorOfArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {7, 5, 6, 8, 3}, 1),
                arguments(new int[] {2, 5, 6, 9, 10}, 2),
                arguments(new int[] {7, 5, 6, 8, 3}, 1),
                arguments(new int[] {3, 3}, 3)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        FindGreatestCommonDivisorOfArray loop =
                new FindGreatestCommonDivisorOfArrayLoop();
        assertEquals(excepted, loop.findGCD(nums));
    }
}
