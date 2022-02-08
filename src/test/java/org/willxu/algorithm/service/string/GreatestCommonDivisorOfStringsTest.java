package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.GreatestCommonDivisorOfStringsLength;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GreatestCommonDivisorOfStringsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. Largest string.
                arguments("ABABABAB", "ABAB", "ABAB"),
                arguments("ABCABC", "ABC", "ABC"),
                arguments("ABABAB", "ABAB", "AB"),
                arguments("LEET", "CODE", "")
        );
    }

    @ParameterizedTest(name = "Length {index}")
    @MethodSource("dataProvider")
    public void testLength(String str1, String str2, String excepted) {
        GreatestCommonDivisorOfStrings length
                = new GreatestCommonDivisorOfStringsLength();
        assertEquals(excepted, length.gcdOfStrings(str1, str2));
    }
}
