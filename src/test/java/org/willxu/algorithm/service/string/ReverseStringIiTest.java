package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.ReverseStringIiLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseStringIiTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer 1
                arguments("a", 2, "a"),
                arguments("abcdefg", 2, "bacdfeg"),
                arguments("abcd", 2, "bacd")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String input, int k, String excepted) {
        ReverseStringIi loop = new ReverseStringIiLoop();
        assertEquals(excepted, loop.reverseStr(input, k));
    }
}
