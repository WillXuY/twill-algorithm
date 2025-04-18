package leetcode.p0300_0399.p0383_ransom_note;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
                           boolean expected) {
        RansomNote remove = new RansomNoteRemove();
        assertEquals(expected, remove.canConstruct(ransomNote, magazine));
    }
}
