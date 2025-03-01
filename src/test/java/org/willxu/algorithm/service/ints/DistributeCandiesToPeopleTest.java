package org.willxu.algorithm.service.ints;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.ints.DistributeCandiesToPeopleLoop;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class DistributeCandiesToPeopleTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1,0,0,0 -> 1,2,0,0 -> 1,2,3,0 -> 1,2,3,1
                arguments(7, 4, new int[] {1, 2, 3, 1}),
                // 1,0,0 -> 1,2,0 -> 1,2,3 -> 5,2,3
                arguments(10, 3, new int[] {5, 2, 3})
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int candies, int num, int[] expected) {
        DistributeCandiesToPeople loop = new DistributeCandiesToPeopleLoop();
        assertArrayEquals(expected, loop.distributeCandies(candies, num));
    }
}
