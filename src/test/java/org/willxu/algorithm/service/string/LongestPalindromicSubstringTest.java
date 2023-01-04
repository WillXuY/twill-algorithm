package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LongestPalindromicSubstringLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestPalindromicSubstringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("babad", "bab"),
                arguments("cbbd", "bb")
        );
    }

    /**
     * Time Limit Exceeded
     */
    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, String excepted) {
        LongestPalindromicSubstring loop =
                new LongestPalindromicSubstringLoop();
        assertEquals(excepted, loop.longestPalindrome(s));
    }
}
