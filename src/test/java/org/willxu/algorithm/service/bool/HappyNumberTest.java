package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.HappyNumberLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HappyNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(19, true),
                arguments(2, false)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int input, boolean excepted) {
        HappyNumber loop = new HappyNumberLoop();
        assertEquals(excepted, loop.isHappy(input));
    }
}
