package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumAmountOfTimeToFillCupsDivide;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumAmountOfTimeToFillCupsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {7, 9, 4}, 10),
                arguments(new int[] {5, 2, 2}, 5),
                arguments(new int[] {2, 4, 2}, 4),
                arguments(new int[] {1, 4, 2}, 4),
                arguments(new int[] {5, 4, 4}, 7),
                arguments(new int[] {5, 0, 0}, 5)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int[] amount, int expected) {
        MinimumAmountOfTimeToFillCups divide =
                new MinimumAmountOfTimeToFillCupsDivide();
        assertEquals(expected, divide.fillCups(amount));
    }
}
