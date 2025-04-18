package leetcode.p1700_1799.p1716_calculate_money_in_leetcode_bank;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

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
    public void testCalculate(int n, int expected) {
        CalculateMoneyInLeetcodeBank calculate =
                new CalculateMoneyInLeetcodeBankCalculate();
        assertEquals(expected, calculate.totalMoney(n));
    }
}
