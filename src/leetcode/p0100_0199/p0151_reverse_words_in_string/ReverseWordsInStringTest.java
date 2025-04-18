package leetcode.p0100_0199.p0151_reverse_words_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ReverseWordsInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments("the sky is blue", "blue is sky the"),
                Arguments.arguments("  hello world ", "world hello"),
                Arguments.arguments("a good   example", "example good a")
        );
    }

    @ParameterizedTest(name = "Split {index}")
    @MethodSource("dataProvider")
    public void testSplit(String s, String expected) {
        ReverseWordsInString split = new ReverseWordsInStringSplit();
        assertEquals(expected, split.reverseWords(s));
    }
}
