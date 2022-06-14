package org.willxu.algorithm.service.impl.integer;

import org.willxu.algorithm.service.integer.CountOfMatchesInTournament;

public class CountOfMatchesInTournamentCalculate
        implements CountOfMatchesInTournament {
    @Override
    public int numberOfMatches(int n) {
        return n - 1;
    }
}
