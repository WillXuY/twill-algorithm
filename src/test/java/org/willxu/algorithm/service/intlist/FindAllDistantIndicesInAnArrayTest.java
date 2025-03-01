package org.willxu.algorithm.service.intlist;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.intlist.FindAllDistantIndicesInAnArrayLoop;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertArrayEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindAllDistantIndicesInAnArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(
                        new int[] {2, 1, 1, 1, 2},
                        2, 1,
                        Stream.of(
                                0, 1, 3, 4
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {3, 4, 9, 1, 3, 9, 5},
                        9, 1,
                        Stream.of(
                                1, 2, 3, 4, 5, 6
                        ).collect(Collectors.toList())
                ),
                arguments(
                        new int[] {2, 2, 2, 2, 2},
                        2, 2,
                        Stream.of(
                                0, 1, 2, 3, 4
                        ).collect(Collectors.toList())
                )
        );
    }

    @ParameterizedTest(name = "Loop {index}")
    @MethodSource("dataProvider")
    public void testLoop(int[] nums, int key, int k, List<Integer> expected) {
        FindAllDistantIndicesInAnArray loop =
                new FindAllDistantIndicesInAnArrayLoop();
        assertArrayEquals(expected.toArray(),
                loop.findKDistantIndices(nums, key, k).toArray());
    }
}
