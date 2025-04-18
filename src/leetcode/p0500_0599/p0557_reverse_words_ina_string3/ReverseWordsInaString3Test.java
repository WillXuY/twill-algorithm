package leetcode.p0500_0599.p0557_reverse_words_ina_string3;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ReverseWordsInaString3Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        "Let's take LeetCode contest",
                        "s'teL ekat edoCteeL tsetnoc"
                ),
                arguments("God Ding", "doG gniD")
        );
    }

    @ParameterizedTest(name = "Index {index}")
    @MethodSource("dataProvider")
    public void testIndex(String input, String expected) {
        ReverseWordsInaString3 index = new ReverseWordsInaString3Index();
        assertEquals(expected, index.reverseWords(input));
    }
}
