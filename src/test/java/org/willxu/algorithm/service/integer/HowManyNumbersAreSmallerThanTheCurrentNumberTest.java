package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.HowManyNumbersAreSmallerThanTheCurrentNumberTreeMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HowManyNumbersAreSmallerThanTheCurrentNumberTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {8, 1, 2, 2, 3}, new int[] {4, 0, 1, 1, 3}),
                arguments(new int[] {6, 5, 4, 8}, new int[] {2, 1, 0, 3}),
                arguments(new int[] {7, 7, 7, 7}, new int[] {0, 0, 0, 0})
        );
    }

    @ParameterizedTest(name = "TreeMap {index}")
    @MethodSource("dataProvider")
    public void testTreeMap(int[] nums, int[] expected) {
        HowManyNumbersAreSmallerThanTheCurrentNumber treeMap
                = new HowManyNumbersAreSmallerThanTheCurrentNumberTreeMap();
        assertArrayEquals(expected, treeMap.smallerNumbersThanCurrent(nums));
    }
}
