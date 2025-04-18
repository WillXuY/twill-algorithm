package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfTheSentenceIsPangramArray;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfTheSentenceIsPangramTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("thequickbrownfoxjumpsoverthelazydog", true),
                arguments("leetcode", false)
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(String sentence, boolean expected) {
        CheckIfTheSentenceIsPangram array =
                new CheckIfTheSentenceIsPangramArray();
        assertEquals(expected, array.checkIfPangram(sentence));
    }
}
