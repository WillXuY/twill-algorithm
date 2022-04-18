package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ConsecutiveCharactersLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ConsecutiveCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", 1),
                arguments("leetcode", 2),
                arguments("abbcccddddeeeeedcba", 5)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int excepted) {
        ConsecutiveCharacters loop = new ConsecutiveCharactersLoop();
        assertEquals(excepted, loop.maxPower(s));
    }
}
