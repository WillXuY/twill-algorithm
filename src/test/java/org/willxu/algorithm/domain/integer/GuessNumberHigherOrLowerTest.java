package org.willxu.algorithm.domain.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.domain.impl.integer.GuessNumberHigherOrLowerGolden;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GuessNumberHigherOrLowerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // unknown wrong 1: Misleading description.
                Arguments.arguments(4, 3),
                // time out
                Arguments.arguments(3, 1),
                Arguments.arguments(10, 6),
                Arguments.arguments(1, 1),
                Arguments.arguments(2, 1),
                Arguments.arguments(2, 2)
        );
    }

    @ParameterizedTest(name = "Golden {index}")
    @MethodSource("dataProvider")
    public void testGolden(int max, int excepted) {
        AbstractGuessNumberHigherOrLower golden
                = new GuessNumberHigherOrLowerGolden(excepted);
        assertEquals(excepted, golden.guessNumber(max));
    }
}
