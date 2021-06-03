package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.PalindromeNumberBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PalindromeNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(121, true),
                /* From left to right, it reads -121. From right to
                left, it becomes 121-.
                There fore it is not a palindrome
                 */
                arguments(-121, false),
                arguments(10, false),
                arguments(-101, false)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testPalindromeNumber(int input, boolean output) {
        PalindromeNumber bruteForce = new PalindromeNumberBruteForce();
        assertEquals(output, bruteForce.isPalindrome(input));
    }
}
