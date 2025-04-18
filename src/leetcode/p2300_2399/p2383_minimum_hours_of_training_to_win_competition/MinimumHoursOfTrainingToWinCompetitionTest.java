package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.MinimumHoursOfTrainingToWinCompetitionMax;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class MinimumHoursOfTrainingToWinCompetitionTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(50, 50, new int[] {1}, new int[] {1}, 0),
                arguments(
                        1, 1,
                        new int[] {1, 1, 1, 1}, new int[] {1, 1, 1, 50},
                        51),
                arguments(
                        5, 3,
                        new int[] {1, 4, 3, 2}, new int[] {2, 6, 3, 1},
                        8),
                arguments(2, 4, new int[] {1}, new int[] {3}, 0)
        );
    }

    @ParameterizedTest(name = "Max {index}")
    @MethodSource("dataProvider")
    public void testMax(int initialEnergy, int initialExperience, int[] energy,
                        int[] experience, int expected) {
        MinimumHoursOfTrainingToWinCompetition max =
                new MinimumHoursOfTrainingToWinCompetitionMax();
        assertEquals(expected, max.minNumberOfHours(
                initialEnergy, initialExperience, energy, experience));
    }
}
