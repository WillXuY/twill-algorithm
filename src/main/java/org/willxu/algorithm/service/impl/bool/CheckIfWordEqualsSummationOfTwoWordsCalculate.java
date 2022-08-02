package org.willxu.algorithm.service.impl.bool;

import org.willxu.algorithm.service.bool.CheckIfWordEqualsSummationOfTwoWords;

public class CheckIfWordEqualsSummationOfTwoWordsCalculate
        implements CheckIfWordEqualsSummationOfTwoWords {
    @Override
    public boolean isSumEqual(
            String firstWord, String secondWord, String targetWord) {
        return calculate(firstWord) + calculate(secondWord)
                == calculate(targetWord);
    }

    private int calculate(String word) {
        int output = 0;
        for (char w: word.toCharArray()) {
            output *= 10;
            output += w - 'a';
        }
        return output;
    }
}
