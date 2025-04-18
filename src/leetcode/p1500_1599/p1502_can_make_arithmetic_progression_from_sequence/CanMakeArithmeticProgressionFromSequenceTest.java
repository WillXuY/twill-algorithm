package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CanMakeArithmeticProgressionFromSequenceSort;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CanMakeArithmeticProgressionFromSequenceTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 5, 1}, true),
                arguments(new int[] {1, 2, 4}, false)
        );
    }

    @ParameterizedTest(name = "Sort {index}")
    @MethodSource("dataProvider")
    public void testSort(int[] arr, boolean expected) {
        CanMakeArithmeticProgressionFromSequence sort =
                new CanMakeArithmeticProgressionFromSequenceSort();
        assertEquals(expected, sort.canMakeArithmeticProgression(arr));
    }
}
