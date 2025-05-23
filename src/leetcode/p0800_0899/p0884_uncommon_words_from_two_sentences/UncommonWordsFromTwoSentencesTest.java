package leetcode.p0800_0899.p0884_uncommon_words_from_two_sentences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class UncommonWordsFromTwoSentencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "this apple is sweet", "this apple is sour",
                        new String[] {"sweet", "sour"}
                ),
                arguments("apple apple", "banana", new String [] {"banana"})
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s1, String s2, String[] expected) {
        UncommonWordsFromTwoSentences set =
                new UncommonWordsFromTwoSentencesSet();
        assertArrayEquals(expected, set.uncommonFromSentences(s1, s2));
    }
}
