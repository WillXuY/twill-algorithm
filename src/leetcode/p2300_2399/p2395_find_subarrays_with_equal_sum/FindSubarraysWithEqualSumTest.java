package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.FindSubarraysWithEqualSumLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindSubarraysWithEqualSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 1}, false),
                arguments(new int[] {4, 2, 4}, true),
                arguments(new int[] {1, 2, 3, 4, 5}, false),
                arguments(new int[] {0, 0, 0}, true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean expected) {
        FindSubarraysWithEqualSum loop = new FindSubarraysWithEqualSumLoop();
        assertEquals(expected, loop.findSubarrays(nums));
    }
}
