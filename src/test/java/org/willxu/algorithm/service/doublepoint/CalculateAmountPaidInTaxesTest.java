package org.willxu.algorithm.service.doublepoint;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.doublepoint.CalculateAmountPaidInTaxesLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculateAmountPaidInTaxesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{3, 50}, {7, 10}, {12, 25}}, 10, 2.65),
                arguments(new int[][] {{1, 0}, {4, 25}, {5, 50}}, 2, 0.25),
                arguments(new int[][] {{2, 50}}, 0, 0.0)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[][] brackets, int income, double excepted) {
        CalculateAmountPaidInTaxes loop = new CalculateAmountPaidInTaxesLoop();
        assertEquals(excepted, loop.calculateTax(brackets, income));
    }
}
