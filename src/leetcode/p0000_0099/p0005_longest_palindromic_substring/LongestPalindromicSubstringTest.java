package leetcode.p0000_0099.p0005_longest_palindromic_substring;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testLoop(String s, String expected) {
        LongestPalindromicSubstring loop =
                new LongestPalindromicSubstringLoop();
        assertEquals(expected, loop.longestPalindrome(s));
    }

    @ParameterizedTest(name = "Dynamic {index}")
    @MethodSource("dataProvider")
    public void testDynamic(String s, String expected) {
        LongestPalindromicSubstring dynamic =
                new LongestPalindromicSubstringDynamic();
        assertEquals(expected, dynamic.longestPalindrome(s));
    }
}
