package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SmallestIndexWithEqualValueLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SmallestIndexWithEqualValueTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {0, 1, 2}, 0),
                arguments(new int[] {4, 3, 2, 1}, 2),
                arguments(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, -1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int expected) {
        SmallestIndexWithEqualValue loop =
                new SmallestIndexWithEqualValueLoop();
        assertEquals(expected, loop.smallestEqual(nums));
    }
}
