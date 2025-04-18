package leetcode.p2300_2399.p2309_greatest_english_letter_in_upper_and_lower_case;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class GreatestEnglishLetterInUpperAndLowerCaseTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("lEeTcOdE", "E"),
                arguments("arRAzFif", "R"),
                arguments("AbCdEfGhIjK", "")
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(String s, String expected) {
        GreatestEnglishLetterInUpperAndLowerCase set =
                new GreatestEnglishLetterInUpperAndLowerCaseSet();
        assertEquals(expected, set.greatestLetter(s));
    }
}
