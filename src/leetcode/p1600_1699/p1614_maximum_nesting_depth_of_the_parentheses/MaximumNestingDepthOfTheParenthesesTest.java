package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumNestingDepthOfTheParenthesesCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNestingDepthOfTheParenthesesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("(1+(2*3)+((8)/4))+1", 3),
                arguments("(1)+((2))+(((3)))", 3)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, int expected) {
        MaximumNestingDepthOfTheParentheses count =
                new MaximumNestingDepthOfTheParenthesesCount();
        assertEquals(expected, count.maxDepth(s));
    }
}
