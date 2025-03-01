package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindNumbersWithEvenNumberOfDigitsDivision;

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
