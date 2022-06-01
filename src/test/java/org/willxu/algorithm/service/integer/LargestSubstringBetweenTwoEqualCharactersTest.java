package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.LargestSubstringBetweenTwoEqualCharactersIndex;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LargestSubstringBetweenTwoEqualCharactersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("aa", 0),
                arguments("abca", 2),
                arguments("cbzxy", -1)
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String s, int excepted) {
        LargestSubstringBetweenTwoEqualCharacters index =
                new LargestSubstringBetweenTwoEqualCharactersIndex();
        assertEquals(excepted, index.maxLengthBetweenEqualCharacters(s));
    }
}
