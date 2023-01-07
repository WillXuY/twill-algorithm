package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.LongestPalindromicSubstringDynamic;
import org.willxu.algorithm.service.impl.string.LongestPalindromicSubstringLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongestPalindromicSubstringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Dynamic 1: palindromeLength <= s.length().
                arguments("ccc", "ccc"),
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

    @ParameterizedTest(name = "Dynamic {index}")
    @MethodSource("dataProvider")
    public void testDynamic(String s, String excepted) {
        LongestPalindromicSubstring dynamic =
                new LongestPalindromicSubstringDynamic();
        assertEquals(excepted, dynamic.longestPalindrome(s));
    }
}
