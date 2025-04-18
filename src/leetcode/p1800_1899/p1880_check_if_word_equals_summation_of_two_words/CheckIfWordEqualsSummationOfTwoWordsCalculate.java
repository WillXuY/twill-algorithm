package leetcode.p1800_1899.p1880_check_if_word_equals_summation_of_two_words;

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
