package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.AverageValueOfEvenNumbersThatAreDivisibleByThreeCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class AverageValueOfEvenNumbersThatAreDivisibleByThreeTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {1, 3, 6, 10, 12, 15}, 9),
                arguments(new int[] {1, 2, 4, 7, 10}, 0)
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[] nums, int expected) {
        AverageValueOfEvenNumbersThatAreDivisibleByThree count =
                new AverageValueOfEvenNumbersThatAreDivisibleByThreeCount();
        assertEquals(expected, count.averageValue(nums));
    }
}
