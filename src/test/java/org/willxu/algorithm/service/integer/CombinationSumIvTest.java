package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CombinationSumIvRecursive;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CombinationSumIvTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                Arguments.arguments(new int[] {1, 2, 3}, 4, 7),
                Arguments.arguments(new int[] {9}, 3, 0)
        );
    }

    @ParameterizedTest(name = "Recursive {index}")
    @MethodSource("dataProvider")
    public void testRecursive(int[] nums, int target, int excepted) {
        CombinationSumIv recursive = new CombinationSumIvRecursive();
        assertEquals(excepted, recursive.combinationSum4(nums, target));
    }
}
