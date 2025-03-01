package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SmallestRange1Find;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SmallestRange1Test {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1}, 0, 0),
                arguments(new int[] {0, 10}, 2, 6),
                arguments(new int[] {1, 3, 6}, 3, 0)
        );
    }

    @ParameterizedTest(name = "Find {index}")
    @MethodSource("dataProvider")
    public void testFind(int[] nums, int k, int expected) {
        SmallestRange1 find = new SmallestRange1Find();
        assertEquals(expected, find.smallestRangeI(nums, k));
    }
}
