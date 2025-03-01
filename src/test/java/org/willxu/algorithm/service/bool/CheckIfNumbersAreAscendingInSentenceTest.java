package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfNumbersAreAscendingInSentenceLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfNumbersAreAscendingInSentenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "1 box has 3 blue 4 red 6 green and 12 yellow marbles",
                        true
                ),
                arguments("hello world 5 x 5", false),
                arguments(
                        "sunset is at 7 51 pm overnight lows will be in the low 50 and 60 s",
                        false
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, boolean expected) {
        CheckIfNumbersAreAscendingInSentence loop =
                new CheckIfNumbersAreAscendingInSentenceLoop();
        assertEquals(expected, loop.areNumbersAscending(s));
    }
}
