package leetcode.p1300_1399.p1328_break_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BreakPalindromeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("oisio", "aisio"),
                Arguments.arguments("zzzz", "azzz"),
                Arguments.arguments("aabaa", "aabab"),
                Arguments.arguments("aba", "abb"),
                Arguments.arguments("aa", "ab"),
                Arguments.arguments("abccba", "aaccba"),
                Arguments.arguments("a", "")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String palindrome, String expected) {
        BreakPalindrome loop = new BreakPalindromeLoop();
        assertEquals(expected, loop.breakPalindrome(palindrome));
    }
}
