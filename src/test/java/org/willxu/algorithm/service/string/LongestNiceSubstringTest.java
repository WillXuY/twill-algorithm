package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LongestNiceSubstringSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestNiceSubstringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("YazaAay", "aAa"),
                arguments("Bb", "Bb"),
                arguments("c", "")
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, String excepted) {
        LongestNiceSubstring set = new LongestNiceSubstringSet();
        assertEquals(excepted, set.longestNiceSubstring(s));
    }
}
