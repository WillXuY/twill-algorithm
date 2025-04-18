package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.RemoveOutermostParenthesesLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveOutermostParenthesesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // (()()) + (())
                arguments("(()())(())", "()()()"),
                /*
                 (()()) + (()) + (()(()))
                 ()() + () + ()(())
                 */
                arguments("(()())(())(()(()))", "()()()()(())"),
                arguments("()()", "")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, String expected) {
        RemoveOutermostParentheses loop = new RemoveOutermostParenthesesLoop();
        assertEquals(expected, loop.removeOuterParentheses(s));
    }
}
