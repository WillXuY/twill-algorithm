package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ShortEncodingOfWordsRegex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShortEncodingOfWordsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new String[] {"me", "time"},
                        5
                ),
                Arguments.arguments(
                        new String[] {"time", "me", "bell"},
                        10
                ),
                Arguments.arguments(
                        new String[] {"t"},
                        2
                )
        );
    }

    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String[] words, int expected) {
        ShortEncodingOfWords regex = new ShortEncodingOfWordsRegex();
        assertEquals(expected, regex.minimumLengthEncoding(words));
    }
}
