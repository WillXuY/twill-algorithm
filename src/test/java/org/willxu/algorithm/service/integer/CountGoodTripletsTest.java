package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountGoodTripletsCombination;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountGoodTripletsTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[] {3, 0, 1, 1, 9, 7}, 7, 2, 3, 4),
                arguments(new int[] {1, 1, 2, 2, 3}, 0, 0, 1, 0)
        );
    }

    @ParameterizedTest(name = "Combination {index}")
    @MethodSource("dataProvider")
    public void testCombination(int[] arr, int a, int b, int c, int excepted) {
        CountGoodTriplets combination = new CountGoodTripletsCombination();
        assertEquals(excepted, combination.countGoodTriplets(arr, a, b, c));
    }
}
