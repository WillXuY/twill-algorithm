package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.SortArrayByParityLoop;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class SortArrayByParityTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 1, 2, 4}, new int[] {2, 4, 3, 1}),
                arguments(new int[] {0}, new int[] {0})
        );
    }

    @ParameterizedTest(name = "dataProvider")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int[] expected) {
        SortArrayByParity loop = new SortArrayByParityLoop();
        assertArrayEquals(expected, loop.sortArrayByParity(nums));
    }
}
