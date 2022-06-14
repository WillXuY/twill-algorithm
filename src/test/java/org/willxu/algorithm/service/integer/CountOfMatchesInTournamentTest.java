package org.willxu.algorithm.service.integer;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.willxu.algorithm.service.impl.integer.CountOfMatchesInTournamentCalculate;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.params.provider.Arguments.arguments;

public class CountOfMatchesInTournamentTest {
    static Stream<Arguments> dataProvider() {
        return Stream.of(
                arguments(7, 6),
                arguments(14, 13)
        );
    }

    @ParameterizedTest(name = "Calculate {index}")
    @MethodSource("dataProvider")
    public void testCalculate(int n, int excepted) {
        CountOfMatchesInTournament calculate =
                new CountOfMatchesInTournamentCalculate();
        assertEquals(excepted, calculate.numberOfMatches(n));
    }
}
