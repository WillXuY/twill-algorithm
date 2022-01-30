package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.PartitionArrayIntoThreePartsWithEqualSumSave;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class PartitionArrayIntoThreePartsWithEqualSumTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                // 1. The last part can't be null.
                arguments(new int[] {1, -1, 1, -1}, false),
                // 0 + 2 + 1 = -6 + 6 - 7 + 9 + 1 = 2 + 0 + 1
                arguments(new int[] {0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1}, true),
                arguments(new int[] {0, 2, 1, -6, 6, 7, 9, -1, 2, 0, 1}, false),
                // 3 + 3 = 6 = 5 - 2 + 2 + 5 + 1 - 9 + 4
                arguments(new int[] {3, 3, 6, 5, -2, 2, 5, 1, -9, 4}, true)
        );
    }

    @ParameterizedTest(name = "Save {index}")
    @MethodSource("dataProvider")
    public void testSave(int[] arr, boolean excepted) {
        PartitionArrayIntoThreePartsWithEqualSum save =
                new PartitionArrayIntoThreePartsWithEqualSumSave();
        assertEquals(excepted, save.canThreePartsEqualSum(arr));
    }
}
