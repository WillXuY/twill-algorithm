package leetcode.p2200_2299.p2259_remove_digit_from_number_to_maximize_result;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class RemoveDigitFromNumberToMaximizeResultTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("73197", '7', "7319"),
                arguments("133235", '3', "13325"),
                arguments("123", '3', "12"),
                arguments("1231", '1', "231"),
                arguments("551", '5', "51")
        );
    }

    @ParameterizedTest(name = "Compare {index}")
    @MethodSource("dataProvider")
    public void testCompare(String number, char digit, String expected) {
        RemoveDigitFromNumberToMaximizeResult compare =
                new RemoveDigitFromNumberToMaximizeResultCompare();
        assertEquals(expected, compare.removeDigit(number, digit));
    }
}
