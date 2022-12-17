package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumCutsToDivideCircleDivide;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumCutsToDivideCircleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(4, 2),
                arguments(3, 3),
                arguments(1, 0)
        );
    }

    @ParameterizedTest(name = "Divide {index}")
    @MethodSource("dataProvider")
    public void testDivide(int n, int excepted) {
        MinimumCutsToDivideCircle divide = new
                MinimumCutsToDivideCircleDivide();
        assertEquals(excepted, divide.numberOfCuts(n));
    }
}
