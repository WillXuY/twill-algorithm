package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.DecodeStringStack;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DecodeStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("3[a]2[bc]", "aaabcbc"),
                Arguments.arguments("3[a2[c]]", "accaccacc"),
                Arguments.arguments("2[abc]3[cd]ed", "abcabccdcdcdef")
        );
    }

    @ParameterizedTest(name = "Stack {index}")
    @MethodSource("dataProvider")
    public void testStack(String s, String excepted) {
        DecodeString stack = new DecodeStringStack();
        assertEquals(excepted, stack.decodeString(s));
    }
}
