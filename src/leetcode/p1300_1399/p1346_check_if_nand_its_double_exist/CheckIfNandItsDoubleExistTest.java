package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfNandItsDoubleExistSet;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfNandItsDoubleExistTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 2. two zero is true
                arguments(new int[] {0, 0}, true),
                // 1. set contains 0*2 itself.
                arguments(new int[] {-2, 0, 10, -19, 4, 6, -8}, false),
                // 10 and 5
                arguments(new int[] {10, 2, 5, 3}, true),
                // 7 and 14
                arguments(new int[] {7, 1, 14, 11}, true),
                arguments(new int[] {3, 1, 7, 11}, false)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[] arr, boolean expected) {
        CheckIfNandItsDoubleExist set = new CheckIfNandItsDoubleExistSet();
        assertEquals(expected, set.checkIfExist(arr));
    }
}
