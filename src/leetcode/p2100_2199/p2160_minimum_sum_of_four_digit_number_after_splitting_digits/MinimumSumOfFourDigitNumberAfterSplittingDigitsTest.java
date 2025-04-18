package leetcode.p2100_2199.p2160_minimum_sum_of_four_digit_number_after_splitting_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumSumOfFourDigitNumberAfterSplittingDigitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(2932, 52),
                arguments(4009, 13)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int num, int expected) {
        MinimumSumOfFourDigitNumberAfterSplittingDigits sort =
                new MinimumSumOfFourDigitNumberAfterSplittingDigitsSort();
        assertEquals(expected, sort.minimumSum(num));
    }
}
