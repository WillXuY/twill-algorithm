package leetcode.p2200_2299.p2278_percentage_of_letter_in_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PercentageOfLetterInStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("foobar", 'o', 33),
                arguments("jjjj", 'k', 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, char letter, int expected) {
        PercentageOfLetterInString count =
                new PercentageOfLetterInStringCount();
        assertEquals(expected, count.percentageLetter(s, letter));
    }
}
