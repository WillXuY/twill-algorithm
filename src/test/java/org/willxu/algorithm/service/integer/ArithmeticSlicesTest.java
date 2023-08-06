package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ArithmeticSlicesLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArithmeticSlicesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2, 3, 4}, 3),
                Arguments.arguments(new int[] {1}, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        ArithmeticSlices loop = new ArithmeticSlicesLoop();
        assertEquals(excepted, loop.numberOfArithmeticSlices(nums));
    }
}
