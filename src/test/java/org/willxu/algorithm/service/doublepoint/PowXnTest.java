package org.willxu.algorithm.service.doublepoint;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.doublepoint.PowXnLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PowXnTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(-1.0, Integer.MAX_VALUE, -1.0),
                arguments(2.0, Integer.MIN_VALUE, 0),
                arguments(2.0, 10, 1024.0),
                arguments(2.1, 3, 9.261000000000001),
                arguments(2.0, -2, 0.25)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(double x, int n, double expected) {
        PowXn loop = new PowXnLoop();
        assertEquals(expected, loop.myPow(x, n));
    }
}
