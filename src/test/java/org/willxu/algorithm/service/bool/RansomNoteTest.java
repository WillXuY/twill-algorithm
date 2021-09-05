package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.RansomNoteRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RansomNoteTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("a", "b", false),
                Arguments.arguments("aa", "ab", false),
                Arguments.arguments("aa", "aab", true)
        );
    }

    @ParameterizedTest(name = "Remove {index}")
    @MethodSource("dataProvider")
    public void testRemove(String ransomNote, String magazine,
                           boolean excepted) {
        RansomNote remove = new RansomNoteRemove();
        assertEquals(excepted, remove.canConstruct(ransomNote, magazine));
    }
}
