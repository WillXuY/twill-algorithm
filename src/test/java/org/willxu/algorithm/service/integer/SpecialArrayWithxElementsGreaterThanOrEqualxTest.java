package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.SpecialArrayWithxElementsGreaterThanOrEqualxSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SpecialArrayWithxElementsGreaterThanOrEqualxTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 6, 7, 7, 0}, -1),
                arguments(new int[] {3, 5}, 2),
                arguments(new int[] {0, 0}, -1),
                arguments(new int[] {0, 4, 3, 0, 4}, 3)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] nums, int excepted) {
        SpecialArrayWithxElementsGreaterThanOrEqualX sort =
                new SpecialArrayWithxElementsGreaterThanOrEqualxSort();
        assertEquals(excepted, sort.specialArray(nums));
    }
}
