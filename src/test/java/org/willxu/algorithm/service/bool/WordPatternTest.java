package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.WordPatternMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class WordPatternTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abba", "dog cat cat dog", true),
                arguments("abba", "dog cat cat fish", false),
                arguments("aaaa", "dog cat cat dog", false),
                arguments("abba", "dog dog dog dog", false)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String pattern, String s, boolean excepted) {
        WordPattern map = new WordPatternMap();
        assertEquals(excepted, map.wordPattern(pattern, s));
    }
}
