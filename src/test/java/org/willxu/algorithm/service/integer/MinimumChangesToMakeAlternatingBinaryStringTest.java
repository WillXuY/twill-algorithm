package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumChangesToMakeAlternatingBinaryStringCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumChangesToMakeAlternatingBinaryStringTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("0100", 1),
                arguments("10", 0),
                arguments("1111", 2)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, int expected) {
        MinimumChangesToMakeAlternatingBinaryString count =
                new MinimumChangesToMakeAlternatingBinaryStringCount();
        assertEquals(expected, count.minOperations(s));
    }
}
