package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountOperationsToObtainZeroLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountOperationsToObtainZeroTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(0, 1, 0),
                arguments(0, 0, 0),
                arguments(2, 3, 3),
                arguments(10, 10, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int num1, int num2, int excepted) {
        CountOperationsToObtainZero loop =
                new CountOperationsToObtainZeroLoop();
        assertEquals(excepted, loop.countOperations(num1, num2));
    }
}
