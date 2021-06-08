package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ImplementStrStrBruteForce;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ImplementStrStrTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("hello", "ll", 2),
                arguments("aaaaa", "bba", -1),
                arguments("", "", 0),
                // wrong answer 1
                arguments("a", "", 0)
        );
    }

    @ParameterizedTest(name = "Brute force {index}")
    @MethodSource("dataProvider")
    public void testImplementStrStr(
            String haystack, String needle, int output) {
        ImplementStrStr bruteForce = new ImplementStrStrBruteForce();
        assertEquals(output, bruteForce.strStr(haystack, needle));
    }
}
