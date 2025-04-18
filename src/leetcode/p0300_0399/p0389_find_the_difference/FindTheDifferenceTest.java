package leetcode.p0300_0399.p0389_find_the_difference;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindTheDifferenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("abcd", "abcde", 'e'),
                Arguments.arguments("", "y", 'y'),
                Arguments.arguments("a", "aa", 'a'),
                Arguments.arguments("ae", "aea", 'a')
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(String s, String t, char expected) {
        FindTheDifference remove = new FindTheDifferenceRemove();
        assertEquals(expected, remove.findTheDifference(s, t));
    }
}
