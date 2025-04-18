package leetcode.p2200_2299.p2283_check_if_number_has_equal_digit_count_and_digit_value;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfNumberHasEqualDigitCountAndDigitValueTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1210", true),
                arguments("030", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String num, boolean expected) {
        CheckIfNumberHasEqualDigitCountAndDigitValue count =
                new CheckIfNumberHasEqualDigitCountAndDigitValueCount();
        assertEquals(expected, count.digitCount(num));
    }
}
