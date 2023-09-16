package org.willxu.algorithm.service.ints;

import org.junit.jupiter.api.Test;
import org.willxu.algorithm.service.impl.ints.RandomPointInNonOverlappingRectanglesCount;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class RandomPointInNonOverlappingRectanglesTest {
    @Test
    public void testCount() {
        RandomPointInNonOverlappingRectangles count =
                new RandomPointInNonOverlappingRectanglesCount(
                        new int[][] {
                                {-2, -2, 1, 1},
                                {2, 2, 4, 6}
                        }
                );
        assertArrayEquals(new int[] {1, -2}, count.pick());
        assertArrayEquals(new int[] {1, -2}, count.pick());
        assertArrayEquals(new int[] {1, -2}, count.pick());
        assertArrayEquals(new int[] {1, -2}, count.pick());
    }
}
