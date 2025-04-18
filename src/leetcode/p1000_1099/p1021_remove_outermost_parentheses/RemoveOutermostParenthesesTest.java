package leetcode.p1000_1099.p1021_remove_outermost_parentheses;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
