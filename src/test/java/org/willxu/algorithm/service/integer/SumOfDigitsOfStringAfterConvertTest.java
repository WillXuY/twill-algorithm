package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SumOfDigitsOfStringAfterConvertLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfDigitsOfStringAfterConvertTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("iiii", 1, 36),
                arguments("leetcode", 2, 6),
                arguments("zbax", 2, 8)
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(String s, int k, int excepted) {
        SumOfDigitsOfStringAfterConvert loop =
                new SumOfDigitsOfStringAfterConvertLoop();
        assertEquals(excepted, loop.getLucky(s, k));
    }
}
