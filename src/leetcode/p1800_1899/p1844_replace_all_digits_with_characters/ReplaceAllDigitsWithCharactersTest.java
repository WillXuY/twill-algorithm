package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReplaceAllDigitsWithCharactersLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReplaceAllDigitsWithCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("a1c1e1", "abcdef"),
                arguments("a1b2c3d4e", "abbdcfdhe")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, String expected) {
        ReplaceAllDigitsWithCharacters loop =
                new ReplaceAllDigitsWithCharactersLoop();
        assertEquals(expected, loop.replaceDigits(s));
    }
}
