package leetcode.p1900_1999.p1974_minimum_time_to_type_word_using_special_typewriter;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumTimeToTypeWordUsingSpecialTypewriterTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("abc", 5),
                arguments("bza", 7),
                arguments("zjpc", 34)
        );
    }

    @ParameterizedTest(name = "Subtraction {index}")
    @MethodSource("dataProvider")
    public void testSubtraction(String word, int expected) {
        MinimumTimeToTypeWordUsingSpecialTypewriter subtraction =
                new MinimumTimeToTypeWordUsingSpecialTypewriterSubtraction();
        assertEquals(expected, subtraction.minTimeToType(word));
    }
}
