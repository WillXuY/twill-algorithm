package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MaximumPopulationYearCount;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MaximumPopulationYearTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1993, 1999}, {2000, 2010}}, 1993),
                arguments(
                        new int[][] {{1950, 1961}, {1960, 1971}, {1970, 1981}},
                        1960
                )
        );
    }

    @ParameterizedTest(name = "Count {index}")
    @MethodSource("dataProvider")
    public void testCount(int[][] logs, int expected) {
        MaximumPopulationYear count = new MaximumPopulationYearCount();
        assertEquals(expected, count.maximumPopulation(logs));
    }
}
