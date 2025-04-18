package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import leetcode.p0900_0999.p0953_verifying_an_alien_dictionary.VerifyingAndAlienDictionaryLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class VerifyingAnAlienDictionaryTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"hello", "leetcode"},
                        "hlabcdefgijkmnopqrstuvwxyz",
                        true
                ),
                arguments(
                        new String[] {"word", "world", "row"},
                        "worldabcefghijkmnpqstuvxyz",
                        false
                ),
                // 'l' > ''
                arguments(
                        new String[] {"apple", "app"},
                        "abcdefghijklmnopqrstuvwxyz",
                        false
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String[] words, String order, boolean expected) {
        VerifyingAnAlienDictionary loop = new VerifyingAndAlienDictionaryLoop();
        assertEquals(expected, loop.isAlienSorted(words, order));
    }
}
