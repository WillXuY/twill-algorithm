package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.NonDecreasingArrayLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NonDecreasingArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2, 4, 5, 3}, true),
                Arguments.arguments(new int[] {5, 7, 1, 8}, true),
                Arguments.arguments(new int[] {3, 4, 2, 3}, false),
                Arguments.arguments(new int[] {4, 2, 3}, true),
                Arguments.arguments(new int[] {4, 2, 1}, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, boolean excepted) {
        NonDecreasingArray loop = new NonDecreasingArrayLoop();
        assertEquals(excepted, loop.checkPossibility(nums));
    }
}
