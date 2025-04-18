package leetcode.p0300_0399.p0392_is_subsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class IsSubsequenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Wrong answer1: index out of bound.
                Arguments.arguments("abc", "", false),
                Arguments.arguments("abc", "ahbgdc", true),
                Arguments.arguments("axc", "ahbgdc", false)
        );
    }

    @ParameterizedTest(name = "Iterator {index}")
    @MethodSource("dataProvider")
    public void testIterator(String s, String t, boolean expected) {
        IsSubsequence iterator = new IsSubsequenceIterator();
        assertEquals(expected, iterator.isSubsequence(s, t));
    }
}
