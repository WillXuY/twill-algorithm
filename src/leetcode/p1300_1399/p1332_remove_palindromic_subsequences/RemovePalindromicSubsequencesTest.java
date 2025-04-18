package leetcode.p1300_1399.p1332_remove_palindromic_subsequences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemovePalindromicSubsequencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("ababa", 1),
                arguments("abb", 2),
                arguments("baabb", 2)
        );
    }

    /**
     * output will be 1(Palindromic string) or 2(remove a then b).
     */
    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int expected) {
        RemovePalindromicSubsequences loop
                = new RemovePalindromicSubsequencesLoop();
        assertEquals(expected, loop.removePalindromeSub(s));
    }
}
