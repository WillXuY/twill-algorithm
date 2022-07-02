package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfArrayIsSortedAndRotatedLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfArrayIsSortedAndRotatedTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 4, 5, 1, 2}, true),
                arguments(new int[] {2, 1, 3, 4}, false),
                arguments(new int[] {1, 2, 3}, true)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean excepted) {
        CheckIfArrayIsSortedAndRotated loop =
                new CheckIfArrayIsSortedAndRotatedLoop();
        assertEquals(excepted, loop.check(nums));
    }
}
