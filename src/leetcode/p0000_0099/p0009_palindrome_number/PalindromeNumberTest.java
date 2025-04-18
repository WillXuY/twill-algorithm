/*
 * Copyright (C) 2021  Weiyang(Will) Xu
 * 
 * This file is part of algorithm.
 * Algorithm is free software: you can redistribute it and/or modify
 * it under the term of the GNU General Public License version 3 or
 * any later version, as specified in the readme.md file.
 */

package leetcode.p0000_0099.p0009_palindrome_number;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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

    @ParameterizedTest(name = "Modulus {index}")
    @MethodSource("dataProvider")
    public void testModulus(int input, boolean output) {
        PalindromeNumber modulus = new PalindromeNumberModulus();
        assertEquals(output, modulus.isPalindrome(input));
    }
}
