package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountEqualAndDivisiblePairsInAnArrayCount;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountEqualAndDivisiblePairsInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {10,2,3,4,9,6,3,10,3,6,3,9,1}, 4, 8),
                arguments(new int[] {3, 1, 2, 2, 2, 1, 3}, 2, 4),
                arguments(new int[] {1, 2, 3, 4}, 1, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int k, int excepted) {
        CountEqualAndDivisiblePairsInAnArray count =
                new CountEqualAndDivisiblePairsInAnArrayCount();
        assertEquals(excepted, count.countPairs(nums, k));
    }
}
