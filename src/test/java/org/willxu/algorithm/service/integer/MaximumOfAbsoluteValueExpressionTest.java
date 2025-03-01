package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumOfAbsoluteValueExpressionLoop;
import org.willxu.algorithm.service.impl.integer.MaximumOfAbsoluteValueExpressionMath;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MaximumOfAbsoluteValueExpressionTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {1, -2},
                        new int[] {8, 8},
                        4
                ),
                Arguments.arguments(
                        new int[] {1, 2, 3, 4},
                        new int[] {-1, 4, 5, 6},
                        13
                ),
                Arguments.arguments(
                        new int[] {1, -2, -5, 0, 10},
                        new int[] {0, -2, -1, -7, -4},
                        20
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testMath(int[] arr1, int[] arr2, int expected) {
        MaximumOfAbsoluteValueExpression math =
                new MaximumOfAbsoluteValueExpressionMath();
        assertEquals(expected, math.maxAbsValExpr(arr1, arr2));
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] arr1, int[] arr2, int expected) {
        MaximumOfAbsoluteValueExpression loop =
                new MaximumOfAbsoluteValueExpressionLoop();
        assertEquals(expected, loop.maxAbsValExpr(arr1, arr2));
    }
}
