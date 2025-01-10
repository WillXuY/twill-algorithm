package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.FindTheMiddleIndexInArraySum;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class FindTheMiddleIndexInArrayTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {2, 3, -1, 8, 4}, 3),
                arguments(new int[] {1, -1, 4}, 2),
                arguments(new int[] {2, 5}, -1)
        );
    }

    @ParameterizedTest(name = "Sum {index}")
    @MethodSource("dataProvider")
    public void testSum(int[] nums, int excepted) {
        FindTheMiddleIndexInArray sum = new FindTheMiddleIndexInArraySum();
        assertEquals(excepted, sum.findMiddleIndex(nums));
    }
}
