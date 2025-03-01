package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.HeightCheckerSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class HeightCheckerTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                /*
                1, 1, 4, 2, 1, 3
                1, 1, 1, 2, 3, 4
                v, v, x, v, x, x
                 */
                arguments(new int[] {1, 1, 4, 2, 1, 3}, 3),
                /*
                5, 1, 2, 3, 4
                1, 2, 3, 4, 5
                x, x, x, x, x
                 */
                arguments(new int[] {5, 1, 2, 3, 4}, 5),
                arguments(new int[] {1, 2, 3, 4, 5}, 0)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] heights, int expected) {
        HeightChecker sort = new HeightCheckerSort();
        assertEquals(expected, sort.heightChecker(heights));
    }
}
