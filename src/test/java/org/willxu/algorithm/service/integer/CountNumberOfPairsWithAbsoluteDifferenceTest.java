package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountNumberOfPairsWithAbsoluteDifferenceCount;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountNumberOfPairsWithAbsoluteDifferenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 1}, 1, 4),
                arguments(new int[] {1, 3}, 3, 0),
                arguments(new int[] {3, 2, 1, 5, 4}, 2, 3)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int k, int excepted) {
        CountNumberOfPairsWithAbsoluteDifference count =
                new CountNumberOfPairsWithAbsoluteDifferenceCount();
        assertEquals(excepted, count.countKDifference(nums, k));
    }
}
