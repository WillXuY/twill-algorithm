package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.NumberOfCommonFactorsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class NumberOfCommonFactorsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(12, 6, 4),
                arguments(25, 30, 2)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int a, int b, int excepted) {
        NumberOfCommonFactors loop = new NumberOfCommonFactorsLoop();
        assertEquals(excepted, loop.commonFactors(a, b));
    }
}
