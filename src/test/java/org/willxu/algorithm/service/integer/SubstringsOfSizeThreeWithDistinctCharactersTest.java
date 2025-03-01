package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SubstringsOfSizeThreeWithDistinctCharactersLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubstringsOfSizeThreeWithDistinctCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("xyzzaz", 1),
                arguments("aababcabc", 4)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int expected) {
        SubstringsOfSizeThreeWithDistinctCharacters loop =
                new SubstringsOfSizeThreeWithDistinctCharactersLoop();
        assertEquals(expected, loop.countGoodSubstrings(s));
    }
}
