package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.MakeTheStringGreatStack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeTheStringGreatTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("leEeetcode", "leetcode"),
                arguments("abBAcC", ""),
                arguments("s", "s")
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String s, String expected) {
        MakeTheStringGreat stack = new MakeTheStringGreatStack();
        assertEquals(expected, stack.makeGood(s));
    }
}
