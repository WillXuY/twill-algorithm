package leetcode.p1900_1999.p1935_maximum_number_of_words_you_can_type;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumNumberOfWordsYouCanTypeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("hello world", "ad", 1),
                arguments("leet code", "lt", 1),
                arguments("leet code", "e", 0)
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String text, String brokenLetters, int expected) {
        MaximumNumberOfWordsYouCanType split =
                new MaximumNumberOfWordsYouCanTypeSplit();
        assertEquals(expected, split.canBeTypedWords(text, brokenLetters));
    }
}
