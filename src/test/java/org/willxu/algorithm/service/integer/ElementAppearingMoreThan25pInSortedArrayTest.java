package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ElementAppearingMoreThan25pInSortedArrayCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ElementAppearingMoreThan25pInSortedArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 2, 6, 6, 6, 6, 7, 10}, 6),
                arguments(new int[] {1, 1}, 1)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] arr, int excepted) {
        ElementAppearingMoreThan25pInSortedArray count
                = new ElementAppearingMoreThan25pInSortedArrayCount();
        assertEquals(excepted, count.findSpecialInteger(arr));
    }
}
