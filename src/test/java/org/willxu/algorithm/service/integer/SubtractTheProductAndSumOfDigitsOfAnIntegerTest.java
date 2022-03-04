package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SubtractTheProductAndSumOfDigitsOfAnIntegerDivision;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SubtractTheProductAndSumOfDigitsOfAnIntegerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2 * 3 * 4 = 24, 2 + 3 + 4 = 9, 24 - 9 = 5
                arguments(234, 15),
                arguments(4421, 21)
        );
    }

    @ParameterizedTest(name = "Division {index}")
    @MethodSource("dataProvider")
    public void testDivision(int n, int excepted) {
        SubtractTheProductAndSumOfDigitsOfAnInteger division
                = new SubtractTheProductAndSumOfDigitsOfAnIntegerDivision();
        assertEquals(excepted, division.subtractProductAndSum(n));
    }
}
