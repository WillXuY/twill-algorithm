package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateIiList;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateIiMapKey;
import org.willxu.algorithm.service.impl.bool.ContainsDuplicateIiMapValue;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ContainsDuplicateIiTest {
    private static int[] generateIntArray(int start, int end) {
        int[] ints = new int[end - start + 1];
        for (int i = 0; i <= end - start; i++) {
            ints[i] = start + i;
        }
        return ints;
    }

    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /* Time Limit Exceeded. */
                arguments(generateIntArray(-24500, 29999), 35000, false),
                arguments(new int[] {1, 2, 3, 1}, 3, true),
                arguments(new int[] {1, 0, 1, 1}, 1, true),
                arguments(new int[] {1, 2, 3, 1, 2, 3}, 2, false)
        );
    }

    @ParameterizedTest(name = "Map key {index}")
    @MethodSource("dataProvider")
    public void testMapKey(int[] nums, int k, boolean excepted) {
        ContainsDuplicateIi mapKey = new ContainsDuplicateIiMapKey();
        assertEquals(excepted, mapKey.containsNearbyDuplicate(nums, k));
    }

    /**
     * Time Limit Exceeded.
     */
    @ParameterizedTest(name = "List {index}")
    @MethodSource("dataProvider")
    public void testList(int[] nums, int k, boolean excepted) {
        ContainsDuplicateIi list = new ContainsDuplicateIiList();
        assertEquals(excepted, list.containsNearbyDuplicate(nums, k));
    }

    /**
     * Time Limit Exceeded.
     */
    @ParameterizedTest(name = "Map value {index}")
    @MethodSource("dataProvider")
    public void testMapValue(int[] nums, int k, boolean excepted) {
        ContainsDuplicateIi mapValue = new ContainsDuplicateIiMapValue();
        assertEquals(excepted, mapValue.containsNearbyDuplicate(nums, k));
    }
}
