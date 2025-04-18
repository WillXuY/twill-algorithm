package leetcode.p2100_2199.p2114_maximum_number_of_words_found_in_sentences;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfWordsFoundInSentencesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new String[] {
                                "alice and bob love leetcode",
                                "i think so too",
                                "this is great thanks very much"
                        },
                        6
                ),
                arguments(
                        new String[] {
                                "please wait",
                                "continue to fight",
                                "continue to win"
                        },
                        3
                )
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String[] sentences, int expected) {
        MaximumNumberOfWordsFoundInSentences split =
                new MaximumNumberOfWordsFoundInSentencesSplit();
        assertEquals(expected, split.mostWordsFound(sentences));
    }
}
