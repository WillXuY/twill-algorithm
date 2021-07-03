package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ValidPalindromePreprocessing;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ValidPalindromeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                Unclear wrong answer 1
                 */
                arguments(
                        "0P",
                        false
                ),
                /*
                Explanation: "amanaplanacanalpanama" is a palindrome.
                 */
                arguments(
                        "A man, a plan, a canal: Panama",
                        true
                ),
                /*
                Explanation: "raceacar" is not a palindrome.
                 */
                arguments(
                        "race a car",
                        false
                )
        );
    }

    @ParameterizedTest(name = "Preprocessing {index}")
    @MethodSource("dataProvider")
    public void testPreprocessing(String input, boolean excepted) {
        ValidPalindrome preprocessing = new ValidPalindromePreprocessing();
        assertEquals(excepted, preprocessing.isPalindrome(input));
    }
}
