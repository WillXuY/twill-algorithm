package leetcode.p2200_2299.p2243_calculate_digit_sum_of_string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculateDigitSumOfStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1234", 2, "37"),
                arguments("11111222223", 3, "135"),
                arguments("00000000", 3, "000")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int k, String expected) {
        CalculateDigitSumOfString loop = new CalculateDigitSumOfStringLoop();
        assertEquals(expected, loop.digitSum(s, k));
    }
}
