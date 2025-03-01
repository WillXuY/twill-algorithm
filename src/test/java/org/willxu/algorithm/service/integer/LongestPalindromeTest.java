package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.LongestPalindromeCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LongestPalindromeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Explanation:
                One longest palindrome that can bve built is "dccaccd",
                whose length is 7.
                 */
                Arguments.arguments("abccccdd", 7),
                Arguments.arguments("a", 1),
                Arguments.arguments("bb", 2)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String input, int expected) {
        LongestPalindrome count = new LongestPalindromeCount();
        assertEquals(expected, count.longestPalindrome(input));
    }
}
