package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.RemoveAllAdjacentDuplicatesInStringRegex;
import org.willxu.algorithm.service.impl.string.RemoveAllAdjacentDuplicatesInStringStack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveAllAdjacentDuplicatesInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // abbaca -> aaca -> ca
                arguments("abbaca", "ca"),
                // azxxzy -> azzy -> ay
                arguments("azxxzy", "ay")
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String s, String expected) {
        RemoveAllAdjacentDuplicatesInString stack =
                new RemoveAllAdjacentDuplicatesInStringStack();
        assertEquals(expected, stack.removeDuplicates(s));
    }

    /**
     * Time out of limit.
     */
    @ParameterizedTest(name = "Regex {index}")
    @MethodSource("dataProvider")
    public void testRegex(String s, String expected) {
        RemoveAllAdjacentDuplicatesInString regex
                = new RemoveAllAdjacentDuplicatesInStringRegex();
        assertEquals(expected, regex.removeDuplicates(s));
    }
}
