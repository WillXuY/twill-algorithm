package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.PartitionArrayIntoDisjointIntervalsLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PartitionArrayIntoDisjointIntervalsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(
                        new int[] {5, 0, 3, 8, 6},
                        3
                ),
                Arguments.arguments(
                        new int[] {1, 1, 1, 0, 6, 12},
                        4
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int excepted) {
        PartitionArrayIntoDisjointIntervals loop =
                new PartitionArrayIntoDisjointIntervalsLoop();
        assertEquals(excepted, loop.partitionDisjoint(nums));
    }
}
