package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.DecodeWaysRecursive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DecodeWaysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("12", 2),
                arguments("226", 3),
                arguments("06", 0)
        );
    }

    /**
     * Time Limit Exceeded
     */
    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(String s, int excepted) {
        DecodeWays recursive = new DecodeWaysRecursive();
        assertEquals(excepted, recursive.numDecodings(s));
    }
}
