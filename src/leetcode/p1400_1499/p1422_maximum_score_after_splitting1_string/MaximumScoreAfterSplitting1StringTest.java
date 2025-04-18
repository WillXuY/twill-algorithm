package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumScoreAfterSplitting1StringCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumScoreAfterSplitting1StringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("011101", 5),
                arguments("00111", 5)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, int expected) {
        MaximumScoreAfterSplitting1String count =
                new MaximumScoreAfterSplitting1StringCount();
        assertEquals(expected, count.maxScore(s));
    }
}
