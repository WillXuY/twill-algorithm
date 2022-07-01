package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SumOfUniqueElementsCount;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SumOfUniqueElementsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 2}, 4),
                arguments(new int[] {1, 1, 1, 1, 1}, 0),
                arguments(new int[] {1, 2, 3, 4, 5}, 15)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int excepted) {
        SumOfUniqueElements count = new SumOfUniqueElementsCount();
        assertEquals(excepted, count.sumOfUnique(nums));
    }
}
