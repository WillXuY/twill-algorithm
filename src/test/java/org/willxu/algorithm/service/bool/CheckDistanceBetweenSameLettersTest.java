package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckDistanceBetweenSameLettersLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckDistanceBetweenSameLettersTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "abbccddeeffgghhiijjkkllmmnnooppqqrrssttuuvvwwxxyyzza",
                        new int[] {50,0,0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,0,0,0,0,0},
                        true
                ),
                arguments(
                        "abaccb",
                        new int[] {1,3,0,5,0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,0,0,0},
                        true
                ),
                arguments(
                        "aa",
                        new int[] {1,0,0,0,0,0,0,0,0,0,0,0,0,
                                0,0,0,0,0,0,0,0,0,0,0,0,0},
                        false
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int[] distance, boolean expected) {
        CheckDistanceBetweenSameLetters loop =
                new CheckDistanceBetweenSameLettersLoop();
        assertEquals(expected, loop.checkDistances(s, distance));
    }
}
