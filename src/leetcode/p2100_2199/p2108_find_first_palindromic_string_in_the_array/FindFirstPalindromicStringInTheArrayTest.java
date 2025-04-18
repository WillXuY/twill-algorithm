package leetcode.p2100_2199.p2108_find_first_palindromic_string_in_the_array;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindFirstPalindromicStringInTheArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"abc","car","ada","racecar","cool"},
                        "ada"
                ),
                arguments(new String[] {"notapalindrome","racecar"}, "racecar"),
                arguments(new String[] {"def","ghi"}, "")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String[] words, String expected) {
        FindFirstPalindromicStringInTheArray loop =
                new FindFirstPalindromicStringInTheArrayLoop();
        assertEquals(expected, loop.firstPalindrome(words));
    }
}
