package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ValidParenthesesStack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidParenthesesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("()", true),
                arguments("()[]{}", true),
                arguments("(]", false),
                arguments("([)]", false),
                arguments("{[]}", true)
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String input, boolean output) {
        ValidParentheses stack = new ValidParenthesesStack();
        assertEquals(output, stack.isValid(input));
    }
}
