package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumAddToMakeParenthesesValidCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MinimumAddToMakeParenthesesValidTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("())", 1),
                Arguments.arguments("(((", 3),
                Arguments.arguments(")(", 2)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, int except) {
        MinimumAddToMakeParenthesesValid count =
                new MinimumAddToMakeParenthesesValidCount();
        assertEquals(except, count.minAddToMakeValid(s));
    }
}
