package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfItIsStraightLineEquation;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfItIsStraightLineTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[][] {
                                {1, 2}, {2, 3}, {3, 4}, {4, 5}, {5, 6}, {6, 7}
                        }, true
                ),
                arguments(
                        new int[][] {
                                {1, 1}, {2, 2}, {3, 4}, {4, 5}, {5, 6}, {7, 7}
                        }, false
                )
        );
    }

    @ParameterizedTest(name = "Equation {index}")
    @MethodSource("dataProvider")
    public void testEquation(int[][] coordinates, boolean excepted) {
        CheckIfItIsStraightLine equation =
                new CheckIfItIsStraightLineEquation();
        assertEquals(excepted, equation.checkStraightLine(coordinates));
    }
}
