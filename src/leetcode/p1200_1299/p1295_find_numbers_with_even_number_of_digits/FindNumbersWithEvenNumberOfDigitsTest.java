package leetcode.p1200_1299.p1295_find_numbers_with_even_number_of_digits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindNumbersWithEvenNumberOfDigitsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                v 2 12
                x 3 345
                x 1 2
                x 1 6
                v 4 7896
                 */
                arguments(new int[] {12, 345, 2, 6, 7896}, 2),
                arguments(new int[] {555, 901, 482, 1771}, 1)
        );
    }

    @ParameterizedTest(name = "Division {index}")
    @MethodSource("dataProvider")
    public void testDivision(int[] nums, int expected) {
        FindNumbersWithEvenNumberOfDigits division
                = new FindNumbersWithEvenNumberOfDigitsDivision();
        assertEquals(expected, division.findNumbers(nums));
    }
}
