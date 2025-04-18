package org.willxu.algorithm.domain.impl.integer;

import leetcode.p0300_0399.p0374_guess_number_higher_or_lower.AbstractGuessNumberHigherOrLower;

public class GuessNumberHigherOrLowerGolden
        extends AbstractGuessNumberHigherOrLower {
    public GuessNumberHigherOrLowerGolden(int pick) {
        super(pick);
    }

    @Override
    public int guessNumber(int n) {
        double golden = 0.618;
        int min = 1;
        int max = n;
        int test = max;
        while (test > min) {
            int guess = guess(test);
            if (guess == 0) {
                return test;
            } else if (guess == 1) {
                min = test;
            } else {
                max = test;
            }
            test = min + (int)((max - min) * golden);
        }
        return min;
    }
}
