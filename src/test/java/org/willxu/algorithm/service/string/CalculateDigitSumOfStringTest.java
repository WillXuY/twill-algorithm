package org.willxu.algorithm.service.string;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.string.CalculateDigitSumOfStringLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CalculateDigitSumOfStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1234", 2, "37"),
                arguments("11111222223", 3, "135"),
                arguments("00000000", 3, "000")
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int k, String excepted) {
        CalculateDigitSumOfString loop = new CalculateDigitSumOfStringLoop();
        assertEquals(excepted, loop.digitSum(s, k));
    }
}
