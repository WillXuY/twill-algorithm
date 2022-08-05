package org.willxu.algorithm.service.bool;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.bool.CheckIfAllTheIntegersInRangeAreCoveredSet;

import java.util.stream.Stream;

import static org.gradle.internal.impldep.org.junit.Assert.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CheckIfAllTheIntegersInRangeAreCoveredTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(new int[][] {{1, 2}, {3, 4}, {5, 6}}, 2, 5, true),
                arguments(new int[][] {{1, 10}, {10, 20}}, 21, 21, false)
        );
    }

    @ParameterizedTest(name = "Set {index}")
    @MethodSource("dataProvider")
    public void testSet(int[][] ranges, int left, int right, boolean excepted) {
        CheckIfAllTheIntegersInRangeAreCovered set =
                new CheckIfAllTheIntegersInRangeAreCoveredSet();
        assertEquals(excepted, set.isCovered(ranges, left, right));
    }
}
