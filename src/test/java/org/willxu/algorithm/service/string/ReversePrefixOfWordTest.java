package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReversePrefixOfWordLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReversePrefixOfWordTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abcdefd", 'd', "dcbaefd"),
                arguments("xyxzxe", 'z', "zxyxxe"),
                arguments("abcd", 'z', "abcd")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String word, char ch, String excepted) {
        ReversePrefixOfWord loop = new ReversePrefixOfWordLoop();
        assertEquals(excepted, loop.reversePrefix(word, ch));
    }
}
