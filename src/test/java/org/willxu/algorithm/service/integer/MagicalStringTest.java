package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MagicalStringLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MagicalStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(7, 4),
                Arguments.arguments(6, 3),
                Arguments.arguments(1, 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int n, int expected) {
        MagicalString loop = new MagicalStringLoop();
        assertEquals(expected, loop.magicalString(n));
    }
}
