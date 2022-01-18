package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.VerifyingAndAlienDictionaryLoop;

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
    public void testLoop(String[] words, String order, boolean excepted) {
        VerifyingAnAlienDictionary loop = new VerifyingAndAlienDictionaryLoop();
        assertEquals(excepted, loop.isAlienSorted(words, order));
    }
}
