package leetcode.p1400_1499.p1455_check_if_word_occurs_as_prefix_of_any_word_in_sentence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfWordOccursAsPrefixOfAnyWordInSentenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. search word may be longer than word.
                arguments("hello from the other side", "they", -1),
                // 1. Prefix not contains.
                arguments("i love eating burger", "ger", -1),
                arguments("i love eating burger", "burg", 4),
                arguments("this problem is an easy problem", "pro", 2),
                arguments("i am tired", "you", -1)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String sentence, String searchWord, int expected) {
        CheckIfWordOccursAsPrefixOfAnyWordInSentence split =
                new CheckIfWordOccursAsPrefixOfAnyWordInSentenceSplit();
        assertEquals(expected, split.isPrefixOfWord(sentence, searchWord));
    }
}
