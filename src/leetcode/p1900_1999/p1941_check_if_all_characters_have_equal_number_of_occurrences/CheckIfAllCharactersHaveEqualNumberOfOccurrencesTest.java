package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfAllCharactersHaveEqualNumberOfOccurrencesMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllCharactersHaveEqualNumberOfOccurrencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abacbc", true),
                arguments("aaabb", false)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(String s, boolean expected) {
        CheckIfAllCharactersHaveEqualNumberOfOccurrences map =
                new CheckIfAllCharactersHaveEqualNumberOfOccurrencesMap();
        assertEquals(expected, map.areOccurrencesEqual(s));
    }
}
