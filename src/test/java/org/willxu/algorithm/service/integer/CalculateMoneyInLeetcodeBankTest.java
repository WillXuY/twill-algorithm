package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CalculateMoneyInLeetcodeBankCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculateMoneyInLeetcodeBankTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 10),
                arguments(10, 37),
                arguments(20, 96)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int n, int excepted) {
        CalculateMoneyInLeetcodeBank calculate =
                new CalculateMoneyInLeetcodeBankCalculate();
        assertEquals(excepted, calculate.totalMoney(n));
    }
}
