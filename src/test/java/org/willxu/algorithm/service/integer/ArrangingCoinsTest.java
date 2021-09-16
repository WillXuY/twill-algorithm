package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ArrangingCoinsCycle;
import org.willxu.algorithm.service.impl.integer.ArrangingCoinsEquation;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrangingCoinsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1, 2, 2 complete 2
                Arguments.arguments(5, 2),
                // 1, 2, 3, 2 complete 3
                Arguments.arguments(8, 3)
        );
    }

    @ParameterizedTest(name = "Equation {index}")
    @MethodSource("dataProvider")
    public void testEquation(int input, int excepted) {
        ArrangingCoins equation = new ArrangingCoinsEquation();
        assertEquals(excepted, equation.arrangeCoins(input));
    }

    @ParameterizedTest(name = "Cycle {index}")
    @MethodSource("dataProvider")
    public void testCycle(int input, int excepted) {
        ArrangingCoins cycle = new ArrangingCoinsCycle();
        assertEquals(excepted, cycle.arrangeCoins(input));
    }
}
