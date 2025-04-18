/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0100_0199.p0125_valid_palindrome;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testPreprocessing(String input, boolean expected) {
        ValidPalindrome preprocessing = new ValidPalindromePreprocessing();
        assertEquals(expected, preprocessing.isPalindrome(input));
    }
}
