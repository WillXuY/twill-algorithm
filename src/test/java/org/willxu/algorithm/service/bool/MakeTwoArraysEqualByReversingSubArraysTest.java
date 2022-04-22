package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.MakeTwoArraysEqualByReversingSubArraysMap;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MakeTwoArraysEqualByReversingSubArraysTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 2, 3, 4}, new int[] {2, 4, 1, 3}, true),
                arguments(new int[] {7}, new int[] {7}, true),
                arguments(new int[] {3, 7, 9}, new int[] {3, 7, 11}, false)
        );
    }

    @ParameterizedTest(name = "Map {index}")
    @MethodSource("dataProvider")
    public void testMap(int[] target, int[] arr, boolean excepted) {
        MakeTwoArraysEqualByReversingSubArrays map =
                new MakeTwoArraysEqualByReversingSubArraysMap();
        assertEquals(excepted, map.canBeEqual(target, arr));
    }
}
