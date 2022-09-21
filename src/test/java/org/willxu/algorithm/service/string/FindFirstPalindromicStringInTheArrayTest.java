package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.FindFirstPalindromicStringInTheArrayLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
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
    public void testLoop(String[] words, String excepted) {
        FindFirstPalindromicStringInTheArray loop =
                new FindFirstPalindromicStringInTheArrayLoop();
        assertEquals(excepted, loop.firstPalindrome(words));
    }
}
