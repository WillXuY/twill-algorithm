package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.DecryptStringFromAlphabetToIntegerMappingReverse;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecryptStringFromAlphabetToIntegerMappingTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("10#11#12", "jkab"),
                arguments("1326#", "acz")
        );
    }

    @ParameterizedTest(name = "Reverse {index}")
    @MethodSource("dataProvider")
    public void testReverse(String s, String expected) {
        DecryptStringFromAlphabetToIntegerMapping reverse
                = new DecryptStringFromAlphabetToIntegerMappingReverse();
        assertEquals(expected, reverse.freqAlphabets(s));
    }
}
