package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.AddDigitsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AddDigitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 38 -> 11 -> 2
                arguments(38, 2),
                arguments(0, 0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int input, int excepted) {
        AddDigits loop = new AddDigitsLoop();
        assertEquals(excepted, loop.addDigits(input));
    }
}
