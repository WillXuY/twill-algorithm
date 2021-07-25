package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountPrimesCycleCalculate;
import org.willxu.algorithm.service.impl.integer.CountPrimesMarkRemove;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountPrimesTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // Time Limit Exceeded
                arguments(499979, 41537),
                /*
                Explanation: There are 4 prime numbers less than 10,
                they are 2, 3, 5, 7.
                 */
                arguments(10, 4),
                arguments(0, 0),
                arguments(1, 0)
        );
    }

    @ParameterizedTest(name = "Mark remove {index}")
    @MethodSource("dataProvider")
    public void testMarkRemove(int input, int excepted) {
        CountPrimes markRemove = new CountPrimesMarkRemove();
        assertEquals(excepted, markRemove.countPrimes(input));
    }

    /**
     * Time out
     */
    @ParameterizedTest(name = "Cycle calculate {index}")
    @MethodSource("dataProvider")
    public void testCycleCalculate(int input, int excepted) {
        CountPrimes cycleCalculate = new CountPrimesCycleCalculate();
        assertEquals(excepted, cycleCalculate.countPrimes(input));
    }
}
