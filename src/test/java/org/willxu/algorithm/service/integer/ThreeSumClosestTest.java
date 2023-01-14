package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.ThreeSumClosestPointer;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class ThreeSumClosestTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {4, 0, 5, -5, 3, 3, 0, -4, -5}, -2, -2),
                arguments(new int[] {-1, 2, 1, -4}, 1, 2),
                arguments(new int[] {0, 0, 0}, 1, 0)
        );
    }

    @ParameterizedTest(name = "Pointer {index}")
    @MethodSource("dataProvider")
    public void testPointer(int[] nums, int target, int excepted) {
        ThreeSumClosest pointer = new ThreeSumClosestPointer();
        assertEquals(excepted, pointer.threeSumClosest(nums, target));
    }
}
