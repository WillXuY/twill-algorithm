package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.LongerContiguousSegmentsOfOnesThanZerosCount;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class LongerContiguousSegmentsOfOnesThanZerosTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments("1101", true),
                arguments("111000", false),
                arguments("110100010", false)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(String s, boolean excepted) {
        LongerContiguousSegmentsOfOnesThanZeros count =
                new LongerContiguousSegmentsOfOnesThanZerosCount();
        assertEquals(excepted, count.checkZeroOnes(s));
    }
}
