package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.EvaluateReversePolishNotationStack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EvaluateReversePolishNotationTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new String[] {"2", "1", "+", "3", "*"}, 9),
                Arguments.arguments(new String[] {"4", "13", "5", "/", "+"}, 6),
                Arguments.arguments(
                        new String[] {
                                "10", "6", "9", "3", "+", "-11", "*", "/", "*",
                                "17", "+", "5", "+"
                        }, 22
                )
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String[] tokens, int expected) {
        EvaluateReversePolishNotation stack =
                new EvaluateReversePolishNotationStack();
        assertEquals(expected, stack.evalRPN(tokens));
    }
}
