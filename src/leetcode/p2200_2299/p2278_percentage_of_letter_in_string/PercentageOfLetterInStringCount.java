package leetcode.p2200_2299.p2278_percentage_of_letter_in_string;

public class PercentageOfLetterInStringCount
        implements PercentageOfLetterInString {
    @Override
    public int percentageLetter(String s, char letter) {
        int count = 0;
        for (char c: s.toCharArray()) {
            if (c == letter) {
                count++;
            }
        }
        return count * 100 / s.length();
    }
}
