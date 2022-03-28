package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindLuckIntegerInAnArrayCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindLuckIntegerInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 2, 3, 4}, 2),
                arguments(new int[] {1, 2, 2, 3, 3, 3}, 3),
                arguments(new int[] {2, 2, 2, 3, 3}, -1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, int excepted) {
        FindLuckIntegerInAnArray count = new FindLuckIntegerInAnArrayCount();
        assertEquals(excepted, count.findLucky(arr));
    }
}
