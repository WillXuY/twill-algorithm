package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfTwoStringArraysAreEquivalentBuild;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfTwoStringArraysAreEquivalentTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {"ab", "c"},
                        new String[] {"a", "bc"},
                        true
                ),
                arguments(
                        new String[] {"a", "cb"},
                        new String[] {"a", "bc"},
                        false
                ),
                arguments(
                        new String[] {"abc", "d", "defg"},
                        new String[] {"abcddefg"},
                        true
                )
        );
    }

    @ParameterizedTest(name = "Build {index}")
    @MethodSource("dataProvider")
    public void testBuild(String[] word1, String[] word2, boolean expected) {
        CheckIfTwoStringArraysAreEquivalent build =
                new CheckIfTwoStringArraysAreEquivalentBuild();
        assertEquals(expected, build.arrayStringsAreEqual(word1, word2));
    }
}
