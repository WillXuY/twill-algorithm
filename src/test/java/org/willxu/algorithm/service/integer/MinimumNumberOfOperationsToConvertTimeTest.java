package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumNumberOfOperationsToConvertTimeLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumNumberOfOperationsToConvertTimeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("02:30", "04:35", 3),
                arguments("11:00", "11:01", 1)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String current, String correct, int excepted) {
        MinimumNumberOfOperationsToConvertTime loop =
                new MinimumNumberOfOperationsToConvertTimeLoop();
        assertEquals(excepted, loop.convertTime(current, correct));
    }
}
