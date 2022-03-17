package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfStepsToReduceNumberToZeroLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfStepsToReduceNumberToZeroTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 14 -> 7 -> 6 -> 3 -> 2 -> 1 -> 0
                arguments(14, 6),
                // 8, 4, 2, 1, 0
                arguments(8, 4),
                arguments(123, 12)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int num, int excepted) {
        NumberOfStepsToReduceNumberToZero loop
                = new NumberOfStepsToReduceNumberToZeroLoop();
        assertEquals(excepted, loop.numberOfSteps(num));
    }
}
