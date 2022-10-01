package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumSumOfFourDigitNumberAfterSplittingDigitsSort;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
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
    public void testSort(int num, int excepted) {
        MinimumSumOfFourDigitNumberAfterSplittingDigits sort =
                new MinimumSumOfFourDigitNumberAfterSplittingDigitsSort();
        assertEquals(excepted, sort.minimumSum(num));
    }
}
