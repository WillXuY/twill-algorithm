package leetcode.p1800_1899.p1859_sorting_the_sentence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testArray(String s, String expected) {
        SortingTheSentence array = new SortingTheSentenceArray();
        assertEquals(expected, array.sortSentence(s));
    }
}
