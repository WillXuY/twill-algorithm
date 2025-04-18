package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MostFrequentNumberFollowingKeyInAnArrayCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MostFrequentNumberFollowingKeyInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 1000, 2}, 1000, 2),
                arguments(new int[] {1, 100, 200, 1, 100}, 1, 100),
                arguments(new int[] {2, 2, 2, 2, 3}, 2, 2)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int key, int expected) {
        MostFrequentNumberFollowingKeyInAnArray count =
                new MostFrequentNumberFollowingKeyInAnArrayCount();
        assertEquals(expected, count.mostFrequent(nums, key));
    }
}
