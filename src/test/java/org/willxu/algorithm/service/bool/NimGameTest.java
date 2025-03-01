package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.NimGameDivide4;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NimGameTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // see: NimGame.org
                arguments(4, false),
                arguments(1, true),
                arguments(2, true)
        );
    }

    @ParameterizedTest(name = "Divide4 {index}")
    @MethodSource("dataProvider")
    public void testDivide4(int input, boolean expected) {
        NimGame divide4 = new NimGameDivide4();
        assertEquals(expected, divide4.canWinNim(input));
    }
}
