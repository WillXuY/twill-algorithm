package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.SortingTheSentenceArray;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortingTheSentenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("is2 sentence4 This1 a3", "This is a sentence"),
                arguments("Myself2 Me1 I4 and3", "Me Myself and I")
        );
    }

    @ParameterizedTest(name = "Array {index}")
    @MethodSource("dataProvider")
    public void testArray(String s, String excepted) {
        SortingTheSentence array = new SortingTheSentenceArray();
        assertEquals(excepted, array.sortSentence(s));
    }
}
