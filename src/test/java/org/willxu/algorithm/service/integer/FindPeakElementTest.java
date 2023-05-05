package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindPeakElementLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindPeakElementTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2}, 1),
                Arguments.arguments(new int[] {1}, 0),
                Arguments.arguments(new int[] {1, 2, 3, 1}, 2),
                Arguments.arguments(new int[] {1, 2, 1, 3, 5, 6, 4}, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        FindPeakElement loop = new FindPeakElementLoop();
        assertEquals(excepted, loop.findPeakElement(nums));
    }
}
